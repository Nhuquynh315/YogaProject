package model;

public class Clazz {
	private int id;
	private int categoryId;
	private int level;
	private int lengthMin;
	private String title;
	private String description;
	
	public Clazz() {
		// TODO Auto-generated constructor stub
	}

	public Clazz(int id, int categoryId, int level, int lengthMin, String title, String description) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.level = level;
		this.lengthMin = lengthMin;
		this.title = title;
		this.description = description;
	}

	public Clazz(int id, int categoryId, String name) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLengthMin() {
		return lengthMin;
	}

	public void setLengthMin(int lengthMin) {
		this.lengthMin = lengthMin;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
