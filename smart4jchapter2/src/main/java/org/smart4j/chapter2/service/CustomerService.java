package org.smart4j.chapter2.service;

import org.smart4j.chapter2.model.Customer;

import javax.servlet.http.HttpServlet;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/17.
 * 客户数据服务
 */
public class CustomerService extends HttpServlet{


    /**
     * 客户列表
     * @return List<Customer>  一个限定类型为customer的列表
     */
    public List<Customer> getCustomerList() {
        //todo
        return null;
    }

    /**
     * 客户
     */
    public Customer getCustomer(long Id){
        //TODO
        return null;
    }


    /**
     * 新增客户
     */
    public boolean createCustomer(Map<String, Object> fileName) {
        //TODO
        return false;
    }

    /**
     * 更新客户
     */
    public boolean updateCustomer(long id,Map<String, Object> fileName) {
        //TODO
        return false;
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomerCustomer( long id) {
        //TODO
        return false;
    }




}
