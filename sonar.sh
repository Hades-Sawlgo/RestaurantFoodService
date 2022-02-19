#Runs Local SonarQube Scan
mvn sonar:sonar -D"sonar.projectKey=PizzaFoodService" -D"sonar.host.url=http://localhost:9000"