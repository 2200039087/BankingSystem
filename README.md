@"
# 🏦 Java Banking Management System

A simple console-based **Banking Management System** built using pure Java and file handling. This project is designed for beginners to understand **Java OOP**, **file I/O**, and how to simulate basic banking operations without a database.

---

## 📌 Features

- ✅ Create new bank accounts  
- 🔐 Secure login with account number and PIN  
- 💵 Deposit and withdraw money  
- 💳 Check account balance  
- 📜 View transaction history (stored as `.txt` files)  
- 🗂️ Data stored locally using file handling (no external DB)

---

## 🗂️ Project Structure

\`\`\`
BankingSystem/
├── src/
│   ├── Account.java           # Account model
│   ├── BankSystem.java        # Main banking logic
│   ├── FileHandler.java       # File I/O helper class
│   ├── Main.java              # Entry point
│   └── Utils.java             # (Reserved for future helper methods)
├── data/
│   ├── accounts.txt           # Stores all account info
│   └── txn_<accountNo>.txt    # Per-user transaction history
└── README.md
\`\`\`

---

## 🚀 Getting Started

### 📋 Prerequisites

- Java 8 or above  
- Command line (Terminal / CMD / PowerShell)

### 🔧 How to Run

1. **Clone the repository**
\`\`\`bash
git clone https://github.com/2200039087/BankingSystem.git
cd BankingSystem
\`\`\`

2. **Ensure \`data/\` folder exists**
\`\`\`bash
mkdir data
\`\`\`

3. **Compile the Java files**
\`\`\`bash
javac src/*.java
\`\`\`

4. **Run the program**
\`\`\`bash
java -cp src Main
\`\`\`

---

## 🧪 Sample Features Demo

\`\`\`
1. Create Account
2. Login
3. Deposit / Withdraw
4. View Balance
5. View Transaction History
\`\`\`

Each user's data is saved in `data/accounts.txt` and transaction logs in `data/txn_<accountNo>.txt`.

---

## 📷 Screenshots:
![image](https://github.com/user-attachments/assets/fdc369b3-7532-42b5-a137-ffa1a7851589)
![image](https://github.com/user-attachments/assets/88772f96-4b29-4677-931c-6954a6bb50df)
![image](https://github.com/user-attachments/assets/ed7fc369-68c6-4dbb-8963-80168f720322)

---

## 🛠 Future Improvements

- [ ] GUI version using Swing or JavaFX  
- [ ] Admin dashboard (view all users, block accounts)  
- [ ] Password encryption (hashing)  
- [ ] Monthly interest calculation  

---

## 🧑‍💻 Author

**Aravinndh Kumaar**  
🔗 GitHub: [@2200039087](https://github.com/2200039087)

---

## 📜 License

This project is licensed under the [MIT License](LICENSE).
"@ > README.md
