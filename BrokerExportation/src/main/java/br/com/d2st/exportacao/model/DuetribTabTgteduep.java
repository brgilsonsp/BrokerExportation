package br.com.d2st.exportacao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class DuetribTabTgteduep implements Serializable{

	private static final long serialVersionUID = 1578265864369751855L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@ManyToOne
	private Tgteduep tgteduep;
	
	private String Type;

    private String DUEID;

    private String DUEPOSNR;

    private String DUEATRIB;

    private String DESCRIPTION;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Tgteduep getTgteduep() {
		return tgteduep;
	}

	public void setTgteduep(Tgteduep tgteduep) {
		this.tgteduep = tgteduep;
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

	public String getDUEPOSNR() {
		return DUEPOSNR;
	}

	public void setDUEPOSNR(String dUEPOSNR) {
		DUEPOSNR = dUEPOSNR;
	}

	public String getDUEATRIB() {
		return DUEATRIB;
	}

	public void setDUEATRIB(String dUEATRIB) {
		DUEATRIB = dUEATRIB;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
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
		DuetribTabTgteduep other = (DuetribTabTgteduep) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DuetribTabTgteduep [id=" + id + ", tgteduep=" + tgteduep.getId() + ", DUEID=" + DUEID + "]";
	}
    
    

}
