## 🎲 Dice Roll 🎲 : 

**Une API simple pour lancer des dés et enregistrer les résultats. Ce projet est développé avec Spring Boot, Lombok et utilise JPA pour la gestion de la persistance des données.**

## ✨ Contributeur ✨: AAROUR Mouna

## 🚀 Fonctionnalités 🚀 :

🎲 **Lancer un ou plusieurs dés :** Génère des valeurs aléatoires entre 1 et 6.
📝 **Enregistrer les résultats :** Les résultats des lancers sont sauvegardés dans une base de données.
📊 **Visualiser les logs :** Accéder aux données des lancers de dés enregistrés.


## ⚙️ Configuration

**Port :** 

```
L'application tourne par défaut sur le port 8081. Vous pouvez changer le port en modifiant application.properties.
```

## ⚡️ Endpoints disponibles ⚡️ : 

### Lancer un seul dé : 

```
/dice/rollDice	Lance un seul dé et retourne le résultat.
```

### Lancer plusieurs dé (count à définir): 

```
/dice/rollDices/{count}	Lance {count} dés et retourne les résultats.
```

## 🏗️ Installation et démarrage

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


## 🛠️ Technologies utilisées 🛠️ : 

- **Framework principal** : Spring Boot
- **Base de données** : H2 
- **Documentation API** : Swagger (bonus)
- **Simplification de code** : Lombok (bonus)
