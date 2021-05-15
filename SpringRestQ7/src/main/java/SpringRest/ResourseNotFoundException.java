package SpringRest;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourseNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;

	public String ResourceNotFoundException(String message){
    	super(message);
    }
