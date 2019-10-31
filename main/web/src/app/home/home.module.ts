import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home.component';

const homeRoute: Routes = [
  {
    path: '',
    component: HomeComponent
  }
]
@NgModule({

  declarations: [
    HomeComponent
  ],
  imports: [
    CommonModule,
    RouterModule.forChild(homeRoute)
  ]
})
export class HomeModule { }
