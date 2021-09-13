package com.bluewind.boot.configuration.quartz;

import com.bluewind.boot.sys.sysjob.entity.SysJob;
import org.quartz.JobExecutionContext;


/**
 * @author liuxingyu01
 * @date 2021-08-27-13:23
 **/
public class QuartzJobExecution extends AbstractQuartzJob {

    @Override
    protected void doExecute(JobExecutionContext context, SysJob sysJob) throws Exception {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
