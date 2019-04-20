import { Component, OnInit } from '@angular/core';
import { NgForOf } from '@angular/common';

@Component({
  selector: 'app-project',
  templateUrl: './project.component.html',
  styleUrls: ['./project.component.css']
})
export class ProjectComponent implements OnInit {
  namefield = '';
  emailfield = '';
  values = false;
  months = ['January', "Feburary", "March","April","May","June","July","August","September","October","November","December"];

  constructor() { }

  ngOnInit() {
  }

  submission(){
    // alert(this.namefield);
    this.values = true;
    
  }

}
