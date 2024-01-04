# Open version de "The One Billion Row Challenge"

## Description

Le Défi Milliard de Lignes (DML) est inspiré par le "One Billion Row Challenge".
Ce projet vise à explorer l'efficacité des langages de programmation différents dans le traitement et l'agrégation rapide de données massives.

## Objectif

Écrire un programme qui lit un fichier de texte contenant des données massives (ex. mesures météorologiques) et calcule des statistiques spécifiques (min, moyenne, max) de façon optimale.
Pour générer les données, il est possible d'utiliser soit un script Python soit un script Bash.

```
python ./python/src/generate.py 1000000000
```

ou

```
./generate 1000000000
```

## Contribution

Ouvert à tous, ce défi encourage l'apprentissage et l'innovation dans le traitement de grandes données. Les participants peuvent utiliser n'importe quel langage de programmation.

## Évaluation

Les soumissions seront évaluées sur la performance.

## Règles

Le programme doit lire un fichier de 1 milliard de lignes.
Les mesures de performance seront prises sur une instance cloud spécifique.
Les contributions doivent être originales et respecter les standards de codage.

## Date Limite

Le défi est ouvert jusqu'au 31 janvier 2025.

Pour plus de détails, visitez le page du projet [original 1brc](https://github.com/gunnarmorling/1brc).

## Pour commencer

1. Créer un fork du dépôt GitHub onebrc.
2. Créer une implémentation dans le langage de votre choix.
3. Assurer une exécution rapide et efficace de votre implémentation.
4. Adapter les scripts existants ou en créer de nouveaux pour exécuter votre solution.
5. Soumettre une pull request au dépôt original, en incluant les détails de votre implémentation et les performances sur votre système.

## FAQ

Q : Puis-je utiliser des langages et/ou outils non-JVM ?
R : Oui, ce défi est ouvert à tous les langages et outils. Aucune restriction n'est imposée sur le choix des librairies ou de frameworks.

Q : Quel est l'encodage du fichier measurements.txt ?
R : Le fichier est encodé en UTF-8.

Q : Puis-je faire des hypothèses sur les noms des stations météorologiques apparaissant dans l'ensemble de données ?
R : Non, bien qu'un ensemble fixe de noms de stations soit utilisé par le générateur de données, toute solution devrait fonctionner avec des noms de stations UTF-8 arbitraires.

Q : Puis-je copier du code d'autres soumissions ?
R : Oui, c'est possible. L'objectif principal du défi est d'apprendre quelque chose de nouveau, plutôt que de "gagner". Si vous le faites, veuillez créditer les soumissions sources pertinentes.
