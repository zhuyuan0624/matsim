/* *********************************************************************** *
 * project: org.matsim.*
 * BasicLaneDefinitions
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) 2009 by the members listed in the COPYING,        *
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
package org.matsim.lanes.basic;

import java.util.ArrayList;
import java.util.List;


/**
 * @author dgrether
 *
 */
public class BasicLaneDefinitionsImpl implements BasicLaneDefinitions {
	
	private List<BasicLanesToLinkAssignment> lanesToLinkAssignments;

	private BasicLaneDefinitionsBuilder builder = new BasicLaneDefinitionsBuilderImpl();
	
	/**
	 * @see org.matsim.lanes.basic.BasicLaneDefinitions#getLanesToLinkAssignments()
	 */
	public List<BasicLanesToLinkAssignment> getLanesToLinkAssignments() {
		return lanesToLinkAssignments;
	}

	/**
	 * @see org.matsim.lanes.basic.BasicLaneDefinitions#addLanesToLinkAssignment(org.matsim.lanes.basic.BasicLanesToLinkAssignment)
	 */
	public void addLanesToLinkAssignment(BasicLanesToLinkAssignment assignment) {
		if (this.lanesToLinkAssignments == null) {
			this.lanesToLinkAssignments = new ArrayList<BasicLanesToLinkAssignment>();
		}
		this.lanesToLinkAssignments.add(assignment);
	}
	
	/**
	 * @see org.matsim.lanes.basic.BasicLaneDefinitions#getBuilder()
	 */
	public BasicLaneDefinitionsBuilder getBuilder(){
		return this.builder;
	}
}
