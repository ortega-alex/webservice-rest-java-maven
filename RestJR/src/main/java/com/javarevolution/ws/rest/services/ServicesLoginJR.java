package com.javarevolution.ws.rest.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.javarevolution.ws.rest.vo.VOUsuario;

@Path("/javaRevolution")
public class ServicesLoginJR {

	@POST
	@Path("/validaUsuario")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOUsuario validaUsuario(VOUsuario vo) {
		vo.setUserValido(false);
		if ( vo.getUsuario().equals("java") && vo.getPassword().equals("javaRevolution") ) {
			vo.setUserValido(true);
		}
		vo.setPassword("*********");
		return vo;
	}
}
