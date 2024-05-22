import {WebPlugin} from '@capacitor/core';

import type {MetadataConfigPlugin} from './definitions';

export class MetadataConfigWeb extends WebPlugin implements MetadataConfigPlugin {
    // eslint-disable-next-line @typescript-eslint/naming-convention,no-unused-vars,@typescript-eslint/no-unused-vars
    public read(_options: {key: string}): Promise<{value: string}> {
        throw new Error('Method not implemented.');
    }
}
