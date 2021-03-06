package com.how2java.tmall.dao;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.pojo.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDAO extends JpaRepository<Product,Integer> {
    Page<Product> findByCategory(Category category, Pageable pageable);
    //前端业务需要 不需要分类
    List<Product> findByCategoryOrderById(Category category);
    //比较原视的模糊查询
    List<Product> findByNameLike(String keyword, Pageable pageable);
}
