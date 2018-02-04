package br.com.d2st.exportacao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Request implements Serializable{

	private static final long serialVersionUID = 2735216481371985530L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String edx;
	
	private String type;
	
	private String acao;
	
	@Enumerated(EnumType.STRING)
	private MessageNumber messageNumber;
	
	@Enumerated(EnumType.STRING)
	private MessageKind messageKind;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEdx() {
		return edx;
	}

	public void setEdx(String edx) {
		this.edx = edx;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public MessageNumber getMessageNumber() {
		return messageNumber;
	}

	public void setMessageNumber(MessageNumber messageNumber) {
		this.messageNumber = messageNumber;
	}

	public MessageKind getMessageKind() {
		return messageKind;
	}

	public void setMessageKind(MessageKind messageKind) {
		this.messageKind = messageKind;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acao == null) ? 0 : acao.hashCode());
		result = prime * result + ((edx == null) ? 0 : edx.hashCode());
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
		Request other = (Request) obj;
		if (acao == null) {
			if (other.acao != null)
				return false;
		} else if (!acao.equals(other.acao))
			return false;
		if (edx == null) {
			if (other.edx != null)
				return false;
		} else if (!edx.equals(other.edx))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Request [id=" + id + ", edx=" + edx + ", acao=" + acao + "]";
	}

	
}
