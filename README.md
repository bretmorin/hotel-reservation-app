# Deploying a Modified Multithreaded Spring Application to the Cloud
#### Multithreaded Spring hotel reservation app setup to run with Docker for cloud deployment
#### Built using Java, Spring, Angular, and Docker
#### MVC Design Pattern Utilized

## Summary
Full-Stack Hotel Reservation Application edited to:
- Create and apply a multithreaded translation process for text on the homepage
- Create and auto-apply currency translations based on the USD
- Create and auto-apply timezone conversions based on Eastern Standard Time
- Deploy the completed application via Docker

### Step-by-step here: [Article Here](https://medium.com/@bretmorin/ecommerce-app-b64c0484c2cf)

---

## Tools Suggested
- Java with
--Any Java IDE(IntelliJ, etc)
- Spring Framework with
--Maven --Lombok
- MySQL Database with 
--MySQL Workbench --Postman
- VS Code with 
--Angular
- Docker

## Web Addresses
- http://localhost:4200
- http://localhost:8080/api/

---

## Starter Files
To go through the process from scratch, included are project starter files that can be utilized to go 
through the step-by-step process.

## Deployment Instructions
1. For deployment, choose AWS or Azure as the cloud provider.
2. In doing so, the next step would be to setup a Container Registry in order to store the image.
3. The image would need to be built with a relevant version tag and then pushed to the registry.
4. Utilizing the image just created, create a Container Instance.
5. Lastly, the container instance should be deployed. This would make it accessible and 'live'.