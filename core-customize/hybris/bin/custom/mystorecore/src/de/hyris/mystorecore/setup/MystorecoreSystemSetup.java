/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hyris.mystorecore.setup;

import static de.hyris.mystorecore.constants.MystorecoreConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import de.hyris.mystorecore.constants.MystorecoreConstants;
import de.hyris.mystorecore.service.MystorecoreService;


@SystemSetup(extension = MystorecoreConstants.EXTENSIONNAME)
public class MystorecoreSystemSetup
{
	private final MystorecoreService mystorecoreService;

	public MystorecoreSystemSetup(final MystorecoreService mystorecoreService)
	{
		this.mystorecoreService = mystorecoreService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		mystorecoreService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return MystorecoreSystemSetup.class.getResourceAsStream("/mystorecore/sap-hybris-platform.png");
	}
}
