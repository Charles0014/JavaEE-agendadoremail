package br.com.alura;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import br.com.alura.Exception.BusinessException;
import br.com.alura.dto.MensagemErroDto;


@Provider
public class BusinessExceptionMapper implements ExceptionMapper<BusinessException>{
	
	@Override
	public Response toResponse(BusinessException exception) {
	    return Response
	            .status(Response.Status.BAD_REQUEST)
	            .entity( MensagemErroDto.build(exception.getMensagens()))
	            .build();
	}
}
