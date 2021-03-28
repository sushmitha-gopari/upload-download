package com.file.uploaddownload.payload;

public class UploadFileResponse {
	private String fileName;
	private String fileDownloaduri;
	private String fileType;
	private long size;
	
	public UploadFileResponse(String fileName, String fileDownloaduri, String fileType, long size) {
		this.fileName = fileName;
		this.fileDownloaduri = fileDownloaduri;
		this.fileType = fileType;
		this.size = size;
	}

	public String getFielName() {
		return fileName;
	}

	public void setFielName(String fielName) {
		this.fileName = fielName;
	}

	public String getFileDownloaduri() {
		return fileDownloaduri;
	}

	public void setFileDownloaduri(String fileDownloaduri) {
		this.fileDownloaduri = fileDownloaduri;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}
}
