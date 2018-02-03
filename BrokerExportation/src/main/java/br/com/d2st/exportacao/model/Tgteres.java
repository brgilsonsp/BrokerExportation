package br.com.d2st.exportacao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Tgteres implements Serializable {

	private static final long serialVersionUID = 1820060860128433993L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@ManyToOne
	private Tgteshkn tgteshkn;

	private String Type;

    @Transient
	private String SBELN;

    private String DSENUM;

    private String RENUM;

    private String ANDAT;

    private String REDAT;

    private String AVBDT;

    private String CANAL;

    private String DDENUM;
    
    private String DDEDT;

    private String DDESQ;

    private String REANX;

    private String DSESQ;

    private String DOCFAT;

    private String XBLNR;

    private String INCO1;

    private String WAERS;

    private String DDEADT;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Tgteshkn getTgteshkn() {
		return tgteshkn;
	}

	public void setTgteshkn(Tgteshkn tgteshkn) {
		this.tgteshkn = tgteshkn;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getSBELN() {
		return SBELN;
	}

	public void setSBELN(String sBELN) {
		SBELN = sBELN;
	}

	public String getDSENUM() {
		return DSENUM;
	}

	public void setDSENUM(String dSENUM) {
		DSENUM = dSENUM;
	}

	public String getRENUM() {
		return RENUM;
	}

	public void setRENUM(String rENUM) {
		RENUM = rENUM;
	}

	public String getANDAT() {
		return ANDAT;
	}

	public void setANDAT(String aNDAT) {
		ANDAT = aNDAT;
	}

	public String getREDAT() {
		return REDAT;
	}

	public void setREDAT(String rEDAT) {
		REDAT = rEDAT;
	}

	public String getAVBDT() {
		return AVBDT;
	}

	public void setAVBDT(String aVBDT) {
		AVBDT = aVBDT;
	}

	public String getCANAL() {
		return CANAL;
	}

	public void setCANAL(String cANAL) {
		CANAL = cANAL;
	}

	public String getDDENUM() {
		return DDENUM;
	}

	public void setDDENUM(String dDENUM) {
		DDENUM = dDENUM;
	}

	public String getDDEDT() {
		return DDEDT;
	}

	public void setDDEDT(String dDEDT) {
		DDEDT = dDEDT;
	}

	public String getDDESQ() {
		return DDESQ;
	}

	public void setDDESQ(String dDESQ) {
		DDESQ = dDESQ;
	}

	public String getREANX() {
		return REANX;
	}

	public void setREANX(String rEANX) {
		REANX = rEANX;
	}

	public String getDSESQ() {
		return DSESQ;
	}

	public void setDSESQ(String dSESQ) {
		DSESQ = dSESQ;
	}

	public String getDOCFAT() {
		return DOCFAT;
	}

	public void setDOCFAT(String dOCFAT) {
		DOCFAT = dOCFAT;
	}

	public String getXBLNR() {
		return XBLNR;
	}

	public void setXBLNR(String xBLNR) {
		XBLNR = xBLNR;
	}

	public String getINCO1() {
		return INCO1;
	}

	public void setINCO1(String iNCO1) {
		INCO1 = iNCO1;
	}

	public String getWAERS() {
		return WAERS;
	}

	public void setWAERS(String wAERS) {
		WAERS = wAERS;
	}

	public String getDDEADT() {
		return DDEADT;
	}

	public void setDDEADT(String dDEADT) {
		DDEADT = dDEADT;
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
		Tgteres other = (Tgteres) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tgteres [id=" + id + ", tgteshkn=" + tgteshkn.toString() + "]";
	}
}
