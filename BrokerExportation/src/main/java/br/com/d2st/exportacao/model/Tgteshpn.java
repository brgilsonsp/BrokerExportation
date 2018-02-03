package br.com.d2st.exportacao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Tgteshpn implements Serializable{

	private static final long serialVersionUID = 4185452769929203427L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@ManyToOne
	private Tgteshkn tgteshkn;

	private String Type;

	@Transient
	@NotEmpty
    private String SBELN;

    private String SBELP;

    private String NBELP;
            
    private String DOCFAT;

    private String ITMFAT;
    
    private String MATNR;

    private String MAKTX;

    @OneToMany(cascade=CascadeType.REMOVE, mappedBy="tgteshpn")
    private List<MaktxText> MAKTX_TEXT = new ArrayList<>();

    private String QTDITM;

    private String NETPR;

    private String KPEIN;

    private String MEINS;

    private String NETWR;

    private String FRTLOC;

    private String FRTINT;

    private String SEGINT;

    private String PRCFOB;

    private String PRCEXW;

    private String PCTCOM;

    private String VLRCOM;

    private String RENUM;

    private String ITMRE;

    private String ENQDM;

    private String BRGEW;

    private String NTGEW;

    private String GEWEI;

    private String VOLUM;
            
    private String VOLEH;

    private String STEUC;

    private String NALADISH;

    private String FABITM;

    private String ATOCON;

    private String AMCCPTC;

    private String BRCCPTC;

    private String CCROM;

    private String FABRILUF;

    private String NETPRORI;

    private String KPEINORI;

    private String MEINSORI;

    private String NETWRORI;

    private String PROD;

    private String FKDAT;

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

	public String getSBELP() {
		return SBELP;
	}

	public void setSBELP(String sBELP) {
		SBELP = sBELP;
	}

	public String getNBELP() {
		return NBELP;
	}

	public void setNBELP(String nBELP) {
		NBELP = nBELP;
	}

	public String getDOCFAT() {
		return DOCFAT;
	}

	public void setDOCFAT(String dOCFAT) {
		DOCFAT = dOCFAT;
	}

	public String getITMFAT() {
		return ITMFAT;
	}

	public void setITMFAT(String iTMFAT) {
		ITMFAT = iTMFAT;
	}

	public String getMATNR() {
		return MATNR;
	}

	public void setMATNR(String mATNR) {
		MATNR = mATNR;
	}

	public String getMAKTX() {
		return MAKTX;
	}

	public void setMAKTX(String mAKTX) {
		MAKTX = mAKTX;
	}

	public List<MaktxText> getMAKTX_TEXT() {
		return MAKTX_TEXT;
	}

	public void setMAKTX_TEXT(List<MaktxText> mAKTX_TEXT) {
		MAKTX_TEXT = mAKTX_TEXT;
	}

	public String getQTDITM() {
		return QTDITM;
	}

	public void setQTDITM(String qTDITM) {
		QTDITM = qTDITM;
	}

	public String getNETPR() {
		return NETPR;
	}

	public void setNETPR(String nETPR) {
		NETPR = nETPR;
	}

	public String getKPEIN() {
		return KPEIN;
	}

	public void setKPEIN(String kPEIN) {
		KPEIN = kPEIN;
	}

	public String getMEINS() {
		return MEINS;
	}

	public void setMEINS(String mEINS) {
		MEINS = mEINS;
	}

	public String getNETWR() {
		return NETWR;
	}

	public void setNETWR(String nETWR) {
		NETWR = nETWR;
	}

	public String getFRTLOC() {
		return FRTLOC;
	}

	public void setFRTLOC(String fRTLOC) {
		FRTLOC = fRTLOC;
	}

	public String getFRTINT() {
		return FRTINT;
	}

	public void setFRTINT(String fRTINT) {
		FRTINT = fRTINT;
	}

	public String getSEGINT() {
		return SEGINT;
	}

	public void setSEGINT(String sEGINT) {
		SEGINT = sEGINT;
	}

	public String getPRCFOB() {
		return PRCFOB;
	}

	public void setPRCFOB(String pRCFOB) {
		PRCFOB = pRCFOB;
	}

	public String getPRCEXW() {
		return PRCEXW;
	}

	public void setPRCEXW(String pRCEXW) {
		PRCEXW = pRCEXW;
	}

	public String getPCTCOM() {
		return PCTCOM;
	}

	public void setPCTCOM(String pCTCOM) {
		PCTCOM = pCTCOM;
	}

	public String getVLRCOM() {
		return VLRCOM;
	}

	public void setVLRCOM(String vLRCOM) {
		VLRCOM = vLRCOM;
	}

	public String getRENUM() {
		return RENUM;
	}

	public void setRENUM(String rENUM) {
		RENUM = rENUM;
	}

	public String getITMRE() {
		return ITMRE;
	}

	public void setITMRE(String iTMRE) {
		ITMRE = iTMRE;
	}

	public String getENQDM() {
		return ENQDM;
	}

	public void setENQDM(String eNQDM) {
		ENQDM = eNQDM;
	}

	public String getBRGEW() {
		return BRGEW;
	}

	public void setBRGEW(String bRGEW) {
		BRGEW = bRGEW;
	}

	public String getNTGEW() {
		return NTGEW;
	}

	public void setNTGEW(String nTGEW) {
		NTGEW = nTGEW;
	}

	public String getGEWEI() {
		return GEWEI;
	}

	public void setGEWEI(String gEWEI) {
		GEWEI = gEWEI;
	}

	public String getVOLUM() {
		return VOLUM;
	}

	public void setVOLUM(String vOLUM) {
		VOLUM = vOLUM;
	}

	public String getVOLEH() {
		return VOLEH;
	}

	public void setVOLEH(String vOLEH) {
		VOLEH = vOLEH;
	}

	public String getSTEUC() {
		return STEUC;
	}

	public void setSTEUC(String sTEUC) {
		STEUC = sTEUC;
	}

	public String getNALADISH() {
		return NALADISH;
	}

	public void setNALADISH(String nALADISH) {
		NALADISH = nALADISH;
	}

	public String getFABITM() {
		return FABITM;
	}

	public void setFABITM(String fABITM) {
		FABITM = fABITM;
	}

	public String getATOCON() {
		return ATOCON;
	}

	public void setATOCON(String aTOCON) {
		ATOCON = aTOCON;
	}

	public String getAMCCPTC() {
		return AMCCPTC;
	}

	public void setAMCCPTC(String aMCCPTC) {
		AMCCPTC = aMCCPTC;
	}

	public String getBRCCPTC() {
		return BRCCPTC;
	}

	public void setBRCCPTC(String bRCCPTC) {
		BRCCPTC = bRCCPTC;
	}

	public String getCCROM() {
		return CCROM;
	}

	public void setCCROM(String cCROM) {
		CCROM = cCROM;
	}

	public String getFABRILUF() {
		return FABRILUF;
	}

	public void setFABRILUF(String fABRILUF) {
		FABRILUF = fABRILUF;
	}

	public String getNETPRORI() {
		return NETPRORI;
	}

	public void setNETPRORI(String nETPRORI) {
		NETPRORI = nETPRORI;
	}

	public String getKPEINORI() {
		return KPEINORI;
	}

	public void setKPEINORI(String kPEINORI) {
		KPEINORI = kPEINORI;
	}

	public String getMEINSORI() {
		return MEINSORI;
	}

	public void setMEINSORI(String mEINSORI) {
		MEINSORI = mEINSORI;
	}

	public String getNETWRORI() {
		return NETWRORI;
	}

	public void setNETWRORI(String nETWRORI) {
		NETWRORI = nETWRORI;
	}

	public String getPROD() {
		return PROD;
	}

	public void setPROD(String pROD) {
		PROD = pROD;
	}

	public String getFKDAT() {
		return FKDAT;
	}

	public void setFKDAT(String fKDAT) {
		FKDAT = fKDAT;
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
		Tgteshpn other = (Tgteshpn) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tgteshpn [id=" + id + ", SBELN=" + SBELN + ", tgteshkn=" + tgteshkn.toString()  + "]";
	}
    
}
