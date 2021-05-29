import { registerPlugin } from '@capacitor/core';

import type { MetadataConfigPlugin } from './definitions';

const MetadataConfig = registerPlugin<MetadataConfigPlugin>('MetadataConfig', {
  web: () => import('./web').then(m => new m.MetadataConfigWeb()),
});

export * from './definitions';
export { MetadataConfig };
