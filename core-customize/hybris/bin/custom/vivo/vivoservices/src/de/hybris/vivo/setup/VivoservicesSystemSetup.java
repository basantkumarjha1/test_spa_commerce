/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.vivo.setup;

import static de.hybris.vivo.constants.VivoservicesConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import de.hybris.vivo.constants.VivoservicesConstants;
import de.hybris.vivo.service.VivoservicesService;


@SystemSetup(extension = VivoservicesConstants.EXTENSIONNAME)
public class VivoservicesSystemSetup
{
	private final VivoservicesService vivoservicesService;

	public VivoservicesSystemSetup(final VivoservicesService vivoservicesService)
	{
		this.vivoservicesService = vivoservicesService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		vivoservicesService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return VivoservicesSystemSetup.class.getResourceAsStream("/vivoservices/sap-hybris-platform.png");
	}
}
