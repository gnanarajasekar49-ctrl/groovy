package com.sample

class AppInfo{
    def steps
    String name
    int port
    String environment
    
    AppInfo(steps,String name,int port,String environment){
        this.steps=steps
        this.name=name
        this.port=port
        this.environment=environment
    }

    void printInfo(){
        println "Application Name:${name}"
        println "Port${port}"
        println "Environment${environment}"
    }


}
