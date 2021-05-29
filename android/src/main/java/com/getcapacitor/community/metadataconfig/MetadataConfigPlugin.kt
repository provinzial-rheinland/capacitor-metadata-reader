package com.getcapacitor.community.metadataconfig

import com.getcapacitor.JSObject
import com.getcapacitor.Plugin
import com.getcapacitor.PluginCall
import com.getcapacitor.PluginMethod
import com.getcapacitor.annotation.CapacitorPlugin

@CapacitorPlugin(name = "MetadataConfig")
class MetadataConfigPlugin : Plugin() {
    private val implementation = MetadataConfig()
    @PluginMethod
    fun read(call: PluginCall) {
        val key = call.getString("key")

        val ret = JSObject()
        val value = implementation.read(context, key!!)
        if (value == null) {
            call.reject("value for key $key not found. Did you add it to AndroidManifest.xml?")
        }
        ret.put("value", value)
        call.resolve(ret)
    }
}