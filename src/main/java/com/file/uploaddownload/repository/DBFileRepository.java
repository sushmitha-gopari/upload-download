package com.file.uploaddownload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.file.uploaddownload.model.DBFile;

@Repository
public interface DBFileRepository extends JpaRepository<DBFile, String>{

}
