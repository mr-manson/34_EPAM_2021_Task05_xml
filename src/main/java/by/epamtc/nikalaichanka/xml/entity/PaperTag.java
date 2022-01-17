package by.epamtc.nikalaichanka.xml.entity;

public enum PaperTag {
	ID("id"),
	TITLE("title"),
	TYPE("paper"),
	MONTHLY("monthly"),
	COLOR("color"),
	VOLUM("volum"),
	GLOSSY("glossy"),
	INDEX("index");
	
    private final String value;

    PaperTag(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
