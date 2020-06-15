package com.main.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.dto.DeductionDto;
import com.main.model.Deduction;
import com.main.repository.DeductionRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class DeductionService {
	
	private final DeductionRepository deductionRepository;
	
	@Transactional
	public void save(DeductionDto deductionDto) {
		Deduction deduction = mapDeductionDto(deductionDto);
		deductionRepository.save(deduction);
	}
	
	public Deduction mapDeductionDto(DeductionDto deductionDto) {
		return Deduction.builder().name(deductionDto.getName()).description(deductionDto.getDescription()).build();
	}
	
	private DeductionDto mapToDto(Deduction deduction) {
		return DeductionDto.builder().name(deduction.getName())
				.id(deduction.getId())
				.description(deduction.getDescription())
				.build();
	}
	
	@Transactional(readOnly = true)
	public void getAll() {
		return deductionRepository.findAll().stream().map(this::mapToDto).collect(toList());
	}
}
