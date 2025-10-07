package com.catalog.persistence.mapper.ext;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.catalog.persistence.model.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductExtMapper extends BaseMapper<Product> {
}
