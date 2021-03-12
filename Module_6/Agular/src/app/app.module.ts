import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { NhanvienComponent } from './nhanvien/nhanvien.component';
import { KhachhangComponent } from './khachhang/khachhang.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    NhanvienComponent,
    KhachhangComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
