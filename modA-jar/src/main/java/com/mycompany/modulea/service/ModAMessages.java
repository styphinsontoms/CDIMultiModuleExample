package com.mycompany.modulea.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.mycompany.core.api.ResourceBundleMessages;


/**
 * Module specific extension of the {@link ResourceBundleMessages}.
 */
@ApplicationScoped
@Named
public class ModAMessages extends ResourceBundleMessages
{
	//~ Methods ----------------------------------------------------------------

	@Override
	protected String getBundleName()
	{
		return "modA";
	}
}
