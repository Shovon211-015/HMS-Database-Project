--Database
CREATE DATABASE perarhospital;

--PATIENT SHEET
CREATE TABLE module1(P_ID INT NOT NULL, NAME VARCHAR(25) NOT NULL, FATHER NAME VARCHAR(25), MOBILE INT NOT NULL UNIQUE KEY, ILLNESS VARCHAR(50) NOT NULL, BLOOD GROUP VARCHAR(5) NOT NULL, ADDRESS VARCHAR(20) NOT NULL, GENDER ENUM ('MALE','FEMALE','OTHER') NOT NULL, AGE INT NOT NULL, ASTATUS ENUM('Admited','Not Asmited') NOT NULL, DDATE date, Adate date, PRIMARY KEY(P_ID) , FOREIGN KEY(ILLNESS) REFERENCES desease(illname));

--DEPERTMENT
CREATE TABLE Depertment(Name VARCHAR(30) PRIMARY KEY, Chairparson VARCHAR(30), CP_Phone_NO INT unique key);

--insert
INSERT INTO `depertment`(`Name`, `Chairparson`, `CP_Phone_NO`) VALUES ('Cardiology','Emdadul Haque','01478523698'), ('Medicine','Ekramul Haque','01369874521'), ('ENT','Ebadat hossain','01498745634'), ('Emergency',NULL,NULL), ('Administrative','Ejajul Islam','01741236985'), ('Surgical','Jalaluddin Alamgir','01987456321'), ('Nursing','Silpi Begum','01852369741'), ('Pharmacy','Rabbi Hasan','01987455241');

--DESEASE
CREATE TABLE Desease(illname VARCHAR(30) PRIMARY KEY, dept VARCHAR(30), FOREIGN KEY(Dept) REFERENCES depertment(Name));

--Insert
INSERT INTO `desease`(`illname`, `dept`) VALUES ('Cancer', 'Cardiology'),  ('Heart', 'Cardiology'), ('EAR', 'ENT'),  ('NOSE', 'ENT'),  ('Troat', 'ENT'), ('Asthma', 'Medicine'), ('BloodPressure', 'Medicine'), ('FEVER', 'Medicine'), ('Bone Break', 'Surgical');

--DOCTOR
CREATE TABLE Doctor(D_ID int PRIMARY KEY, Name VARCHAR(30) not null, PStart_Time TIME,PEnd_Time Time, Qualification VARCHAR(250), Achivement VARCHAR(250), Email VARCHAR(50) not null unique key, Phono int unique key, salary int, Dept_Name VARCHAR(50) not null, FOREIGN KEY(Dept_Name) REFERENCES depertment(Name));

--STUFF
CREATE TABLE Stuff(ID int PRIMARY KEY, Name VARCHAR(30) NOT NULL, Age int NOT NULL, Gender ENUM('male', 'female') NOT NULL, Address VARCHAR(30) NOT NULL, Phone_NO INT NOT NULL UNIQUE KEY, WORK_TYPE VARCHAR(25) NOT NULL UNIQUE KEY, STARTING_date date NOT NULL, Salary DOUBLE NOT NULL, FOREIGN KEY(WORK_TYPE) REFERENCES Works(NAME));

---WORKS
CREATE TABLE Works(NAME VARCHAR(50) PRIMARY KEY, dept VARCHAR(30), FOREIGN KEY(Dept) REFERENCES depertment(Name));

--Insert  
INSERT INTO `Works`(`name`, `dept`) VALUES ('Account Manager', 'Administrative'), ('Receptionist', 'Administrative'), ('Security', 'Administrative'), ('Car_Reception', 'Cardiology'), ('ent_Reception', 'ENT'), ('Med_Reception', 'Medicine'), ('Cleaner', 'Nursing'), ('Nurse', 'Nursing'), ('Pharmacist', 'Pharmacy'), ('Sur_Reception', 'Surgical') , ('OT Specialist', 'Surgical');
