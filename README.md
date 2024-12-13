## 🎲 Dice Roll API 🎲 : 

**Une API simple et efficace pour lancer des dés et enregistrer les résultats. Ce projet est développé avec Spring Boot, Lombok et utilise JPA pour la gestion de la persistance des données.**

## 🚀 Fonctionnalités 🚀 :

🎲 **Lancer un ou plusieurs dés :** Génère des valeurs aléatoires entre 1 et 6.
📝 **Enregistrer les résultats :** Les résultats des lancers sont sauvegardés dans une base de données.
📊 **Visualiser les logs :** Accéder aux données des lancers de dés enregistrés.


## ⚙️ Configuration

**Base de données :**

Le projet utilise une base de données H2. 

**Port :** 

L'application tourne par défaut sur le port 8081. Vous pouvez changer le port en modifiant application.properties :

## ⚡️ Endpoints disponibles ⚡️ : 

### Lancer un seul dé : 

**GET	/dice/rollDice**	Lance un seul dé et retourne le résultat.

### Lancer plusieurs dé (count à définir): 

**GET	/dice/rollDices/{count}**	Lance {count} dés et retourne les résultats.

















## 🛠️ Technologies utilisées 🛠️ : 

- **Framework principal** : Spring Boot
- **Base de données** : H2 
- **Documentation API** : Swagger (bonus)
- **Simplification de code** : Lombok (bonus)
