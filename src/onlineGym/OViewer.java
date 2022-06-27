package onlineGym;

import java.util.Observer;

public class OViewer implements Observer{

	private String standup;
	private String laydown;
	
	 @Override
	    public void update(Observable o, Object standup) {
	        this.Position1((String) standup);
	    }

	    public String getPosition1() {
	        return standup;
	    }

	    public void setPosition1(String standup) {
	        this.standup = standup;
	    }
	    
	    @Override
	    public void update(Observable o, Object laydown) {
	        this.Position2((String) laydown);
	    }

	    public String getPosition2() {
	        return laydown;
	    }

	    public void setPosition2(String laydown) {
	        this.laydown = laydown;
	    }
}
