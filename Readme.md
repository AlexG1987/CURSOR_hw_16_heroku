Useles info to project

App lint - https://serene-beach-76506.herokuapp.com/ (paste it to your HTTP-client)

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
"firstName":"Robert",
"lastName":"Martin",
"books":[{"title":"Clean Code", "genre":"Programming", "description":"Book about goog coding style", "rate":10}]
}

Book
{
"title":"Clean Code",
"genre":"Programming",
"description":"Book about goog coding style",
"rate":10
}