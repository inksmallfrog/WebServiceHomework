class BooksController < ApplicationController
	def index
		client = Savon.client(wsdl: 'http://localhost:8080/services/MSBM?wsdl')
  		response = client.call(:get_book_list)
  		@books = Array.new
  		response.body[:get_book_list_response][:return].each do |book_item| 
  			@books.push << Book.new(book_item)
  		end
	end
end
