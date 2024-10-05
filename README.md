

---

# **Recettes de Repas - Application Android**

## **Description du projet**
Cette application Android permet de présenter différentes **recettes de repas**, en commençant par les pizzas et en étendant les catégories à des plats comme les **burgers**, **pâtes**, **salades**, et **desserts**. Les utilisateurs peuvent parcourir les différentes catégories de repas, voir les recettes et obtenir des détails complets sur chaque plat (ingrédients et étapes de préparation).

## **Fonctionnalités principales**
1. **Affichage des recettes** : 
   - Les utilisateurs peuvent visualiser une liste de repas disponibles dans l'application.
   - Chaque repas est associé à une image, un nom, des ingrédients, et une description détaillée.
   
2. **Catégorisation des repas** :
   - Les repas sont organisés en **catégories** (pizzas, burgers, pâtes, etc.) pour faciliter la navigation.
   - Un menu ou des boutons permettent aux utilisateurs de sélectionner une catégorie spécifique, comme "Pizzas" ou "Burgers".
   
3. **Navigation vers les détails** :
   - En cliquant sur un repas dans la liste, l'utilisateur est redirigé vers une **page de détails** où il peut consulter :
     - Les ingrédients.
     - Les étapes de préparation.
   
4. **Splash Screen avec animation** :
   - Une activité de démarrage avec un logo animé pour une meilleure expérience utilisateur.

## **Architecture du projet**
Le projet est structuré en plusieurs packages pour faciliter la maintenance et l'ajout de nouvelles fonctionnalités :
- **beans** : Contient la classe `Produit` représentant un repas avec ses propriétés (nom, ingrédients, etc.).
- **dao** : Gère les interfaces de gestion des données, incluant l'interface générique `IDao`.
- **service** : Contient la classe `ProduitService` qui implémente les opérations de gestion des repas.
- **adapter** : Inclut l'`Adapter` personnalisé pour la gestion des éléments de la liste (ListView).
- **activités** : Gère les activités (SplashActivity, ListPizzaActivity, DétailsActivity) pour l'affichage et la navigation.

## **Prérequis**
- Android Studio
- Un émulateur Android ou un appareil physique
- Java ou Kotlin pour le développement sous Android

## **Installation**
1. Clonez ce dépôt dans votre environnement local :
   ```bash
   git clone https://github.com/username/recettes-android.git
   ```
2. Ouvrez le projet dans **Android Studio**.
3. Lancer l'application en utilisant un émulateur Android ou un appareil physique connecté.

## **Étapes de développement**
1. **Création de l'application Android** :
   - Développer une application qui affiche des recettes à partir d'une collection de données.
   
2. **Interface utilisateur** :
   - Mise en place d'une **Splash Activity** avec animation.
   - Création d'une activité **ListView** pour afficher les repas.

3. **Ajout de catégories de repas** :
   - Mise en place d'un système de catégories pour naviguer entre différents types de repas (pizzas, burgers, etc.).
   
4. **Affichage des détails d'un repas** :
   - Implémentation de la redirection vers une page de détails en cliquant sur un repas.

## **Contributeurs**
- **Abdellah El Gharbi**
- **Encadré par :** Pr. Lachgar

## **Licence**
Ce projet est sous licence [MIT](LICENSE).

---

Vous pouvez adapter ce fichier **README** selon les spécificités de votre projet et les futures évolutions.
