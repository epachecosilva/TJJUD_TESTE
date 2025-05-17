import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { RouterModule } from '@angular/router';
import { LivroListComponent } from './components/livro/livro-list.component';
import { LivroFormComponent } from './components/livro/livro-form.component';
import { AutorListComponent } from './components/autor/autor-list.component';
import { AutorFormComponent } from './components/autor/autor-form.component';
import { AssuntoListComponent } from './components/assunto/assunto-list.component';
import { AssuntoFormComponent } from './components/assunto/assunto-form.component';
import { AutorService } from './services/autor.service';
import { AssuntoService } from './services/assunto.service';
import { LivroService } from './services/livro.service';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
  ],
  imports: [
    BrowserModule,
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    AppRoutingModule,
    RouterModule
  ],
  providers: [LivroService, AutorService, AssuntoService],
})
export class AppModule { } 