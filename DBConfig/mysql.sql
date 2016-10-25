CREATE TABLE MSBM_user(
	id int UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT, 
	name varchar(20) NOT NULL UNIQUE,
	pwd varchar(80) NOT NULL,
	address varchar(120))AUTO_INCREMENT = 0;

CREATE TABLE MSBM_book(
	id int UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name varchar(120) NOT NULL,
	picture varchar(120) DEFAULT "/assets/picture/default.jpg",
	publisher varchar(120),
	ISBN varchar(80),
	original_price float(8, 2),
	price float(8, 2),
	discount float(4, 2) NOT NULL DEFAULT 0.0,
	count int NOT NULL DEFAULT 0,
	ordered_times int NOT NULL DEFAULT 0,
	descript varchar(420) DEFAULT ""
)AUTO_INCREMENT = 0;

CREATE TABLE MSBM_order(
	id int NOT NULL PRIMARY KEY AUTO_INCREMENT, 
	user_id int NOT NULL FOREIGN KEY REFERENCES 'MSBM_user'('id'),
	book_id int NOT NULL FOREIGN KEY REFERENCES 'MSBM_book'('id')
)AUTO_INCREMENT = 0;