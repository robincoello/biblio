package be.iccbxl.poo.data;

public class GraphicNovel extends Books {

	private String cartoonist; 
	private boolean color;
	
	
	public GraphicNovel(int id, String title, String author, short totalPages, String language, String cartoonist) {
		super(id, title, author, totalPages, language);
		this.cartoonist = cartoonist;
		this.color = true; 
	}


	public String getCartoonist() {
		return cartoonist;
	}


	public void setCartoonist(String cartoonist) {
		this.cartoonist = cartoonist;
	}


	public boolean isColor() {
		return color;
	}


	public void setColor(boolean color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "GraphicNovel [cartoonist=" + cartoonist + ", color=" + color + ", id=" + id + ", title=" + title
				+ ", Author=" + Author + ", totalPages=" + totalPages + ", loandPeriod=" + loandPeriod
				+ ", rentalPrice=" + rentalPrice + ", borrowingDate=" + borrowingDate + ", language=" + language
				+ ", borrower=" + borrower + "]";
	} 
	
	
}
