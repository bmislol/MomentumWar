# ⚔️ MomentumWar 

**A Full-Stack Gamified Behavioral Engine & Social Streak Platform**

MomentumWar isn't just a habit tracker, it's a social accountability system designed to handle the complexity of non linear consistency. Built with a "logic first" approach, the application solves the limitations of standard "daily only" trackers.

## 🧠 The Logic Engine: Flexible Scheduling
Most trackers fail when a user’s goal isn't daily (e.g., "Hit the gym 3x per week"). MomentumWar utilizes a custom scheduling engine to:
* **Dynamic Window Calculation:** Track requirements across rolling weekly/monthly windows.
* **State Management:** Accurately determine "Active," "At Risk," or "Broken" states for non linear habits.
* **Grace Period Integration:** Programmatic handling of rest days without breaking "Momentum."

## 🏗️ System Architecture
* **Backend:** Java 21 & Spring Boot 3.4. Multi-layered architecture (Controller -> Service -> Repository).
* **Database:** PostgreSQL with a relational schema optimized for social graphs and activity logging.
* **Frontend:** React 19 (Vite) utilizing Tailwind CSS for a responsive, high-performance UI.
* **Security:** Stateless authentication using JWT via Spring Security.

## 🚀 Key Features
* **Streak Wars:** Real-time social competition where users can challenge friends to "Consistency Duels."
* **Aura System:** A gamified progression system where points earned from streaks unlock profile customizations.
* **Activity Logs:** Media supported proof of work (Public/Private options).

## 🛠️ Getting Started
### Prerequisites
* Java 21+
* Node.js 18+
* PostgreSQL 15+

### Installation
1. Clone the repo: `git clone https://github.com/bmislol/MomentumWar.git`
2. **Server:** Navigate to `/server`, configure `application.properties`, and run `./mvnw spring-boot:run`
3. **Client:** Navigate to `/client`, run `npm install`, then `npm run dev`