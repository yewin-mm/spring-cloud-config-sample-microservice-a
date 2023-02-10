# spring-cloud-config-sample-microservice-a
<!-- PROJECT SHIELDS -->

<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/yewin-mm/spring-cloud-config-sample-microservice-a.svg?style=for-the-badge
[contributors-url]: https://github.com/yewin-mm/spring-cloud-config-sample-microservice-a/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/yewin-mm/spring-cloud-config-sample-microservice-a.svg?style=for-the-badge
[forks-url]: https://github.com/yewin-mm/spring-cloud-config-sample-microservice-a/network/members
[stars-shield]: https://img.shields.io/github/stars/yewin-mm/spring-cloud-config-sample-microservice-a.svg?style=for-the-badge
[stars-url]: https://github.com/yewin-mm/spring-cloud-config-sample-microservice-a/stargazers
[issues-shield]: https://img.shields.io/github/issues/yewin-mm/spring-cloud-config-sample-microservice-a.svg?style=for-the-badge
[issues-url]: https://github.com/yewin-mm/spring-cloud-config-sample-microservice-a/issues
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/ye-win-1a33a292/

<h1 align="center">
  Overview
  <img src="https://github.com/yewin-mm/spring-cloud-config-sample-microservice-a/blob/master/github/template/images/overview/cloud_config.png" /><br/>
</h1>


