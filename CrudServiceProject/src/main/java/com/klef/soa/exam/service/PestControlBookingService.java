package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.PestControlBookingEntity;

public interface PestControlBookingService {

	PestControlBookingEntity addPest(PestControlBookingEntity p);
	
	List<PestControlBookingEntity> displayAll();
	
	String deletePest(Long id);
}
