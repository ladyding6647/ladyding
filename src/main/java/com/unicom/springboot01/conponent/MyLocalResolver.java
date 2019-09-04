package com.unicom.springboot01.conponent;

import com.sun.corba.se.spi.resolver.LocalResolver;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 这个类是:${END}
 *
 * @author lyl
 * @version 1.0
 * Date: 2019/5/30 14:46
 */
public class MyLocalResolver implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String l = request.getParameter("l");
        Locale locale = Locale.getDefault();
        /*zh_CN*/
        if(!StringUtils.isEmpty(l)){
            String[] str = l.split("_");
            locale = new Locale(str[0],str[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
