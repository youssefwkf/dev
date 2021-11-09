package tn.esprit.spring.services;

import java.util.Date;
import java.util.List;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.entities.Timesheet;



public interface ITimesheetService {
	
	public int ajouterMission(Mission mission);
	public void affecterMissionADepartement(int missionId, int depId);
	public Timesheet ajouterTimesheet(int missionId, long employeId, Date dateDebut, Date dateFin);
	public void validerTimesheet(int missionId, long employeId, Date dateDebut, Date dateFin, long validateurId);
	public List<Mission> findAllMissionByEmployeJPQL(long employeId);
	public List<Employe> getAllEmployeByMission(int missionId);
}