INSERT INTO users(id, name) VALUES (3,'coach');
INSERT INTO users(id, name) VALUES (4,'rochelle');

INSERT INTO payments(id, userId, amount) VALUES (1, 1, 27.0);
INSERT INTO payments(id, userId, amount) VALUES (2, 2, 22.0);
INSERT INTO payments(id, userId, amount) VALUES (3, 2, 36.0);
INSERT INTO payments(id, userId, amount) VALUES (4, 1, 42.0);
INSERT INTO payments(id, userId, amount) VALUES (11, 2, 27.0);

INSERT INTO products(id, name) VALUES (1,'short espresso');
INSERT INTO products(id, name) VALUES (2,'latte');
INSERT INTO products(id, name) VALUES (3,'flat white');
INSERT INTO products(id, name) VALUES (4,'long black');
INSERT INTO products(id, name) VALUES (5,'mocha');
INSERT INTO products(id, name) VALUES (6,'supermochacrapucaramelcream');

INSERT INTO productprices(id, productId, size, price) VALUES (1, 1, 'small', 3.0);
INSERT INTO productprices(id, productId, size, price) VALUES (2, 2, 'small', 3.5);
INSERT INTO productprices(id, productId, size, price) VALUES (3, 2, 'medium', 4.0);
INSERT INTO productprices(id, productId, size, price) VALUES (4, 2, 'large', 4.5);
INSERT INTO productprices(id, productId, size, price) VALUES (5, 3, 'small', 3.5);
INSERT INTO productprices(id, productId, size, price) VALUES (6, 3, 'medium', 4.0);
INSERT INTO productprices(id, productId, size, price) VALUES (7, 3, 'large', 4.5);
INSERT INTO productprices(id, productId, size, price) VALUES (8, 4, 'small', 3.25);
INSERT INTO productprices(id, productId, size, price) VALUES (9, 4, 'medium', 3.5);
INSERT INTO productprices(id, productId, size, price) VALUES (10, 5, 'small', 4.0);
INSERT INTO productprices(id, productId, size, price) VALUES (11, 5, 'medium', 4.5);
INSERT INTO productprices(id, productId, size, price) VALUES (12, 5, 'large', 5.0);
INSERT INTO productprices(id, productId, size, price) VALUES (13, 6, 'large', 5.0);
INSERT INTO productprices(id, productId, size, price) VALUES (14, 6, 'huge', 5.5);
INSERT INTO productprices(id, productId, size, price) VALUES (15, 6, 'mega', 6.0);
INSERT INTO productprices(id, productId, size, price) VALUES (16, 6, 'ultra', 7.0);

INSERT INTO orders(id, userId, productId, size) VALUES (1, 1, 4, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (2, 2, 3, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (3, 1, 3, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (4, 1, 5, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (5, 1, 1, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (6, 2, 1, 'small');
