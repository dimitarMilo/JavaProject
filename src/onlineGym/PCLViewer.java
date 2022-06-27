package onlineGym;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PCLViewer implements PropertyChangeListener {

	private String standup;
	private String laydown;
	 
	public void propertyChange(PropertyChangeEvent evt) {       
		this.setPosition1((String) evt.getNewValue());    
	}	    
	public String getPosition1() {        
		return standup;    
	}    
	public void setPosition1(String standup) {       
		this.standup = standup;   
	}
	
	public void propertyChange(PropertyChangeEvent evt) {       
		this.setPosition2((String) evt.getNewValue());    
	}	    
	public String getPosition2() {        
		return laydown;    
	}    
	public void setPosition2(String laydown) {       
		this.laydown = laydown;   
	}
}
