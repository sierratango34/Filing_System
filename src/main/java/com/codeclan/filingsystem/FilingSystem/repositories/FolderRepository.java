package com.codeclan.filingsystem.FilingSystem.repositories;

import com.codeclan.filingsystem.FilingSystem.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
