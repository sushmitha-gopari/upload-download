package com.file.uploaddownload.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.file.uploaddownload.model.DBFile;
import com.file.uploaddownload.service.DBFileStorageService;

@RestController
public class FileDownloadController {

	@Autowired
    private DBFileStorageService dbFileStorageService;

	@GetMapping("//downloadFile/{fileName:.+}")
	    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
	        // Load file as Resource
	        DBFile dBFile = dbFileStorageService.getFile(fileName);

	        return ResponseEntity.ok()
	                .contentType(MediaType.parseMediaType(dBFile.getFileType()))
	                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + dBFile.getFileName() + "\"")
	                .body(new ByteArrayResource(dBFile.getData()));
	    }
}