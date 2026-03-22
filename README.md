# Expense Tracker

Build a simple expense tracker to manage your finances.

Project URL: <a href="https://roadmap.sh/projects/expense-tracker">https://roadmap.sh/projects/expense-tracker</a>

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
