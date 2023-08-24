package model;

public class Clazz {
	private int id;
	private int category_id;
	private String name;
	private int level;
	private int lengthMin;
	private String description;
	
	
	public Clazz() {
		// TODO Auto-generated constructor stub
	}

	public Clazz(int id, int category_id, String name, int level, int lengthMin, String description) {
		super();
		this.id = id;
		this.category_id = category_id;
		this.name = name;
		this.level = level;
		this.lengthMin = lengthMin;
		this.description = description;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
