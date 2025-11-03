import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';
import { Country } from '../model/country';
import { Countryservice } from '../service/countryservice';
import { CommonModule } from '@angular/common'; 

@Component({
  selector: 'app-show-country',
  standalone: true,
  imports: [CommonModule], 
  templateUrl: './show-country.html',
  styleUrl: './show-country.css'
})
export class ShowCountryComponent implements OnInit {

  country: Country = new Country(); 

  constructor(
    private route: ActivatedRoute,
    private countryService: Countryservice
  ) { }

  ngOnInit(): void {
    this.route.params.forEach((params: Params) => {
      let id = +params['id']; 
      
      this.countryService.getCountry(id).subscribe(
        (data: Country) => {
          this.country = data;
        }
      );
    });
  }
}