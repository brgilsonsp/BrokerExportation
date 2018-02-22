package br.com.d2st.exportacao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class AddressTabTgteduek implements Serializable{
		
	private static final long serialVersionUID = 1337682096586996865L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@ManyToOne
	private Tgteduek tgteduek;

	public String type;

	private String dueid;

    private String adrnr;

    private String lineseq;

    private String content;

    @Deprecated
	public AddressTabTgteduek() { }

	public AddressTabTgteduek(Tgteduek tgteduek, String type) {
		super();
		this.tgteduek = tgteduek;
		this.type = type;
	}

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
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDueid() {
		return dueid;
	}

	public void setDueid(String dueid) {
		this.dueid = dueid;
	}

	public String getAdrnr() {
		return adrnr;
	}

	public void setAdrnr(String adrnr) {
		this.adrnr = adrnr;
	}

	public String getLineseq() {
		return lineseq;
	}

	public void setLineseq(String lineseq) {
		this.lineseq = lineseq;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
		AddressTabTgteduek other = (AddressTabTgteduek) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AddressTabTgteduek [id=" + id + ", tgteduek=" + tgteduek.getId() + ", type=" + type + "]";
	}

    
}
