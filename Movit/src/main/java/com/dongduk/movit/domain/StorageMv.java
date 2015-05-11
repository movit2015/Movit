package com.dongduk.movit.domain;

import java.io.Serializable;


@SuppressWarnings("serial")
public class StorageMv implements Serializable {

  /* Private Fields */
	private int storageIdx;
	private int memberIdx;
	private String s_title;
	private String s_director;
	private String s_img;
	private String s_nation;
	private String s_time;
	private double s_rating;
	private String s_pubYear;
	
	public String getS_pubYear() {
		return s_pubYear;
	}
	public void setS_pubYear(String s_pubYear) {
		this.s_pubYear = s_pubYear;
	}
	public int getStorageIdx() {
		return storageIdx;
	}
	public void setStorageIdx(int storageIdx) {
		this.storageIdx = storageIdx;
	}
	public int getMemberIdx() {
		return memberIdx;
	}
	public void setMemberIdx(int memberIdx) {
		this.memberIdx = memberIdx;
	}
	public String getS_title() {
		return s_title;
	}
	public void setS_title(String s_title) {
		this.s_title = s_title;
	}
	public String getS_director() {
		return s_director;
	}
	public void setS_director(String s_director) {
		this.s_director = s_director;
	}
	public String getS_img() {
		return s_img;
	}
	public void setS_img(String s_img) {
		this.s_img = s_img;
	}
	
	public String getS_nation() {
		return s_nation;
	}
	public void setS_nation(String s_nation) {
		this.s_nation = s_nation;
	}
	public String getS_time() {
		return s_time;
	}
	public void setS_time(String s_time) {
		this.s_time = s_time;
	}
	public double getS_rating() {
		return s_rating;
	}
	public void setS_rating(double s_rating) {
		this.s_rating = s_rating;
	}
 
  /* JavaBeans Properties */

	
}
