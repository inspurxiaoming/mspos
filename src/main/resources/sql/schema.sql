CREATE TABLE
IF
	NOT EXISTS event_monitor (
		id VARCHAR ( 128 ) COLLATE utf8mb4_general_ci NOT NULL,
		event_name VARCHAR ( 255 ) COLLATE utf8mb4_general_ci DEFAULT NULL,
		create_date datetime DEFAULT NULL,
	PRIMARY KEY ( id )
	) ENGINE = INNODB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci;