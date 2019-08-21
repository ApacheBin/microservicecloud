package cn.edu.ecust.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: xubin
 * @Date: 2018/11/30 15:35
 */

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {//必须序列化
    private Long deptno;
    private String dname;
    private String db_source;
    public Dept(String dname) {
        this.dname = dname;
    }
}
