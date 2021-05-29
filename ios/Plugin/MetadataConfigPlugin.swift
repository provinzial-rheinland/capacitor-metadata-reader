import Foundation
import Capacitor

@objc(MetadataConfigPlugin)
public class MetadataConfigPlugin: CAPPlugin {
    private let implementation = MetadataConfig()

    @objc func read(_ call: CAPPluginCall) {
        let key = call.getString("key") ?? ""
        
        let value = implementation.read(key)
        call.resolve([
            "value": value
        ])
    }
}
