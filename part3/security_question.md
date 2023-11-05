# Answer to security question:

Based on the OWASP top 10 2021, these are some security problems that may have my startup.

### **1. Broken Access Control:**
The software engineer employees have access to very confidential data, such as passwords, financial or sales information.
The customer support employees can have access to the customer confidential information and make changes in orders and accounts.

#### *- How to fix this?*
Use an authentication and authorization system like roles in the database to have a control over who has access to what information and limit the employee access to only the information that they need to perform their tasks.

>

### **2. Injection:**
The attackers can inject malicious code in the app web or even in the database to alter confidential information and steal sensitive customer data. Or even they can take the total control over the system.

#### *- How to fix this?*
Use input filters to validate the data that is introduced in the app web or the database. 
These filters can be lenght filters to check that the data is not too long or too short depending of the situation. Type filters that check that the data is the correct type. Allowed values filters, these filters check that the data are among a set of allowed values.
Among many other filters.

>

### **3. Cryptographic Failures:**
Failures in the storage, transmission or display of data can allow that the sensitive information like passwords, addresses, or phone numbers are accidentally exposed.

#### *- How to fix this?*
Encrypting sensitive customer data such as those mentioned above and save the information in a safe place.

_~Jose Fernando Restrepo Sánchez~_