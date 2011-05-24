package com.demo.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.demo.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	//页面元素的属性名称
	private String id;
	private String username;
	private String password;
	private String sex;
	private String address;
	private String[] favorite;
	
	/**
	 * 模拟用户登录，向session中保存登录用户姓名
	 * @return
	 */
	public String login(){
		ServletActionContext.getRequest().getSession().setAttribute("loginUser", "张三");
		return null;
	}
	
	
	/**
	 * 列表页面
	 * @return
	 */
	public String list(){
		List users = new UserService().getUsers();
		ServletActionContext.getRequest().setAttribute("result", users);
		return SUCCESS;
	}
	
	/**
	 * 跳转到添加页面
	 * @return
	 */
	public String toAdd(){
		return SUCCESS;
	}
	
	/**
	 * 添加方法
	 * @return
	 */
	public String add(){
		System.out.println("添加id:"+this.getId());
		System.out.println("添加username:"+this.getUsername());
		System.out.println("添加password"+this.getPassword());
		System.out.println("添加sex:"+this.getSex());
		System.out.println("添加address:"+this.getAddress());
		for(int i=0;i<this.getFavorite().length;i++){
			System.out.println("添加favorite:"+this.getFavorite()[i]);
		}
		System.out.println("添加成功!!!!!!!!!!!!!!!!");
		return SUCCESS;
	}
	/**
	 * 跳转到修改页面
	 * @return
	 */
	public String toUpdate(){
		return SUCCESS;
	}
	/**
	 * 修改方法
	 * @return
	 */
	public String update(){
		return SUCCESS;
	}
	/**
	 * 跳转到详细信息页面
	 * @return
	 */
	public String toDetail(){
		return SUCCESS;
	}
	/**
	 * 删除方法
	 * @return
	 */
	public String delete(){
		return SUCCESS;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String[] getFavorite() {
		return favorite;
	}

	public void setFavorite(String[] favorite) {
		this.favorite = favorite;
	}

	
}
