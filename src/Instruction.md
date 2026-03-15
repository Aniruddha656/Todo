# Java Todo List Application (Phase 1)

## Goal of this Project

Build a **Todo List Manager** using Java.

This program will run in the **terminal / console**.

The purpose of this project is to practice:

- Java Classes and Objects
- Object Oriented Programming (OOP)
- ListArray
- Enum
- Exception Handling
- Menu driven programs
- Git workflow
- Basic program design

In this phase, tasks will only exist while the program is running.  
If the program stops, the tasks will disappear.



---

# Use Git From The Start

Initialize Git when you start the project.

```
git init
git add .
git commit -m "initial commit"
```

---

# Use a Separate Branch

Do not work directly on the `main` branch.

Create a development branch.

```
git checkout -b todo-phase1
```

Commit changes regularly.

Example:

```
git commit -m "created Task class"
git commit -m "added enums"
git commit -m "implemented add task feature"
git commit -m "implemented view tasks"
```

---

# Application Menu

The application should show a menu like this.

```
1. Add Task
2. View Tasks
3. Mark Task As Completed
4. Delete Task
5. Exit
```

---

# Task Fields

Each task should contain:

```
id
title
description
priority
status
createdTime
```

Example:

```
ID: 1
Title: Study Java
Description: Learn OOP
Priority: HIGH
Status: PENDING
CreatedTime: 2026-03-06T19:10
```

---

# Task ID

Task ID must be **auto generated**.

User should never enter it manually.

---

# Use Enum for Priority and Status

Do not store these values as Strings.

Use **Enum**.

Create two enums.

Priority:

```
LOW
MEDIUM
HIGH
```

Status:

```
PENDING
COMPLETED
```

Example idea:

```
Priority priority;
Status status;
```

Research:

```
enum
```

---

# Features to Implement

## 1 Add Task

User enters:

- Title
- Description
- Priority

Program automatically sets:

- ID
- Status = PENDING
- CreatedTime

Research:

```
LocalDateTime
```

Package:

```
java.time
```

---

# 2 View Tasks

When the user selects **View Tasks**, show another menu.

Example:

```
1. View Tasks Sorted By Created Time (Latest First)
2. View Tasks (Pending First, Completed Last)
3. Back
```

---

## Option 1  
View tasks sorted by **createdTime descending**.

Newest tasks should appear first.

Research:

```
Collections.sort()
Comparator
```

---

## Option 2  
View tasks with **Pending tasks first** and **Completed tasks at the bottom**.

Example output:

```
------ TASK LIST ------

ID: 3
Title: Study Java
Priority: HIGH
Status: PENDING

ID: 1
Title: Gym
Priority: MEDIUM
Status: PENDING

ID: 2
Title: Buy groceries
Priority: LOW
Status: COMPLETED
```

---

# 3 Mark Task As Completed

User enters task ID.

Status should change:

```
PENDING → COMPLETED
```

If task does not exist:

```
Task not found
```

---

# 4 Delete Task

User enters task ID.

Task should be removed from list.

If task does not exist:

```
Task not found
```

---

# How Tasks Should Be Stored

Use:

```
ListArray<Task>
```

Research:

```
add()
remove()
get()
size()
```

Also research loops:

```
for loop
enhanced for loop
```

---

# Classes You Must Create

```
Task
TaskManager
Main
Priority (Enum)
Status (Enum)
```

---

# Task Class

Represents one task.

Fields:

```
id
title
description
priority
status
createdTime
```

Include:

- Constructor
- Getters
- Setters

Research:

```
encapsulation
constructor
getter
setter
```

---

# TaskManager Class

Responsible for managing tasks.

Contains:

```
ListArray<Task>
```

Example methods:

```
addTask()
getAllTasks()
getTasksSortedByTime()
getTasksPendingFirst()
completeTask()
deleteTask()
```

---

# Main Class

Handles:

- Menu
- User input
- Calling TaskManager methods

Research:

```
Scanner
while loop
switch
```

---

# Exception Handling

Program should not crash if input is wrong.

Examples:

- User enters text instead of number
- Invalid menu option

Research:

```
try
catch
InputMismatchException
```

---

# Project Rules

## Rule 1

Do not store tasks in `Main`.

Tasks must be stored inside `TaskManager`.

Structure:

```
Main → menu and input
TaskManager → business logic
Task → data object
```

---

## Rule 2

All fields inside `Task` must be **private**.

Access them using getters and setters.

Wrong:

```
task.title = "New title"
```

Correct:

```
task.setTitle("New title")
```

---

# OOP Concepts Used

Encapsulation  
Objects  
Abstraction  
Composition

Example composition:

```
ListArray<Task>
```

---

# Project Structure

```
todo-app
│
├── Main.java
├── Task.java
├── TaskManager.java
├── Priority.java
├── Status.java
│
└── README.md
```

---

# Sample Program Run

```
===== TODO LIST APPLICATION =====

1. Add Task
2. View Tasks
3. Mark Task As Completed
4. Delete Task
5. Exit
```

---

Add Task:

```
Enter task title: Study Java
Enter task description: Learn OOP
Enter task priority (LOW/MEDIUM/HIGH): HIGH

Task added successfully
Task ID: 1
```

---

View Tasks Menu:

```
1. View Tasks Sorted By Created Time
2. View Tasks (Pending First)
3. Back
```

---

Example Output (Pending First):

```
------ TASK LIST ------

ID: 1
Title: Study Java
Priority: HIGH
Status: PENDING

ID: 2
Title: Gym
Priority: MEDIUM
Status: COMPLETED
```

---

Mark Complete:

```
Enter task ID: 1

Task updated successfully
```

---

Delete Task:

```
Enter task ID: 2

Task deleted successfully
```

---

Invalid Task Example:

```
Enter task ID: 10

Task not found
```

---

Exit:

```
Exiting application...
Goodbye
```