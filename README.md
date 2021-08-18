# Springboot_JPA_Practice
![alt text](https://media.vlpt.us/images/dnjscksdn98/post/00097025-bc06-401e-9044-6d80dc6eacf6/jpa.png)

In this repository I aim to practice the following skills.
* Java
* Spring Framework(Spring Boot)
* JPA
* QueryDsl
* Rest API

I will plan to follow the materials on the course accordingly and will produce toy web application while doing so.

## jpashop
* Practicing basic Java language and Spring framework
* Designing tables for domain as well as laying out business logic in service files
* Basic understanding of databases(as this is a practice application, an h2 database, which is commonly used for test environments was used)
* Understanding and practicing REST API development
* Optimizing JPQL using fetch join method and calling DTOs.

### errors that occured in the process
* Delete 'out' file when css or javascript files are not implemented
* Always remember to activate h2 database before running app via "./h2.sh" command in the bin directory


## mavenshop
* Practicing relational mapping of Java entities
* Basic understainding of Entity Manger
* Using inheritance(JOINED, SINGLE_TABLE) for Java entity ORM, and using MappedSuperclass to take care of common values.
* Understanding proxy and why it is necessary to use the 'Lazy' fetch type.

### errors that occured in the process
* Forgot to add "<property name="hibernate.hbm2ddl.auto" value="create" />" in persistnece.xml resulting in failing to create the correct tables to map the data.


## data-jpa
* Basic understanding of Spring Data JPA
* Adding different methods while still using Spring Data JPA
* Adding base entity such as createDate, modifiedDate, createUser, modifiedUser
* Paging using Spring Data JPA