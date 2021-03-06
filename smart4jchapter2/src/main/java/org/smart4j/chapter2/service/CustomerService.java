package org.smart4j.chapter2.service;

import com.sun.media.jfxmedia.logging.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.util.PropsUtil;

import javax.servlet.http.HttpServlet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Administrator on 2017/5/17.
 * 客户数据服务
 */
public class CustomerService extends HttpServlet {

    private static final String DRIVER;
    private static final String URL;
    private static final String USERNAME;
    private static final String PASSWORD;
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);



    static {

        Properties  conf = PropsUtil.loadProps("config.properties");
        DRIVER = conf.getProperty("jdbc.driver");
        URL = conf.getProperty("jdbc.url");
        USERNAME = conf.getProperty("jdbc.username");
        PASSWORD = conf.getProperty("jdbc.password");
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            LOGGER.error("can not load jdbc driver", e);
        }


    }


    /**
     * 客户列表
     *
     * @return List<Customer>  一个限定类型为customer的列表
     */
    public List<Customer> getCustomerList() {
        Connection conn= null;
        try {
            List<Customer> customerList =new ArrayList<>();
            String sql = "select * from customer";
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            PreparedStatement stmt =conn.prepareCall(sql);
            ResultSet rs =stmt.executeQuery();
            while (rs.next()){
                Customer customer =new Customer();
                customer.setId(rs.getLong("id"));
                customer.setName(rs.getString("name"));
                customer.setContact(rs.getString("contact"));
                customer.setTelephone(rs.getString("telephone"));
                customer.setEmail(rs.getString("email"));
                customer.setRemark(rs.getString("remark"));
                customerList.add(customer);
            }
            return customerList;
        }catch (SQLException e){
            LOGGER.error("execute sql failure",e);
        }finally {
            if (conn != null) {
                try {
                    conn.close();

                } catch (SQLException e) {
                    LOGGER.error("close connection failure e");
                }
            }
        }
        return null;
    }

    /**
     * 客户
     */
    public Customer getCustomer(long Id) {
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
    public boolean updateCustomer(long id, Map<String, Object> fileName) {
        //TODO
        return false;
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomerCustomer(long id) {
        //TODO
        return false;
    }


}
