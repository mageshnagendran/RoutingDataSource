package com.magesh.common.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Around("com.magesh.common.aspect.CommonJoinPointConfig.monitorTimeAnnotation()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		Object returnProceed = joinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("Time Taken by Class : {}; Method : {} is {} ms", joinPoint.getTarget().getClass().getName(), joinPoint.getSignature().getName(), timeTaken);
		return returnProceed;
	}
}
