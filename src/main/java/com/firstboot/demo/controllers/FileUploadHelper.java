package com.firstboot.demo.controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	
	Boolean uploadImage(MultipartFile file) {
		
		Boolean rv = false;
		
		final String uploadDir = "C:\\Users\\angry\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\springJPA\\src\\main\\webapp\\images";
		try {
			// getting input stream
			InputStream is = file.getInputStream();
			// allocating data structure to read into
			byte [] img = new byte[is.available()];
			//reading into img
			is.read(img);
			
			// now we need to write this img to out images folder 
			FileOutputStream fos = new FileOutputStream(uploadDir+File.separator+file.getOriginalFilename());
			fos.write(img);
			
			//flush and close 
			fos.flush();
			fos.close();
			is.close();
			
			rv=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return rv;
	}
}
