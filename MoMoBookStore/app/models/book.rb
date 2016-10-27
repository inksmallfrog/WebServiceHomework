class Book
	include ActiveModel::Model 
	attr_accessor :id, :name, :picture, :publisher, :isbn,
      	:original_price, :price, :discount, :count, :ordered_times,
        :descript, :create_time, :finished_time
        
    def initialize(attributes={})
    	super
    end
end
