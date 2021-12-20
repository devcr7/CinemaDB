# CinemaDB
An online database of information related to films, television/web series and streaming content online – including cast, plot summaries, trivia, ratings, and fan and critical votes. Uses IMDB unofficial REST API.

This app basically uses IMDB unofficial Rest API (https://rapidapi.com/hmerritt/api/imdb-internet-movie-database-unofficial) for interacting with the server.
Retrofit has been used as Rest client which makes https request and help in converting the JSON to java for further interaction with the API interface.

Several Model/POJO classes have been created to for retrieving the API response concerned with search and film endpoints. The interface of the same has been created seperately.
Retrofit object has been created in RequestManager class to deal with all call and get calls.
Two seprate recycler views have been used one for each endpoints which deals with 2 different adapters.
Postman has been used to test our API.

Splash screen and icon image has been taken from pinterest.
Below are the two screen recordings while the app is in use (Dark and light mode both).




https://user-images.githubusercontent.com/61392760/146841592-5c1e6c77-86ed-490d-9674-d3859511b782.mp4




https://user-images.githubusercontent.com/61392760/146842927-ad15ce8b-b47b-46f2-8fa5-d7db7d4d951f.mp4

