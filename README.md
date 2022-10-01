# A Cooking Recipe API

[![Java Language](https://img.shields.io/badge/language-Java-3A75B0.svg?logo=OpenJDK)][1]
[![JVM Platform](https://img.shields.io/badge/platform-JVM-6C93B8.svg?logo=IntelliJIDEA)][2]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?logo=JUnit5)][3]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?logo=ApacheMaven)][4]
[![Spring Boot](https://img.shields.io/badge/web%20framework-Spring%20Boot-6DB33F.svg?logo=SpringBoot)][5]

The purpose of this project is to build a simple web (JSON over HTTP) API to manage recipes, following a **test-driven development** approach. 

We want to ensure that the emphasis is on practicing all the concepts covered during the course. Therefore, in building this simple API, we will focus on **happy path scenarios** only.

**<u>Note:</u>** for brevity, not all ingredients and instructions are displayed in the examples below.

- [Retrieve recipes][6]
- [Create a recipe][7]
- [Change a recipe][8]
- [Delete a recipe][9]

## Retrieve recipes

> *As a user (through a client of this web API) <br/>*
> *I want to be able to retrieve all the recipes <br/>*
> *So that I can choose what I will cook today.*

#### <u>Example</u>

Given there are 2 recipes in our recipe management system <br/>
When I request to see their details via the `GET /recipes` endpoint <br/>
Then I should get a `200 OK` HTTP response with: <br/>

```JSON
[
    {
        "id": 1,
        "name": "Creamy courgette lasagne",
        "ingredients": [
            {
                "name": "dried lasagne sheets",
                "quantity": "9"
            },
            {
                "name": "courgette coarsely grated",
                "quantity": "700g (about 6)"
            }
        ],
        "instructions": "Heat oven to 220C/fan 200C/gas 7. Put a pan of water on to boil, 
            then cook the lasagne sheets for about 5 mins until softened, but not cooked through..."
    },
    {
        "id": 2,
        "name": "Blackberry pie",
        "ingredients": [
            {
                "name": "blackberries",
                "quantity": "600g"
            },
            {
                "name": "self-raising flour",
                "quantity": "300g (plus extra for dusting)"
            }
        ],
        "instructions": "First, make the pastry. 
            Tip both flours and the sugar into a bowl with a large pinch of salt..."
    }
]

```


## Create a recipe

> *As a user (through a client of this web API) <br/>*
> *I want to be able to create a new recipe as needed <br/>*
> *So that I add to my collection of recipes.*

#### <u>Example</u>

Given the ingredients and instructions of a new recipe below <br/>
When I request to create a new recipe via the `POST /recipes` endpoint <br/>
Then I should get a `201 CREATED` HTTP response. <br/>

```JSON
{
    "name": "Aubergine parmigiana lasagne",
    "ingredients": [
        {
            "name": "large aubergines, trimmed and thinly sliced lengthways",
            "quanity": "3"
        },
        {
            "name": "vegetarian mozzarella, drained and coarsely grated",
            "quanity": "250g"
        }
    ],
    "instructions": "Heat a griddle or large frying pan over a medium-high heat. 
        Brush the aubergine slices on both sides with the olive oil and season with a little salt,
        then griddle in batches until the slices are softened and slightly charred..."
}
```


## Change a recipe

> *As a user (through a client of this web API) <br/>*
> *I want to be able to edit a recipe <br/>*
> *So that I keep an accurate record of my recipes.*

#### <u>Examples</u>

Given the new (partial) instructions of an existing recipe below <br/>
When I request to update a recipe via the `PUT /recipes/{id}` endpoint <br/>
Then I should get a `204 NO CONTENT` HTTP response. <br/>

```JSON
{
    "name": "Aubergine parmigiana lasagne",
    "instructions": "Heat a griddle or large frying pan over a medium-high heat. 
        Brush the aubergine slices on both sides with the olive oil and season with a little salt,
        then griddle in batches until the slices are softened and slightly charred (ensure the heat isn’t too high or the aubergine will char before it softens). 
        Transfer the cooked slices to a plate as you go..."
}
```

<br/>

Given the updated list of ingredients of an existing recipe below <br/>
When I request to update a recipe via the `PUT /recipes/{id}` endpoint <br/>
Then I should get a `204 NO CONTENT` HTTP response. <br/>

```JSON
{
    "name": "Aubergine parmigiana lasagne",
    "ingredients": [
        {
            "name": "garlic cloves, finely sliced",
            "quanity": "6"
        },
        {
            "name": "chopped tomatoes",
            "quanity": "3 x 400g cans"
        }
    ]
}
```


## Delete a recipe

> *As a user (through a client of this web API) <br/>*
> *I want to be able to delete a recipe <br/>*
> *When I no longer need it.*

#### <u>Example</u>

Given a recipe we no longer need in our system <br/>
When I request to delete it via the `DELETE /recipes/{id}` endpoint <br/>
Then I should get a `204 NO CONTENT` response. <br/>



[1]: https://www.java.com/en/download/help/whatis_java.html
[2]: https://www.ibm.com/cloud/blog/jvm-vs-jre-vs-jdk
[3]: https://junit.org/junit5/
[4]: https://maven.apache.org/
[5]: https://spring.io/projects/spring-boot

[6]: #retrieve-recipes
[7]: #create-a-recipe
[8]: #change-a-recipe
[9]: #delete-a-recipe
