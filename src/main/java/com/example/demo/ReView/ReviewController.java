package com.example.demo.ReView;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")
public class ReviewController {
	
	@Autowired
	ReViewService reviewService;
	
	@GetMapping("") // ¸ðµç ¸®ºä
	public List<ReViewDto> getAllReviews() {
		return reviewService.getAllReviews();
	}
	

}
