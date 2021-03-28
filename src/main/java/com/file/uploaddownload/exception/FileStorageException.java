package com.file.uploaddownload.exception;

public class FileStorageException extends RuntimeException {

	public FileStorageException(String string) {
        super(string);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
