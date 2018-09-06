package smartcontract.eth.rs.validation;

import org.springframework.stereotype.Component;

/**
 * This class encapsulates the validations of requests received by users.
 * @author Jonathan Samson
 */
@Component
public class RequestValidator {
	
	public RequestValidator() {
		
	}
	
	public boolean validateRequest (String clientWalletAddress, String clientContractAddress, String requestNoteDetail) {
		
		//TODO
		return false;
	}
	
}
