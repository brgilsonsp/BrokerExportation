package br.com.d2st.exportacao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Tgteshkn implements Serializable{

	private static final long serialVersionUID = -5685731968496959458L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@OneToOne
	private Shipping shipping;
		
	@OneToMany(cascade=CascadeType.REMOVE, mappedBy="tgteshkn")
	private List<Tgteshpn> tgteshpn = new ArrayList<>();
	
	@OneToMany(cascade=CascadeType.REMOVE, mappedBy="tgteshkn")
	private List<Tgteprd> tgteprd = new ArrayList<>();
	
	@OneToMany(cascade=CascadeType.REMOVE, mappedBy="tgteshkn")
	private List<ShpText> shpText = new ArrayList<>();	
	
	@OneToMany(cascade=CascadeType.REMOVE, mappedBy="tgteshkn")
	private List<Tgteres> tgteres = new ArrayList<>();
	
	@OneToMany(cascade=CascadeType.REMOVE, mappedBy="tgteshkn")
	private List<Tgteduek> tgteduek = new ArrayList<>();
	
	@OneToMany(cascade=CascadeType.REMOVE, mappedBy="tgteshkn")
	private List<Tgteduep> tgteduep = new ArrayList<>();
	
	private String Type;

	@Transient
    private String SBELN;
    
    private String LOCSE;
    
    private String TIPSE;

    private String TSETMP;

    private String SEDAT;

    private String ETADT;

    private String ENVDT;

    private String PREVDT;
    
    private String TRANS;

    private String ZOLLAO;

    private String ZLANDO;

    private String ZOLLAD;

    private String ZLANDD;

    private String NETWR;

    private String WAERSRF;

    private String INCO1;

    private String ZTERM;

    private String SESTAT;

    private String WAERS;

    private String BFMAR;

    private String SHPTRIP;

    private String ETDDT;

    private String BLNMB;

    private String BLDTA;

    private String HSAWB;

    private String SHPNAM;

    private String INVNR;
    
    private String DT_INVNR;
    
    private String VOLUM;

    private String NTGEW;

    private String BRGEW;

    private String VLFRETE;

    private String MOEDAFRT;

    private String VLSEGURO;

    private String MOEDASGR;

    private String VLCOAGT;

    private String MOEDACOAGT;

    private String PCCOAGT;

    private String TPCOAGT;

    private String DTCLTC;
    
    private String DTEARM;

    private String DTENTC;
    
    private String URFDESP;

    private String URFEMBA;

    private String MODPAG;

    private String BASCOM;

    private String PRECLCT;

    private String DTCOLETA;

    private String DTCHGARM;

    private String DTPRESC;

    private String DTAVERB;

    private String DTENTREGA;

    private String BROKNM;

    private String NMBOOK;

    private String DTBOOK;

    private String TPVEIC;

    private String TPCARG;

    private String UFEMBARQ;

    private String INSTNEG;

    private String TPPRP;
    
    private String DTSHIP;

    private String NROCE;

    private String DTCE;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Shipping getShipping() {
		return shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

	public List<Tgteshpn> getTgteshpn() {
		return tgteshpn;
	}

	public void setTgteshpn(List<Tgteshpn> tgteshpn) {
		this.tgteshpn = tgteshpn;
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

	public String getLOCSE() {
		return LOCSE;
	}

	public void setLOCSE(String lOCSE) {
		LOCSE = lOCSE;
	}

	public String getTIPSE() {
		return TIPSE;
	}

	public void setTIPSE(String tIPSE) {
		TIPSE = tIPSE;
	}

	public String getTSETMP() {
		return TSETMP;
	}

	public void setTSETMP(String tSETMP) {
		TSETMP = tSETMP;
	}

	public String getSEDAT() {
		return SEDAT;
	}

	public void setSEDAT(String sEDAT) {
		SEDAT = sEDAT;
	}

	public String getETADT() {
		return ETADT;
	}

	public void setETADT(String eTADT) {
		ETADT = eTADT;
	}

	public String getENVDT() {
		return ENVDT;
	}

	public void setENVDT(String eNVDT) {
		ENVDT = eNVDT;
	}

	public String getPREVDT() {
		return PREVDT;
	}

	public void setPREVDT(String pREVDT) {
		PREVDT = pREVDT;
	}

	public String getTRANS() {
		return TRANS;
	}

	public void setTRANS(String tRANS) {
		TRANS = tRANS;
	}

	public String getZOLLAO() {
		return ZOLLAO;
	}

	public void setZOLLAO(String zOLLAO) {
		ZOLLAO = zOLLAO;
	}

	public String getZLANDO() {
		return ZLANDO;
	}

	public void setZLANDO(String zLANDO) {
		ZLANDO = zLANDO;
	}

	public String getZOLLAD() {
		return ZOLLAD;
	}

	public void setZOLLAD(String zOLLAD) {
		ZOLLAD = zOLLAD;
	}

	public String getZLANDD() {
		return ZLANDD;
	}

	public void setZLANDD(String zLANDD) {
		ZLANDD = zLANDD;
	}

	public String getNETWR() {
		return NETWR;
	}

	public void setNETWR(String nETWR) {
		NETWR = nETWR;
	}

	public String getWAERSRF() {
		return WAERSRF;
	}

	public void setWAERSRF(String wAERSRF) {
		WAERSRF = wAERSRF;
	}

	public String getINCO1() {
		return INCO1;
	}

	public void setINCO1(String iNCO1) {
		INCO1 = iNCO1;
	}

	public String getZTERM() {
		return ZTERM;
	}

	public void setZTERM(String zTERM) {
		ZTERM = zTERM;
	}

	public String getSESTAT() {
		return SESTAT;
	}

	public void setSESTAT(String sESTAT) {
		SESTAT = sESTAT;
	}

	public String getWAERS() {
		return WAERS;
	}

	public void setWAERS(String wAERS) {
		WAERS = wAERS;
	}

	public String getBFMAR() {
		return BFMAR;
	}

	public void setBFMAR(String bFMAR) {
		BFMAR = bFMAR;
	}

	public String getSHPTRIP() {
		return SHPTRIP;
	}

	public void setSHPTRIP(String sHPTRIP) {
		SHPTRIP = sHPTRIP;
	}

	public String getETDDT() {
		return ETDDT;
	}

	public void setETDDT(String eTDDT) {
		ETDDT = eTDDT;
	}

	public String getBLNMB() {
		return BLNMB;
	}

	public void setBLNMB(String bLNMB) {
		BLNMB = bLNMB;
	}

	public String getBLDTA() {
		return BLDTA;
	}

	public void setBLDTA(String bLDTA) {
		BLDTA = bLDTA;
	}

	public String getHSAWB() {
		return HSAWB;
	}

	public void setHSAWB(String hSAWB) {
		HSAWB = hSAWB;
	}

	public String getSHPNAM() {
		return SHPNAM;
	}

	public void setSHPNAM(String sHPNAM) {
		SHPNAM = sHPNAM;
	}

	public String getINVNR() {
		return INVNR;
	}

	public void setINVNR(String iNVNR) {
		INVNR = iNVNR;
	}

	public String getDT_INVNR() {
		return DT_INVNR;
	}

	public void setDT_INVNR(String dT_INVNR) {
		DT_INVNR = dT_INVNR;
	}

	public String getVOLUM() {
		return VOLUM;
	}

	public void setVOLUM(String vOLUM) {
		VOLUM = vOLUM;
	}

	public String getNTGEW() {
		return NTGEW;
	}

	public void setNTGEW(String nTGEW) {
		NTGEW = nTGEW;
	}

	public String getBRGEW() {
		return BRGEW;
	}

	public void setBRGEW(String bRGEW) {
		BRGEW = bRGEW;
	}

	public String getVLFRETE() {
		return VLFRETE;
	}

	public void setVLFRETE(String vLFRETE) {
		VLFRETE = vLFRETE;
	}

	public String getMOEDAFRT() {
		return MOEDAFRT;
	}

	public void setMOEDAFRT(String mOEDAFRT) {
		MOEDAFRT = mOEDAFRT;
	}

	public String getVLSEGURO() {
		return VLSEGURO;
	}

	public void setVLSEGURO(String vLSEGURO) {
		VLSEGURO = vLSEGURO;
	}

	public String getMOEDASGR() {
		return MOEDASGR;
	}

	public void setMOEDASGR(String mOEDASGR) {
		MOEDASGR = mOEDASGR;
	}

	public String getVLCOAGT() {
		return VLCOAGT;
	}

	public void setVLCOAGT(String vLCOAGT) {
		VLCOAGT = vLCOAGT;
	}

	public String getMOEDACOAGT() {
		return MOEDACOAGT;
	}

	public void setMOEDACOAGT(String mOEDACOAGT) {
		MOEDACOAGT = mOEDACOAGT;
	}

	public String getPCCOAGT() {
		return PCCOAGT;
	}

	public void setPCCOAGT(String pCCOAGT) {
		PCCOAGT = pCCOAGT;
	}

	public String getTPCOAGT() {
		return TPCOAGT;
	}

	public void setTPCOAGT(String tPCOAGT) {
		TPCOAGT = tPCOAGT;
	}

	public String getDTCLTC() {
		return DTCLTC;
	}

	public void setDTCLTC(String dTCLTC) {
		DTCLTC = dTCLTC;
	}

	public String getDTEARM() {
		return DTEARM;
	}

	public void setDTEARM(String dTEARM) {
		DTEARM = dTEARM;
	}

	public String getDTENTC() {
		return DTENTC;
	}

	public void setDTENTC(String dTENTC) {
		DTENTC = dTENTC;
	}

	public String getURFDESP() {
		return URFDESP;
	}

	public void setURFDESP(String uRFDESP) {
		URFDESP = uRFDESP;
	}

	public String getURFEMBA() {
		return URFEMBA;
	}

	public void setURFEMBA(String uRFEMBA) {
		URFEMBA = uRFEMBA;
	}

	public String getMODPAG() {
		return MODPAG;
	}

	public void setMODPAG(String mODPAG) {
		MODPAG = mODPAG;
	}

	public String getBASCOM() {
		return BASCOM;
	}

	public void setBASCOM(String bASCOM) {
		BASCOM = bASCOM;
	}

	public String getPRECLCT() {
		return PRECLCT;
	}

	public void setPRECLCT(String pRECLCT) {
		PRECLCT = pRECLCT;
	}

	public String getDTCOLETA() {
		return DTCOLETA;
	}

	public void setDTCOLETA(String dTCOLETA) {
		DTCOLETA = dTCOLETA;
	}

	public String getDTCHGARM() {
		return DTCHGARM;
	}

	public void setDTCHGARM(String dTCHGARM) {
		DTCHGARM = dTCHGARM;
	}

	public String getDTPRESC() {
		return DTPRESC;
	}

	public void setDTPRESC(String dTPRESC) {
		DTPRESC = dTPRESC;
	}

	public String getDTAVERB() {
		return DTAVERB;
	}

	public void setDTAVERB(String dTAVERB) {
		DTAVERB = dTAVERB;
	}

	public String getDTENTREGA() {
		return DTENTREGA;
	}

	public void setDTENTREGA(String dTENTREGA) {
		DTENTREGA = dTENTREGA;
	}

	public String getBROKNM() {
		return BROKNM;
	}

	public void setBROKNM(String bROKNM) {
		BROKNM = bROKNM;
	}

	public String getNMBOOK() {
		return NMBOOK;
	}

	public void setNMBOOK(String nMBOOK) {
		NMBOOK = nMBOOK;
	}

	public String getDTBOOK() {
		return DTBOOK;
	}

	public void setDTBOOK(String dTBOOK) {
		DTBOOK = dTBOOK;
	}

	public String getTPVEIC() {
		return TPVEIC;
	}

	public void setTPVEIC(String tPVEIC) {
		TPVEIC = tPVEIC;
	}

	public String getTPCARG() {
		return TPCARG;
	}

	public void setTPCARG(String tPCARG) {
		TPCARG = tPCARG;
	}

	public String getUFEMBARQ() {
		return UFEMBARQ;
	}

	public void setUFEMBARQ(String uFEMBARQ) {
		UFEMBARQ = uFEMBARQ;
	}

	public String getINSTNEG() {
		return INSTNEG;
	}

	public void setINSTNEG(String iNSTNEG) {
		INSTNEG = iNSTNEG;
	}

	public String getTPPRP() {
		return TPPRP;
	}

	public void setTPPRP(String tPPRP) {
		TPPRP = tPPRP;
	}

	public String getDTSHIP() {
		return DTSHIP;
	}

	public void setDTSHIP(String dTSHIP) {
		DTSHIP = dTSHIP;
	}

	public String getNROCE() {
		return NROCE;
	}

	public void setNROCE(String nROCE) {
		NROCE = nROCE;
	}

	public String getDTCE() {
		return DTCE;
	}

	public void setDTCE(String dTCE) {
		DTCE = dTCE;
	}

	public List<Tgteprd> getTgteprd() {
		return tgteprd;
	}

	public void setTgteprd(List<Tgteprd> tgteprd) {
		this.tgteprd = tgteprd;
	}

	public List<ShpText> getShpText() {
		return shpText;
	}

	public void setShpText(List<ShpText> shpText) {
		this.shpText = shpText;
	}

	public List<Tgteres> getTgteres() {
		return tgteres;
	}

	public void setTgteres(List<Tgteres> tgteres) {
		this.tgteres = tgteres;
	}

	public List<Tgteduek> getTgteduek() {
		return tgteduek;
	}

	public void setTgteduek(List<Tgteduek> tgteduek) {
		this.tgteduek = tgteduek;
	}

	public List<Tgteduep> getTgteduep() {
		return tgteduep;
	}

	public void setTgteduep(List<Tgteduep> tgteduep) {
		this.tgteduep = tgteduep;
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
		Tgteshkn other = (Tgteshkn) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tgteshkn [id=" + id + ", shipping=" + shipping.getSbeln() + "]";
	}
    
    
	
}
