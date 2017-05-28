package xyz.xiaomilier.common.base.mapper;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by 袁恩光 on 2017/3/26.
 */
@Repository
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
