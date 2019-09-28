# Running the project
This project was built with maven.
[dog-api-0.0.1-SNAPSHOT.jar](https://github.com/kthompson55/dog-api/blob/master/dog-api-0.0.1-SNAPSHOT.jar "dog-api-0.0.1-SNAPSHOT.jar") will run a Spring server on localhost:8080
To run the jar, run the following command in the terminal from the root of the repository:
`java -jar dog-api-0.0.1-SNAPSHOT.jar`

# API Documentation
The following routes are accepted:
`GET /api/dog-ratings` - Returns a list of all the valid submitted dog ratings
`POST /api/dog-ratings` - Attempts to add a dog rating on the server
When posting a dog rating, the following JSON model is required:
```JSON
{
  "rating": <number>, // 10 = x = 16
  "imageUrl": <string> // has to be properly formed URL
}
```