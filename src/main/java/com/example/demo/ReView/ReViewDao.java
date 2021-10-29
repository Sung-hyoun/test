package com.example.demo.ReView;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ReViewDao {
	
	public static List<ReViewDto> reviews;
	
	static {
		reviews = new ArrayList();
		
		reviews.add(new ReViewDto(1, "대상1", "작성자1", "리뷰 내용1", "평가 항목1"));
		reviews.add(new ReViewDto(2, "대상2", "작성자2", "리뷰 내용2", "평가 항목2"));
		reviews.add(new ReViewDto(3, "대상3", "작성자3", "리뷰 내용3", "평가 항목3"));
		reviews.add(new ReViewDto(4, "대상4", "작성자4", "리뷰 내용4", "평가 항목4"));
		reviews.add(new ReViewDto(5, "대상5", "작성자5", "리뷰 내용5", "평가 항목5"));
		
	}
	
	public List<ReViewDto> getAllReviews() {
		return reviews;
	}

}
