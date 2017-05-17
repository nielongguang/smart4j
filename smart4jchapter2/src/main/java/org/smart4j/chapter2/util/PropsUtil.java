package org.smart4j.chapter2.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * Created by Administrator on 2017/5/17.
 */

public final class PropsUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    /**
     * 加载属性文件
     */
    public static Properties loadProps(String fileName) {
        Properties properties = null;
        InputStream is;
        is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
        try {
            if (is == null) {
                throw new FileNotFoundException(fileName + "file is not find");
            }
        }catch (FileNotFoundException e){
            LOGGER.error("load properties file failure",e);
        }finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    LOGGER.error("close input stream failure",e);
                }
            }
        }
    return properties;
    }


}
