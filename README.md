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
* veryfiy
* install (lokal in ein Verzeichniss kopieren)
* deploy (ins Maverepository kopieren und verfügbar machen, nicht auf den Anwendungsserver)

## Maven Projekt erstellen:




## Java Klasse vs. Swing Project

Dieses Beispiel enthält einen Taschenrechner und JUnittest erstellt von ChatGPT.
Im nächsten Schritt soll dieses Projket wiederholt werden nur mit einer SPRINg Applikation. 
