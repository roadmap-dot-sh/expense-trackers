# Expense Tracker

Build a simple expense tracker to manage your finances.

Project URL: <a href="https://roadmap.sh/projects/expense-tracker">https://roadmap.sh/projects/expense-tracker</a>

## Requirements

Build a simple expense tracker application to manage your finances. The application should allow users to add, delete,
and view their expenses. The application should also provide a summary of the expenses.

Application should run from the command line and should have the following features:

- Users can add an expense with a description and amount.
- Users can update an expense.
- Users can delete an expense.
- Users can view all expenses.
- Users can view a summary of all expenses.
- Users can view a summary of expenses for a specific month (of current year).

Here are some additional features that you can add to the application:

- Add expense categories and allow users to filter expenses by category.
- Allow users to set a budget for each month and show a warning when the user exceeds the budget.
- Allow users to export expenses to a CSV file.

The list of commands and their expected output is shown below:

```bash
$ expense-tracker add --description "Lunch" --amount 20
# Expense added successfully (ID: 1)

$ expense-tracker add --description "Dinner" --amount 10
# Expense added successfully (ID: 2)

$ expense-tracker list
# ID  Date       Description  Amount
# 1   2024-08-06  Lunch        $20
# 2   2024-08-06  Dinner       $10

$ expense-tracker summary
# Total expenses: $30

$ expense-tracker delete --id 2
# Expense deleted successfully

$ expense-tracker summary
# Total expenses: $20

$ expense-tracker summary --month 8
# Total expenses for August: $20
```

## Run application

Open terminal and type these following commands to run application

##### 1. Clone repository and change to project directory

```shell
git clone https://github.com/roadmap-dot-sh/expense-trackers.git
cd expense-trackers
```

##### 2. Run application

- Build `.jar` file:

```shell
mvn clean package
```

- Run and test:

    - Add Expense: Pass 2 parameters `description` and `amount`
      ```shell
      java -jar target/expense-trackers-1.0-SNAPSHOT.jar add --description <description> --amount <amount>
      ```

    - List All Expense:
      ```shell
      java -jar target/expense-trackers-1.0-SNAPSHOT.jar list
      ```

    - Summary Total:
      ```shell
      java -jar target/expense-trackers-1.0-SNAPSHOT.jar summary
      ```

    - Update Expense: Pass 2 parameters `id` and `amount`
      ```shell
      java -jar target/expense-trackers-1.0-SNAPSHOT.jar update --id <id> --amount <amount>
      ```

    - Delete Expense: Pass parameter `id`
      ```shell
      java -jar target/expense-trackers-1.0-SNAPSHOT.jar delete --id <id>
      ```

    - Summary by month: Pass parameter `month`
      ```shell
      java -jar target/expense-trackers-1.0-SNAPSHOT.jar summary --month <month>
      ```
