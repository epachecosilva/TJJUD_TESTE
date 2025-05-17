import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({ providedIn: 'root' })
export class AssuntoService {
  private apiUrl = 'http://localhost:8080/api/assuntos';

  constructor(private http: HttpClient) {}

  getAssuntos(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrl);
  }

  addAssunto(assunto: any): Observable<any> {
    return this.http.post<any>(this.apiUrl, assunto);
  }

  deleteAssunto(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
} 