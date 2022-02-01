CREATE TABLE users(
    id int NOT NULL UNIQUE auto_increment,
    name text NOT NULL,
    password text NOT NULL,
    active BIT NOT NULL,
    PRIMARY KEY (id)
);

insert into users (id, name, password, active)
values(1,'teste', '$2a$10$ryVl8CRTo7E1a.OzpbV9aO7/8PmsE1MOqPPMhF11CE9sxXTmzpFRm', true);