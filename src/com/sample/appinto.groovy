package com.sample

class AppInfo{
    String name
    int port
    String environment
    
    AppInfo(String name,int port,String environment){
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
