import java.util.ArrayList;

public class Manager {
	private String name;
	private ArrayList<Supervisor> supervisorList;
	private ArrayList<ProjectLeader> projectLeaderList;
	private Ceo ceo;
	
	public Manager(String name, ArrayList<Supervisor> supervisorList, ArrayList<ProjectLeader> projectLeaderList, Ceo ceo) {
		this.name = name;
		this.supervisorList = supervisorList;
		this.projectLeaderList = projectLeaderList;
		this.ceo = ceo;
	}
	
	
	void seeDanger() 
	{
		int trueCount = 0;
		int falseCount = 0;
		for(int i =0;i<supervisorList.size();i++) 
		{
			boolean check = supervisorList.get(i).getFeedback();
			if(check) 
			{
				trueCount++;
			}
			else 
			{
				falseCount++;
			}
		}
		for(int i =0;i<projectLeaderList.size();i++) 
		{
			boolean check = projectLeaderList.get(i).getFeedback();
			if(check) 
			{
				trueCount++;
			}
			else 
			{
				falseCount++;
			}
		}
		
		if(falseCount == 0)
		{
			ceo.seeDanger();
		}
		
	}
	
	public void evacuate() 
	{
		for(int i =0;i<supervisorList.size();i++) 
		{
			supervisorList.get(i).evacuate();
		}
		for(int i =0;i<projectLeaderList.size();i++) 
		{
			projectLeaderList.get(i).evacuate();
		}
		System.out.println("The employee "+name+" is evacuating.");
	}
	
	public Decision suggestDecision(Hazard h) 
	{
		if(h == Hazard.Water || h == Hazard.Electrcity) 
		{
			return Decision.FileReport;
		}
		return Decision.Evacuation;
	}
	
}
