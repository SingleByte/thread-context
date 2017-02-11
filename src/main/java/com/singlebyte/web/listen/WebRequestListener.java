package com.singlebyte.web.listen;

import com.singlebyte.web.context.ThreadContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by lvkunyuan on 2017/1/24.
 * 监听HttpRequest域对象创建和销毁
 */
@WebListener
public class WebRequestListener implements ServletRequestListener {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public void requestInitialized(ServletRequestEvent var1) {

        logger.info("WebRequestListener request init");
    }


    public void requestDestroyed(ServletRequestEvent var1) {
        ThreadContext.clean();
        logger.info("clean threadContext success");
    }

}
