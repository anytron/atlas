package com.atlas.base.mapper;

import tk.mybatis.mapper.common.Mapper;

/**
 * @description 
 * <pre>
 * 作用: 所有mapper需要实现此接口
 * 实现此接口可实现集成功能基础CRUD功能
 * 特殊sql比如联合查询多表等使用自定义方法自定义mapper映射sql
 * </pre>
 * @className BaseMapper
 * @author anytron
 * @date 2020年2月5日下午10:00:38
 * @version 1.0
 * @param <T>
 */
public interface BaseMapper<T> extends Mapper<T> {

}
