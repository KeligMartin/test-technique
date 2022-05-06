1) Retourner tous les éléments book

    `//book`


2) Retourner tous les éléments title ayant comme parent un élément book avec un attribut type égal à roman

   `//book[@type='roman']/title`


3) Retourner le nombre d'éléments book ayant un attribut type égal à bd

   `count(//book[@type='bd'])`

4) Que renvoie la requête XPath suivante :  `/library/library/ancestor-or-self::library`

   Elle renvoie deux noeuds XML, le premier `library` qui contient tous les autres sous-noeuds, et un deuxieme noeud `library` qui est contenu dans le 1er et ne contient qu'un `book`