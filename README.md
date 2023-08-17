# MyGitHubActionsTest
Repository that demonstrates GitHubActions mit Java Maven

## Vorausetzungen Software

Git bzw. TortoiseGit
Maven
VS Code


## Java Maven

Es gibt in GitHub fertige Workflows für Ant, Grant, Maven. 

Ant ist alt und konnte ich nicht auf meinem Rechner installieren, Stand 8/23. Nach Rücksprache haben wir uns für Maven entschieden.
Ich wusste von Maven nur das es eine Build Tool ist. Das folgende Video erklärt die Kette die Maven abarbeitet:

   https://www.youtube.com/watch?v=ExKq23bNABk

Dreh und Angelpunkt von Maven ist die pom.xml (Project Object Model), dort wird definiert was maven tun soll.
Maven führt folgende Schritte durch:

* validate (optional)
* compile (kompiliert in alle möglichen Formate, ist im POM File definiert)
* test
* package (.war oder .jars erstellen)
* verify
* install (lokal in ein Verzeichniss kopieren)
* deploy (ins Maverepository kopieren und verfügbar machen, nicht auf den Anwendungsserver)

### Maven Projekt erstellen:

* Erstellt das Mavenprojekt mit der gewünschten Verzeichnisstruktur.
* von https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

```
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```
### Java Klasse und JUnit im richtigen Verzeichniss ablegen

C:\Users\xxxxx\Desktop\MavenTest\MyGitHubActionsTest\my-app\src\test\java\com\mycompany\app  -> JUnit Test
C:\Users\xxxxx\Desktop\MavenTest\MyGitHubActionsTest\my-app\src\main\java\com\mycompany\app  -> Java Klasse 

### Java compilieren

```
mvn compile
```

schlägt fehl weil ich JRE installiert habe, da aber in Github compiliert werden soll, kann das ausgelassen werden.

### git push

* https://thomas-leister.de/git-fuer-einsteiger/
* theoretisch geht es so:
* 
```
git add .
git commit -m "Initial commit"
git push -u origin master
```

### pom.xml muss auf Ebene von .git

ich habe das Projet falsch erstellt, die pom.xml liegt im falschen Verzeichniss


## Java Klasse vs. Swing Project

Dieses Beispiel enthält einen Taschenrechner und JUnittest erstellt von ChatGPT.
Im nächsten Schritt soll dieses Projket wiederholt werden nur mit einer SPRING Applikation. 
