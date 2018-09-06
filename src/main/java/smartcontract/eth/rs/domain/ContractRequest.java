package smartcontract.eth.rs.domain;

/**
 * POJO to encapsulates the contractRequest object.
 * @author Jonathan Samson
 */
public class ContractRequest {

	private String clientWalletAddress;
	private String clientContractAddress;
	private String note;

	public ContractRequest() {

	}

	public ContractRequest(String clientWalletAddress, String clientContractAddress, String note) {
		super();
		this.clientWalletAddress = clientWalletAddress;
		this.clientContractAddress = clientContractAddress;
		this.note = note;
	}

	public String getClientWalletAddress() {
		return clientWalletAddress;
	}

	public void setClientWalletAddress(String clientWalletAddress) {
		this.clientWalletAddress = clientWalletAddress;
	}

	public String getClientContractAddress() {
		return clientContractAddress;
	}

	public void setClientContractAddress(String clientContractAddress) {
		this.clientContractAddress = clientContractAddress;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}