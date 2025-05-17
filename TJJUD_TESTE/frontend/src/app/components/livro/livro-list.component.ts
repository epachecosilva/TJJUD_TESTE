import { Component, OnInit } from '@angular/core';
import { LivroService } from '../../services/livro.service';

@Component({
  selector: 'app-livro-list',
  templateUrl: './livro-list.component.html'
})
export class LivroListComponent implements OnInit {
  livros: any[] = [];

  constructor(private livroService: LivroService) {}

  ngOnInit() {
    this.livroService.getLivros().subscribe(data => this.livros = data);
  }
} 