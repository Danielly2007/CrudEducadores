package com.proficao.educadores_Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.proficao.educadores_DTO.EduDTO;
import com.proficao.educadores_Model.EduModel;
import com.proficao.educadores_Repository.EduRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

public class EduController {
	
	@Autowired
	EduRepository repo;
	@GetMapping
	public ResponseEntity<?> GetEdu(){
		List<EduModel> lista = repo.findAll();
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping
	public ResponseEntity<?> POstEdu(@RequestBody @Valid EduDTO data){
	EduModel mewEdu = new EduModel(data);
		System.out.println(data);
		repo.save(newEdu);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<?> UpdateEdu(@PathVariable ("id") Long id, @RequestBody @Valid EduDTO eduDTO){
		Optional<EduModel> optionalEdu = repo.findById();
		
		if (optionalEdu.isPresent()) {
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
