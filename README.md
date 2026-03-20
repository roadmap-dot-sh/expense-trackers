# Expense Tracker

project url: <a href="https://roadmap.sh/projects/expense-tracker">https://roadmap.sh/projects/expense-tracker</a>

## Run application

1. Clone repository

```
git clone https://github.com/roadmap-dot-sh/expense-trackers.git
cd expense-trackers
```

2. Start

- Build .jar file:

```
mvn clean package
```

- Test:

    - Add Expense: Pass 2 parameters `description` and `amount`
      ```
      java -jar target/expense-trackers-1.0-SNAPSHOT.jar add --description <description> --amount <amount>
      ```

    - List All Expense:
      ```
      java -jar target/expense-trackers-1.0-SNAPSHOT.jar list
      ```

    - Summary Total:
      ```
      java -jar target/expense-trackers-1.0-SNAPSHOT.jar summary
      ```

    - Update Expense: Pass 2 parameters `id` and `amount`
      ```
      java -jar target/expense-trackers-1.0-SNAPSHOT.jar update --id <id> --amount <amount>
      ```

    - Delete Expense: Pass parameter `id`
      ```
      java -jar target/expense-trackers-1.0-SNAPSHOT.jar delete --id <id>
      ```

    - Summary by month: Pass parameter `month`
      ```
      java -jar target/expense-trackers-1.0-SNAPSHOT.jar summary --month <month>
      ```
