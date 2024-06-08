import { Coin } from './../model/coin';
import { Component, OnInit } from '@angular/core';
import { FormControl, ReactiveFormsModule } from '@angular/forms';
import { MatSelectModule } from '@angular/material/select';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatOptionModule } from '@angular/material/core';
import { CommonModule } from '@angular/common';  // Adicione esta linha
import { CoinsService } from '../../services/coins.service';
import { MatTableModule } from '@angular/material/table';
import { FormsModule } from '@angular/forms'; // Importe FormsModule
import { MatButtonModule } from '@angular/material/button';









@Component({
  selector: 'app-coins',
  standalone: true,
  imports: [
    CommonModule, // Adicione esta linha
    ReactiveFormsModule,
    MatSelectModule,
    MatFormFieldModule,
    MatOptionModule,
    MatTableModule,
    FormsModule,
    MatButtonModule
  ],
  templateUrl: './coins.component.html',
  styleUrls: ['./coins.component.scss']
})

export class CoinsComponent implements OnInit {

  coins: Coin[] =[];
  displayedColumns = [
    'coin',
    'usd',
    'usd_market_cap',
    'usd_24h_vol',
    'usd_24h_change',
    'last_updated_at',

];
coinName: string = '';
searchValue: string = '';
errorMessage: string = '';

  constructor(private coinsService: CoinsService) { }

  ngOnInit(): void { }

  buscarMoedas(): void {
    if (!this.coinName){
      this.showErrorMessage('Por favor, insira o nome da moeda');
      return;
    }
    this.errorMessage = '';
    this.coinsService.getMoedas(this.coinName).subscribe(
      (data: any) => {
        this.coins = [data];
        this.searchValue = this.coinName;
        this.errorMessage = '';
      },
      error => {
        this.showErrorMessage('Moeda não encontrada');
      }
    );

  }
  showErrorMessage(message: string): void {
    this.errorMessage = message;
    setTimeout(() => {
      this.errorMessage = '';
    }, 3000); // Mensagem de erro será exibida por 3 segundos
  }
}
