# SEG3502 — Lab 8 — Serveur GraphQL

Application Spring Boot/Kotlin de départ pour le laboratoire 8.

Le projet contient déjà :

- l'entité `Employee`;
- `EmployeesRepository`;
- `CreateEmployeeInput`;
- la configuration MongoDB;
- la configuration Web/CORS/Security.

L'API GraphQL Employee est définie dans :

```text
src/main/resources/graphql/employee.graphqls
src/main/kotlin/seg3x02/employeeGql/resolvers/EmployeesResolver.kt
```

Démarrage :

```bash
./gradlew bootRun
```

Sous Windows :

```text
gradlew.bat bootRun
```

GraphiQL est disponible à `http://localhost:9000/graphiql?path=/graphql`.
La page utilise des ressources GraphiQL versionnées servies par un CDN; une connexion Internet
est nécessaire pour afficher l'éditeur.
