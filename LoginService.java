package com.Caioschuengue.br.service;

import org.springframework.stereotype.Service;

import com.Caio.br.entities.Usuario;
@Service
public class LoginService {
	
	public boolean validarLogin(Usuario usuario) {
		return "admin".equals(usuario.getUsername()) && "1234".equals(usuario.getPassword());
		}
	}

