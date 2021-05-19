package HRMS.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.HRMS.business.abstracts.StaffService;
import HRMS.HRMS.dataAccess.abstracts.StaffDao;
import HRMS.HRMS.entities.concretes.Staff;

@Service
public class StaffManager implements StaffService {

	private StaffDao staffDao;
	
	@Autowired
	public StaffManager(StaffDao staffDao) {
		this.staffDao = staffDao;
	}

	@Override
	public List<Staff> getAll() {
		return this.staffDao.findAll();
	}

}
