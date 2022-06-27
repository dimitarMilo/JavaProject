package onlineGym;

import java.util.Observable;

public class OCoach extends Observable{

	private String standup;
	private String laydown;
	
	public void setPosition1(String standup) {
		this.standup = standup;
		setChanged();
		notifyObservers(standup);
		
	public void setPosition2(String laydown) {
		this.standup = laydown;
		setChanged();
		notifyObservers(laydown);
	}
}
