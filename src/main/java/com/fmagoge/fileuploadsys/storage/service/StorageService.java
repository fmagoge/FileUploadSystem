package com.fmagoge.fileuploadsys.storage.service;

import org.springframework.web.multipart.MultipartFile;


public interface StorageService {

	void init();

	void store(MultipartFile file);

	void deleteAll();
}
