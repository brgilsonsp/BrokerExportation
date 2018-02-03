package br.com.d2st.exportacao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class StatusResponse implements Serializable  {
	
	private static final long serialVersionUID = -4388455838613704622L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String code;
	
	private String descr;
	
	private String dataResponse;
	
	@Enumerated(EnumType.STRING)
	private MessageNumber messageNumber;
	
	@Enumerated(EnumType.STRING)
	private MessageKind messageKing;
	
	private String sbeln;
	
	@ManyToOne
	private Company company;	
	
	@OneToMany(cascade=CascadeType.REMOVE, mappedBy="statusResponse")
	private List<ErrorResponse> errorsResponse = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getDataResponse() {
		return dataResponse;
	}

	public void setDataResponse(String dataResponse) {
		this.dataResponse = dataResponse;
	}

	public MessageNumber getMessageNumber() {
		return messageNumber;
	}

	public void setMessageNumber(MessageNumber messageNumber) {
		this.messageNumber = messageNumber;
	}

	public MessageKind getMessageKing() {
		return messageKing;
	}

	public void setMessageKing(MessageKind messageKing) {
		this.messageKing = messageKing;
	}

	public String getSbeln() {
		return sbeln;
	}

	public void setSbeln(String sbeln) {
		this.sbeln = sbeln;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public List<ErrorResponse> getErrorsResponse() {
		return errorsResponse;
	}

	public void setErrorsResponse(List<ErrorResponse> errorsResponse) {
		this.errorsResponse = errorsResponse;
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
		StatusResponse other = (StatusResponse) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		
		return "StatusResponse [id=" + id + ", code=" + code + ", dataResponse=" + dataResponse + ", messageNumber="
				+ messageNumber + ", company=" + company.getName() + "]";
	}
	
	
	
}
