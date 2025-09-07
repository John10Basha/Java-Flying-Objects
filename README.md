# COMP249 – Assignment 1  
## ✈️ Flying Objects Hierarchy (Java OOP Project)

### 📌 Project Overview
This project implements a hierarchy of **flying objects** using **Java inheritance, encapsulation, constructors, method overriding, and packages**.  
It was developed for **COMP249 – Object-Oriented Programming II (Fall 2024)**.  

The project is divided into two parts:
- **Part I** – Class hierarchy, constructors, `toString()`, `equals()`, and a UAV price finder.
- **Part II** – Builds on Part I and introduces a deep copy feature for arrays of flying objects.

⚠️ **Note:** The GitHub version corresponds to **Part II**, which includes everything from Part I plus the new Part II changes.

---

### 🚀 Features

#### Part I
- UML diagram representing class hierarchy.  
- Java implementation of the following classes:  
  - `Airplane` ✈️  
  - `Helicopter` 🚁  
  - `Quadcopter`  
  - `Multirotor`  
  - `UAV` (Drone)  
  - `AgriculturalDrone`  
  - `MAV` (Micro Air Vehicle)  
- Each class includes:  
  - Default, parameterized, and copy constructors  
  - Accessors and mutators  
  - Overridden `toString()` and `equals()` methods  

#### Part II
- Introduces a new driver program with an additional static method:
  - `copyFlyingObjects(FlyingObject[] arr)`  
    - Returns a deep copy of the array using copy constructors  
    - Works for any mix of flying objects  
    - **Restrictions:** No `clone()`, no explicit type-checking inside constructors  
- Demonstrates copying with arrays of 15–20 objects (at least one from each class).  
- Displays both original and copied arrays to validate correctness.  

---

## 📂 Project Structure
`ca.concordia.airplane` → `Airplane`  
`ca.concordia.helicopter` → `Helicopter`, `Quadcopter`  
`ca.concordia.multirotor` → `Multirotor`  
`ca.concordia.uav` → `UAV`  
`ca.concordia.drones` → `AgriculturalDrone`, `MAV`  
`ca.concordia.driver` → `Main driver program`  

