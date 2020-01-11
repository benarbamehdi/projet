Ce projet à été réalisé sous eclipse oxygen, nous avons utiliser le plugin "WindowBuilder" pour l'interface graphique.

Le programme permet de charger un fichier .COMPILA puis d'effectuer l'une des 3 analyses ( lexicale, syntaxique ou semantique )

Nous détaillons ci dessous de façon générale la manière dont nous avons realiser chacune de ces 3 fonctions d'analyses.

Analyse lexicale : 

On va lire le fichier .COMPILA préalablement charger ligne par ligne à travers une boucle, à chaque itération on va stocker la ligne courante dans un tableau de caracteres puis on va tester individuellement chaque caractere pour voir ci ce dernier fait partie de notre alaphabet, si oui alors on va l'ajouter dans notre variable buffer ( variable qui contiendra le mot à analyser, cette derniere est initialement vide ), ce processus va se repeter jusqu'a ce qu'on l'on arrive à un caractere "espace" ou a un "saut de ligne" à ce moment la si on a bien un saut de ligne ou un espace et que notre buffer n'est pas vide alors on va proceder à l'analyse lexicale du mot contenu dans notre buffer via une succession de if et de case jusqu'a ce que l'on traite tout les cas possible puis on va repeter le processus precedant jusqu'a ce que l'on finisse de parcourir l'ensemble du fichier.

Analyse Syntaxique :

dans un premier temps, on va réutiliser le code que l'on a précédement utiliser pour l'analyse lexicale sauf que cette fois, lors de l'analyse du mot, on va attribué à chaque cas possible un nombre ou une lettre qui nous servira plus tard pour l'analyse syntaxique, on stockera le nombre ou la lettre en question dans une variable que l'on a nommé "syntax", ce processus va se repeter jusqu'a ce qu'on analyse tout les mots d'une ligne puis on va vérifier la syntaxe de la ligne en question grace à notre variable syntax en effectuant une serie de tests, si par exemple dans notre variable syntax on a la valeur suivante : 4527, ceci correspond alors a une declaration correcte d'un entier car dans notre programme, le 4 défini "int number", le 5 defini les deux points ":", le 2 défini un identificateur et le 7 défini le point virgule ";".

Analyse Semantique : 

on va réutiliser le code precedement utilisé pour l'analyse syntaxique sauf que cette fois, au moment de l'analyse du mot, on va en plus de la variable syntax, egalement utiliser une variable "sem" dans laquelle on stockera la traduction java du mot analtysé, par exemple le mot "Int_Number" sera enregistré dans notre variable sem comme etant "Int", ce processus va se faire pour chaque ligne, ainsi a la fin de l'analyse de chaque ligne on aura dans notre variable sem, par exemple pour la declaration d'un entier, quelque chose comme : Int i ; 

puis comme precedement, on va effectuer des tests sur un ensemble de conditions pour chaque cas possible, si tout est bon, on aura notre chaine sem en sortie.
