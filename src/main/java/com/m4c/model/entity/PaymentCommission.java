	package com.m4c.model.entity;

	import java.io.Serializable;
	import java.util.Date;
	import javax.persistence.AttributeOverride;
	import javax.persistence.AttributeOverrides;
	import javax.persistence.Column;
	import javax.persistence.EmbeddedId;
	import javax.persistence.Entity;
	import javax.persistence.Table;


	/**
	* @author Jose Antonio Arroniz
	* @version 1.0
	*/
	@Entity
	@Table (name="M4CCOMISIONESPAGADAS")
	public class PaymentCommission implements Serializable {
		private static final long serialVersionUID = 1L;
		
		private CommissionServicePk pk;
		private Long idbooking;
		private Date date;
		private Long reservation;
		private Long idsubservice;
		private Long idcontracService;
		private String subservice;
		private Long category;
		private Double amount;
		private String user;
		
		 @EmbeddedId
		    @AttributeOverrides( {
		        @AttributeOverride(name="idService", column=@Column(name="IDSERVCONTRATADO", unique=false, nullable=false) ),
		        @AttributeOverride(name="booking", column=@Column(name="BOOKING", unique=false, nullable=false) ) } )		
		public CommissionServicePk getPk() {
			return pk;
		}

		public void setPk(CommissionServicePk pk) {
			this.pk = pk;
		}

		@Column (name="BOOKING", unique=false, nullable=false, insertable=false, updatable=false)
		public Long getIdbooking() {
			return idbooking;
		}

		public void setIdbooking(Long idbooking) {
			this.idbooking = idbooking;
		}

		
		@Column (name="FECHA")
		public Date getDate() {
			return date;
		}
		
		public void setDate(Date date) {
			this.date = date;
		}
		
		@Column (name="IDRESERVACION")
		public Long getReservation() {
			return reservation;
		}
		public void setReservation(Long reservation) {
			this.reservation = reservation;
		}
		
		
		@Column (name="IDSUBSERVICIO")
		public Long getIdsubservice() {
			return idsubservice;
		}
		public void setIdsubservice(Long idsubservice) {
			this.idsubservice = idsubservice;
		}
		
		@Column (name="IDSERVCONTRATADO", unique=false, nullable=false, insertable=false, updatable=false)
		public Long getIdcontracService() {
			return idcontracService;
		}

		public void setIdcontracService(Long idcontracService) {
			this.idcontracService = idcontracService;
		}

		
		@Column (name="SUBSERVICIO")
		public String getSubservice() {
			return subservice;
		}
		public void setSubservice(String subservice) {
			this.subservice = subservice;
		}
		
		@Column (name="CATEGORIA")
		public Long getCategory() {
			return category;
		}
		public void setCategory(Long category) {
			this.category = category;
		}
		
		@Column (name="IMPORTE")
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
		}
		
		@Column (name="IDUSER")
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		

	}

