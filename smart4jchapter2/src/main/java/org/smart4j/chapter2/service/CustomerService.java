package org.smart4j.chapter2.service;

import com.sun.org.apache.bcel.internal.generic.RETURN;
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
     * @return
     */
    public List<Customer> getCustomerList() {
        //todo
        return null;
    }

    /**
     * 客户
     * @param Id
     * @return
     */
    public Customer getCustomer(long Id){
        //TODO
        return null;
    }


    /**
     * 新增客户
     * @return
     */
    public boolean CreateCustomer(Map<String, Object> fileName) {
        //TODO
        return false;
    }

    /**
     * 更新客户
     * @param id
     * @param fileName
     * @return
     */
    public boolean updateCustomer(long id,Map<String, Object> fileName) {
        //TODO
        return false;
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomerCustomer( long id) {
        //TODO
        return false;
    }




}
