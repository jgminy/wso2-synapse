/*
 *  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.apache.synapse.aspects.flow.statistics.log.templates;

import org.apache.synapse.aspects.flow.statistics.data.raw.StatisticDataUnit;
import org.apache.synapse.aspects.flow.statistics.log.StatisticEventProcessor;
import org.apache.synapse.aspects.flow.statistics.log.StatisticEventProcessor3;
import org.apache.synapse.aspects.flow.statistics.log.StatisticsReportingEvent;

/**
 * Event to open statistics for a component.
 */
public class StatisticsOpenEvent implements StatisticsReportingEvent {

	private StatisticDataUnit statisticDataUnit;

	public StatisticsOpenEvent(StatisticDataUnit statisticDataUnit) {
		this.statisticDataUnit = statisticDataUnit;
	}

	@Override
	public void process() {
		StatisticEventProcessor3.openStatisticEntry(statisticDataUnit);
	}

    @Override
    public void processEvents(StatisticEventProcessor eventProcessor) {
        eventProcessor.openStatisticEntry(statisticDataUnit);
    }
}
