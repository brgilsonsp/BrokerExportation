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

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Tgteduep implements Serializable {

	private static final long serialVersionUID = 8574685431968095431L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@ManyToOne
	private Tgteshkn tgteshkn;
	
	private String Type;

    private String DUEID;

    private String DUEPOSNR;

    private String DUENUM;

    private String DUEITM;

    private String RUCNUM;
            
    private String PRCFOB;

    private String CDLANDD;

    private String MENGE;

    private String NETWR;

    private String MENGE_TRIB;

    private String NTGEW;

    private String ENQDM;

    private String PRVDOCID;

    private String PRVTPCODE;
    
    private String PCTCOM;

    private String CHAVENFE;

    private String TPCDREM;

    private String CNPJCPF;

    private String CHAVENF_FORM;

    private String CDNFR;

    private String CPNJCPFEXP;

    @OneToMany(cascade=CascadeType.REMOVE, mappedBy="tgteduep")
    private List<AddinfoTabTgteduep> ADDINFO_TAB = new ArrayList<>();

    @OneToMany(cascade=CascadeType.REMOVE, mappedBy="tgteduep")
    private List<NferefTabTgteduep> NFEREF_TAB = new ArrayList<>();

    @OneToMany(cascade=CascadeType.REMOVE, mappedBy="tgteduep")
    private List<AtoconTabTgteduep> ATOCON_TAB = new ArrayList<>();

    @OneToMany(cascade=CascadeType.REMOVE, mappedBy="tgteduep")
    private List<DuetribTabTgteduep> DUEATRIB_TAB = new ArrayList<>();

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

	public String getDUENUM() {
		return DUENUM;
	}

	public void setDUENUM(String dUENUM) {
		DUENUM = dUENUM;
	}

	public String getDUEITM() {
		return DUEITM;
	}

	public void setDUEITM(String dUEITM) {
		DUEITM = dUEITM;
	}

	public String getRUCNUM() {
		return RUCNUM;
	}

	public void setRUCNUM(String rUCNUM) {
		RUCNUM = rUCNUM;
	}

	public String getPRCFOB() {
		return PRCFOB;
	}

	public void setPRCFOB(String pRCFOB) {
		PRCFOB = pRCFOB;
	}

	public String getCDLANDD() {
		return CDLANDD;
	}

	public void setCDLANDD(String cDLANDD) {
		CDLANDD = cDLANDD;
	}

	public String getMENGE() {
		return MENGE;
	}

	public void setMENGE(String mENGE) {
		MENGE = mENGE;
	}

	public String getNETWR() {
		return NETWR;
	}

	public void setNETWR(String nETWR) {
		NETWR = nETWR;
	}

	public String getMENGE_TRIB() {
		return MENGE_TRIB;
	}

	public void setMENGE_TRIB(String mENGE_TRIB) {
		MENGE_TRIB = mENGE_TRIB;
	}

	public String getNTGEW() {
		return NTGEW;
	}

	public void setNTGEW(String nTGEW) {
		NTGEW = nTGEW;
	}

	public String getENQDM() {
		return ENQDM;
	}

	public void setENQDM(String eNQDM) {
		ENQDM = eNQDM;
	}

	public String getPRVDOCID() {
		return PRVDOCID;
	}

	public void setPRVDOCID(String pRVDOCID) {
		PRVDOCID = pRVDOCID;
	}

	public String getPRVTPCODE() {
		return PRVTPCODE;
	}

	public void setPRVTPCODE(String pRVTPCODE) {
		PRVTPCODE = pRVTPCODE;
	}

	public String getPCTCOM() {
		return PCTCOM;
	}

	public void setPCTCOM(String pCTCOM) {
		PCTCOM = pCTCOM;
	}

	public String getCHAVENFE() {
		return CHAVENFE;
	}

	public void setCHAVENFE(String cHAVENFE) {
		CHAVENFE = cHAVENFE;
	}

	public String getTPCDREM() {
		return TPCDREM;
	}

	public void setTPCDREM(String tPCDREM) {
		TPCDREM = tPCDREM;
	}

	public String getCNPJCPF() {
		return CNPJCPF;
	}

	public void setCNPJCPF(String cNPJCPF) {
		CNPJCPF = cNPJCPF;
	}

	public String getCHAVENF_FORM() {
		return CHAVENF_FORM;
	}

	public void setCHAVENF_FORM(String cHAVENF_FORM) {
		CHAVENF_FORM = cHAVENF_FORM;
	}

	public String getCDNFR() {
		return CDNFR;
	}

	public void setCDNFR(String cDNFR) {
		CDNFR = cDNFR;
	}

	public String getCPNJCPFEXP() {
		return CPNJCPFEXP;
	}

	public void setCPNJCPFEXP(String cPNJCPFEXP) {
		CPNJCPFEXP = cPNJCPFEXP;
	}

	public List<AddinfoTabTgteduep> getADDINFO_TAB() {
		return ADDINFO_TAB;
	}

	public void setADDINFO_TAB(List<AddinfoTabTgteduep> aDDINFO_TAB) {
		ADDINFO_TAB = aDDINFO_TAB;
	}

	public List<NferefTabTgteduep> getNFEREF_TAB() {
		return NFEREF_TAB;
	}

	public void setNFEREF_TAB(List<NferefTabTgteduep> nFEREF_TAB) {
		NFEREF_TAB = nFEREF_TAB;
	}

	public List<AtoconTabTgteduep> getATOCON_TAB() {
		return ATOCON_TAB;
	}

	public void setATOCON_TAB(List<AtoconTabTgteduep> aTOCON_TAB) {
		ATOCON_TAB = aTOCON_TAB;
	}

	public List<DuetribTabTgteduep> getDUEATRIB_TAB() {
		return DUEATRIB_TAB;
	}

	public void setDUEATRIB_TAB(List<DuetribTabTgteduep> dUEATRIB_TAB) {
		DUEATRIB_TAB = dUEATRIB_TAB;
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
		Tgteduep other = (Tgteduep) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tgteduep [id=" + id + ", tgteshkn=" + tgteshkn.toString() + ", DUEID=" + DUEID + "]";
	}
	
    
}
