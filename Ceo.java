import java.util.ArrayList;

public class Ceo {
	private String name;
	private ArrayList<Manager> managerList;
	private ArrayList<Decision> decisionList;
	
	public Ceo(String name, ArrayList<Manager> managerList) {
		this.name = name;
		this.managerList = managerList;
		decisionList = new ArrayList<Decision>();
	}
	
	public void seeDanger() 
	{
		for(int i =0;i<managerList.size();i++)
		{
			decisionList.add(managerList.get(i).suggestDecision(Hazard.GasLeak));
		}
		int evacualtionCount = 0;
		int fileReportCount = 0;
		for(int i =0;i<decisionList.size();i++) 
		{
			if(decisionList.get(i) == Decision.Evacuation) 
			{
				evacualtionCount++;
			}
			else if(decisionList.get(i) == Decision.FileReport) 
			{
		        fileReportCount++;
			}
		}
		
		if(evacualtionCount > fileReportCount)
		{
			evacuate();
		}
		else 
		{
			fileReport();
		}
	}
	
	public void evacuate() 
	{
		for(int i =0;i<managerList.size();i++) 
		{
			managerList.get(i).evacuate();
		}
		System.out.println("The employee "+name+" is evacuating.");
	}
	
	public void fileReport() 
	{
		System.out.println("The city environmental department is notified");
	}
}
