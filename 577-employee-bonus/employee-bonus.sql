# Write your MySQL query statement below
SELECT e.name, b.bonus from Employee e LEFT JOIN Bonus b ON e.empId=b.empId Where bonus<1000 OR bonus is null;