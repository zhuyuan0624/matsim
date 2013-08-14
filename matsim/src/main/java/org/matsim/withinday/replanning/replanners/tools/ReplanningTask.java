/* *********************************************************************** *
 * project: org.matsim.*
 * ReplanningTask.java
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) 2008 by the members listed in the COPYING,        *
 *                   LICENSE and WARRANTY file.                            *
 * email           : info at matsim dot org                                *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *   See also COPYING, LICENSE and WARRANTY file                           *
 *                                                                         *
 * *********************************************************************** */

package org.matsim.withinday.replanning.replanners.tools;

import org.matsim.api.core.v01.Id;
import org.matsim.core.mobsim.framework.MobsimAgent;

public class ReplanningTask {

	protected MobsimAgent agentToReplan;
	protected Id withinDayReplannerId;
	
	public ReplanningTask(MobsimAgent agentToReplan, Id withinDayReplannerId) {
		this.agentToReplan = agentToReplan;
		this.withinDayReplannerId = withinDayReplannerId;
	}
	
	public MobsimAgent getAgentToReplan() {
		return this.agentToReplan;
	}
	
	public Id getWithinDayReplannerId() {
		return this.withinDayReplannerId;
	}
}
