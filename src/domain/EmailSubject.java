package domain;

public enum EmailSubject {
	
	STOCK_LOWER("Estoque abaixo do Mínimo");
	
	private final String value;
	
	private EmailSubject(String value) {		
		this.value = value;
		
	}
	
	public String getValue() {		
		return this.value;
	}
	
}
