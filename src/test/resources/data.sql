/* Insert new users */
INSERT INTO `users` (`id`, `deleted`, `email`, `first_name`, `last_name`, `password`, `phone_number`, `type`, `username`) VALUES (1, 0, 'isco@gmail.com', 'Isco', 'Alarcon', '$10$wDeKOR2hyQaoEQSw827CHubLgjV5F2fOeKm.tIu1QDszHHUdr.Rjq', '065066665', 'oglašavač', 'isco');
INSERT INTO `users` (`id`, `deleted`, `email`, `first_name`, `last_name`, `password`, `phone_number`, `type`, `username`) VALUES (2, 0, 'sr4@gmail.com', 'Sergio', 'Ramos', '$10$wDeKOR2hyQaoEQSw827CHubLgjV5F2fOeKm.tIu1QDszHHUdr.Rjq', '065066665', 'verifikator', 'sr4');
INSERT INTO `users` (`id`, `deleted`, `email`, `first_name`, `last_name`, `password`, `phone_number`, `type`, `username`) VALUES (3, 0, 'david@gmail.com', 'David', 'Beckham', '$10$wDeKOR2hyQaoEQSw827CHubLgjV5F2fOeKm.tIu1QDszHHUdr.Rjq', '065066665', 'oglašavač', 'david');
INSERT INTO `users` (`id`, `deleted`, `email`, `first_name`, `last_name`, `password`, `phone_number`, `type`, `username`) VALUES (4, 0, 'bjelica@gmail.com', 'Nemanja', 'Bjelica', '$10$wDeKOR2hyQaoEQSw827CHubLgjV5F2fOeKm.tIu1QDszHHUdr.Rjq', '065066765', 'verifikator', 'bjelica');
INSERT INTO `users` (`id`, `deleted`, `email`, `first_name`, `last_name`, `password`, `phone_number`, `type`, `username`) VALUES (5, 0, 'lillard@gmail.com', 'Damian', 'Lillard', '$10$wDeKOR2hyQaoEQSw827CHubLgjV5F2fOeKm.tIu1QDszHHUdr.Rjq', '065066635', 'oglašavač', 'damian');
INSERT INTO `users` (`id`, `deleted`, `email`, `first_name`, `last_name`, `password`, `phone_number`, `type`, `username`) VALUES (6, 0, 'lebron@gmail.com', 'LeBron', 'James', '$10$wDeKOR2hyQaoEQSw827CHubLgjV5F2fOeKm.tIu1QDszHHUdr.Rjq', '065061665', 'oglašavač', 'james');
INSERT INTO `users` (`id`, `deleted`, `email`, `first_name`, `last_name`, `password`, `phone_number`, `type`, `username`) VALUES (7, 0, 'wiggins@gmail.com', 'Andrew', 'Wiggins', '$10$wDeKOR2hyQaoEQSw827CHubLgjV5F2fOeKm.tIu1QDszHHUdr.Rjq', '065161665', 'verifikator', 'wiggins');

/* Insert new real estates */
INSERT INTO `real_estates` (`id`, `area`, `deleted`, `heating_type`, `name`, `type`) VALUES ('1', '120', 0, 'coal', 'RealEstate1', 'flat');
INSERT INTO `real_estates` (`id`, `area`, `deleted`, `heating_type`, `name`, `type`) VALUES ('2', '220', 0, 'central_heating', 'RealEstate2', 'house');
INSERT INTO `real_estates` (`id`, `area`, `deleted`, `heating_type`, `name`, `type`) VALUES ('3', '360', 0, 'central_heating', 'RealEstate3', 'flat');

/* Insert new announcements */
INSERT INTO `announcements` (`id`, `date_announced`, `date_modified`, `deleted`, `expiration_date`, `price`, `phone_number`, `type`, `verified`, `author_id`, `real_estate_id`) VALUES ('1', '1994-01-01', '1994-01-03', 0, '1994-01-20', '50', '0654887612', 'flat', 'verified', '1', '1');
INSERT INTO `announcements` (`id`, `date_announced`, `date_modified`, `deleted`, `expiration_date`, `price`, `phone_number`, `type`, `verified`, `author_id`, `real_estate_id`) VALUES ('2', '1997-01-01', '1997-01-03', 0, '1997-01-20', '60', '0654887111', 'flat', 'verified', '1', '3');


/* Insert new comments*/
INSERT INTO `comments` (`id`, `content`, `date`, `announcement_id`, `author_id`) VALUES ('1', 'Another one comment', '2016-05-05', '2', '5');
INSERT INTO `comments` (`id`, `content`, `date`, `announcement_id`, `author_id`) VALUES ('2', 'Another one comment', '2016-07-15', '2', '7');
INSERT INTO `comments` (`id`, `content`, `date`, `announcement_id`, `author_id`) VALUES ('3', 'Another one comment', '2016-01-25', '2', '6');


/* Insert new companies*/
INSERT INTO `companies` (`id`, `address`, `name`, `phone_number`) VALUES ('1', 'Trg Dositeja Obradovića', 'company', '5461963');
INSERT INTO `companies` (`id`, `address`, `name`, `phone_number`) VALUES ('2', 'Bulevar oslobođenja', 'company7', '1122335');
INSERT INTO `companies` (`id`, `address`, `name`, `phone_number`) VALUES ('3', 'Bulevar Despota Stefana', 'company8', '5000963');


/* Insert new marks*/
INSERT INTO `marks`  VALUES ('1', '4', '2', '1', '3');
INSERT INTO `marks`  VALUES ('2', '5', '2', '1', '4');
INSERT INTO `marks`  VALUES ('3', '3', '2', '1', '3');


/* Insert new reports*/
INSERT INTO `reports` (`id`,`email`, `content`, `status`, `type`, `announcement_id`, `reporter_id`) VALUES ('1', 'user6@mail.com', 'Inappropriate content', 'active', 'admin', '2', '6');