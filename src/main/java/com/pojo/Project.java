package com.pojo;

public class Project {
	
	private int projectId;
	private String projectNames;
	private int svGreen;
	private int svYellow;
	private int svRed;
	private int eoGreen;
	private int eoYellow;
	private int eoRed;
	private int ftrGreen;
	private int ftrYellow;
	private int ftrRed;
	private int rwGreen;
	private int rwYellow;
	private int rwRed;
	private int rrGreen;
	private int rrYellow;
	private int rrRed;
	private int adGreen;
	private int adYellow;
	private int adRed;

	public Project() {

	}

	public Project(int projectId, String projectNames, int svGreen, int svYellow, int svRed, int eoGreen, int eoYellow,
			int eoRed, int ftrGreen, int ftrYellow, int ftrRed, int rwGreen, int rwYellow, int rwRed, int rrGreen,
			int rrYellow, int rrRed, int adGreen, int adYellow, int adRed) {

		this.projectId = projectId;
		this.projectNames = projectNames;
		this.svGreen = svGreen;
		this.svYellow = svYellow;
		this.svRed = svRed;
		this.eoGreen = eoGreen;
		this.eoYellow = eoYellow;
		this.eoRed = eoRed;
		this.ftrGreen = ftrGreen;
		this.ftrYellow = ftrYellow;
		this.ftrRed = ftrRed;
		this.rwGreen = rwGreen;
		this.rwYellow = rwYellow;
		this.rwRed = rwRed;
		this.rrGreen = rrGreen;
		this.rrYellow = rrYellow;
		this.rrRed = rrRed;
		this.adGreen = adGreen;
		this.adYellow = adYellow;
		this.adRed = adRed;

	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectNames() {
		return projectNames;
	}

	public void setProjectNames(String projectNames) {
		this.projectNames = projectNames;
	}

	public int getSvGreen() {
		return svGreen;
	}

	public void setSvGreen(int svGreen) {
		this.svGreen = svGreen;
	}

	public int getSvYellow() {
		return svYellow;
	}

	public void setSvYellow(int svYellow) {
		this.svYellow = svYellow;
	}

	public int getSvRed() {
		return svRed;
	}

	public void setSvRed(int svRed) {
		this.svRed = svRed;
	}

	public int getEoGreen() {
		return eoGreen;
	}

	public void setEoGreen(int eoGreen) {
		this.eoGreen = eoGreen;
	}

	public int getEoYellow() {
		return eoYellow;
	}

	public void setEoYellow(int eoYellow) {
		this.eoYellow = eoYellow;
	}

	public int getEoRed() {
		return eoRed;
	}

	public void setEoRed(int eoRed) {
		this.eoRed = eoRed;
	}

	public int getFtrGreen() {
		return ftrGreen;
	}

	public void setFtrGreen(int ftrGreen) {
		this.ftrGreen = ftrGreen;
	}

	public int getFtrYellow() {
		return ftrYellow;
	}

	public void setFtrYellow(int ftrYellow) {
		this.ftrYellow = ftrYellow;
	}

	public int getFtrRed() {
		return ftrRed;
	}

	public void setFtrRed(int ftrRed) {
		this.ftrRed = ftrRed;
	}

	public int getRwGreen() {
		return rwGreen;
	}

	public void setRwGreen(int rwGreen) {
		this.rwGreen = rwGreen;
	}

	public int getRwYellow() {
		return rwYellow;
	}

	public void setRwYellow(int rwYellow) {
		this.rwYellow = rwYellow;
	}

	public int getRwRed() {
		return rwRed;
	}

	public void setRwRed(int rwRed) {
		this.rwRed = rwRed;
	}

	public int getRrGreen() {
		return rrGreen;
	}

	public void setRrGreen(int rrGreen) {
		this.rrGreen = rrGreen;
	}

	public int getRrYellow() {
		return rrYellow;
	}

	public void setRrYellow(int rrYellow) {
		this.rrYellow = rrYellow;
	}

	public int getRrRed() {
		return rrRed;
	}

	public void setRrRed(int rrRed) {
		this.rrRed = rrRed;
	}

	public int getAdGreen() {
		return adGreen;
	}

	public void setAdGreen(int adGreen) {
		this.adGreen = adGreen;
	}

	public int getAdYellow() {
		return adYellow;
	}

	public void setAdYellow(int adYellow) {
		this.adYellow = adYellow;
	}

	public int getAdRed() {
		return adRed;
	}

	public void setAdRed(int adRed) {
		this.adRed = adRed;
	}
	
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectNames=" + projectNames + ", svGreen=" + svGreen
				+ ", svYellow=" + svYellow + ", svRed=" + svRed + ", eoGreen=" + eoGreen + ", eoYellow=" + eoYellow
				+ ", eoRed=" + eoRed + ", ftrGreen=" + ftrGreen + ", ftrYellow=" + ftrYellow + ", ftrRed=" + ftrRed
				+ ", rwGreen=" + rwGreen + ", rwYellow=" + rwYellow + ", rwRed=" + rwRed + ", rrGreen=" + rrGreen
				+ ", rrYellow=" + rrYellow + ", rrRed=" + rrRed + ", adGreen=" + adGreen + ", adYellow=" + adYellow
				+ ", adRed=" + adRed + "]";
	}

}
