package br.com.financeiro.helpers;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

import br.com.financeiro.dao.PapelDao;
import br.com.financeiro.dao.UsuarioDao;
import br.com.financeiro.dominio.Usuario;

@Component("PapelConverter")
public class PapelConverter implements Converter{
	
	@Inject
	private PapelDao dao;

	@SuppressWarnings("unused")
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) throws ConverterException{
		
		
		  if(value != null || value != "") {  
			
	            return dao.find(Integer.parseInt(value)) ;  
	        }  
	        return null; 
				
		//return dao.find(Long.valueOf(value));
		
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) throws ConverterException{
		
		 if(value != null && value instanceof Usuario) {  
	            return Integer.toString(((Usuario)value).getId());  
	        }  
	        return null;
		
		
		//return ((User) value).getId().toString();
//	       Usuario usuario = (Usuario)value;    
//	       String codigo = Integer.toString(usuario.getId());
//
//		return  codigo;			
	}

	
	}
