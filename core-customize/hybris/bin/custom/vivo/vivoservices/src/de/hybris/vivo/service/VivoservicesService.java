/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.vivo.service;

public interface VivoservicesService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
