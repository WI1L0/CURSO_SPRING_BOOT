package com.williamMartinez.app.services;

import java.awt.print.Pageable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.williamMartinez.app.model.Usuario;
import com.williamMartinez.app.repository.IUsuarioRepository;

@Service
public class UsuarioServicesImpl implements IUsuarioServicesImpl{

	@Autowired
	private IUsuarioRepository repository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Usuario> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	/*@Override
	@Transactional(readOnly = true)
	public Page<Usuario> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll(pageable);
	}*/

	@Override
	@Transactional
	public Optional<Usuario> findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	@Transactional
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return repository.save(usuario);
	}

	@Override
	public void deleteByid(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Page<Usuario> findAll(org.springframework.data.domain.Pageable pageable) {
		// TODO Auto-generated method stub
		return repository.findAll(pageable);
	}
}
