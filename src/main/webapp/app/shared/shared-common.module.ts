import { NgModule } from '@angular/core';

import { TestThipsterSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [TestThipsterSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [TestThipsterSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class TestThipsterSharedCommonModule {}
