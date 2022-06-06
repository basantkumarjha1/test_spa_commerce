/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.mystorefacades.setup;

import static de.hybris.mystorefacades.constants.MystorefacadesConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import de.hybris.mystorefacades.constants.MystorefacadesConstants;
import de.hybris.mystorefacades.service.MystorefacadesService;


@SystemSetup(extension = MystorefacadesConstants.EXTENSIONNAME)
public class MystorefacadesSystemSetup
{
	private final MystorefacadesService mystorefacadesService;

	public MystorefacadesSystemSetup(final MystorefacadesService mystorefacadesService)
	{
		this.mystorefacadesService = mystorefacadesService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		mystorefacadesService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return MystorefacadesSystemSetup.class.getResourceAsStream("/mystorefacades/sap-hybris-platform.png");
	}
}
