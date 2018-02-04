package br.com.d2st.exportacao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames= {"sbeln","messageKind"}))
public class Shipping implements Serializable{

	private static final long serialVersionUID = 6487245478028482330L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	
	@NotEmpty
	private String sbeln;
	
	private String stcod;
	
	private String descr;
	
	private String lasup;
	
	@Enumerated(EnumType.STRING)
	@NotEmpty
	private MessageKind messageKind;
	
	@ManyToOne
	private Client client;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSbeln() {
		return sbeln;
	}

	public void setSbeln(String sbeln) {
		this.sbeln = sbeln;
	}

	public String getStcod() {
		return stcod;
	}

	public void setStcod(String stcod) {
		this.stcod = stcod;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getLasup() {
		return lasup;
	}

	public void setLasup(String lasup) {
		this.lasup = lasup;
	}

	public MessageKind getMessageKind() {
		return messageKind;
	}

	public void setMessageKind(MessageKind messageKind) {
		this.messageKind = messageKind;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((messageKind == null) ? 0 : messageKind.hashCode());
		result = prime * result + ((sbeln == null) ? 0 : sbeln.hashCode());
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
		Shipping other = (Shipping) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (messageKind != other.messageKind)
			return false;
		if (sbeln == null) {
			if (other.sbeln != null)
				return false;
		} else if (!sbeln.equals(other.sbeln))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Shipping [id=" + id + ", sbeln=" + sbeln + ", messageKind=" + messageKind + ", client=" + client.getId() + "]";
	}


	
}
