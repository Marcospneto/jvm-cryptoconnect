import { Routes } from '@angular/router';

export const routes: Routes = [
  {path:'', pathMatch: 'full', redirectTo: 'coins'},
  {path: 'coins',
    loadChildren: () => import('./coins/coins.module').then(m => m.CoinsModule)
  }
];
