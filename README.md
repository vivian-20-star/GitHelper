# Git Tutorial CLI
A beginner-friendly Python CLI tool that explains how to navigate Git in plain language.

## Table of Contents
1. [Understanding Git](#understanding-git)
2. [Setting Up](#setting-up)
3. [Getting Started with Git](#getting-started-with-git)
4. [Branching and Merging](#branching-and-merging)
5. [Common Git Errors and Troubleshooting](#common-git-errors-and-troubleshooting)
6. [Practice Exercises](#practice-exercises)

---

## Understanding Git

**What is Git?**

Git is a tool that tracks changes in the files you create, and helps people collaborate on projects.

The program allows developers to manage and organize changes so that nothing is lost. Each developer begins by creating a copy of the <abbr title="A folder where Git stores a project's files and complete history.">repository</abbr> and works on their own version, which can later be merged with the main project.

With Git, you can:
- Go back to previous versions of your project
- Track who made changes
- Collaborate safely with others without overwriting their work

**Whats the different between Git and GitHub?**

Its common to confuse Git and GitHubt, but they are different tools that can work together. 

Git is the system that tracks changes in your project on your own computer. You can use it completely offline.

[GitHub](https://github.com/), on the other hand, is a remote hosting service that stories your Git repositories online. It allows you to share your work with other GitHub users online, and back up your project.

The two work alongside each other. Think of it this way: Fit is the engine tracking your project, and GitHub is the cloud garage where your project lives online.

Uploading is **not necessary**, Git alone is enough for learning, experimenting and mnaging your own projects. Keeping your project on Git will prevent public sharing of your code, collaboration from other developers and online backup.

**Why use Git?**

Git can be used to keep a complete history of a project. It also makes it possible to expirement safely with new features or new code without breaking the main project.

By allowing multiple people to collaborate on the same files without overwriting original code, it allows you to revert changes if something goes wrong. Think of Git as a **memory bank** for your project. Every change is stored, nothing is ever lost.

## Setting Up

Before you can start using Git, it's important to set up your environment correctly. This includes installing Git itself, optionally using a code editor, and understanding the types of files and programming languages Git can manage.

**1. Installing Git**

Git is the **core tool** you need to track your project's history and collaborate with others. The program is available for [Windows](https://gitforwindows.org/), [Mac](https://sourceforge.net/projects/git-osx-installer/files/git-2.23.0-intel-universal-mavericks.dmg/download?use_mirror=autoselect), and Linux (via package management tool). 

Visit the Git install wesbite [here](https://github.com/git-guides/install-git#install-git-on-linux) to learn more if none of these options apply to you, or a different method is preferred. 

**2. Choosing a Code Editor (Recommended for Beginners)**

Git can be used entirely from the command line, after downloading the necessary package, but many developers use a code editor to make editing files easier. 

- Here are popular options: 
    -   [Visual Studio Code](https://code.visualstudio.com/download) - Free, easy to use for beginners and supports many programming languages. Highlights different parts of your code, catches mistakes and can show Git information drectly.
    - [Sublime Text](https://www.sublimetext.com/download) - Fast and simple, but doesn't have as many built in features as VS code. Easy to learn and won't slow your computer down.

**3. Understanding File types and Programming Languages**

Git can track almost any type of file, but it is optimized for text-based files. To understand common abbreviations in code, refer to the following lists.

- Programming Code
    - Python (.py)
    - JavaScript (.js)
    - Java (.java)
    - C++ (.cpp)
    - Ruby (.rb)

- Markup and Configuration files
    - HTML (.html)
    - CSS (.css)
    - Markdown (.md)
    - JSON (.json)
    - YAML (.yml)

- Documents
    - Text files (.txt)
    - Documentation files (.md)

**4. Preparing Environment for Projects**

Once Git is installed and your optional code editor is ready, you are set to begin you first project! Typically you will use the following steps:

1. Creating a repository, which will store your files and their history

2. Make changes in your working directory, where you edit your project files.

3. Stage and commit changes to create snapshots of your project.

These exact steps can be found in the next chapter on Git commnds and project set up. 

## Getting Started with Git

This chapter will walk you through the key steps for initializing a project, saving changes, understanding branches and connecting to a remote repository.

**1. Creating Your First Repository**

Recall that a repository where Git stores all your project files and history. To start a new project, you must create a local repository. This is telling Git "*_Begin tracking changes in this folder and its files_*."

There are two ways to do this: 

- 
    