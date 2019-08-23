import { Component, OnInit } from '@angular/core';
import { PersonServiceService } from './person-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {

  title = 'Demo Application';
  url = '/person';
 
  public data: any;
 
  constructor(private api: PersonServiceService) {
  }
 
  ngOnInit() {
    this.api
      .getPerson(this.url)
      .subscribe(
        data => {
          console.log(data);
          this.data = data;
        },
        err => {
          console.log(err);
        }
      );
  }
}
