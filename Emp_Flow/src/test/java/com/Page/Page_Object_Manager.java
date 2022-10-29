package com.Page;

import org.openqa.selenium.WebDriver;

import com.Pom.Change_password;
import com.Pom.Home_WMY;
import com.Pom.Lan_Popup;
import com.Pom.Log_out;
import com.Pom.Post_Job;
import com.Pom.Reschedule_job;
import com.Pom.Roless;
import com.Pom.Schedule_job;
import com.Pom.Sign_Up;
import com.Pom.Signin;
import com.Pom.view_profile;

public class Page_Object_Manager {
	
		public WebDriver driver;

		//private ClassName objname;
		
		private Signin sign;

		private Change_password log;
		
		private view_profile vp;
		
		private Schedule_job sche;
		
		private Reschedule_job resche;
		
		private Home_WMY home;
		
		private Roless role;
		
		private Lan_Popup Language;
		
		private Log_out logout;
		
		private Sign_Up signup;
		
		private Post_Job postjob;

		public Page_Object_Manager(WebDriver driver2) {
			
		this.driver=driver2;
		
		}
		
		public Signin getInstancesign() {
			   
		    if(sign==null) {
		   
		    	sign=new Signin(driver);
		   
		     }
		   
		    return sign;
		   
		     }
		
		public Lan_Popup getInstanceLanguage() {
			   
		    if(Language==null) {
		   
		    	Language=new Lan_Popup(driver);
		   
		     }
		   
		    return Language;
		   
		     }

		public Change_password getInstancelog() {
		   
		    if(log==null) {
		   
		      log=new Change_password(driver);
		   
		     }
		   
		    return log;
		   
		     }
		
		public view_profile getInstancevp() {
			   
		    if(vp==null) {
		   
		    	vp=new view_profile(driver);
		   
		     }
		   
		    return vp;
		   
		     }
		
		public Schedule_job getInstancesche() {
			   
		    if(sche==null) {
		   
		    	sche=new Schedule_job(driver);
		   
		     }
		   
		    return sche;
		   
		     }
		
		public Home_WMY getInstancehome() {
			   
		    if(home==null) {
		   
		    	home=new Home_WMY(driver);
		   
		     }
		   
		    return home;
		   
		     }
		
		public Reschedule_job getInstanceresche() {
			   
		    if(resche==null) {
		   
		    	resche=new Reschedule_job(driver);
		   
		     }
		   
		    return resche;
		   
		     }
		
		public Roless getInstancerole() {
			   
		    if(role==null) {
		   
		    	role=new Roless(driver);
		   
		     }
		   
		    return role;
		   
		     }

		
		public Log_out getInstancelogout() {
			   
		    if(logout==null) {
		   
		    	logout=new Log_out(driver);
		   
		     }
		   
		    return logout;
		   
		     }
		
		public Sign_Up getInstancesignup() {
			   
		    if(signup==null) {
		   
		    	signup=new Sign_Up(driver);
		   
		     }
		   
		    return signup;
		   
		     }
		
		public Post_Job getInstancepostjob() {
			   
		    if(postjob==null) {
		   
		    	postjob=new Post_Job(driver);
		   
		     }
		   
		    return postjob;
		   
		     }
		
		
	}

