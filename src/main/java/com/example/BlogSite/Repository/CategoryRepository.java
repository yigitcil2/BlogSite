package com.example.BlogSite.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.BlogSite.Model.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {


}
