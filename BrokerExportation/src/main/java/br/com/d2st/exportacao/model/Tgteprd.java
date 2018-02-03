package br.com.d2st.exportacao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Tgteprd implements Serializable{

	private static final long serialVersionUID = 6798138355481889919L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@ManyToOne
	private Tgteshkn tgteshkn;

	private String Type;

    private String PARVW;

    private String PARID;

    private String NAME1;

    private String NAME2;

    private String STREET;
    
    private String HOUSE_NUM1;

    private String HOUSE_NUM2;

    private String POST_CODE1;

    private String CITY1;

    private String CITY2;

    private String PSTLZ;

    private String REGION;

    private String COUNTRY;

    private String STCD1;

    private String STCD3;

    private String STCD4;

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

	public String getPARVW() {
		return PARVW;
	}

	public void setPARVW(String pARVW) {
		PARVW = pARVW;
	}

	public String getPARID() {
		return PARID;
	}

	public void setPARID(String pARID) {
		PARID = pARID;
	}

	public String getNAME1() {
		return NAME1;
	}

	public void setNAME1(String nAME1) {
		NAME1 = nAME1;
	}

	public String getNAME2() {
		return NAME2;
	}

	public void setNAME2(String nAME2) {
		NAME2 = nAME2;
	}

	public String getSTREET() {
		return STREET;
	}

	public void setSTREET(String sTREET) {
		STREET = sTREET;
	}

	public String getHOUSE_NUM1() {
		return HOUSE_NUM1;
	}

	public void setHOUSE_NUM1(String hOUSE_NUM1) {
		HOUSE_NUM1 = hOUSE_NUM1;
	}

	public String getHOUSE_NUM2() {
		return HOUSE_NUM2;
	}

	public void setHOUSE_NUM2(String hOUSE_NUM2) {
		HOUSE_NUM2 = hOUSE_NUM2;
	}

	public String getPOST_CODE1() {
		return POST_CODE1;
	}

	public void setPOST_CODE1(String pOST_CODE1) {
		POST_CODE1 = pOST_CODE1;
	}

	public String getCITY1() {
		return CITY1;
	}

	public void setCITY1(String cITY1) {
		CITY1 = cITY1;
	}

	public String getCITY2() {
		return CITY2;
	}

	public void setCITY2(String cITY2) {
		CITY2 = cITY2;
	}

	public String getPSTLZ() {
		return PSTLZ;
	}

	public void setPSTLZ(String pSTLZ) {
		PSTLZ = pSTLZ;
	}

	public String getREGION() {
		return REGION;
	}

	public void setREGION(String rEGION) {
		REGION = rEGION;
	}

	public String getCOUNTRY() {
		return COUNTRY;
	}

	public void setCOUNTRY(String cOUNTRY) {
		COUNTRY = cOUNTRY;
	}

	public String getSTCD1() {
		return STCD1;
	}

	public void setSTCD1(String sTCD1) {
		STCD1 = sTCD1;
	}

	public String getSTCD3() {
		return STCD3;
	}

	public void setSTCD3(String sTCD3) {
		STCD3 = sTCD3;
	}

	public String getSTCD4() {
		return STCD4;
	}

	public void setSTCD4(String sTCD4) {
		STCD4 = sTCD4;
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
		Tgteprd other = (Tgteprd) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tgteprd [id=" + id + ", tgteshkn=" + tgteshkn.toString() + "]";
	}
    
    
}
