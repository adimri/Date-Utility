package com.inovia.test;

public class Date {
	private String dD;
	private String mM;
	private String yYYYY;

	
	public Date(String dD, String mM, String yYYYY) {
		super();
		this.dD = dD;
		this.mM = mM;
		this.yYYYY = yYYYY;
	}

	public String getdD() {
		return dD;
	}

	public void setdD(String dD) {
		this.dD = dD;
	}

	public String getmM() {
		return mM;
	}

	public void setmM(String mM) {
		this.mM = mM;
	}

	public String getyYYYY() {
		return yYYYY;
	}

	public void setyYYYY(String yYYYY) {
		this.yYYYY = yYYYY;
	}

}
