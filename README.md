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
Le fichier HTML associé a été désigné avec la valeur de retour de la fonction, en ajoutant le suffixe `.html` et en cherchant dans le dossier `templates` (le dossier cible et l'extension sont des valeurs par défaut).

### 3
Le nom à saluer est passé comme paramètre GET au serveur web. Il est désigné comme paramètre de la fonction `greeting` par l'annotation `@RequestParam(name="nameGET", required=false, defaultValue="World")`, qui spécifie par ailleurs que le paramètre est optionnel, et qui lui donne une valeur par défaut. Ce paramètre est ensuite passé comme variable à ThymeLeaf avec `model.addAttribute("nomTemplate", nameGET);` `nomTemplate` est le nom de la variable par laquelle on peut y accéder depuis le pseudo-HTML.
Dans le fichier HTML, la balise `<p th:text="'Bonjour ' + ${nomTemplate} + ' ! '" />` va être interprétée par ThymeLeaf, et le texte qu'elle contient sera interprété, ce qui donnera un résultat final comme `<p >Bonjour ENSIM ! </p>`.

## Étape 17 : conséquence de l'ajout de la classe `Addresse` au modèle
Une table a automatiquement été créée avec les colonnes `ID`, `CONTENT`, `CREATION`.

## Étape 18 : détails de la création de la table
À l'initialisation de l'application, une base de donnée a été créée per Hibernate avec une table par classe annotée `@Entity`.
Dans la classe, les annotations `@Id` et `@GeneratedValue` signalent, respectivement, que la clef `id` est une clef primaire, et que sa valeur peut être générée automatiquement.

## Étape 20 : requête `SELECT` après peuplement de la table
> **SELECT * FROM ADDRESS;**
> ID  	CONTENT  								CREATION  
> 1		57 boulevard demorieux					2020-11-12
> 2		51 allee du gamay, 37080 montpellier	2020-11-12

Toute la table apparaît bien.

## Étape 23 : `@Autowired`
> Marks a constructor, field, setter method, or config method as to be autowired by Spring's dependency injection facilities. This is an alternative to the JSR-330 Inject annotation, adding required-vs-optional semantics.

[Documentation officielle](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/annotation/Autowired.html)
cet attribut sera automatiquement initialisé de façon pertinente par Spring.

## Étape 30 : Bootstrap
Bootstrap est un _framework_ Javascript, il s'inclut donc comme n'importe quel script Javascript, directement dans chaque fichier HTML :
```HTML
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>  
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
```

(Jquery est inclus aussi en tant que dépendance de Bootstrap.)

Lien de documentation : [https://www.javatpoint.com/bootstrap-example](https://www.javatpoint.com/bootstrap-example) et suivants

De plus, rajouter
```HTML
<meta name="viewport" content="width=device-width, initial-scale=1">```
dans l'en-tête HTML permet à la page d'être plus  _responsive_ .