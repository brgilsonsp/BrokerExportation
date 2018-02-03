package br.com.d2st.exportacao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class AddinfoTabTgteduek implements Serializable {

	private static final long serialVersionUID = 842563933365217044L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@ManyToOne
	private Tgteduek tgteduek;
	
	private String Type;

    private String DUEID;

    private String DUEPOSNR;

    private String STMTPCODE;

    private String STMCODE;

    private String LMTDTTIME;

    private String DTTMSTR;

    private String DESCRIPTION;

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

	public String getDUEPOSNR() {
		return DUEPOSNR;
	}

	public void setDUEPOSNR(String dUEPOSNR) {
		DUEPOSNR = dUEPOSNR;
	}

	public String getSTMTPCODE() {
		return STMTPCODE;
	}

	public void setSTMTPCODE(String sTMTPCODE) {
		STMTPCODE = sTMTPCODE;
	}

	public String getSTMCODE() {
		return STMCODE;
	}

	public void setSTMCODE(String sTMCODE) {
		STMCODE = sTMCODE;
	}

	public String getLMTDTTIME() {
		return LMTDTTIME;
	}

	public void setLMTDTTIME(String lMTDTTIME) {
		LMTDTTIME = lMTDTTIME;
	}

	public String getDTTMSTR() {
		return DTTMSTR;
	}

	public void setDTTMSTR(String dTTMSTR) {
		DTTMSTR = dTTMSTR;
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
		AddinfoTabTgteduek other = (AddinfoTabTgteduek) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AddinfoTabTgteduek [id=" + id + ", tgteduek=" + tgteduek.getId() + ", DUEID=" + DUEID + "]";
	}
    
    
	

}
