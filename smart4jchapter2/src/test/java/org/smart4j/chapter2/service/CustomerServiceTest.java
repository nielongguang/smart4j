package org.smart4j.chapter2.service; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.smart4j.chapter2.model.Customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 
* CustomerService Tester. 
* 
* @author <Authors name> 
* @since <pre>ÎåÔÂ 17, 2017</pre> 
* @version 1.0 
*/ 
public class CustomerServiceTest {

    CustomerService customerService =new CustomerService() ;

    @Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getCustomerList() 
* 
*/ 
@Test
public void testGetCustomerList() throws Exception {

    long length =2;
    List<Customer> customerList = customerService.getCustomerList();
    Assert.assertEquals(length,customerList.size());
} 

/** 
* 
* Method: getCustomer(long Id) 
* 
*/ 
@Test
public void testGetCustomer() throws Exception {
    long id =1;
   Assert.assertNotNull(customerService.getCustomer(id));
} 

/** 
* 
* Method: CreateCustomer(Map<String, Object> fileName) 
* 
*/ 
@Test
public void testCreateCustomer() throws Exception {
    Map<String,Object> fileMap = new HashMap<>();
    fileMap.put("name", "customer100");
    fileMap.put("contact","john");
    fileMap.put("telephone", "13512345678");
    boolean result =customerService.createCustomer(fileMap);
    Assert.assertTrue(result);


}

/** 
* 
* Method: updateCustomer(long id, Map<String, Object> fileName) 
* 
*/ 
@Test
public void testUpdateCustomer() throws Exception { 
  Map<String,Object> fileMap = new HashMap<>();
    fileMap.put("contact", "Eric");
    fileMap.put("name", "customer100");
    fileMap.put("telephone","13412345678");
    boolean result=customerService.createCustomer(fileMap);
    Assert.assertTrue(result);


} 

/** 
* 
* Method: deleteCustomerCustomer(long id) 
* 
*/ 
@Test
public void testDeleteCustomerCustomer() throws Exception {
    long id =1;
    Assert.assertTrue(customerService.deleteCustomerCustomer(id));
} 


} 
