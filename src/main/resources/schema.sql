DROP TABLE IF EXISTS courses_students;

DROP TABLE IF EXISTS students;

DROP TABLE IF EXISTS courses;

DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  email VARCHAR(255) NOT NULL,
  password VARCHAR(80) NOT NULL,
  first_name VARCHAR(45) NOT NULL,
  last_name VARCHAR(45) NOT NULL,
  fl_active TINYINT NOT NULL DEFAULT 1,
  user_type VARCHAR(45) NOT NULL
);


CREATE TABLE IF NOT EXISTS courses (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  code VARCHAR(12) NOT NULL,
  name VARCHAR(255) NOT NULL,
  start_time DATE NOT NULL,
  end_time DATE NOT NULL,
  fl_active TINYINT NOT NULL DEFAULT 0,
  fk_tutor INT,
    FOREIGN KEY (fk_tutor) REFERENCES users (id)
);

CREATE TABLE IF NOT EXISTS students (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(45) NOT NULL,
  last_name VARCHAR(45) NOT NULL,
  email VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS courses_students (
  fk_student INT NOT NULL,
  fk_course INT NOT NULL,
  PRIMARY KEY(fk_student, fk_course),
  FOREIGN KEY (fk_student) REFERENCES students (id),
  FOREIGN KEY (fk_course) REFERENCES courses (id)
);


