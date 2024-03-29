import { Component, OnInit} from '@angular/core';
import{ Hero } from '../hero';
import { HeroService} from '../hero.service';

@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css']
})
export class HeroesComponent implements OnInit {
  hero: Hero ={
    id:1,
    name: 'Windstorm'
  };

  heroes : Hero[];  
  constructor(private heroService:HeroService) { 


  }

  ngOnInit() {
    this.getHeroes();
  }

  selectedHero:Hero;
  onSelect(hero: Hero):void{
    this.selectedHero = hero;
  }

  getHeroes() : void{
    this.heroService.getHeroes().subscribe(heroes =>this.heroes = heroes);//jo b value change hogi observable k through vo subscribe ke heroes k andr aayegi usko hm this.heroes krke apne variable mai daalege

  
  }

}
