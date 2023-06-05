package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;

import java.util.List;
public interface UsuarioDao {
     List<Usuario> getUsuarios();

     void eliminar();

     void eliminar(Long id);

     boolean registrar(Usuario usuario);

     Usuario obtenerUsuarioPorCredenciales(Usuario usuario);
}
