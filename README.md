## Dependency Injection and Components
[DevSuperior](https://devsuperior.com.br/)\
<br>
You must create a system to calculate the total value of an order, considering a discount percentage and shipping. Calculating the total value of the order consists of applying the discount to the basic value of the order, and adding the shipping cost. The rule for calculating shipping is as follows:\
<br>
### Shipping fee
![img1](https://github.com/luiz-barros-92/assets/blob/main/challenges/c1/c1-1.png)
<br>
### Order
![img2](https://github.com/luiz-barros-92/assets/blob/main/challenges/c1/c1-2.png)
<br>
<br>
The logic for calculating the total order value must be implemented by components (services), each with its own responsibility, as per the project below:
### Services
![img3](https://github.com/luiz-barros-92/assets/blob/main/challenges/c1/c1-3.png)
<br>
Your solution must be implemented in Java with Spring Boot. The output must be shown in the application's terminal log. Each service must be implemented as a component registered with @Service.
