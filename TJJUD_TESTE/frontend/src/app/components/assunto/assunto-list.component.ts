import { Component, OnInit } from '@angular/core';
import { AssuntoService } from '../../services/assunto.service';

@Component({
  selector: 'app-assunto-list',
  templateUrl: './assunto-list.component.html'
})
export class AssuntoListComponent implements OnInit {
  assuntos: any[] = [];

  constructor(private assuntoService: AssuntoService) {}

  ngOnInit() {
    this.assuntoService.getAssuntos().subscribe(data => this.assuntos = data);
  }
} 