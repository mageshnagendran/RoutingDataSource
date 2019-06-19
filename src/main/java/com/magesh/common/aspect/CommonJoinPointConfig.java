package com.magesh.common.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("@annotation(com.magesh.common.aspect.MonitorTime)")
	public void monitorTimeAnnotation(){}

}
