CREATE TABLE member
(
    id           bigint       NOT NULL
        constraint pk_member_id primary key,
    tc_id        varchar(11)  NOT NULL
        constraint unique_tc_id unique,
    email        varchar(50)  NOT NULL,
    username     varchar(20)  NOT NULL
        constraint unique_username unique,
    password     varchar(255) NOT NULL,
    created_date date         NOT NULL
);

CREATE SEQUENCE seq_member