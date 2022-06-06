/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.mystoreservices.service;

public interface MystoreservicesService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
