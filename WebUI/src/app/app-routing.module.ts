import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateSinhvienComponent } from './sinhvien/create-sinhvien/create-sinhvien.component';
import { ListSinhvienComponent } from './sinhvien/list-sinhvien/list-sinhvien.component';
import { UpdateSinhvienComponent } from './sinhvien/update-sinhvien/update-sinhvien.component';

const routes: Routes = [
  {path:'', redirectTo:'sinhvien', pathMatch:'full'},
  {path: 'createsinhvien', component: CreateSinhvienComponent},
  {path:'listsinhviens', component:ListSinhvienComponent},
  {path:'listsinhviens/:ma_SV', component:UpdateSinhvienComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
