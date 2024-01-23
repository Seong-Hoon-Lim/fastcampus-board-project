package com.fastcampus.boardproject.repository;

import com.fastcampus.boardproject.domain.UserAccount;
import com.fastcampus.boardproject.domain.projection.UserAccountProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = UserAccountProjection.class)
public interface UserAccountRepository extends JpaRepository<UserAccount, String> {

}
