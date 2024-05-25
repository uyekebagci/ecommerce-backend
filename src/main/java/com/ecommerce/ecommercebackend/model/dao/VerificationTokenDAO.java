package com.ecommerce.ecommercebackend.model.dao;

import com.ecommerce.ecommercebackend.model.VerificationToken;
import org.springframework.data.repository.ListCrudRepository;

public interface VerificationTokenDAO extends ListCrudRepository<VerificationToken, Long> {
}
