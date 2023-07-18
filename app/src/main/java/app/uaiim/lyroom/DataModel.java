package app.uaiim.lyroom;

public class DataModel {
	private String ItemId;
	private String ItemTitle;
	private String ItemContent;
	private String ItemLabel;
	private String ItemImage;

	public String getItemId() {
		return ItemId;
	}

	public void setItemId(String ItemId) {
		this.ItemId = ItemId;
	}

	public String getItemTitle() {
		return ItemTitle;
	}

	public void setItemTitle(String ItemTitle) {
		this.ItemTitle = ItemTitle;
	}

	public String getItemContent() {
		return ItemContent;
	}

	public void setItemContent(String ItemContent) {
		this.ItemContent = ItemContent;
	}

	public String getItemLabel() {
		return ItemLabel;
	}

	public void setItemLabel(String ItemLabel) {
		this.ItemLabel = ItemLabel;
	}

	public String getItemImage() {
		return ItemImage;
	}

	public void setItemImage(String ItemImage) {
		this.ItemImage = ItemImage;
	}

	public DataModel(String ItemId, String ItemTitle, String ItemContent, String ItemLabel, String ItemImage) {
		this.ItemId = ItemId;
		this.ItemTitle = ItemTitle;
		this.ItemContent = ItemContent;
		this.ItemLabel = ItemLabel;
		this.ItemImage = ItemImage;
	}
}