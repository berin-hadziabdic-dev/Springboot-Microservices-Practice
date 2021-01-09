This is a sample self study project on how to launch and configure Springbot
microservices. The business domain will be banking and there will be three
bounded contexts, each consisting of one to two microservices. 

Context-1 
Accounts

Context-2
Loans 

Context-3 
CustomerService. 

Each of the contexts will connect to a remote AWS hosted RDS database, and may
optionally be hosted on EC2, though they will be tested locally. Spring Cloud
gateway, Zuul, and Consul will be used to manage these applications.
