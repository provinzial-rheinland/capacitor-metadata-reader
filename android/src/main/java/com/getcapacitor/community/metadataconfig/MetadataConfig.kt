package com.getcapacitor.community.metadataconfig

import android.content.Context
import android.content.pm.PackageManager

class MetadataConfig {
    fun read(context: Context, key: String): String? {
        context.packageManager.getApplicationInfo(context.packageName, PackageManager.GET_META_DATA)
            .apply {
                return this.metaData.getString(key)
            }
    }
}