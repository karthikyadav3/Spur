import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { ProductComponent } from './product.component';
import { ProductService } from './product.service';
import { HttpClientModule } from '@angular/common/http';

const productRoute: Routes = [
  {
    path: '',
    component: ProductComponent
  }
]
@NgModule({
  declarations: [
    ProductComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule,
    RouterModule.forChild(productRoute)
  ],
  providers: [
    ProductService
  ]
})
export class ProductModule { }
