package edu.hfut.wangyu.dal;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseModel implements Serializable {

    private static final long serialVersionUID = -4268898209820709788L;

    /**
     * 逻辑删除符号
     */
    private Integer flag;

    private Date created;

    private Date modified;

}
