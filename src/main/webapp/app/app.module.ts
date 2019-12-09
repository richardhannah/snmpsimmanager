import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import './vendor';
import { SnmpsimmanagerSharedModule } from 'app/shared/shared.module';
import { SnmpsimmanagerCoreModule } from 'app/core/core.module';
import { SnmpsimmanagerAppRoutingModule } from './app-routing.module';
import { SnmpsimmanagerHomeModule } from './home/home.module';
import { SnmpsimmanagerEntityModule } from './entities/entity.module';
// jhipster-needle-angular-add-module-import JHipster will add new module here
import { JhiMainComponent } from './layouts/main/main.component';
import { NavbarComponent } from './layouts/navbar/navbar.component';
import { FooterComponent } from './layouts/footer/footer.component';
import { PageRibbonComponent } from './layouts/profiles/page-ribbon.component';
import { ErrorComponent } from './layouts/error/error.component';

@NgModule({
  imports: [
    BrowserModule,
    SnmpsimmanagerSharedModule,
    SnmpsimmanagerCoreModule,
    SnmpsimmanagerHomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    SnmpsimmanagerEntityModule,
    SnmpsimmanagerAppRoutingModule
  ],
  declarations: [JhiMainComponent, NavbarComponent, ErrorComponent, PageRibbonComponent, FooterComponent],
  bootstrap: [JhiMainComponent]
})
export class SnmpsimmanagerAppModule {}
