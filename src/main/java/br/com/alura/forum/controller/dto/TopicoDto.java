package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.DateTimeAtCompleted;

import br.com.alura.forum.modelo.Topico;

public class TopicoDto {

	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	
	public TopicoDto(Topico topico) {
		this.id =  topico.getId();
		this.titulo =  topico.getTitulo();
		this.mensagem =  topico.getMensagem();
		//this.dataCriacao = topico.getDataCriacao();
		
		
	}
	
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
//	public LocalDateTime getDataCriacao() {
//		return dataCriacao;
//	}
	public static List<TopicoDto> converter(List<Topico> listaTopico){
		
		int tamanhoLista = listaTopico.size();
		List<TopicoDto> listaTopicoDto =  new ArrayList();
		for (int i = 0; i<tamanhoLista;i++) {
			listaTopicoDto.add(new TopicoDto(listaTopico.get(i)));
		}
		
		
		return listaTopicoDto;
				
	}
	
}
