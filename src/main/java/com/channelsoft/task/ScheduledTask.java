package com.channelsoft.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * <dl>
 * <dt>ScheduledTask</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2006</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2018-12-27 16:35</dd>
 * </dl>
 *
 * @author nanrt
 */
@Component
@Slf4j
public class ScheduledTask {
	/**
	 * fixedRate的单位是毫秒
	 */
	@Scheduled(fixedRate = 100 * 30)
	public void testTask1() {
		log.info("启动第一个定时任务testTask1");
		log.info("Scheduling Tasks Examples: The time is now " + new Date());
	}

	@Scheduled(cron = "*/3 * * * * ?")
	public void testTask2() {
		log.info("启动第一个定时任务testTask2");
		log.info("Scheduling Tasks Examples: The time is now " + new Date());
	}

}
