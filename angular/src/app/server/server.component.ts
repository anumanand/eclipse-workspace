import {Component} from '@angular/core';
import { templateJitUrl, analyzeFileForInjectables } from '@angular/compiler';

@Component({
    selector:'app-server',
    templateUrl: './server.component.html' 
})

export class ServerComponent{
    serverId: number = 20;
    serverStatus: string = 'offline';
    allowNewServer = false;
    serverCreationStatus = "no server is created!";
    serverName = "Testserver";
    serverCreated = false;

    constructor(){
        setTimeout(() => {
            this.allowNewServer = true;
        },2000);
    }

    ngOnInit(){}

    onCreateServer(){
        this.serverCreated=true;
        // this.serverCreationStatus =  'server is created and name is:' + this.serverName;
    }

    onUpdateServerName(event: Event){
        //  this.serverName = (<HTMLInputElement>event.target).value;
    }


}