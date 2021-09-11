Create Table member_session_info
(
    id           bigint       NOT NULL
        constraint pk_member_session_info_id primary key,
    member_id    bigint
        constraint fk_member_id references member,
    access_token varchar(255) NOT NULL,
    logout_date  date,
    created_date date         NOT NULL
);

CREATE SEQUENCE seq_member_session_info