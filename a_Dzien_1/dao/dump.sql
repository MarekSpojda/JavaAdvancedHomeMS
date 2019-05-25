CREATE TABLE `user_group`
(
    `id`   int(11)                             NOT NULL,
    `name` varchar(255) COLLATE utf8_polish_ci NOT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_polish_ci;

ALTER TABLE `user_group`
    ADD PRIMARY KEY (`id`);

ALTER TABLE `user_group`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

CREATE TABLE exercise
(
    id       int(11) NOT NULL,
    exername varchar(255),
    primary key (id)
);

ALTER TABLE `exercise`
    add column description VARCHAR(50) AFTER exername;

ALTER TABLE exercise
    CHANGE exername title varchar(255);

ALTER TABLE exercise
    MODIFY COLUMN id INT auto_increment;

CREATE TABLE user
(
    id        int(11) NOT NULL auto_increment,
    username  varchar(255),
    usergroup int(11) not null,
    primary key (id),
    FOREIGN KEY (usergroup) REFERENCES user_group (id)
);