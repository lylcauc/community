package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("aaa")
public class AlphaDaoSelect implements AlphaDao {
    @Override
    public String Select() {
        return "Select";
    }
}
