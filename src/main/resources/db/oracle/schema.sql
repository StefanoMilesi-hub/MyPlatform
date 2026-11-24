CREATE TABLE assets (
    firebase_key VARCHAR2(40) PRIMARY KEY,
    asset_id VARCHAR2(20),
    asset_type VARCHAR2(80),
    assigned_user VARCHAR2(200),
    brand VARCHAR2(100),
    created_at TIMESTAMP WITH TIME ZONE,
    model VARCHAR2(120),
    purchase_date DATE,
    serial_number VARCHAR2(100),
    status VARCHAR2(40)
);

CREATE TABLE documents (
    firebase_key VARCHAR2(40) PRIMARY KEY,
    category VARCHAR2(100),
    description VARCHAR2(1000),
    file_name VARCHAR2(255),
    file_url VARCHAR2(2048),
    title VARCHAR2(255)
);

CREATE TABLE items (
    firebase_key VARCHAR2(40) PRIMARY KEY,
    item_date DATE,
    deleted NUMBER(1),
    item_id VARCHAR2(40),
    name VARCHAR2(255),
    status VARCHAR2(40),
    item_type VARCHAR2(40),
    value NUMBER(18, 4)
);

CREATE TABLE joined_roles (
    firebase_key VARCHAR2(40) PRIMARY KEY,
    active NUMBER(1),
    end_date DATE,
    role_id VARCHAR2(40),
    user_id VARCHAR2(128),
    role VARCHAR2(40),
    selected NUMBER(1),
    start_date DATE,
    user_email VARCHAR2(320)
);

CREATE TABLE payroll (
    firebase_key VARCHAR2(40) PRIMARY KEY,
    bonus_amount NUMBER(18, 2),
    created_at TIMESTAMP WITH TIME ZONE,
    employee_id VARCHAR2(40),
    encrypted_salary VARCHAR2(500),
    first_name VARCHAR2(100),
    last_name VARCHAR2(100),
    overtime_amount NUMBER(18, 2),
    payroll_month NUMBER(2),
    payroll_year NUMBER(4)
);

CREATE TABLE roles (
    firebase_key VARCHAR2(40) PRIMARY KEY,
    end_date DATE,
    role_id VARCHAR2(40),
    role VARCHAR2(40),
    start_date DATE
);

CREATE TABLE stats (
    firebase_key VARCHAR2(40) PRIMARY KEY,
    change_value NUMBER(18, 4),
    color VARCHAR2(40),
    deleted NUMBER(1),
    icon VARCHAR2(32),
    stat_id VARCHAR2(40),
    title VARCHAR2(255),
    stat_type VARCHAR2(40),
    value VARCHAR2(100)
);

CREATE TABLE users (
    firebase_key VARCHAR2(128) PRIMARY KEY,
    expiration_date TIMESTAMP WITH TIME ZONE,
    token VARCHAR2(1000),
    active_role VARCHAR2(40),
    email VARCHAR2(320),
    user_id VARCHAR2(128)
);

CREATE TABLE videos (
    firebase_key VARCHAR2(40) PRIMARY KEY,
    category VARCHAR2(100),
    description VARCHAR2(1000),
    file_name VARCHAR2(255),
    file_url VARCHAR2(2048),
    title VARCHAR2(255)
);
