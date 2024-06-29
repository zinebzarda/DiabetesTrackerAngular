import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { Glycemia } from "../../../model/GlycemieDiabete";

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http: HttpClient) { }

  ShowAll(): Observable<Glycemia[]> {
    return this.http.get<Glycemia[]>("http://localhost:8080/glycemia/showAll");
  }

  public addGlycemie(formData: any): Observable<Glycemia> {
    return this.http.post<Glycemia>("http://localhost:8080/glycemia/Add", formData);
  }

  public deleteGlycemie(id: number) {
    return this.http.delete(`http://localhost:8080/glycemia/delete/${id}`);
  }

  //public updateGlycemie(id: number, glycemie: Glycemie) {
  // return this.http.put(`${this.urlApi}/update/${id}`, glycemie)
  //}
}
