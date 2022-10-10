package com.rpsb.portal.Reform.Portal.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpsb.portal.Reform.Portal.model.NgoBranch;
import com.rpsb.portal.Reform.Portal.repo.NgoBranchRepository;

@Service
public class NgoBranchService {
	private static final Logger log = LoggerFactory.getLogger(NgoBranchService.class);
	@Autowired
		private NgoBranchRepository repository;
		
		
		public String addNgoBranch(NgoBranch ngobranch) {
		repository.save(ngobranch);
		return "Ngo Branch Saved";
		
	}

}
