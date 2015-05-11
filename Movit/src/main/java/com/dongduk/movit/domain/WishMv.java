package com.dongduk.movit.domain;

import java.io.Serializable;
@SuppressWarnings("serial")
public class WishMv {
	/* Private Fields */
	private int wishIdx;
	private int memberIdx;
	private String w_title;
	private String w_director;
	private String w_img;
	
	 /* JavaBeans Properties */
	public int getWishIdx() {
		return wishIdx;
	}
	public void setWishIdx(int wishIdx) {
		this.wishIdx = wishIdx;
	}
	public int getMemberIdx() {
		return memberIdx;
	}
	public void setMemberIdx(int memberIdx) {
		this.memberIdx = memberIdx;
	}
	public String getW_title() {
		return w_title;
	}
	public void setW_title(String w_title) {
		this.w_title = w_title;
	}
	public String getW_director() {
		return w_director;
	}
	public void setW_director(String w_director) {
		this.w_director = w_director;
	}
	public String getW_img() {
		return w_img;
	}
	public void setW_img(String w_img) {
		this.w_img = w_img;
	}	

}
