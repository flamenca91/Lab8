
public class Leads {
	private String name;
	private ProjectLeader projectLeader;
	public Leads(String name, ProjectLeader projectLeader) {
		this.name = name;
		this.projectLeader = projectLeader;
	}
	
	public void seeDanger() 
	{
		projectLeader.seeDanger();
	}
	
	public void fixIt() 
	{
		System.out.println("The employee "+name+" is fixing it.");
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
