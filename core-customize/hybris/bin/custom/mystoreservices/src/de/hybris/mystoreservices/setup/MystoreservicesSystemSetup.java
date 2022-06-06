/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.mystoreservices.setup;

import static de.hybris.mystoreservices.constants.MystoreservicesConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import de.hybris.mystoreservices.constants.MystoreservicesConstants;
import de.hybris.mystoreservices.service.MystoreservicesService;


@SystemSetup(extension = MystoreservicesConstants.EXTENSIONNAME)
public class MystoreservicesSystemSetup
{
	private final MystoreservicesService mystoreservicesService;

	public MystoreservicesSystemSetup(final MystoreservicesService mystoreservicesService)
	{
		this.mystoreservicesService = mystoreservicesService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		mystoreservicesService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return MystoreservicesSystemSetup.class.getResourceAsStream("/mystoreservices/sap-hybris-platform.png");
	}
}
