package com.example.accessingdatajpa.service;

import java.util.Optional;

import org.springframework.stereotype.Controller;

import com.example.accessingdatajpa.model.Angle;

//API - application prog interface 
public interface IAngelService {
	
	public Optional<Angle> getAngleById(Long id) throws Exception;
	
	public Iterable<Angle> getAllAngle() ;
	
	public  Angle addAngle( Angle angle) ;
	
	public  String deleteAngleByid(Long id) ;
	
	public  Angle updateAngle(Angle newAngle ,Long id);
	
}

