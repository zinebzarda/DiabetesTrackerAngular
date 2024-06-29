import {Component, OnInit} from "@angular/core";
import {ServiceService} from "../service.service";
import {Glycemia} from "../../../../model/GlycemieDiabete";
import {FormGroup} from "@angular/forms";


@Component({
  selector: 'app-glycemie',
  templateUrl: './glycemie.component.html',
  styleUrl: './glycemie.component.css'
})
export class GlycemieComponent implements OnInit{

  glysemieList:Glycemia[]=[]

  constructor(private service:ServiceService) {
  }

  ngOnInit(): void {
    this.showGlycemie()
  }


  showGlycemie(){
    this.service.ShowAll().subscribe(
      value => {
        this.glysemieList=value
      }
    )
  }

  deleteGlycemie(id:number){
    this.service.deleteGlycemie(id).subscribe(()=>{
        this.showGlycemie();
      }
    )

  }
}
