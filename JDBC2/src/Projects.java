/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seolargo
 */
public class Projects {
    
	//Definitions here.
	private String projectName;
	
	private String yoneticiMin;
	private String yoneticiMax;
	
	private String analistMin;
	private String analistMax;
	
	private String tasarimciMin;
	private String tasarimciMax;
	
	private String testerMin;
	private String testerMax;
		
	//Constructor here.
	public Projects(String projectName, String yoneticiMin, String analistMin, String tasarimciMin, 
			String testerMin, String yoneticiMax, String analistMax, String tasarimciMax, String testerMax)
	{
		this.projectName = projectName;
		
		this.yoneticiMin = yoneticiMin;
		this.yoneticiMax = yoneticiMax;
		
		this.analistMin = analistMin;
		this.analistMax = analistMax;
		
		this.tasarimciMin = tasarimciMin;
		this.tasarimciMax = tasarimciMax;
		
		this.testerMin = testerMin;
		this.testerMax = testerMax;
	}
	
	//Getters and setters are here.
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getYoneticiMin() {
		return yoneticiMin;
	}

	public void setYoneticiMin(String yoneticiMin) {
		this.yoneticiMin = yoneticiMin;
	}

	public String getAnalistMin() {
		return analistMin;
	}

	public void setAnalistMin(String analistMin) {
		this.analistMin = analistMin;
	}

	public String getTasarimciMin() {
		return tasarimciMin;
	}

	public void setTasarimciMin(String tasarimciMin) {
		this.tasarimciMin = tasarimciMin;
	}

	public String getTesterMin() {
		return testerMin;
	}

	public void setTesterMin(String testerMin) {
		this.testerMin = testerMin;
	}

	public String getYoneticiMax() {
		return yoneticiMax;
	}

	public void setYoneticiMax(String yoneticiMax) {
		this.yoneticiMax = yoneticiMax;
	}

	public String getAnalistMax() {
		return analistMax;
	}

	public void setAnalistMax(String analistMax) {
		this.analistMax = analistMax;
	}

	public String getTasarimciMax() {
		return tasarimciMax;
	}

	public void setTasarimciMax(String tasarimciMax) {
		this.tasarimciMax = tasarimciMax;
	}

	public String getTesterMax() {
		return testerMax;
	}

	public void setTesterMax(String testerMax) {
		this.testerMax = testerMax;
	}
}
