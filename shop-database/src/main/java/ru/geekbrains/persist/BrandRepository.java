package ru.geekbrains.persist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.geekbrains.persist.model.Category;

public interface BrandRepository extends JpaRepository<Category, Long>, JpaSpecificationExecutor<Category> {
}
