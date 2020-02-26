package com.bw.bean;

public class Condition {
	private Integer pageNum;
	private String name;
	private String actor;
	private String u1;
	private String u2;
	private Double p1;
	private Double p2;
	private String years;
	private String l1;
	private String l2;
	private String conn;
	private String jz;

	
	public String getConn() {
		return conn;
	}

	public void setConn(String conn) {
		this.conn = conn;
	}

	public String getJz() {
		return jz;
	}

	public void setJz(String jz) {
		this.jz = jz;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getU1() {
		return u1;
	}

	public void setU1(String u1) {
		this.u1 = u1;
	}

	public String getU2() {
		return u2;
	}

	public void setU2(String u2) {
		this.u2 = u2;
	}

	public Double getP1() {
		return p1;
	}

	public void setP1(Double p1) {
		this.p1 = p1;
	}

	public Double getP2() {
		return p2;
	}

	public void setP2(Double p2) {
		this.p2 = p2;
	}

	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}

	public String getL1() {
		return l1;
	}

	public void setL1(String l1) {
		this.l1 = l1;
	}

	public String getL2() {
		return l2;
	}

	public void setL2(String l2) {
		this.l2 = l2;
	}

	public Condition(Integer pageNum, String name, String actor, String u1, String u2, Double p1, Double p2,
			String years, String l1, String l2) {
		super();
		this.pageNum = pageNum;
		this.name = name;
		this.actor = actor;
		this.u1 = u1;
		this.u2 = u2;
		this.p1 = p1;
		this.p2 = p2;
		this.years = years;
		this.l1 = l1;
		this.l2 = l2;
	}

	public Condition() {
		super();
	}

	@Override
	public String toString() {
		return "Condition [pageNum=" + pageNum + ", name=" + name + ", actor=" + actor + ", u1=" + u1 + ", u2=" + u2
				+ ", p1=" + p1 + ", p2=" + p2 + ", years=" + years + ", l1=" + l1 + ", l2=" + l2 + "]";
	}

}
