# Réponse aux questions théoriques du TP

## Étape 5 : liste des dépendances Spring :

### Spring Web
Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

### JPA
Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.

### Hibernate
JSR-303 validation with Hibernate validator.

### H2
Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application.

### DevTools
Provides fast application restarts, LiveReload, and configurations for enhanced development experience.

### ThymeLeaf
A modern server-side Java template engine for both web and standalone environments. Allows HTML to be correctly displayed in browsers and as static prototypes.

## Étape 13 : analyse du code du contrôleur

### 1
L'URL d'appel "/greeting" a été spécifié avec l'annotation `@GetMapping("/greeting")`

### 2
Le fichier HTML associé a été désigné avec la même annotation `@GetMapping("/greeting")` ; cela a sélectionné le fichier `greeting.html` du dossier `templates` (le dossier cible et l'extension sont des valeurs par défaut)

### 3
Le nom à saluer est passé comme paramètre GET au serveur web. Il est désigné comme paramètre de la fonction `greeting` par l'annotation `@RequestParam(name="nameGET", required=false, defaultValue="World")`, qui spécifie par ailleurs que le paramètre est optionnel, et qui lui donne une valeur par défaut. Ce paramètre est ensuite passé comme variable à ThymeLeaf avec `model.addAttribute("nomTemplate", nameGET);` `nomTemplate` est le nom de la variable par laquelle on peut y accéder depuis le pseudo-HTML.
Dans le fichier HTML, la balise `<p th:text="'Bonjour ' + ${nomTemplate} + ' ! '" />` va être interprétée par ThymeLeaf, et le texte qu'elle contient sera interprété, ce qui donnera un résultat final comme `<p >Bonjour ENSIM ! </p>`.