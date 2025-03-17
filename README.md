# 🚀 AutomationBatchATB10x  

Welcome to **AutomationBatchATB10x**, a **Java-based API automation framework** using **Rest Assured, TestNG, Allure, Extent Reports, and more**. This project is designed for efficient API testing with logging, reporting, and CI/CD integration.  

---

## 📌 Tech Stack & Dependencies  

| **Feature**            | **Dependency**                      |
|------------------------|------------------------------------|
| **API Testing**       | Rest Assured                      |
| **Logging**           | Log4j                              |
| **HTML Reporting**    | Allure            |
| **Assertions**        | Rest Assured, AssertJ, TestNG      |
| **Test Case Management** | TestNG                         |
| **JSON Schema Validation** | Rest Assured                |
| **Version Control**   | Git                                |
| **CI/CD**            | Jenkins                            |
| **Payload Management** | Jackson API, Gson (POJO)         |
| **Code Repository**   | GitHub.com                         |
| **Database**         | MySQL Connector (JDBC)            |

---

## 🛠 Setup & Installation  

### ✅ Prerequisites  
Make sure you have the following installed:  

🔹 **Java 8+** → [Download Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)  
🔹 **Maven** → [Install Maven](https://maven.apache.org/install.html)  
🔹 **Git** → [Download Git](https://git-scm.com/downloads)  
🔹 **Jenkins** → [Setup Jenkins](https://www.jenkins.io/download/)  
🔹 **MySQL Server** → [Install MySQL](https://dev.mysql.com/downloads/)  

---

### 📥 Installation  

1️⃣ **Clone the repository**  
```bash
git clone https://github.com/Shubhamsep2317/AutomationBatchATB10x.git
```

2️⃣ **Go to the project folder**  
```bash
cd AutomationBatchATB10x
```

3️⃣ **Install dependencies**  
```bash
mvn clean install
```

---

## 🚀 Running Tests  

### 🔹 Using Maven  
Run all tests:  
```bash
mvn test
```

### 🔹 Run with Jenkins  
1. Open **Jenkins** and create a new **Freestyle** or **Pipeline** job.  
2. Configure it to pull the latest code from GitHub.  
3. Add a build step to run:  
   ```bash
   mvn clean test
   ```

### 🔹 Generate Reports  

📌 **Extent Reports**  
- Reports are generated in:  
  ```plaintext
  target/extent-reports/index.html
  ```

📌 **Allure Reports**  
- To generate and view the Allure report:  
  ```bash
  mvn allure:serve
  ```

---

## 📂 Project Structure  

```
AutomationBatchATB10x
│── src/main/java        # Main application code
│── src/test/java        # Test cases
│── src/test/resources   # Test data & JSON schemas
│── pom.xml              # Maven dependencies
│── log4j.properties     # Log4j configuration
│── Jenkinsfile          # Jenkins pipeline (if used)
│── README.md            # Project documentation
```

---

## 📜 Database Configuration (MySQL)  

To connect your tests to a **MySQL database**, configure the `db.properties` file:  

```properties
db.url=jdbc:mysql://localhost:3306/your_database
db.user=root
db.password=your_password
```

Then, use JDBC in your test cases:  
```java
Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM users");
```

---

## 💡 Contributing  

Want to improve this project? Follow these simple steps:  

1. **Fork the repository**  
2. **Create a new branch**  
   ```bash
   git checkout -b my-feature
   ```
3. **Make changes & commit**  
   ```bash
   git commit -m "Added a cool feature"
   ```
4. **Push your branch**  
   ```bash
   git push origin my-feature
   ```
5. **Open a pull request** 🎉  

---

## 📜 License  

This project is licensed under the **MIT License**.  

---

🚀 **That’s it! Now you're ready to automate like a pro!** 🔥  
