import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CoinsService {
  private apiUrl = 'http://localhost:8080/api/coins';
  constructor(private http: HttpClient) { }

  getMoedas(nomeMoeda: string): Observable<any> {
    const url = `${this.apiUrl}/${nomeMoeda}`;
    return this.http.get<any>(url);
  }
}
