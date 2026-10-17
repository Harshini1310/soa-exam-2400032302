package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.exam.entity.PestControlBookingEntity;
import com.klef.soa.exam.service.PestControlBookingServiceImpl;

@RestController
@RequestMapping("/PestControllerBooking")
public class PestControlBookingController {

    @Autowired
    PestControlBookingServiceImpl pestImpl;

    @GetMapping("/")
    public String home() {
        return "CRUD Service is running";
    }

    @PostMapping("/Add")
    public PestControlBookingEntity addPest(
            @RequestBody PestControlBookingEntity p) {
        return pestImpl.addPest(p);
    }

    @GetMapping("/DisplayAll")
    public List<PestControlBookingEntity> displayall() {
        return pestImpl.displayAll();
    }

    @DeleteMapping("/Delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return pestImpl.deletePest(id);
    }
}