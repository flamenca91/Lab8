import java.util.ArrayList;

public class Supervisor {
	private String name;
	private ArrayList<RegularEmployees> employeesList;
	private Manager manager;
	
	public Supervisor(String name, ArrayList<RegularEmployees> employeesList, Manager manager) {
		this.manager = manager;
		this.name = name;
		this.employeesList = employeesList;
	}
	
	public void seeDanger() 
	{
		manager.seeDanger();
		fixIt();
	}
	
	public void fixIt() 
	{
		System.out.println("The employee "+name+" is fixing it.");
		for(int i =0;i<employeesList.size();i++) 
		{
			employeesList.get(i).fixIt();
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
