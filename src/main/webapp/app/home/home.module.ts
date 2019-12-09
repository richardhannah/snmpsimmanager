import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { SnmpsimmanagerSharedModule } from 'app/shared/shared.module';
import { HOME_ROUTE } from './home.route';
import { HomeComponent } from './home.component';

@NgModule({
  imports: [SnmpsimmanagerSharedModule, RouterModule.forChild([HOME_ROUTE])],
  declarations: [HomeComponent]
})
export class SnmpsimmanagerHomeModule {}
