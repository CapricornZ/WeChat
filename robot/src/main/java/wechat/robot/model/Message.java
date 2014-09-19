package wechat.robot.model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

public abstract class Message {
	
	private String toUserName;
	private String fromUserName;
	private String msgType;
	private String msgId;
	private String createTime;
	
	@XmlElement(name="ToUserName")
	public String getToUserName() {
		return toUserName;
	}
	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}
	
	@XmlElement(name="FromUserName")
	public String getFromUserName() {
		return fromUserName;
	}
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}
	
	@XmlElement(name="MsgType")
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	
	@XmlElement(name="MsgId")
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	
	@XmlElement(name="CreateTime")
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
}
