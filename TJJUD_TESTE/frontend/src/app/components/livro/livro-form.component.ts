import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { LivroService } from '../../services/livro.service';

@Component({
  selector: 'app-livro-form',
  templateUrl: './livro-form.component.html'
})
export class LivroFormComponent {
  livroForm: FormGroup;

  constructor(private fb: FormBuilder, private livroService: LivroService) {
    this.livroForm = this.fb.group({
      titulo: ['', Validators.required],
      editora: [''],
      edicao: [''],
      anoPublicacao: [''],
      valor: ['', Validators.required]
    });
  }

  onSubmit() {
    if (this.livroForm.valid) {
      this.livroService.addLivro(this.livroForm.value).subscribe();
      this.livroForm.reset();
    }
  }
} 