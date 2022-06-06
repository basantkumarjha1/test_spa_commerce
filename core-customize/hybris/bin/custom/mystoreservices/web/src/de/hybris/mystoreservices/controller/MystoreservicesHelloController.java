/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.mystoreservices.controller;

import static de.hybris.mystoreservices.constants.MystoreservicesConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.hybris.mystoreservices.service.MystoreservicesService;


@Controller
public class MystoreservicesHelloController
{
	@Autowired
	private MystoreservicesService mystoreservicesService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", mystoreservicesService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
