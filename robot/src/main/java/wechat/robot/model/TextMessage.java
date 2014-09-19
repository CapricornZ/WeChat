package wechat.robot.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class TextMessage extends Message{
	
	private String content;

	@XmlElement(name="Content")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
