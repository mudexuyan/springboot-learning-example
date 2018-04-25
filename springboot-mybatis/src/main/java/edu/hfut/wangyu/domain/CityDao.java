package edu.hfut.wangyu.domain;

import org.apache.ibatis.annotations.Param;
import edu.hfut.wangyu.dal.City;
import org.springframework.stereotype.Component;

/**
 * 城市 DAO 接口类
 *
 * Created by bysocket on 07/02/2017.
 */
@Component
public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);

}
