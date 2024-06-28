import {Component, OnInit} from "@angular/core";
import {ServiceService} from "../service.service";
import {Glycemia} from "../../../../model/GlycemieDiabete";


@Component({
  selector: 'app-glycemie',
  templateUrl: './glycemie.component.html',
  styleUrl: './glycemie.component.css'
})
export class GlycemieComponent implements OnInit{

  glysemieList:Glycemia[]=[]

  constructor(private service:ServiceService) {
  }

ngOnInit() {
    this.service.ShowAll().subscribe(
      value => {
        this.glysemieList=value
      }
    )
}
}
