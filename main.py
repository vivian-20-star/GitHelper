def understanding_git():
    print("\n=== Understanding Git ===")
    print("Git is a distributed version control system that helps developers track changes in source code during software development.")
    print("It allows multiple developers to work on the same project simultaneously without overwriting each other's changes.\n")
    input("Press Enter to return to the main menu...")

def setting_up():
    print("\n=== Setting Up ===")
    print("Git tracks changes to files over time.")
    print("This allows you to go back, compare versions and collaborate safely.\n")
    print("Press Enter to return to the main menu...\n")

def creating_your_first_project():
    print("\n=== Creating Your First Project ===")
    print("Common Git commands include:")
    print("1. git init - Initialize a new Git repository")
    print("2. git clone - Clone an existing repository")
    print("3. git add - Stage changes for commit")
    print("4. git commit - Commit staged changes")
    print("5. git push - Push changes to a remote repository")
    print("6. git pull - Fetch and merge changes from a remote repository\n")
    input("Press Enter to return to the main menu...")

def common_git_errors_and_troubleshooting():
    print("\n=== Common Git Errors and Troubleshooting ===")
    print("Learn how to fix common Git mistakes.\n")
    print("Press Enter to return to the main menu...")

def extras_and_additional_tools():
    print("\n=== Extras and Additional Tools ===")
    print("Learn about additional Git tools and features.")
    print("Press Enter to return to the main menu...")

while True:
    print("Welcome to Git Tutorial CLI!")
    print("Please choose an option:")
    print("1. Understanding Git")
    print("2. Setting Up")
    print("3. Creating Your First Project")
    print("4. Common Git Errors and Troubleshooting")
    print("5. Extras and Additional Tools")
    print("6. Exit")

    choice = input("Enter your choice (1-6): ")

    if choice == '1':
        understanding_git()
    elif choice == '2': 
        setting_up()
    elif choice == '3':
        creating_your_first_project()
    elif choice == '4':
        common_git_errors_and_troubleshooting()
    elif choice == '5':
        extras_and_additional_tools()
    elif choice == '6':
        print("Exiting the Git Tutorial CLI. Goodbye!")
        break # exits the loop and program
    else:
        print("Invalid choice. Please try again.")