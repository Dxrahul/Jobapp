# JobHook - Job Finding Web Application

Welcome to **JobHook**, a modern and responsive job-finding web application designed to connect job seekers with opportunities seamlessly. This project is built using a robust tech stack and incorporates advanced features to ensure a secure, user-friendly, and efficient experience.

---

## 🚀 **Technologies Used**

- **Frontend**: React, Redux, Tailwind CSS, Mantine UI, Tabler Icons  
- **Backend**: Spring Boot  
- **Database**: MongoDB  
- **Authentication**: JSON Web Token (JWT)  
- **Other Tools**: Axios, React Router, Nodemailer (for OTP)

---

## ✨ **Highlighted Features**

1. **Notification System**: A 4-tier notification system to keep users informed about job updates, application status, and more.  
2. **OTP via Email**: Secure user authentication with OTP (One-Time Password) sent via email.  
3. **JWT Authentication**: APIs are secured using JSON Web Tokens (JWT) for enhanced security.  
4. **Role-Based Access Control**: Protected routes ensure users can only access features based on their roles (e.g., job seeker, employer, admin).  
5. **Fully Responsive Design**: The application is optimized for all devices, ensuring a smooth experience on desktops, tablets, and mobile phones.  

---

## 📂 **Project Structure**

```
jobhook/
├── client/               # Frontend (React, Redux, Tailwind)
│   ├── src/
│   │   ├── components/   # Reusable UI components
│   │   ├── pages/        # Application pages
│   │   ├── redux/        # State management
│   │   ├── utils/        # Utility functions
│   │   └── App.js        # Main application component
├── server/               # Backend (Spring Boot)
│   ├── src/
│   │   ├── controllers/  # API controllers
│   │   ├── models/       # Database models
│   │   ├── repositories/ # Data access layer
│   │   ├── services/     # Business logic
│   │   └── config/       # JWT and security configurations
├── README.md             # Project documentation
└── .gitignore            # Files and directories to ignore
```

---

## 🛠️ **Setup and Installation**

### Prerequisites
- Node.js (for frontend)
- Java (for Spring Boot backend)
- MongoDB (for database)

### Steps to Run the Project

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/jobhook.git
   cd jobhook
   ```

2. **Frontend Setup**:
   ```bash
   cd client
   npm install
   npm start
   ```

3. **Backend Setup**:
   ```bash
   cd server
   ./mvnw spring-boot:run
   ```

4. **Database Setup**:
   - Ensure MongoDB is running locally or update the connection string in the backend configuration.

5. **Access the Application**:
   - Open your browser and navigate to `http://localhost:3000`.

---


## 🙏 **Acknowledgments**

- Special thanks to the open-source community for providing the tools and libraries used in this project.  
- Inspired by the need for a seamless job-search experience in today's digital world.

---

 Happy coding! 🚀
