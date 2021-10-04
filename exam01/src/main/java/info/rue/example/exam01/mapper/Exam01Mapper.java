package info.rue.example.exam01.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Exam01Mapper {

	String getCurrentDateTime();
}
