package smartcontract.eth.rs.exposition.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import smartcontract.eth.rs.domain.ContractRequest;
import smartcontract.eth.rs.validation.RequestValidator;

/**
 * This class encapsulates the REST exposition of our api.
 * @author Jonathan Samson
 */
@RestController
public class ContractRestController {

	private static final Logger LOG = LoggerFactory.getLogger(ContractRestController.class);

	@Autowired RequestValidator validator;
	
	@RequestMapping(method = RequestMethod.POST, value = "/claim")
	@ResponseBody
	public String postClaimRequest(@RequestBody ContractRequest contractRequest) {
		
		LOG.info("Received New Request : " 
		+ contractRequest.getClientWalletAddress() + " " 
		+ contractRequest.getClientContractAddress() + " " 
		+ contractRequest.getNote());
		
		boolean validateResponse = validator.validateRequest(contractRequest.getClientWalletAddress(), contractRequest.getClientContractAddress(), contractRequest.getNote());
		LOG.info(Boolean.toString(validateResponse));
		
		return "POST claimRequest";
	}

}