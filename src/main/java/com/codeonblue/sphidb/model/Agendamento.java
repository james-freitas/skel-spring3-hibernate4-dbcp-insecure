package com.codeonblue.sphidb.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name="agendamento")
@Entity
public class Agendamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "data_agendamento")
	@Temporal(TemporalType.DATE)
	private Calendar data;
	
	@Column(length = 5)
	private String horaInicioAtendimento;
	
	@Column(length = 5)
	private String horaFimAtendimento;
	
	@Enumerated(EnumType.STRING)
	private StatusAgendamento statusAgendamento;
	
	@Column(length = 512)
	private String observacao;
	
	@ManyToOne
	@JoinColumn(name = "id_servico", nullable = false)
	private Servico servico;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuario usuario;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public String getHoraInicioAtendimento() {
		return horaInicioAtendimento;
	}
	public void setHoraInicioAtendimento(String horaInicioAtendimento) {
		this.horaInicioAtendimento = horaInicioAtendimento;
	}
	public String getHoraFimAtendimento() {
		return horaFimAtendimento;
	}
	public void setHoraFimAtendimento(String horaFimAtendimento) {
		this.horaFimAtendimento = horaFimAtendimento;
	}
	public StatusAgendamento getStatus() {
		return statusAgendamento;
	}
	public void setStatus(StatusAgendamento status) {
		this.statusAgendamento = status;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
