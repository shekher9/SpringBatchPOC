package com.ri.processer;

import org.springframework.batch.item.ItemProcessor;

import com.ri.model.ExamResult;

public class ExamResultProcesser implements ItemProcessor<ExamResult, ExamResult> {

	@Override
	public ExamResult process(ExamResult item) throws Exception {
		if(item.getPercentage()>=85)
			return item;
		else
			return null;
	}

}
