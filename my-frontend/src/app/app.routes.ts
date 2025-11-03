import { Routes } from '@angular/router';
import { ShowCountriesComponent } from './show-countries/show-countries'; 
import { ShowCountryComponent } from './show-country/show-country';

export const routes: Routes = [
  { path: 'countries', component: ShowCountriesComponent },
  { path: 'country/:id', component: ShowCountryComponent },
  { path: '', redirectTo: '/countries', pathMatch: 'full' }
];