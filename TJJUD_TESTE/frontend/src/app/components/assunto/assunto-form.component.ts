import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AssuntoService } from '../../services/assunto.service';

@Component({
  selector: 'app-assunto-form',
  templateUrl: './assunto-form.component.html'
})
export class AssuntoFormComponent {
  assuntoForm: FormGroup;

  constructor(private fb: FormBuilder, private assuntoService: AssuntoService) {
    this.assuntoForm = this.fb.group({
      descricao: ['', Validators.required]
    });
  }

  onSubmit() {
    if (this.assuntoForm.valid) {
      this.assuntoService.addAssunto(this.assuntoForm.value).subscribe();
      this.assuntoForm.reset();
    }
  }
} 