package com.capgemini.filedbPOC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.capgemini.filedbPOC.domain.File;
import com.capgemini.filedbPOC.repository.FileRepository;

@Service
public class FileService {
	
	@Autowired
	private FileRepository fileRepo;
	
	public File saveFile(MultipartFile file) {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		
		
		
		return null;
		
	}
	
	

}
