INSERT INTO users(id, name) VALUES (1,'coach');
INSERT INTO users(id, name) VALUES (2,'rochelle');
INSERT INTO users(id, name) VALUES (3,'bill');
INSERT INTO users(id, name) VALUES (4,'zoey');
INSERT INTO users(id, name) VALUES (5,'nick');
INSERT INTO users(id, name) VALUES (6,'francis');
INSERT INTO users(id, name) VALUES (7,'louis');
INSERT INTO users(id, name) VALUES (8,'ellis');

INSERT INTO payments(id, userId, amount) VALUES (1, 1, 27.0);
INSERT INTO payments(id, userId, amount) VALUES (2, 2, 22.0);
INSERT INTO payments(id, userId, amount) VALUES (3, 3, 41.0);
INSERT INTO payments(id, userId, amount) VALUES (4, 4, 0);
INSERT INTO payments(id, userId, amount) VALUES (5, 3, 36.0);
INSERT INTO payments(id, userId, amount) VALUES (6, 5, 48.0);
INSERT INTO payments(id, userId, amount) VALUES (7, 1, 42.0);
INSERT INTO payments(id, userId, amount) VALUES (8, 2, 36.0);
INSERT INTO payments(id, userId, amount) VALUES (9, 5, 48.0);
INSERT INTO payments(id, userId, amount) VALUES (10, 6, 45.0);
INSERT INTO payments(id, userId, amount) VALUES (11, 2, 27.0);
INSERT INTO payments(id, userId, amount) VALUES (12, 6, 31.0);
INSERT INTO payments(id, userId, amount) VALUES (13, 4, 9.0);
INSERT INTO payments(id, userId, amount) VALUES (14, 5, 47.0);
INSERT INTO payments(id, userId, amount) VALUES (15, 7, 12.0);
INSERT INTO payments(id, userId, amount) VALUES (16, 2, 10.0);
INSERT INTO payments(id, userId, amount) VALUES (17, 4, 43.0);
INSERT INTO payments(id, userId, amount) VALUES (18, 6, 36.0);
INSERT INTO payments(id, userId, amount) VALUES (19, 4, 49.0);
INSERT INTO payments(id, userId, amount) VALUES (20, 8, 24.0);

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
INSERT INTO orders(id, userId, productId, size) VALUES (2, 8, 4, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (3, 2, 3, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (4, 1, 3, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (5, 4, 4, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (6, 4, 1, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (7, 5, 5, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (8, 3, 6, 'ultra');
INSERT INTO orders(id, userId, productId, size) VALUES (9, 8, 5, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (10,2, 1, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (11,6, 4, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (12,1, 5, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (13,1, 1, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (14,2, 4, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (15,3, 5, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (16,8, 5, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (17,7, 5, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (18,1, 2, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (19,4, 3, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (20,8, 2, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (21, 7, 2, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (22, 4, 1, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (23, 7, 4, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (24, 4, 3, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (25, 2, 6, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (26, 1, 3, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (27, 6, 5, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (28, 6, 1, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (29, 6, 1, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (30, 8, 3, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (31,1, 4, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (32,1, 1, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (33,8, 6, 'huge');
INSERT INTO orders(id, userId, productId, size) VALUES (34,8, 1, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (35,1, 2, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (36,5, 1, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (37,8, 1, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (38,2, 2, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (39,1, 2, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (40, 2, 4, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (41,8, 3, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (42,3, 2, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (43,2, 6, 'mega');
INSERT INTO orders(id, userId, productId, size) VALUES (44,1, 5, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (45,3, 6, 'mega');
INSERT INTO orders(id, userId, productId, size) VALUES (46,6, 4, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (47,1, 4, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (48,6, 3, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (49,1, 4, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (50, 3, 4, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (51,3, 6, 'huge');
INSERT INTO orders(id, userId, productId, size) VALUES (52,8, 6, 'ultra');
INSERT INTO orders(id, userId, productId, size) VALUES (53,2, 1, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (54,7, 5, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (55,1, 6, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (56,5, 1, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (57,3, 5, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (58,8, 1, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (59,5, 3, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (60,4, 6, 'ultra');
INSERT INTO orders(id, userId, productId, size) VALUES (61,7, 3, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (62,7, 4, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (63,5, 1, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (64,2, 2, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (65,7, 5, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (66,7, 4, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (67,1, 6, 'mega');
INSERT INTO orders(id, userId, productId, size) VALUES (68,6, 4, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (69,7, 3, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (70,3, 6, 'mega');
INSERT INTO orders(id, userId, productId, size) VALUES (71,4, 2, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (72,8, 3, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (73,4, 3, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (74,8, 1, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (75,2, 3, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (76,8, 6, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (77,5, 2, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (78,1, 2, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (79,5, 5, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (80,7, 2, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (81,7, 6, 'mega');
INSERT INTO orders(id, userId, productId, size) VALUES (82,6, 6, 'mega');
INSERT INTO orders(id, userId, productId, size) VALUES (83,4, 2, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (84,6, 2, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (85,1, 3, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (86,1, 6, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (87,8, 1, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (88,7, 3, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (89,3, 1, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (90,5, 3, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (91,4, 5, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (92,2, 4, 'medium');
INSERT INTO orders(id, userId, productId, size) VALUES (93,4, 2, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (94,2, 1, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (95,6, 5, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (96,3, 4, 'small');
INSERT INTO orders(id, userId, productId, size) VALUES (97,6, 6, 'ultra');
INSERT INTO orders(id, userId, productId, size) VALUES (98,2, 6, 'large');
INSERT INTO orders(id, userId, productId, size) VALUES (99,8, 6, 'ultra');
INSERT INTO orders(id, userId, productId, size) VALUES (100,5, 6, 'huge');
