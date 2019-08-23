import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class PersonServiceService {

  constructor(private http: HttpClient) { }
 
  public getPerson(url: string): any {
    return this.http.get(url).pipe(map(response => {
        return response;
      }));
  }
}
