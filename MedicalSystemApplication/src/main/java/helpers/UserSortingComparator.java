package helpers;

import java.util.Comparator;

import dto.UserDTO;

public class UserSortingComparator implements Comparator<UserDTO>{

	@Override
	public int compare(UserDTO o1, UserDTO o2) {
		return o1.getFirstname().compareTo(o2.getFirstname());
	}

	
}
