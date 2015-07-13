package domain;

import java.math.BigDecimal;

public class Product extends DomainEntity {

	public static final String
		CAIXA = "CX",
		UNIDADE = "UN",
		LITRO = "L",
		METRO = "M",
		KILOGRAMA = "KG",
		SACO = "SC";
	
	private TimeCover timeCover;
	private String name;
	private String code;
	private String barcode;
	private String unitMeasure;
	private Make make;
	private BigDecimal quantity;
	private BigDecimal price;
	private BigDecimal quantityMinimum;
	private BigDecimal maxQuantity;
	private BigDecimal quantityMinimumSale;
	
	public BigDecimal getQuantityMinimumSale() {
		return quantityMinimumSale;
	}
	
	public void setQuantityMinimumSale(BigDecimal quantityMinimumSale) {
		this.quantityMinimumSale = quantityMinimumSale;
	}
	
	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getQuantityMinimum() {
		return quantityMinimum;
	}

	public void setQuantityMinimum(BigDecimal double1) {
		this.quantityMinimum = double1;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getUnitMeasure() {
		return unitMeasure;
	}

	public void setUnitMeasure(String unitMeasure) {
		this.unitMeasure = unitMeasure;
	}

	public Make getMake() {
		return make;
	}

	public void setMake(Make make) {
		this.make = make;
	}
	public TimeCover getTimeCover() {
		return timeCover;
	}

	public void setTimeCover(TimeCover timeCover) {
		this.timeCover = timeCover;
	}
	
	public BigDecimal getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(BigDecimal maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

}
