package com.math.model.repository;

import com.math.model.domain.Data;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yangkuan
 * @date 2018/09/18
 */
public interface DataRepository extends JpaRepository<Data,Long>{

}
