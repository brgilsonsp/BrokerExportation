package br.com.d2st.exportacao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class AddressTabTgteduek implements Serializable{
		
	private static final long serialVersionUID = 1337682096586996865L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@ManyToOne
	private Tgteduek tgteduek;

	public String Type;

	private String DUEID;

    private String ADRNR;

    private String LINESEQ;

    private String CONTENT;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Tgteduek getTgteduek() {
		return tgteduek;
	}

	public void setTgteduek(Tgteduek tgteduek) {
		this.tgteduek = tgteduek;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getDUEID() {
		return DUEID;
	}

	public void setDUEID(String dUEID) {
		DUEID = dUEID;
	}

	public String getADRNR() {
		return ADRNR;
	}

	public void setADRNR(String aDRNR) {
		ADRNR = aDRNR;
	}

	public String getLINESEQ() {
		return LINESEQ;
	}

	public void setLINESEQ(String lINESEQ) {
		LINESEQ = lINESEQ;
	}

	public String getCONTENT() {
		return CONTENT;
	}

	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressTabTgteduek other = (AddressTabTgteduek) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AddressTabTgteduek [id=" + id + ", tgteduek=" + tgteduek.getId() + ", DUEID=" + DUEID + "]";
	}
    
    

}
