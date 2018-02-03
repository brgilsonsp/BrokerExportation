package br.com.d2st.exportacao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class NferefTabTgteduep implements Serializable{

	private static final long serialVersionUID = -6091438364265879884L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@ManyToOne
	private Tgteduep tgteduep;
	
	private String Type;

    private String DUEID;

    private String DUEPOSNR;

    private String DOCNUM;

    private String ITMNUM;
    
    private String NFENUM;

    private String SERIES;

    private String PARID;

    private String MENGE;

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

	public String getDOCNUM() {
		return DOCNUM;
	}

	public void setDOCNUM(String dOCNUM) {
		DOCNUM = dOCNUM;
	}

	public String getITMNUM() {
		return ITMNUM;
	}

	public void setITMNUM(String iTMNUM) {
		ITMNUM = iTMNUM;
	}

	public String getNFENUM() {
		return NFENUM;
	}

	public void setNFENUM(String nFENUM) {
		NFENUM = nFENUM;
	}

	public String getSERIES() {
		return SERIES;
	}

	public void setSERIES(String sERIES) {
		SERIES = sERIES;
	}

	public String getPARID() {
		return PARID;
	}

	public void setPARID(String pARID) {
		PARID = pARID;
	}

	public String getMENGE() {
		return MENGE;
	}

	public void setMENGE(String mENGE) {
		MENGE = mENGE;
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
		NferefTabTgteduep other = (NferefTabTgteduep) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NferefTabTgteduep [id=" + id + ", tgteduep=" + tgteduep.getId() + ", DUEID=" + DUEID + "]";
	}

}
