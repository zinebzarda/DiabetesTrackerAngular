import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {GlycemieFormComponent} from "./glycemie-form/glycemie-form.component";
import {GlycemieComponent} from "./glycemie/glycemie.component";

const routes: Routes = [
  {path:"showAll",component:GlycemieComponent},
  {path:"add",component:GlycemieFormComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
