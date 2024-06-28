import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Glycemia} from "../../../model/GlycemieDiabete";

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient) { }

  ShowAll():Observable<Glycemia[]>{
    return this.http.get<Glycemia[]>("http://localhost:8080/glycemia/showAll")
  }


}
