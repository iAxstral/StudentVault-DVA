# StudentVault-DVA

# 🛡️ StudentVault-DVA (Damn Vulnerable Application)

## ⚠️ Legal Disclaimer
**This application is strictly for educational and research purposes.** It was intentionally built with critical security flaws to demonstrate common web vulnerabilities and how to mitigate them. Do not deploy this application on a public-facing server, and never use the exploitation techniques shown here against systems you do not have explicit permission to test.

## 📖 About The Project
StudentVault is a mock password manager API designed for university study groups (like *Grupo OlayaLeal*) to store and share academic credentials, lab access keys, and server passwords. 

However, the backend of this application is intentionally riddled with security flaws based on the **OWASP Top 10**. The primary goal of this repository is to showcase the attacker's mindset when exploiting modern APIs, and the engineer's mindset when refactoring and securing the codebase.

### 🛠️ Built With
* **Language:** Java 25
* **Framework:** Spring Boot 3.3.9
* **Database:** MongoDB
* **Build Tool:** Maven

---

## Vulnerabilities Explored
This project implements and documents the following security flaws:

| Vulnerability Category | Specific Implementation in this App |
| :--- | :--- |
| **A01:2021 - Broken Access Control** | **Insecure Direct Object Reference (IDOR):** Users can access other students' private vaults by manipulating the user ID in the API endpoint. |
| **A02:2021 - Cryptographic Failures** | **Plaintext Storage:** Master passwords and sensitive vault data are stored in the database without hashing or encryption. |
| **A03:2021 - Injection** | **NoSQL Injection:** Authentication bypass via manipulated JSON payloads targeting the MongoDB driver. |

---

## 🌿 Branching Strategy
This repository is divided into specific branches to separate the insecure code from the secured code. To explore the project, switch between the following branches:

* `main`: Project foundation, architecture, and core documentation.
* `vulnerable-version`: Contains the intentionally exploitable Spring Boot application (The Attacker's Playground).
* `secure-patch`: *(Coming Soon)* Contains the refactored, hardened code with proper security validations, parameterized queries, and cryptography (The Defender's Blueprint).

---

## Getting Started

### Prerequisites
To run this application locally, you will need:
* Java Development Kit (JDK) 17 or higher
* MongoDB running locally (Default port `27017`)
* Git

### Installation & Execution
1. Clone the repository:
   ```bash
   git clone [https://github.com/iAxstral/StudentVault-DVA.git](https://github.com/iAxstral/StudentVault-DVA.git)