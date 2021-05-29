import Foundation

@objc public class MetadataConfig: NSObject {
    @objc public func read(_ key: String) -> String? {
        return Bundle.main.object(forInfoDictionaryKey: key) as? String
    }
}
