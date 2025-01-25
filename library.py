class library():
    def __init__(self,names):
        self.books={}
        self.n=names
    def add(self,book_name):
        if book_name in self.books:
            self.books[book_name] +=1
        else:
            self.books[book_name]=1
            print( "your book " + book_name +" added ")
            
    def return_book(self,book_name):
        self.add(book_name)
        print("your book" + book_name + " returned ")
x = library("student library")
choice = input("enter your choice ")
if choice == "1":
    book = input("Enter the name of the book  ")
    x.add(book)
elif choice == "2":
    book = input("Enter the name of the book to return ")
    x.return_book(book)
