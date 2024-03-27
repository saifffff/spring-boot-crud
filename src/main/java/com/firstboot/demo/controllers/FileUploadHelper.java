package com.firstboot.demo.controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	
	Boolean uploadImage(MultipartFile file) {
		Boolean rv = false;
		final String uploadDir = "C:\\Users\\angry\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\springJPA\\src\\main\\webapp\\images";
		
		try {
			// Files.copy(input_stream, target_path, StandardCopyOption)
			Files.copy(file.getInputStream(),
					Paths.get(uploadDir+File.separator+file.getOriginalFilename()),
						StandardCopyOption.REPLACE_EXISTING);
			// on success write operation
			rv=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return rv;
	}
}
