package by.epamtc.nikalaichanka.xml.entity;

import java.io.Serializable;

public class Paper implements Serializable {

	private static final long serialVersionUID = 1111L;

	private int id;
	private String title;
	private String type;
	private String monthly;
	private String color;
	private int volum;
	private String glossy;
	private int index;

	public Paper() {

	}
	
	public Paper(String title) {
		this.title = title;
	}
	
	public Paper(String id, String title) {
		this.title = title;
		this.type = type;
	}

	public Paper(String title, String type, String monthly, String color, int volum, String glossy, int index) {
		this.title = title;
		this.type = type;
		this.monthly = monthly;
		this.color = color;
		this.volum = volum;
		this.glossy = glossy;
		this.index = index;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMonthly() {
		return monthly;
	}

	public void setMonthly(String monthly) {
		this.monthly = monthly;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getVolum() {
		return volum;
	}

	public void setVolum(int volum) {
		this.volum = volum;
	}

	public String getGlossy() {
		return glossy;
	}

	public void setGlossy(String glossy) {
		this.glossy = glossy;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 1231 : 1237);
		result = prime * result + ((glossy == null) ? 1231 : 1237);
		result = prime * result + index;
		result = prime * result + ((monthly == null) ? 1231 : 1237);
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + volum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Paper other = (Paper) obj;
		if (color != other.color || glossy != other.glossy || index != other.index || monthly != other.monthly
				|| volum != other.volum)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Paper [title=" + title + ", type=" + type + ", monthly=" + monthly + ", color=" + color + ", volum="
				+ volum + ", glossy=" + glossy + ", index=" + index + "]";
	}
}
