package telran.java2022.accounting.dto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class UserPasswordExpiredExeption extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5641668824912269961L;

	
}
