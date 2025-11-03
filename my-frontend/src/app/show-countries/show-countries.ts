import { Component, OnInit } from '@angular/core';
import { Country } from '../model/country';
import { Countryservice } from '../service/countryservice';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-show-countries',
  standalone: true,
  imports: [CommonModule, RouterLink], 
  templateUrl: './show-countries.html', 
  styleUrl: './show-countries.css'
})
export class ShowCountriesComponent implements OnInit {

  countries: Country[] = [];

  constructor(private countryService: Countryservice) { }

  ngOnInit(): void {
    this.countryService.getCountries().subscribe(
      (data: Country[]) => {
        this.countries = data;
      }
    );
  }
}