## Spring Boot | Unit Testing | JaCoCo

Dasn ce repo, nous allons voir comment utiliser le plugin JaCoCo Maven pour générer un rapport de couverture de code
pour un projet Java.

**Remarque** : 
*JaCoCo est un outil de couverture de ligne activement développé, qui est utilisé pour mesurer le nombre de lignes de
notre code testées.*

Exécutez tous les tests : `mvn clean test`

Rapport JaCoCo, accédez à `target/jacoco-report/index.html` et ouvrez le fichier pour afficher la couverture.

- Vert – Le code est testé ou couvert.
- Rouge - Le code n'est pas testé ou couvert.
- Jaune - Le code est partiellement testé ou couvert.
- Si toutes les lignes sont testées, couverture à 100 %.
