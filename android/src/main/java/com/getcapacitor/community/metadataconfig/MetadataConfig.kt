package com.getcapacitor.community.metadataconfig

import android.content.Context
import android.content.pm.PackageManager
import android.util.Log

class MetadataConfig {
    private val TAG = "com.getcapacitor.community.metadataconfig"

    fun read(context: Context, key: String): String {
        context.packageManager.getApplicationInfo(context.packageName, PackageManager.GET_META_DATA)
            .apply {
                val value = this.metaData.getString(key)
                if (value == null) {
                    Log.w(TAG, "missing value for key $key. Did you add it to the AndroidManifest?")
                }

                return value ?: ""
            }
    }
}