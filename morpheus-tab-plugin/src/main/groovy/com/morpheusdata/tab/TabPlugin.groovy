package com.morpheusdata.tab

import com.morpheusdata.core.Plugin
import com.morpheusdata.model.Permission
import com.morpheusdata.core.MorpheusContext
import com.morpheusdata.model.Tab

/**
 * Example Custom Tab Plugin
 */
class TabPlugin extends Plugin {

	@Override
	void initialize() {
		CustomTabProvider customTabProvider = new CustomTabProvider(this, morpheusContext)
		this.pluginProviders.put(customTabProvider.providerCode, customTabProvider)
		this.setName("Custom Tabs")
		this.setPermissions([Permission.build('Custom Instance Tab','custom-instance-tab', [Permission.AccessType.none, Permission.AccessType.full])])
	}

	@Override
	void onDestroy() {
	}
}
