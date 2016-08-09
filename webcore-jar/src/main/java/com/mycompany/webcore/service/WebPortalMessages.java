package com.mycompany.webcore.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.mycompany.core.api.ResourceBundleMessages;


/**
 * Module specific extension of the {@link ResourceBundleMessages}.
 */
@ApplicationScoped
@Named
public class WebPortalMessages extends ResourceBundleMessages
{
	//~ Methods ----------------------------------------------------------------

	@Override
	protected String getBundleName()
	{
		return "webportal";
	}
}
