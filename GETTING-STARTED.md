# Start Here

In the next sections, we'll look at the design (or specification) of each of the components needed for a given requirement.

Generally speaking, each functionality will be implemented via four types of components:

1. A **controller** 
    > It will be in charge of handling a `HTTP` request, and responding with an appropriate `JSON over HTTP` response.

2. A **query** or a **command**
    > Following the [Command and Query Responsibility Segregation][1] pattern. A command is used to change the state of the system, whereas a query is used to retrieve information about the system.

3. A **domain entity**
    > Which we'll use to model a recipe and its operations.

4. A **repository**
    > Which we'll use to store and retrieve recipes in the system. For simplicity, we'll use an in-memory repository.


## Run the application locally

This application is a simple server (for the web API) built using the [Spring Boot][2] framework.

First, ensure that you have Java installed by running the following in your terminal:

```bash
$ javac -version

javac 17.0.4
```
Or:

```bash
$ java -version

openjdk version "17.0.4" 2022-07-19 LTS
OpenJDK Runtime Environment Zulu17.36+13-CA (build 17.0.4+8-LTS)
OpenJDK 64-Bit Server VM Zulu17.36+13-CA (build 17.0.4+8-LTS, mixed mode, sharing)
```

Then, to start the server, run the following command:

```bash
cd api
./mvnw spring-boot:run
```

You should be able to see a similar output to this:

```bash
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.4)

2022-10-01 17:36:22.502  INFO 4849 --- [           main] c.c.recipe.RecipeApiApplication          : Starting RecipeApiApplication using Java 17.0.4
2022-10-01 17:36:22.504  INFO 4849 --- [           main] c.c.recipe.RecipeApiApplication          : No active profile set, falling back to 1 default profile: "default"
2022-10-01 17:36:22.891  INFO 4849 --- [           main] c.c.recipe.RecipeApiApplication          : Started RecipeApiApplication in 0.806 seconds (JVM running for 1.021)
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.664 s
[INFO] Finished at: 2022-10-01T17:36:22+01:00
[INFO] ------------------------------------------------------------------------
```



[1]: https://martinfowler.com/bliki/CQRS.html
[2]: https://spring.io/projects/spring-boot
