import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LivroListComponent } from './components/livro/livro-list.component';
import { LivroFormComponent } from './components/livro/livro-form.component';
import { AutorListComponent } from './components/autor/autor-list.component';
import { AutorFormComponent } from './components/autor/autor-form.component';
import { AssuntoListComponent } from './components/assunto/assunto-list.component';
import { AssuntoFormComponent } from './components/assunto/assunto-form.component';

const routes: Routes = [
  { path: '', redirectTo: '/livros', pathMatch: 'full' },
  { path: 'livros', component: LivroListComponent },
  { path: 'livros/novo', component: LivroFormComponent },
  { path: 'autores', component: AutorListComponent },
  { path: 'autores/novo', component: AutorFormComponent },
  { path: 'assuntos', component: AssuntoListComponent },
  { path: 'assuntos/novo', component: AssuntoFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { } 