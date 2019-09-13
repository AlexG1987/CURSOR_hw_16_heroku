Useles info to project

App lint - https://boiling-tor-14805.herokuapp.com/ (paste it to your HTTP-client)

Methods:

POST
/addAuthor
/addBook

GET
/sortedBooksByAuthor/{id}
/sortedBooksByGenre/{genre}

DELETE
/deleteAuthor/{id}
/deleteBook/{id}

PATCH
/updateAuthor/{id}
/updateBook/{id}

Params:

Author
{
"fName":"",
"lName":"",
"books":[{"title":"", "genre":"", "description":"", "rate":,}],
}

Book
{
"title":"",
"genre":"",
"description":"",
"rate":,
}