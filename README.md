## 🎲 DICE ROLL 🎲 : 

**Une API simple pour lancer des dés et enregistrer les résultats. Ce projet est développé avec Spring Boot, Lombok et utilise JPA pour la gestion de la persistance des données.**

## ✨ CONTRIBUTEUR ✨: AAROUR Mouna

## 🚀 FONCTIONNALITEES 🚀:

🎲 **Lancer un ou plusieurs dés :** Génère des valeurs aléatoires entre 1 et 6.
📝 **Enregistrer les résultats :** Les résultats des lancers sont sauvegardés dans une base de données.
📊 **Visualiser les logs :** Accéder aux données des lancers de dés enregistrés.


## ⚙️ CONFIGURATION ⚙️: 

**Port :** 

```
L'application tourne par défaut sur le port 8081. Vous pouvez changer le port en modifiant application.properties.
```

## ⚡️ TESTER ⚡️: 

### Lancer un seul dé : 

```
http://localhost:8080/dice/rollDice
```

### Lancer plusieurs dé (count à définir): 

```
http://localhost:8080/dice/rollDices/5
```

## 🏗️ INSTALLATION ET DEMARRAGE 🏗️:

**Clonez le projet :**

```
git clone https://github.com/votre-utilisateur/dice-roll-api.git
cd dice-roll-api
```

**Assurez-vous d'avoir Java 17+ et Maven installés.**

***Lancez l'application :***

```
mvn spring-boot:run
```

***Accédez à l'application :***
```
http://localhost:8081
```


## 🛠️ TECHNOLOGIES UTILISEES 🛠️: 

- **Framework principal** : Spring Boot
- **Base de données** : H2 
- **Documentation API** : Swagger (bonus)
- **Simplification de code** : Lombok (bonus)