# spring-cloud-config-sample-microservice-a
* This is the sample microservice for Spring Cloud Config Microservice A project.
* Nowadays, We used spring cloud config for centralization for all configures at one place over `Git` call config repository (properties or yml files store). 
* Also, we don't need to restart our application again if we changed something in our `application.properties` files or if we want to change something in that config file.
* So, Spring Cloud Config is used for centralized configuration and used to change config at runtime collaborate with Spring boot Actuator build in `Refresh` api. 
* This project is communicate with [Cloud Config Server](https://github.com/yewin-mm/spring-cloud-config-server) for fetching (pulling) config value through that server <br> 
and communicate with [Config Files Storage](https://github.com/yewin-mm/spring-cloud-config-files-storage) as for config files storage repository, and you can also see [Spring Cloud Config Sample Microservice B](https://github.com/yewin-mm/spring-cloud-config-sample-microservice-b) as for another config sample client service. 

<!-- TABLE OF CONTENTS -->
## Table of Contents
- [About The Project](#about-the-project)
    - [Built With](#built-with)
- [Getting Started](#getting-started)
    - [Before you begin](#before-you-begin)
    - [Clone Project](#clone-project)
    - [Prerequisites](#prerequisites)
    - [Instruction](#instruction)
      -  [Setup Config file store and Run Services](#setup-and-run-services)
      -  [Testing](#testing)
          -  [Testing Config Server](#testing-config-server)
          -  [Testing Normal Config](#testing-normal-config)
          -  [Testing Dynamic Config](#testing-dynamic-config)
- [Contact Me](#contact)
- [Contributing](#Contributing)


<a name="about-the-project"></a>
## ⚡️About The Project
This is Demo Project for Spring Cloud Config Sample Microservice A. <br>
This service will fetch config properties from [cloud config server](https://github.com/yewin-mm/spring-cloud-config-server) and cloud config server get those properties files from [config files repository](https://github.com/yewin-mm/spring-cloud-config-files-storage) through `Git`. <br>
So, firstly, you need to put `application.properties` or `yml` for this application to `Github` or `Bitbucket` or you can even use your local config folder which already committed to local git repository. <br>
Here, config file means your application require file like `application.properties` or `application.yml` file.

<a name="built-with"></a>
### 🪓 Built With
This project is built with
* [Java](https://www.oracle.com/au/java/technologies/javase/javase-jdk8-downloads.html)
* [Maven](https://maven.apache.org/download.cgi)
* [Cloud Config Server](https://github.com/yewin-mm/spring-cloud-config-server)

<a name="getting-started"></a>
## 🔥 Getting Started
This project is built with Java, Maven, [Cloud Config Server](https://github.com/yewin-mm/spring-cloud-config-server) as Server and use `Project Lombok` as plugin.
So, please make sure all are installed in your machine.

<a name="before-you-begin"></a>
### 🔔 Before you begin
If you are new in Git, GitHub and new in Spring Boot configuration structure, <br>
You should see basic detail instructions first in here [Spring Boot Application Instruction](https://github.com/yewin-mm/spring-boot-app-instruction)<br>
If you are not good enough in basic API knowledge with Java Spring Boot and other spring basic knowledge, you should learn below example projects first. <br>
Click below links.
* [Spring Boot Sample CRUD Application](https://github.com/yewin-mm/spring-boot-sample-crud) (for sample CRUD application)
* [Reading Values from Properties files](https://github.com/yewin-mm/reading-properties-file-values) (for reading values from properties files)
* [Spring Profile](https://github.com/yewin-mm/spring-profile-properties-yml-file) (for knowing spring profiles)
* [Config Files Store](https://github.com/yewin-mm/spring-cloud-config-files-storage) (for config file store)
* [Cloud Config Server](https://github.com/yewin-mm/spring-cloud-config-server) (for config server)
* [Spring Cloud Config Sample Microservice B](https://github.com/yewin-mm/spring-cloud-config-sample-microservice-b) (for another sample config client)


<a name="clone-project"></a>
### 🥡 Clone Project
* Clone the repo
   ```sh
   git clone https://github.com/yewin-mm/spring-cloud-config-sample-microservice-a.git
   ```
<a name="prerequisites"></a>
### 🔑 Prerequisites
Prerequisites can be found here, [Spring Boot Application Instruction](https://github.com/yewin-mm/spring-boot-app-instruction). <br>
You need to clone [Config Server](https://github.com/yewin-mm/spring-cloud-config-server). <br>
You need to clone [Config Files Store](https://github.com/yewin-mm/spring-cloud-config-files-storage) for getting and managing properties files and [Spring Cloud Config Sample Microservice B](https://github.com/yewin-mm/spring-cloud-config-sample-microservice-b) for another client sample.


<a name="instruction"></a>
### 📝 Instruction
<a name="setup-and-run-services"></a>
#### Setup Config file store and Run Services
* Clone [Config Files Store](https://github.com/yewin-mm/spring-cloud-config-files-storage).
  * Firstly, you need to do that config files store folder as git repository.
  * Go to your cloned config file repo folder(directory) with CMD or Terminal
  * Type `git init` and type `git add .` and type `git commit -m "first commit for config"`. 
    * (`git init` command should type only `one time` for this folder).
* Clone [Spring Cloud Config Server](https://github.com/yewin-mm/spring-cloud-config-server) and go to `application.prperties` file.
  * In there, you need to comment out my cloud config url `spring.cloud.config.server.git.uri = https://github.com/yewin-mm/spring-cloud-config-files-storage.git` <br> 
  and uncomment the field for local config repo `spring.cloud.config.server.git.uri = file:///Users/yewin/IdeaProjects/microservices-config-files`
  * And, you need to `change path` to your config file store `directory` which you cloned in above step.
  * You still can use my cloud config url without comment out instead of local config url, but it's better using your clone config file directory for updating and testing properties values.
  * You can even change spring security username, password and encrypted key in that properties file.
  * Run that cloud config server.
* Clone and run this application.
  * Please make sure that `spring.cloud.config.username`, `password` and `spring.config.import` url port in `application.properties` file is same with config server security username and password and running port.
  * Please make sure your config file store directory is already need to be git project as above `git init` keyword.

<a name="testing"></a>
#### Testing
* Import `cloud config.postman_collection.json` file under project directory (see that file in project directory) into your installed Postman application.
  * Click in your Postman (top left corner) import -> file -> upload files -> {choose that json file} and open/import.
  * After that, you can see the folder which you import from file in your Postman.
  * Open your imported `cloud-config` folder in postman and inside this folder, you will see total of 3 folders,


<a name="testing-config-server"></a>
##### Testing Config Server
* Now, you can test Config Server by calling api from Postman.
* Please note that your Config File Store directory is already git project as above [Setup Config file store](#setup-and-run-services) step.
* Open `config-server` folder
  * Open `(build-in api) (service a) check properties (default profile)` api, click `send` button, you can see Service A default profile config values.
  * And this values is from `microservice-a.properties` file and which file under your cloned config file store directory.
  * You can also check for another check properties APIs `as per application profile` and I already dropped those APIs in that folder.
  * You can also check `encrypt` and `decrypt` APIs by adding test value in encrypt api, and you will get encrypted value, <br>
    and you can add that encrypted value in decrypt api and you will get decrypted value.
  * Those `encrypt` and `decrypt` APIs is just for testing encryption which will use in our config file store and config server as for security. <br>
    Because someone may get your config files, and he can easily get your secret credentials like server credentials.
  * Because in real world applications, you need to push your config file store in GitHub or Bitbucket.
  * That approach is because your real world running application in cloud server can't connect to your local config directory and so, you need to push your config repo to GitHub or Bitbucket.
  * So, this config file store directory is just for testing in local laptop and even if you push your config file store in GitHub as repository,
    your config server can fetch that config file directory well and I already dropped that sample cloud config file url in `application.properties` file of  config server too.
    
<a name="testing-normal-config"></a>
##### Testing Normal Config
* Now, you can test Normal Config by calling api from Postman.
* Please note that your Config File Store directory is already git project as above [Setup Config file store](#setup-and-run-services) step.
* Open `client microservices-a` folder
  * Open `getValueByUsingValueAnnotation` api, click `send` button, you can see Service A config value. <br> That way is getting config value by using `@Value` annotation.
  * Surprisingly that config values are `not` from this `application.properties` file (you can change the value in this application.properties file for testing) <br> 
    and you will see that values are from `microservice-a-qa.properties` file under config file store directory.
  * So, this application take config values from `config file store` through `config server` over Git repository (because config file store have to be git project and need to be committed).
  * You can also test by `changing spring profile` in this application.properties file like `default, dev, prod`, and you will see the values which are from config file store and there will be many files `as per profile`.
  * If you want to test for using this `application.properties` file, you can stop config server and call this API again.
  * You can also test for `getValueByUsingConfigProperties` api, click `send` button, you can see Service A config value. <br> That way is getting config value by using `@ConfigurationProperties` annotation.

<a name="testing-dynamic-config"></a>
##### Testing Dynamic Config
* Now, you can test Dynamic Config by calling api from Postman.
* Please note that your Config File Store directory is already git project as above [Setup Config file store](#setup-and-run-services) step.
* Open `client microservices-a` folder
* Firstly, Run your project (if not run) and call `getValueByUsingValueAnnotation` or `getValueByUsingConfigProperties` api and see the values.
  * Go to config file store folder (directory). 
  * Update some values in properties file and save that file which file need to be same with your running spring profile, <br> 
    eg. if you run your application with `QA` profile, you need to update some values in `microservice-a-qa.properties` file.
  * Commit into Git.
    * Go to config file store folder (directory) with `CMD` or `terminal`.
    * type `git add .` and `git commit -m "update some values"`,
  * No need to stop your running application. 
  * Call `getValueByUsingValueAnnotation` or `getValueByUsingConfigProperties` api again and see the values.
  * There, you will see your updated values won't be shown.
  * Call `(build-in api) refresh` API and you will see the field name that you updated as response.
  * Call `getValueByUsingValueAnnotation` or `getValueByUsingConfigProperties` api again and see the values.
  * There, you will see your updated values can be seen.
  * That's mean you will get your updated config values without restarting the application.
  * You can also check for another profile,
    * Stop this application and change profile (eg. prod) and run.
    * Call getValue API and see the values,
    * Update some values in properties file as per your profile. 
    * eg. if you run with `prod` profile, you need to update value in `microservice-a-prod.properties` file. 
    * Save that file and commit.
    * Call `Refresh` Api and call `getValue` API again. You will see your updated values as per profile file.
  * You can also check build-in actuator `health` and `env` api.

* That's what we call Spring Cloud Config, 
  * Your applications configs can be `centralization` as you can use Config Store for all applications, 
    <br> you can see another config client here, [Spring Cloud Config Sample Microservice B](https://github.com/yewin-mm/spring-cloud-config-sample-microservice-b) and so, all applications can use that Config Store Repository.
  * You applications are not depend on its own config properties file and we can handle those config properties files at one place for all applications.
  * You can do update values if you need to change something important in application config while the application was running on production go live, <br>
    and you can do as your business logic with that updated values without restarting the application.
  * Because normally, we need to restart the application if we changed some config in application.properties.
  * So, with that dynamic configuration approach, it will help you a lot in your production go live application, if you want to change something important.
  * You can push `Cloud Config Store` to `GitHub` or `Bitbucket` rather than putting in your machine,
  * and if you pushed that Config store into `GitHub` or `Bitbucket`, you need to add that Git url in `Config Server` properties file which I already dropped as sample. 

* After that you can check the code which you don't know. You can learn it, and you can apply in your job or study fields.

***Have Fun and Enjoy in Learning Code***


<a name="contact"></a>
## ✉️ Contact
Name - Ye Win <br> LinkedIn profile -  [Ye Win's LinkedIn](https://www.linkedin.com/in/ye-win-1a33a292/)  <br> Email Address - yewin.mmr@gmail.com

Project Link: [Spring Cloud Config Sample Microservice A](https://github.com/yewin-mm/spring-cloud-config-sample-microservice-a)


<a name="contributing"></a>
## ⭐ Contributing
Contributions are what make the open source community such an amazing place to be learnt, inspire, and create. Any contributions you make are **greatly appreciated**.
<br>If you want to contribute....
1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/yourname`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeatures'`)
4. Push to the Branch (`git push -u origin feature/yourname`)
5. Open a Pull Request
