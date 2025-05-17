import { Component, OnInit } from '@angular/core';
import { AutorService } from '../../services/autor.service';

@Component({
  selector: 'app-autor-list',
  templateUrl: './autor-list.component.html'
})
export class AutorListComponent implements OnInit {
  autores: any[] = [];

  constructor(private autorService: AutorService) {}

  ngOnInit() {
    this.autorService.getAutores().subscribe(data => this.autores = data);
  }
} 