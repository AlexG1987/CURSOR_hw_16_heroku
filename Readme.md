Useles info to project

App lint - https://serene-beach-76506.herokuapp.com/ (paste it to your HTTP-client)

Methods:

/book

/ POST - add book
/{id} PATCH - update book by id
/{id} DELETE - delete book by id
/{genre} GET - get list of books by genre
/{author} GET - get list of books by author

/author

/ POST - add author
/{id} PATCH - update author by id
/{id} DELETE - delete author by id

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