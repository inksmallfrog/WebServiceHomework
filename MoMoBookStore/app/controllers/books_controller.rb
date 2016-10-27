class BooksController < ApplicationController
	def index
		client = Savon.client(wsdl: 'http://localhost:8080/services/MSBM?wsdl')
  		response = client.call(:get_book_list)
  		puts response
  		@books = Array.new
  		response.body[:get_book_list_response][:return].each do |book_item| 
  			puts book_item
  			@books.push << Book.create(book_item)
  		end
  		puts @books.length
	end
end
