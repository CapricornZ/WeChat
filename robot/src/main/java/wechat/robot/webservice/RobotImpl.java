package wechat.robot.webservice;

import java.security.MessageDigest;
import java.util.Arrays;

import wechat.robot.model.PicMessage;
import wechat.robot.model.TextMessage;

public class RobotImpl implements IRobot {
	
	private String TOKEN = "weixin";

	@Override
	public String responsePic(String signature, String timestamp, String nonce, PicMessage msg) {
		
		System.out.println(msg.getFromUserName());
		System.out.println(msg.getPicUrl());
		return null;
	}
	
	@Override
	public String responseText(String signature, String timestamp, String nonce, TextMessage msg) {
		
		System.out.println(msg.getFromUserName());
		System.out.println(msg.getContent());
		
		String rtn = "<xml><ToUserName><![CDATA[" + msg.getFromUserName();
		rtn += "]]></ToUserName><FromUserName><![CDATA[fromUser]]></FromUserName><CreateTime>12345678</CreateTime><MsgType><![CDATA[text]]></MsgType>";
		rtn += "<Content><![CDATA[" + msg.getContent() + "]]></Content></xml>";
		return rtn;
	}
	
	@Override
	public String checkSignature(String signature, String timestamp, String nonce, String echostr) {

		String token=TOKEN;  
        String[] tmpArr={token,timestamp,nonce};  
        Arrays.sort(tmpArr);  
        String tmpStr=this.ArrayToString(tmpArr);  
        tmpStr=this.SHA1Encode(tmpStr);  
        if(tmpStr.equalsIgnoreCase(signature)){
            return echostr;
        }else{  
            return "ERROR";  
        }  
	}
	
	 //数组转字符串  
    private String ArrayToString(String [] arr){  
        StringBuffer bf = new StringBuffer();  
        for(int i = 0; i < arr.length; i++){  
         bf.append(arr[i]);  
        }  
        return bf.toString();  
    }  
    //sha1加密  
    private String SHA1Encode(String sourceString) {  
        String resultString = null;  
        try {  
           resultString = new String(sourceString);  
           MessageDigest md = MessageDigest.getInstance("SHA-1");  
           resultString = byte2hexString(md.digest(resultString.getBytes()));  
        } catch (Exception ex) {  
        }  
        return resultString;  
    }
    
    private final String byte2hexString(byte[] bytes) {  
        StringBuffer buf = new StringBuffer(bytes.length * 2);  
        for (int i = 0; i < bytes.length; i++) {  
            if (((int) bytes[i] & 0xff) < 0x10) {  
                buf.append("0");  
            }  
            buf.append(Long.toString((int) bytes[i] & 0xff, 16));  
        }  
        return buf.toString().toUpperCase();  
    }

	
}
