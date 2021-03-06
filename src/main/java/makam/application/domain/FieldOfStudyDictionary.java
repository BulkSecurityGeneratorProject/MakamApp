package makam.application.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A FieldOfStudyDictionary.
 */
@Entity
@Table(name = "field_of_study_dictionary")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class FieldOfStudyDictionary implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "jhi_key")
    private String key;

    @Column(name = "jhi_value")
    private String value;

    @ManyToOne
    @JsonIgnoreProperties("fieldOfStudyDictionaries")
    private FacultyDictionary facultyDictionary;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public FieldOfStudyDictionary key(String key) {
        this.key = key;
        return this;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public FieldOfStudyDictionary value(String value) {
        this.value = value;
        return this;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public FacultyDictionary getFacultyDictionary() {
        return facultyDictionary;
    }

    public FieldOfStudyDictionary facultyDictionary(FacultyDictionary facultyDictionary) {
        this.facultyDictionary = facultyDictionary;
        return this;
    }

    public void setFacultyDictionary(FacultyDictionary facultyDictionary) {
        this.facultyDictionary = facultyDictionary;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FieldOfStudyDictionary)) {
            return false;
        }
        return id != null && id.equals(((FieldOfStudyDictionary) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "FieldOfStudyDictionary{" +
            "id=" + getId() +
            ", key='" + getKey() + "'" +
            ", value='" + getValue() + "'" +
            "}";
    }
}
