package com.hou.eve.search.corej.option;

import com.hou.eve.search.corej.entity.SearchDTO;

/**
 * @author hbw
 * @date 2020-07-07 21:24
 */
public interface Option {

    /**
     * 查找
     * @param searchDTO
     * @return
     */
    String doGet(SearchDTO searchDTO);

    /**
     * 插入
     * @param searchDTO
     * @return
     */
    String doPost(SearchDTO searchDTO);

    /**
     * 修改
     * @param searchDTO
     * @return
     */
    String doPut(SearchDTO searchDTO);

    /**
     * 删除
     * @param searchDTO
     * @return
     */
    String doDelete(SearchDTO searchDTO);

    /**
     * 判断是否存在
     * @param searchDTO
     * @return
     */
    String doHead(SearchDTO searchDTO);
}
