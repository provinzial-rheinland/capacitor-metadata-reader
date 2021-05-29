import { WebPlugin } from '@capacitor/core';

import type { MetadataConfigPlugin } from './definitions';

export class MetadataConfigWeb extends WebPlugin implements MetadataConfigPlugin {
  read(_options: { key: string; }): Promise<{ value: string; }> {
    throw new Error('Method not implemented.');
  }
}
