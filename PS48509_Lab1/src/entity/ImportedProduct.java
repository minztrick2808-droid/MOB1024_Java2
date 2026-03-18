package entity;

public class ImportedProduct extends Product{
	private Double importTaxRate; 
	private Double shippingFee;
	
	public ImportedProduct() {}
	public ImportedProduct(String id, String name, double basePrice ,double importTaxRate, double shippingFee) {
		super(id, name, basePrice);
		this.setImportTaxRate(importTaxRate);
		this.setShippingFee(shippingFee);
	}
	public Double getImportTaxRate() {
		return importTaxRate;
	}
	public boolean setImportTaxRate(Double importTaxRate) {
		if(importTaxRate >= 0 &&  importTaxRate <=1) {
			this.importTaxRate= importTaxRate;
			return true;
		}return false;
	}
	public Double getShippingFee() {
		return shippingFee;
	}
	public boolean setShippingFee(Double shippingFee) {
		if(shippingFee >= 0 ) {
			this.shippingFee = shippingFee;
			return true;
		}
		return false;
	}
	@Override
	public double finalPrice() {
		// TODO Auto-generated method stub
		return super.finalPrice() + super.finalPrice()*this.importTaxRate + this.shippingFee;
	}
	@Override
	public String toString() {
	    return super.toString() + " ImportedProduct [importTaxRate=" + importTaxRate + ", shippingFee=" + shippingFee + "]";
	}
	
	
	
}
