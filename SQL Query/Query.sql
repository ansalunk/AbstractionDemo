BEGIN TRANSACTION;

/* Create Manufacturer table */
CREATE TABLE MANUFACTURER(MNAME TEXT, MODEL TEXT, PRICE NUMBER);

/* Create sample records in the table */
INSERT INTO MANUFACTURER VALUES('Toyota', 'Camry', 16000);
INSERT INTO MANUFACTURER VALUES('Toyota', 'Highlander', 22000);
INSERT INTO MANUFACTURER VALUES('Honda', 'Pilot', 24000);
INSERT INTO MANUFACTURER VALUES('Honda', 'Accord', 17000);
COMMIT;

/* Query to find car manufacturer and model with highest cost */

SELECT m1.mname as Manufacturer, m1.model as Model, m1.price as Price
FROM manufacturer m1
INNER JOIN
(SELECT mname, MAX(price) AS mprice
FROM MANUFACTURER
GROUP BY mname) m2
ON m1.mname=m2.mname AND m1.price = m2.mprice;SELECT * FROM demo;