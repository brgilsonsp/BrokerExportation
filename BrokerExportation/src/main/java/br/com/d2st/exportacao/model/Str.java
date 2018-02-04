package br.com.d2st.exportacao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Str implements Serializable{

	private static final long serialVersionUID = -7060382316125557260L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String type;
	
	private String xmlvr;
	
	private String envrm;
	
	private String intnr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getXmlvr() {
		return xmlvr;
	}

	public void setXmlvr(String xmlvr) {
		this.xmlvr = xmlvr;
	}

	public String getEnvrm() {
		return envrm;
	}

	public void setEnvrm(String envrm) {
		this.envrm = envrm;
	}

	public String getIntnr() {
		return intnr;
	}

	public void setIntnr(String intnr) {
		this.intnr = intnr;
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
		Str other = (Str) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Str [id=" + id + ", xmlvr=" + xmlvr + ", envrm=" + envrm + ", intnr=" + intnr + "]";
	}

	
}
