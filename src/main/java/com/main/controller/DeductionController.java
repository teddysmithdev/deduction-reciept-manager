package com.main.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.dto.DeductionDto;
import com.main.service.DeductionService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/deductions")
@AllArgsConstructor
@Slf4j
public class DeductionController {
	
	private final DeductionService deductionService;

	@PostMapping
	public ResponseEntity<DeductionDto> createDeductions(@RequestBody DeductionDto deductionDto){
		return ResponseEntity.status(HttpStatus.CREATED).body(deductionService.save(deductionDto));
	}
	
	public ResponseEntity<List<DeductionDto>> getAllDeductions(){
		return ResponseEntity.status(HttpStatus.OK).body(deductionService.getAll());
	}
}
