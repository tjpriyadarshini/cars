CREATE TABLE cars (
    car_id int not null primary key,
    variant varchar,
    original_price double,
    discount float,
    model_id integer references models(model_id)
);
