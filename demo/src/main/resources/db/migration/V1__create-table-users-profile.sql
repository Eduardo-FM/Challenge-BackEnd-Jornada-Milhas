CREATE TABLE tb_users_profile (

    id BIGINT NOT NULL AUTO_INCREMENT,
    user_name VARCHAR(50) NOT NULL,
    comment VARCHAR(300),
    user_picture BLOB,

    PRIMARY KEY(id)

);