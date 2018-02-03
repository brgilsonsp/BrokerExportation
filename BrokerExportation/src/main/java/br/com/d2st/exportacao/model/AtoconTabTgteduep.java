package br.com.d2st.exportacao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class AtoconTabTgteduep implements Serializable{

	private static final long serialVersionUID = -6428050818519641103L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@ManyToOne
	private Tgteduep tgteduep;
	
	private String Type;

    private String DUEID;

    private String DUEPOSNR;

    private String ATOCON;

    private String ATOCONITM;

    private String VLRCOMCOB;

    private String VLRSEMCOB;

    private String STEUC;

    private String CNPJ_BENEF;

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

	public String getATOCON() {
		return ATOCON;
	}

	public void setATOCON(String aTOCON) {
		ATOCON = aTOCON;
	}

	public String getATOCONITM() {
		return ATOCONITM;
	}

	public void setATOCONITM(String aTOCONITM) {
		ATOCONITM = aTOCONITM;
	}

	public String getVLRCOMCOB() {
		return VLRCOMCOB;
	}

	public void setVLRCOMCOB(String vLRCOMCOB) {
		VLRCOMCOB = vLRCOMCOB;
	}

	public String getVLRSEMCOB() {
		return VLRSEMCOB;
	}

	public void setVLRSEMCOB(String vLRSEMCOB) {
		VLRSEMCOB = vLRSEMCOB;
	}

	public String getSTEUC() {
		return STEUC;
	}

	public void setSTEUC(String sTEUC) {
		STEUC = sTEUC;
	}

	public String getCNPJ_BENEF() {
		return CNPJ_BENEF;
	}

	public void setCNPJ_BENEF(String cNPJ_BENEF) {
		CNPJ_BENEF = cNPJ_BENEF;
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
		AtoconTabTgteduep other = (AtoconTabTgteduep) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AtoconTabTgteduep [id=" + id + ", tgteduep=" + tgteduep.getId() + ", DUEID=" + DUEID + "]";
	}
    
    

}
