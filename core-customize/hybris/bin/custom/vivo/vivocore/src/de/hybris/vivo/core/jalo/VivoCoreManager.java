/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.vivo.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.vivo.core.constants.VivoCoreConstants;
import de.hybris.vivo.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class VivoCoreManager extends GeneratedVivoCoreManager
{
	public static final VivoCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (VivoCoreManager) em.getExtension(VivoCoreConstants.EXTENSIONNAME);
	}
}
