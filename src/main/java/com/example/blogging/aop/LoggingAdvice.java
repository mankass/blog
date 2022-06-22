package com.example.blogging.aop;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAdvice {

    Logger log = LoggerFactory.getLogger(LoggingAdvice.class);

   // @Pointcut(value ="execution(public * com.example.blogging.Mail.*.*(..) ) ")
     @Pointcut(value ="execution(public * com.example.blogging.service.*.*(..) ) ")

    public void myPointcut(){

    }

    @Around("myPointcut()")
    public Object applicationLogger(ProceedingJoinPoint pjp) throws Throwable {

        long startTime=System.currentTimeMillis();
        ObjectMapper mapper = new ObjectMapper();
        String methodName = pjp.getSignature().getName();
        String className = pjp.getTarget().getClass().toString();
        Object[] array = pjp.getArgs();
        log.info("method invoke"+ methodName+" : class name "+className+ "arguments"+mapper.writeValueAsString(array));
        Object temp=pjp.proceed();
        long endTime=System.currentTimeMillis();

        log.info( methodName+" : class name "+className+ "arguments"+
                mapper.writeValueAsString(temp) +" time is "+(endTime-startTime));
        return  temp;
    }
}
