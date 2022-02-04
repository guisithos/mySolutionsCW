SELECT
  CASE WHEN Mod(number,2) = 0 THEN 'Even'
       ELSE 'Odd' END as is_even

FROM numbers
