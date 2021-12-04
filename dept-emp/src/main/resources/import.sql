insert into department values(10, 'ACCOUNTING', 'NEW YORK');
insert into department values(20, 'RESEARCH', 'DALLAS');
insert into department values(30, 'SALES', 'CHICAGO');
insert into department values(40, 'OPERATIONS', 'BOSTON');

insert into job (id, job_title, job_description) values (1, 'President', 'He is the president!');
insert into job (id, job_title, job_description) values (2, 'Manager', 'Has the responsibility for some employees');
insert into job (id, job_title, job_description) values (3, 'Analyst', 'Analyzing some data');
insert into job (id, job_title, job_description) values (4, 'Clerk', 'Performs administrative tasks');
insert into job (id, job_title, job_description) values (5, 'Salesman', 'Sells the products to the customers');

insert into employee (id, name, job_id, manager_id, hire_date, sal, commission, department_id) values (7839, 'KING', 1, null, to_date('17-11-1981','dd-mm-yyyy'), 5000, null, 10);
insert into employee (id, name, job_id, manager_id, hire_date, sal, commission, department_id) values (7698, 'BLAKE', 2, 7839,  to_date('1-5-1981','dd-mm-yyyy'), 2850, null, 30);
insert into employee (id, name, job_id, manager_id, hire_date, sal, commission, department_id) values (7782, 'CLARK', 2, 7839, to_date('9-6-1981','dd-mm-yyyy'), 2450, null, 10);
insert into employee (id, name, job_id, manager_id, hire_date, sal, commission, department_id) values (7566, 'JONES', 2, 7839, to_date('2-4-1981','dd-mm-yyyy'), 2975, null, 20);
insert into employee (id, name, job_id, manager_id, hire_date, sal, commission, department_id) values (7788, 'SCOTT', 3, 7566, to_date('13-7-87','dd-mm-rr') - 85, 3000, null, 20);
insert into employee (id, name, job_id, manager_id, hire_date, sal, commission, department_id) values (7902, 'FORD', 3, 7566, to_date('3-12-1981','dd-mm-yyyy'), 3000, null, 20);
insert into employee (id, name, job_id, manager_id, hire_date, sal, commission, department_id) values (7369, 'SMITH', 4, 7902, to_date('17-12-1980','dd-mm-yyyy'), 800, null, 20);
insert into employee (id, name, job_id, manager_id, hire_date, sal, commission, department_id) values (7499, 'ALLEN', 5, 7698, to_date('20-2-1981','dd-mm-yyyy'), 1600, 300, 30);
insert into employee (id, name, job_id, manager_id, hire_date, sal, commission, department_id) values (7521, 'WARD', 5, 7698, to_date('22-2-1981','dd-mm-yyyy'), 1250, 500, 30);
insert into employee (id, name, job_id, manager_id, hire_date, sal, commission, department_id) values (7654, 'MARTIN', 5, 7698, to_date('28-9-1981','dd-mm-yyyy'), 1250, 1400, 30);
insert into employee (id, name, job_id, manager_id, hire_date, sal, commission, department_id) values (7844, 'TURNER', 5, 7698, to_date('8-9-1981','dd-mm-yyyy'), 1500, 0, 30);
insert into employee (id, name, job_id, manager_id, hire_date, sal, commission, department_id) values (7876, 'ADAMS', 4, 7788, to_date('13-7-87', 'dd-mm-rr') - 51, 1100, null, 20);
insert into employee (id, name, job_id, manager_id, hire_date, sal, commission, department_id) values (7900, 'JAMES', 4, 7698, to_date('3-12-1981','dd-mm-yyyy'), 950, null, 30);
insert into employee (id, name, job_id, manager_id, hire_date, sal, commission, department_id) values (7934, 'MILLER', 4, 7782, to_date('23-1-1982','dd-mm-yyyy'), 1300, null, 10);