import Foundation
import Capacitor

@objc(MetadataConfigPlugin)
public class MetadataConfigPlugin: CAPPlugin {
    private let implementation = MetadataConfig()

    @objc func read(_ call: CAPPluginCall) {
        let key = call.getString("key") ?? ""
        
        let value = implementation.read(key)
        if (value == nil) {
            call.reject("value for \(key) not found. Did you add the key/value to Info.plist?")
        }
        call.resolve([
            "value": value!
        ])
    }
}
