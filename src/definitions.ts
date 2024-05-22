export interface MetadataConfigPlugin {
    read(options: {key: string}): Promise<{value: string}>;
}
