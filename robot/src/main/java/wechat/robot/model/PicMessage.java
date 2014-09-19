package wechat.robot.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class PicMessage extends Message {
	
	private String picUrl;
	private String mediaId;
	@XmlElement(name="PicUrl")
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	
	@XmlElement(name="MediaId")
	public String getMediaId() {
		return mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

}
