package com.math.model.repository;

import com.math.model.domain.Filtered;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yangkuan
 * @date 2018/09/17
 */
public interface FilteredRepository extends JpaRepository<Filtered,Long>{
}
