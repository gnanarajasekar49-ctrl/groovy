package com.sample

class AppInfo implements Serializable {
    def steps
    String name
    int port
    String environment

    AppInfo(steps, String name, int port, String environment) {
        this.steps = steps
        this.name = name
        this.port = port
        this.environment = environment
    }

    void printInfo() {
        steps.echo "Application Name: ${name}"
        steps.echo "Port: ${port}"
        steps.echo "Environment: ${environment}"
    }
}
