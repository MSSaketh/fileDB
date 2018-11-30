package com.capgemini.filedbPOC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.filedbPOC.domain.File;

@Repository
public interface FileRepository extends JpaRepository<File, String> {

}
