package action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private InputStream inputStream; //这个名字和struts.xml中对应，不能写错
	
	public InputStream getInputStream() {
		return inputStream;
	}
	//测试文件
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute() {
		return SUCCESS;
	}
	public String login() throws Exception {
		if("admin".equals(username)&&"123".equals(password)) {
			 inputStream = new ByteArrayInputStream("success".getBytes("UTF-8")); 
			 return SUCCESS;
		}
		return null;
	}

}
