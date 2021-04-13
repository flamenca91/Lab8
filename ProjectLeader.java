import java.util.ArrayList;

public class ProjectLeader {
	private String name;
	private ArrayList<Leads> leadsList;
	private Manager manager;
	
	public ProjectLeader(String name, ArrayList<Leads> leadsList, Manager manager) {
		this.name = name;
		this.leadsList = leadsList;
		this.manager = manager;
	}
	public void seeDanger() 
	{
		manager.seeDanger();
		fixIt();
	}
	
	public void fixIt() 
	{
		System.out.println("The employee "+name+" is fixing it.");
		for(int i =0;i<leadsList.size();i++) 
		{
			leadsList.get(i).fixIt();
		}
	}
	
	public boolean getFeedback() 
	{
		System.out.println("Feedback by "+name);
		return true;
	}
	
	public void evacuate() 
	{
		System.out.println("The employee "+name+" is evacuating.");
	}
	
}
