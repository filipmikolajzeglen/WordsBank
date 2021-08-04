package model;

import java.util.Objects;

public class IrregularVerbTranslation implements Translation {

    private long id;
    private String IFrom;
    private String IIForm;
    private String IIIForm;
    private String translation;

    public IrregularVerbTranslation() {
    }

    public IrregularVerbTranslation(String IFrom, String IIForm, String IIIForm, String translation) {
        this.IFrom = IFrom;
        this.IIForm = IIForm;
        this.IIIForm = IIIForm;
        this.translation = translation.toUpperCase();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIFrom() {
        return IFrom;
    }

    public void setIFrom(String IFrom) {
        this.IFrom = IFrom;
    }

    public String getIIForm() {
        return IIForm;
    }

    public void setIIForm(String IIForm) {
        this.IIForm = IIForm;
    }

    public String getIIIForm() {
        return IIIForm;
    }

    public void setIIIForm(String IIIForm) {
        this.IIIForm = IIIForm;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "IrregularVerbTranslation{" +
                "id=" + id +
                ", IFrom='" + IFrom + '\'' +
                ", IIForm='" + IIForm + '\'' +
                ", IIIForm='" + IIIForm + '\'' +
                ", translation='" + translation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IrregularVerbTranslation that = (IrregularVerbTranslation) o;
        return id == that.id &&
                Objects.equals(IFrom, that.IFrom) &&
                Objects.equals(IIForm, that.IIForm) &&
                Objects.equals(IIIForm, that.IIIForm) &&
                Objects.equals(translation, that.translation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, IFrom, IIForm, IIIForm, translation);
    }
}
