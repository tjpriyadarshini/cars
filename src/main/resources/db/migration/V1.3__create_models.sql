CREATE TABLE models (
    model_id int not null primary key,
    modelName varchar,
    brand_id integer references brands(brand_id),
    type_id integer references types(type_id)
);