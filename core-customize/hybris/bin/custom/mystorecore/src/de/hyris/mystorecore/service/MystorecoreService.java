/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hyris.mystorecore.service;

public interface MystorecoreService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
