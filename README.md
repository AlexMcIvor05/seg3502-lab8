# SEG3502 — Laboratoire 8

Ce dossier contient les deux parties du laboratoire 8 :

- `client/` : application Angular Employee déjà configurée pour communiquer avec GraphQL;
- `server/` : application Spring Boot/Kotlin + MongoDB avec son API GraphQL Employee.

## 1. Démarrer MongoDB

Le serveur utilise MongoDB sur le port `27017`.

Exemple avec Docker :

```bash
docker run -d -p 27017:27017 --name mongodb mongo
```

## 2. Démarrer le serveur GraphQL

Le projet serveur utilise Java 21.

```bash
cd server
./gradlew bootRun
```

Sous Windows :

```text
gradlew.bat bootRun
```

Le serveur démarre sur le port `9000`.

GraphiQL :

```text
http://localhost:9000/graphiql?path=/graphql
```

La page utilise des ressources GraphiQL versionnées servies par un CDN; une connexion Internet
est nécessaire pour afficher l'éditeur.

Point de terminaison GraphQL :

```text
http://localhost:9000/graphql
```

## 3. Démarrer le client Angular

Dans un deuxième terminal :

```bash
cd client
npm install
npm start
```

Puis ouvrez :

```text
http://localhost:4200
```

## Travail demandé

Le serveur expose les opérations GraphQL nécessaires au client Angular, notamment :

- `src/main/resources/graphql/employee.graphqls`
- `src/main/kotlin/seg3x02/employeeGql/resolvers/EmployeesResolver.kt`

Le client Angular est fourni et contient les opérations GraphQL correspondantes.
