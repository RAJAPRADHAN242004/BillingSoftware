package com.billing.service;

import com.billing.io.CategoryRequest;
import com.billing.io.CategoryResponse;

public interface CategoryService {
    CategoryResponse add(CategoryRequest request);
}
