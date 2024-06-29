import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup} from "@angular/forms";
import {ServiceService} from "../service.service";
import {Glycemia} from "../../../../model/GlycemieDiabete";

@Component({
  selector: 'app-glycemie-form',
  templateUrl: './glycemie-form.component.html',
  styleUrl: './glycemie-form.component.css'
})
export class GlycemieFormComponent implements OnInit{

  glycemieForm!:FormGroup;

  constructor(private formB: FormBuilder,private  service:ServiceService) {
  }
  ngOnInit(): void {
    this.glycemieForm = this.formB.group(
      {
        date: this.formB.control(""),
        time: this.formB.control(""),
        level: this.formB.control(""),
        name_patient: this.formB.control(""),
      })
  }

  addGlycemie() {
    let formData: FormData = new FormData();
    formData.set('date', this.glycemieForm.value.date);
    formData.set('time', this.glycemieForm.value.time);
    formData.set('level', this.glycemieForm.value.level);
    formData.set('name_patient', this.glycemieForm.value.name_patient);
    this.service.addGlycemie(formData).subscribe(
      {
        next: value =>
          alert('les valeurs de Glycemie est ajoutee')
      }
    )


  }

}
