package adesisPoc.poc.service.dao;

import java.util.List;

import adesisPoc.poc.service.dao.dto.DtoUser;

public interface UserServiceDao {
	
	List<DtoUser> listUsers();

	DtoUser getUser(String id);
}
