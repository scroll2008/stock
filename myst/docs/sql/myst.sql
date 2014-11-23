
--流通市值占比
create or replace view market_value_percentage as
select code, name,
       circulated_market_value market_value,
       100 * circulated_market_value / all_value per,
       all_value
  from qqstock q,
       (select sum(circulated_market_value) all_value from qqstock)
 order by circulated_market_value desc;


--总市值占比
create or replace view total_value_percentage
as 
select code, name,
       total_macket_value total_value,
       100 * total_macket_value / all_value per,
       all_value
  from qqstock q,
       (select sum(total_macket_value) all_value from qqstock)
 order by total_macket_value desc;

--前15名流通市值占比
select sum(per) from market_value_percentage where rownum <=15;

--前15名总市值占比
select sum(per) from total_value_percentage  where rownum <=15;




