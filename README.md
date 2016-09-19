# Example Todo app built with Angular 2, PrimeNG, and Java (using JSweet on the front-end and JAX-RS on the back-end)

This is part of the sample application for the presentation "Full Stack Java with JSweet, Angular 2, PrimeNG, and JAX-RS", 
originally given at JavaOne in September, 2016 by [Kito D. Mann](https://www.linkedin.com/in/kitomann) from [Virtua, Inc.](https://virtua.tech). 
It demonstrates how you can write an [Angular 2](https://angular.io) application with [PrimeNG](http://www.primefaces.org/primeng/) components using Java (courtesy of the
 [JSweet](http://jsweet.org) transpiler), and have it talk to a standard Java back-end using [JAX-RS](https://jax-rs-spec.java.net/).

This repository contains the back-end code; the [front-end](https://github.com/kito99/angular-primeng-jsweet-todo-client) and 
[slides](https://github.com/kito99/angular-primeng-jsweet-todo-slides) are in separate repositories. 


The app contains a simple JAX-RS `TaskResource`, uses [CDI](http://www.cdi-spec.org/) for dependency injection, and is deployed 
using [Jersey](https://jersey.java.net/) in a stand-alone JAR. This project is built using Apache [Maven](https://maven.apache.org/).


## Prerequisites

All you need is JDK 1.8, Maven, and your favorite IDE.

## Running the App

Run the example as follows:

>     mvn clean compile exec:java

This deploys the example using [Grizzly](http://grizzly.java.net/) container. You can access the application at:

- <http://localhost:8081/todo>

The only endpoint is "tasks" see the `TaskResource` class for more info. 

### Setup the front-end

If you haven't already, visit the [angular-primeng-jsweet-todo-client](https://github.com/kito99/angular-primeng-jsweet-todo-client) project and 
clone the Java-based front-end build using JSweet, Angular 2, and PrimeNG. See the README for that repository for more information.


