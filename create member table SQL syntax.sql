CREATE TABLE MEMBER(
					ID VARCHAR(20) NOT NULL PRIMARY KEY,
					PASSWORD VARCHAR(20) NOT NULL,
					GENDER VARCHAR(10) NOT NULL,
					NAME VARCHAR(20) NOT NULL,
					PHONE VARCHAR(20),
					EMAIL VARCHAR(20),
					ADDRESS VARCHAR(50)
					CHARACTER SET UTF8 COLLATE UTF8_BIN);