CREATE TABLE food
(
    name varchar(255) not null,
    weight integer,
    unit_of_measure varchar(255),
    date_of_storage timestamp,
    primary key(name)
);

INSERT INTO FOOD (NAME, WEIGHT, UNIT_OF_MEASURE, DATE_OF_STORAGE)
       VALUES('Hot Dogs', 2355 , 'KG', sysdate());
INSERT INTO FOOD (NAME, WEIGHT, UNIT_OF_MEASURE, DATE_OF_STORAGE)
       VALUES('Bread', 2462 ,'KG',sysdate());
INSERT INTO FOOD (NAME, WEIGHT, UNIT_OF_MEASURE, DATE_OF_STORAGE)
       VALUES('Cheese', 4555 ,'KG',sysdate());


