import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AutorService } from '../../services/autor.service';

@Component({
  selector: 'app-autor-form',
  templateUrl: './autor-form.component.html'
})
export class AutorFormComponent {
  autorForm: FormGroup;

  constructor(private fb: FormBuilder, private autorService: AutorService) {
    this.autorForm = this.fb.group({
      nome: ['', Validators.required]
    });
  }

  onSubmit() {
    if (this.autorForm.valid) {
      this.autorService.addAutor(this.autorForm.value).subscribe();
      this.autorForm.reset();
    }
  }
} 