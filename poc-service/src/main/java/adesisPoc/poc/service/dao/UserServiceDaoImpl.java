package adesisPoc.poc.service.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import adesisPoc.commons.utils.ManageMongoDB;
import adesisPoc.poc.service.dao.dto.DtoUser;

import com.mongodb.DB;
import com.mongodb.DBCollection;

@RestController
public class UserServiceDaoImpl implements UserServiceDao{

	@Autowired
	ManageMongoDB mongoManager;
	
	@RequestMapping("/users")
	public List<DtoUser> listUsers() {
		DB simpleConnect = mongoManager.simpleConnect();
		DBCollection collection = simpleConnect.getCollection("users");

		return null;
	}

	public DtoUser getUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
