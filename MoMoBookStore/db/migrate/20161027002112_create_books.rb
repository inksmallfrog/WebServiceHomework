class CreateBooks < ActiveRecord::Migration[5.0]
  def change
    create_table(:books, id: false) do |t|
      t.integer :id
      t.string :name
      t.string :picture
      t.string :publisher
      t.string :isbn
      t.float :original_price
      t.float :price
      t.float :discount
      t.integer :count
      t.integer :ordered_times
      t.string :descript
      t.timestamp :create_time
      t.timestamp :finished_time

      t.timestamps
    end
  end
end
