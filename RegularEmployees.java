
public class RegularEmployees {
	private String name;
    private Supervisor supervisor;
	public RegularEmployees(String name, Supervisor supervisor) {
		this.name = name;
		this.supervisor = supervisor;
	}
	
	public void seeDanger() 
	{
		supervisor.seeDanger();
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
