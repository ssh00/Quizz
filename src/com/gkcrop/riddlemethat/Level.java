package com.gkcrop.riddlemethat;

public class Level {

	private String TextId;
	private String Ribbon;
	private String Answer;
	private String levelNumber;

	public String getLevelNumber() {
		return levelNumber;
	}
	public void setLevelNumber(String levelNumber) {
		this.levelNumber = levelNumber;
	}

	public String getTextId() {
		return TextId;
	}
	public void setTextId(String MusicId) {
		this.TextId = MusicId;
	}

	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String Answer) {
		this.Answer = Answer;
	}

	public String getRibbon() {
		return Ribbon;
	}
	public void setRibbon(String Ribbon) {
		this.Ribbon = Ribbon;
	}

}
