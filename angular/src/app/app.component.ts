import { Component } from '@angular/core';
import { Content } from '@angular/compiler/src/render3/r3_ast';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Tour of Heroes';
  serverElements = [{type: 'server' ,name: 'testserver', content: 'just a test!'}];
  name = 'Angular';
  public number: number = 1000;
  
  
}
