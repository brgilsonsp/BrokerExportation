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
public class Tgteduek implements Serializable {

	private static final long serialVersionUID = 3704020866186311987L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@ManyToOne
	private Tgteshkn tgteshkn;
	
	private String Type;

    private String DUEID;

    private String XLOCEMBARQ;

    private String XLOCDESPACHO;

    private String CDRAD;

    private String EMRAD;
    
    private String LATITUDE;

    private String LONGITUDE;

    private String CDRAE;

    private String EMRAE;

    private String CNPJ_DESP;

    private String WAERS;

    private String INCO1;

    @OneToMany(cascade=CascadeType.REMOVE, mappedBy="tgteduek")
    private List<AddressTabTgteduek> ADDRESS_TAB = new ArrayList<>();

    @OneToMany(cascade=CascadeType.REMOVE, mappedBy="tgteduek")
    private List<AddinfoTabTgteduek> ADDINFO_TAB = new ArrayList<>();

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

	public String getXLOCEMBARQ() {
		return XLOCEMBARQ;
	}

	public void setXLOCEMBARQ(String xLOCEMBARQ) {
		XLOCEMBARQ = xLOCEMBARQ;
	}

	public String getXLOCDESPACHO() {
		return XLOCDESPACHO;
	}

	public void setXLOCDESPACHO(String xLOCDESPACHO) {
		XLOCDESPACHO = xLOCDESPACHO;
	}

	public String getCDRAD() {
		return CDRAD;
	}

	public void setCDRAD(String cDRAD) {
		CDRAD = cDRAD;
	}

	public String getEMRAD() {
		return EMRAD;
	}

	public void setEMRAD(String eMRAD) {
		EMRAD = eMRAD;
	}

	public String getLATITUDE() {
		return LATITUDE;
	}

	public void setLATITUDE(String lATITUDE) {
		LATITUDE = lATITUDE;
	}

	public String getLONGITUDE() {
		return LONGITUDE;
	}

	public void setLONGITUDE(String lONGITUDE) {
		LONGITUDE = lONGITUDE;
	}

	public String getCDRAE() {
		return CDRAE;
	}

	public void setCDRAE(String cDRAE) {
		CDRAE = cDRAE;
	}

	public String getEMRAE() {
		return EMRAE;
	}

	public void setEMRAE(String eMRAE) {
		EMRAE = eMRAE;
	}

	public String getCNPJ_DESP() {
		return CNPJ_DESP;
	}

	public void setCNPJ_DESP(String cNPJ_DESP) {
		CNPJ_DESP = cNPJ_DESP;
	}

	public String getWAERS() {
		return WAERS;
	}

	public void setWAERS(String wAERS) {
		WAERS = wAERS;
	}

	public String getINCO1() {
		return INCO1;
	}

	public void setINCO1(String iNCO1) {
		INCO1 = iNCO1;
	}

	public List<AddressTabTgteduek> getADDRESS_TAB() {
		return ADDRESS_TAB;
	}

	public void setADDRESS_TAB(List<AddressTabTgteduek> aDDRESS_TAB) {
		ADDRESS_TAB = aDDRESS_TAB;
	}

	public List<AddinfoTabTgteduek> getADDINFO_TAB() {
		return ADDINFO_TAB;
	}

	public void setADDINFO_TAB(List<AddinfoTabTgteduek> aDDINFO_TAB) {
		ADDINFO_TAB = aDDINFO_TAB;
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
		Tgteduek other = (Tgteduek) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tgteduek [id=" + id + ", tgteshkn=" + tgteshkn.toString() + ", DUEID=" + DUEID + "]";
	}
    
    
}
