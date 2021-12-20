# CinemaDB
An online database of information related to films, television/web series and streaming content online – including cast, plot summaries, trivia, ratings, and fan and critical votes. Uses IMDB unofficial REST API.

This app basically uses IMDB unofficial Rest API (https://rapidapi.com/hmerritt/api/imdb-internet-movie-database-unofficial) for interacting with the server.
Retrofit has been used as Rest client which makes https request and help in converting the JSON to java for further interaction with the API interface.

Several Model/POJO classes have been created to for retrieving the API response concerned with search and film endpoints. The interface of the same has been created seperately.
Retrofit object has been created in RequestManager class to deal with all call and get calls.

Splash screen and icon image has been taken from pinterest.


