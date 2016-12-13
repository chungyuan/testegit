package QAInteractive;

import java.util.ArrayList;

public class Questions {
	int num;	
	String title;
	ArrayList<Answers> ansList = new ArrayList<Answers>();
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList<Answers> getAnsList() {
		return ansList;
	}
	public void setAnsList(ArrayList<Answers> ansList) {
		this.ansList = ansList;
	}

}
