package app.main.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bar {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	private String value;
	public Bar() {
	}

	public Bar(long id, String value) {
		this.id = id;
		this.value = value;
	}

	public Bar(String value) {
		this.value = value;
	}
	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}
    @Override
    public String toString() {
        return String.format(
                "Bar[id=%d, value='%s']",
                id, value);
    }
}
