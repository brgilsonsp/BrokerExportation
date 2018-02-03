package br.com.d2st.exportacao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Client implements Serializable{
		
	private static final long serialVersionUID = 2537922461409852534L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String idbr;
	
	@NotEmpty
	private String idcl;
	
	@NotEmpty
	private String shkey;
	
	private String nameLdcl;
	
	@ManyToOne
	private Company company;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdbr() {
		return idbr;
	}

	public void setIdbr(String idbr) {
		this.idbr = idbr;
	}

	public String getIdcl() {
		return idcl;
	}

	public void setIdcl(String idcl) {
		this.idcl = idcl;
	}

	public String getShkey() {
		return shkey;
	}

	public void setShkey(String shkey) {
		this.shkey = shkey;
	}

	public String getNameLdcl() {
		return nameLdcl;
	}

	public void setNameLdcl(String nameLdcl) {
		this.nameLdcl = nameLdcl;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idbr == null) ? 0 : idbr.hashCode());
		result = prime * result + ((idcl == null) ? 0 : idcl.hashCode());
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
		Client other = (Client) obj;
		if (idbr == null) {
			if (other.idbr != null)
				return false;
		} else if (!idbr.equals(other.idbr))
			return false;
		if (idcl == null) {
			if (other.idcl != null)
				return false;
		} else if (!idcl.equals(other.idcl))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", idbr=" + idbr + ", idcl=" + idcl + ", nameLdcl=" + nameLdcl + "]";
	}
	
	
	
}
