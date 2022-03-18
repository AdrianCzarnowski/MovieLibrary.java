Stwórz program o nazwie MovieLibrary. Powinien on przechowywać listę filmów.

Każdy film powinien mieć: nazwę, tytuł, rok wydania, reżysera, gatunek oraz listę aktorów

Reżyser oraz aktorzy powinni mieć oddzielnie imię i nazwisko.

Zastosuj tutaj programowanie obiektowe – stwórz klasy np. MovieLibrary, Movie, Director, Actor (lub inne jakie uważasz) wraz z potrzebnymi polami klasy i metodami.

Tym razem nie będziesz danych wprowadzać za pomocą klawiatury ale powinny być zaimportowanee z pliku JSON

 



Stwórz menu w programie, które będzie wyświetlane użytkownikowi w konsoli, wraz z obsługą wybranych przez niego opcji:

               1. Podaj dwie daty aby wyświetlić nazwy filmów wydanych pomiędzy tymi datami

               2. Wyświetl wszystkie informacje o losowym filmie

               3. Podaj imię i nazwisko aktora aby wyświetlić nazwy filmów w jakich zagrał

 

Komentarz do opcji 2: Wyświetlenie wszystkich informacji o filmie rozumiem jako wypisanie ich np. w takim formacie:

title: The Shawshank Redemption

director: Frank Darabont

genre: drama

date: 1994

actors: Tim Robbins, Morgan Freeman, Bob Gunton

 

Powyższy efekt powinien być uzyskany poprzez nadpisania metody toString() w klasach typu Movie, Actor itd..
