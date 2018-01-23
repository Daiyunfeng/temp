package pers.hjc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 用户表
 * @author Administrator
 */
@Entity
@Table(name = "g_user")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler",
		"operations", "roles", "menus" })
public class User
{
	@Id
	@Column(nullable = false, unique = true)
	private Long ID; 
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String realname;

	@Column(nullable = false)
	private Long phone;
	
	@Column(nullable=false,columnDefinition="varchar(255) default 'res/head/default.png'")
	private String head="res/head/default.png";
}
