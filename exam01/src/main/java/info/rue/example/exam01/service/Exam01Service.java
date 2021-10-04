package info.rue.example.exam01.service;

import info.rue.example.exam01.mapper.Exam01Mapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class Exam01Service {

	private Exam01Mapper exam01Mapper;

	public String getCurrentDateTime() {
		return exam01Mapper.getCurrentDateTime();
	}
}
