package com.example.rest.mapper;

import com.example.rest.dto.Userdto;
import com.example.rest.entity.User;

public class Usermapper {

	public static Userdto maptouserdto(User user)
	{
	Userdto userdto =new Userdto(
    			
    			user.getId(),user.getFirstName(),user.getLastName(),user.getEmail()
    			);
	
	return userdto;
}
	public static User maptouser(Userdto userdto)
	{
	User user =new User(
    			
    			userdto.getId(),userdto.getFirstName(),userdto.getLastName(),userdto.getEmail()
    			);
	
	return user;
}
}
	
