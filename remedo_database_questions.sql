Solution 1 : select u.user_id, u. address, t. total_invoice_amount, t.invoice_amount_paid, t remedo_commission from users u , transactions  t where u.user_id = t.user_id and u.user_id = ‘u1’ ;
Solution 2 : Select sum(remedo_commission) from transactions where user_id = ‘u1’ ;
Solution 3 : Select user_id from users where user_id not in (select user_id from user_extra_info);
Solution 4 : Select user_id from user_extra_info ;
Solution 5 : Select user_id from transactions where user_id not in (select user_id from user_extra_info);
