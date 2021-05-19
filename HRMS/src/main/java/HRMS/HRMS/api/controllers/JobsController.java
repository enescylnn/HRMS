package HRMS.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS.HRMS.business.abstracts.JobsService;
import HRMS.HRMS.business.abstracts.StaffService;
import HRMS.HRMS.entities.concretes.Staff;

@RestController
@RequestMapping("api/jobs")
public class JobsController {

	private JobsService jobsService;
	
	@Autowired
	public JobsController(JobsService jobsService) {
		super();
		this.jobsService = jobsService;
	}

	@GetMapping("/getall")
	public List<Staff> getAll(){
		return this.jobsService.getAll();
	}
}
