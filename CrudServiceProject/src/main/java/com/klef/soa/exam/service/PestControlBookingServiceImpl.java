package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.PestControlBookingEntity;
import com.klef.soa.exam.repository.PestControlBookingRepository;

@Service
public class PestControlBookingServiceImpl implements PestControlBookingService{
	
	@Autowired
	PestControlBookingRepository pestControlBookingRepository;

	@Override
	public PestControlBookingEntity addPest(PestControlBookingEntity p) {
		return pestControlBookingRepository.save(p);
	}

	@Override
	public List<PestControlBookingEntity> displayAll() {
		return pestControlBookingRepository.findAll();
	}

	@Override
	public String deletePest(Long id) {
		pestControlBookingRepository.deleteById(id);
        return "Student deleted successfully";
	}

}
