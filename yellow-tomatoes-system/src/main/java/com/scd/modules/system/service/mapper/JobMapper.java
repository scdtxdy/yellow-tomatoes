package com.scd.modules.system.service.mapper;

import com.scd.common.mapper.CoreMapper;
import com.scd.modules.system.domain.Job;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface JobMapper extends CoreMapper<Job> {

}
