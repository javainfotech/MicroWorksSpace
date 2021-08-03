DROP TABLE IF EXISTS exchange_value;

CREATE TABLE exchange_value (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  currency_from VARCHAR(250) NOT NULL,
  currency_to VARCHAR(250) NOT NULL,
  conversion_multiple VARCHAR(250) DEFAULT NULL,
  port INT
);

insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port) 
values(1000,'USD','INR',70,0); 

insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port) 
values(1001,'EUR','INR',112,0); 

insert into exchange_value(id,currency_from,currency_to,conversion_multiple,port) 
values(1002,'AUD','INR',2,0); 