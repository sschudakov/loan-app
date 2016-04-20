CREATE TABLE clients (
	id              INT PRIMARY KEY AUTO_INCREMENT,
	passport_number VARCHAR(20),
	name            VARCHAR(30),
	surname         VARCHAR(30),
	age             INT,
	is_married      BOOLEAN DEFAULT FALSE
);

CREATE TABLE loan_requests (
	id                INT PRIMARY KEY AUTO_INCREMENT,
	client_id         INT,
	request_time      TIMESTAMP,
	amount            INT,
	term              INT,
	official_income   INT,
	additional_income INT,
	FOREIGN KEY (client_id) REFERENCES clients (id)
);

CREATE TABLE loans (
	id              INT PRIMARY KEY AUTO_INCREMENT,
	client_id       INT,
	loan_request_id INT,
	amount					INT,
	term						INT,
	issue_date			TIMESTAMP,
	FOREIGN KEY (client_id) REFERENCES clients (id),
	FOREIGN KEY (loan_request_id) REFERENCES loan_requests (id),
);