package wechat.robot.webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import wechat.robot.model.PicMessage;
import wechat.robot.model.TextMessage;

public interface IRobot {
	
	@GET
	@Path("Robot")
	String checkSignature(@QueryParam("signature")String signature, @QueryParam("timestamp")String timestamp, @QueryParam("nonce")String nonce, @QueryParam("echostr")String echostr);
	
	@POST
	@Path("Robot")
	@Consumes("text/xml")
	String responseText(@QueryParam("signature")String signature, @QueryParam("timestamp")String timestamp, @QueryParam("nonce")String nonce, TextMessage msg);
	
	@POST
	@Path("Robot")
	@Consumes("text/xml")
	String responsePic(@QueryParam("signature")String signature, @QueryParam("timestamp")String timestamp, @QueryParam("nonce")String nonce, PicMessage msg);
}
