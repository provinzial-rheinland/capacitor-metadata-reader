import Foundation

@objc public class MetadataConfig: NSObject {
    @objc public func read(_ key: String) -> String {
        let value = Bundle.main.object(forInfoDictionaryKey: key) as? String
        if (value == nil) {
            print("value not found for key \(key). Did you add the entry to Info.plist?")
        }
        
        return value ?? ""
    }
}
