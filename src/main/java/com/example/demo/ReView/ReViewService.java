package com.example.demo.ReView;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReViewService {
	
	@Autowired
	ReViewDao reviewDao;
	
	public List<ReViewDto> getAllReviews() {
		return reviewDao.getAllReviews();
	}
	
	

}
