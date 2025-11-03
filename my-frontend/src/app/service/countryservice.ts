import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Country } from '../model/country'; 
import { HttpClient, HttpHeaders } from '@angular/common/http'; 

@Injectable({
  providedIn: 'root'
})
export class Countryservice {

  private countriesUrl: string;

  constructor(private http: HttpClient) {
    this.countriesUrl = '/api/countries';
  }

  public getCountries(): Observable<Country[]> {
    return this.http.get<Country[]>(this.countriesUrl);
  }

  public getCountry(id: number): Observable<Country> {
    return this.http.get<Country>(`/api/show-country/${id}`);
  }
}