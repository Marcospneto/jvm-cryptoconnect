import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatOptionModule } from '@angular/material/core';
import { MatTableModule } from '@angular/material/table';
import {MatInputModule} from '@angular/material/input';



import { CoinsRoutingModule } from './coins-routing.module';

@NgModule({
  imports: [
    CommonModule,
    CoinsRoutingModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatOptionModule,
    MatTableModule,
    MatInputModule,
  ]
})
export class CoinsModule { }
