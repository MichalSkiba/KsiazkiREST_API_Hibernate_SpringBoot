# KsiazkiREST_API_Hibernate_SpringBoot

Aplikacja Współdziala z Angularem

Aplikacja w fazie rozwoju

http://localhost:8080/swagger-ui.html



Poniżej zapytanie sql niezbędne do prezentacji aplikacji

CREATE TABLE book(
   id     INTEGER  NOT NULL PRIMARY KEY 
  ,tytul  VARCHAR(137) NOT NULL
  ,autor  VARCHAR(98)
  ,jakosc VARCHAR(8)
  ,stron  INTEGER  NOT NULL
  ,cena   NUMERIC(5,2)
  ,url    VARCHAR(97)
  ,url2   VARCHAR(10)
);
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (1,'100 sposobów na odporność','Charlotte Haigh','SKAN',66,24.99,'https://4.allegroimg.com/original/0c992a/7f0d66984894b774cf4403591cd4',NULL);
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (2,'101 niezwykłych pomysłów na biznes','Grzegorz Marynowicz','HQ',213,39.99,'https://static01.helion.com.pl/global/okladki/326x466/7e70f2083d5b77ec02518b091bfb8e64','101nie.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (3,'101 pomysłów na randkę','Krzysztof Król','HQ',274,39.9,'https://static01.helion.com.pl/global/okladki/326x466/b72c8bcf656f2cbac32d8dadb7b8aa0d','101ran.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (4,'13 najpopularniejszych sieciowych ataków na Twój komputer. Wykrywanie. usuwanie skutków i zapobieganie','Maciej Szmit. Mariusz Tomaszewski. Dominika Lisiak. Izabela Politowska','HQ',210,34.9,'https://static01.helion.com.pl/global/okladki/326x466/d0e797c0cba66af063bfd6565b6f6e10','xxatak.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (5,'30 pomysłów na zarabianie w domu','Infor Biznes','HQ',99,24,'https://image.ceneostatic.pl/data/products/44197869/i-30-pomyslow-na-zarabianie-w-domu-e-book.jpg',NULL);
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (6,'35 typy klientow',NULL,NULL,2,0,NULL,NULL);
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (7,'365 dni do sukcesu','Waldemar Mielczarek',NULL,67,20,'https://get.zlotemysli.pl/products/image/000/006/403/152x200.jpg?201904',NULL);
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (8,'3ds Max 2012. Biblia','Kelly L. Murdock','HQ',1576,199,'https://static01.helion.com.pl/global/okladki/326x466/c098da30062bf427324aa02145ead1e1','max12b.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (9,'3ds Max 2012. Ćwiczenia praktyczne','Joanna Pasek','HQ',242,29.9,'https://static01.helion.com.pl/global/okladki/326x466/259da797b188b8f3ab484900aaddaf3f','cwma21.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (10,'5 najlepszych listów handlowych','Buczny Aleksander',NULL,80,0,'https://get.zlotemysli.pl/products/image/000/006/497/152x200.jpg?201904',NULL);
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (11,'biblia sprzedaży','Arkadiusz Bednarski',NULL,466,79,'https://static01.helion.com.pl/global/okladki/326x466/cb7d988fbd92147e5c947c92abe45b22','bibspr.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (12,'Mózg na zakupach','A.K. Predeep',NULL,250,49.9,'https://static01.helion.com.pl/global/okladki/326x466/bdd79e788658e205d32fe739fd97b382','mozaku.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (13,'ABC Access 2003 PL','Maciej Groszek','SKAN OCR',163,15,'https://static01.helion.com.pl/global/okladki/326x466/f676ab1671d674f536c6b5ccdc6f7444','abca23.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (14,'ABC CorelDRAW X7 PL','Roland Zimek','HQ',295,39.9,'https://static01.helion.com.pl/global/okladki/326x466/16a0f6d31c584657781269090337f8a8','abccx7.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (15,'ABC Excel 2016 PL','Witold Wrotek','HQ',342,39.9,'https://static01.helion.com.pl/global/okladki/326x466/5b0a46faca303156f8039ab6a70ca217','abce16.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (16,'ABC komputera. Wydanie 10','Piotr Wróblewski','HQ',401,39.9,'https://static01.helion.com.pl/global/okladki/326x466/9c22e2404886ea54882eaf539e8e601a','abck10.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (17,'ABC Mądrego Rodzica - Inteligencja Twojego Dziecka','Jolanta Gajda','HQ',226,30.9,'http://s.lubimyczytac.pl/upload/books/17000/17164/352x500.jpg',NULL);
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (18,'ABC sam składam komputer. Wydanie IV','Bartosz Danowski. Andrzej Pyrchla','HQ',338,39,'https://static01.helion.com.pl/global/okladki/326x466/2b59d3ffcc338c75e720030b013be92e','abcss4.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (19,'ABC Seksualności','Krzysztof Król. Jan Gajos','HQ',162,34.9,'http://s.lubimyczytac.pl/upload/books/279000/279750/452538-352x500.jpg',NULL);
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (20,'ABC systemu Windows 10 PL','Danuta Mendrala. Marcin Szeliga','HQ',389,39.9,'https://static01.helion.com.pl/global/okladki/326x466/58d9ae7bf3f02a52e09adbc5d6b88d68','abcw1p.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (21,'ABC systemu Windows 8 PL','Danuta Mendrala. Marcin Szeliga','HQ',352,34.9,'https://static01.helion.com.pl/global/okladki/326x466/1040e73ed714147c077c26e683a3dcf2','abcwi8.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (22,'ABC Word 2016 PL','Aleksandra Tomaszewska','HQ',257,34.9,'https://static01.helion.com.pl/global/okladki/326x466/fcfeaee61a9bcf65f31a405c02def35d','abcw16.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (23,'Access 2007 PL. Nieoficjalny podręcznik','Matthew MacDonald','HQ',742,89,'https://static01.helion.com.pl/global/okladki/326x466/ca2b4f2143cb0966b9e9c316f8761ac5','ac27np.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (24,'Access 2016 PL w biurze i nie tylko','Sergiusz Flanczewski','HQ',457,77,'https://static01.helion.com.pl/global/okladki/326x466/26d99971df9493af89d34a3c5da71a35','a16biu.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (25,'ActionScript 3.0. Biblia','Roger Braunstein. Mims H. Wright. Joshua J. Noble','HQ',748,99,'https://static01.helion.com.pl/global/okladki/326x466/a1931198a4a0abca4207180ce04dd1be','acs3bi.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (26,'Active Directory w systemach wolnego oprogramowania','Zbigniew Góra','HQ',257,44.9,'https://static01.helion.com.pl/global/okladki/326x466/6c394bcf305f381460cf037db1ec5263','acdili.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (27,'Administrowanie sieciowymi protokołami komunikacyjnymi','Stanisław Wszelak','HQ',392,69,'https://static01.helion.com.pl/global/okladki/326x466/b050384b35795dc36fc604f25b98276f','adsipr.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (28,'Adobe Acrobat XI - Podręcznik','Adobe Creative Team','HQ',495,44.9,NULL,NULL);
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (29,'Adobe Dreamweaver CC - Podręcznik','Adobe Creative Team','HQ',712,89,'https://emp-scs-uat.img-osdw.pl/img-p/1/kipwn/d576082e/std/2bc-452/603947384o.jpg',NULL);
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (30,'Adobe Flash CC - Podręcznik','Adobe Creative Team','HQ',965,69,NULL,NULL);
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (31,'Adobe Flash Professional CS6-CS6PL. Oficjalny podręcznik','Adobe Creative Team','HQ',410,79,'https://static01.helion.com.pl/global/okladki/326x466/4a1f7c7ed58afb4d402776c4cf099ff3','flcs6o.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (32,'Adobe Illustrator CC - Podręcznik','Adobe Creative Team','HQ',507,79,'https://static01.helion.com.pl/global/okladki/326x466/c3cc5dae6d6898a0823e5f192a8793c2','ilcco2.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (33,'Adobe Illustrator CS6-CS6 PL. Oficjalny podręcznik','Adobe Creative Team','HQ',470,79,'https://static01.helion.com.pl/global/okladki/326x466/02d7a7f7bfdc7205a7b8eeef556af06e','ilcs6o.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (34,'Adobe Indesign CC - Podręcznik','Adobe Creative Team','HQ',454,79,'https://static01.helion.com.pl/global/okladki/326x466/9825a6ee8053de26418a38c52e637317','indcco.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (35,'Adobe InDesign CS6-CS6 PL. Oficjalny podręcznik','Adobe Creative Team','HQ',424,79,'https://static01.helion.com.pl/global/okladki/326x466/25e35b607b4f65bc0c45f54daa83921e','ind6op.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (36,'Adobe Photoshop CC - Podręcznik','Adobe Creative Team','HQ',893,77,'https://static01.helion.com.pl/global/okladki/326x466/24265b6361830996e4b46bbc69f82b96','phcco2.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (37,'Adobe Photoshop CS6-CS6 PL. Oficjalny podręcznik','Adobe Creative Team','HQ',382,77,'https://static01.helion.com.pl/global/okladki/326x466/8ed8dcba3ab030443179f6261ce31a09','pcs6op.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (38,'Adobe Photoshop Lightroom 4. Podręcznik dla fotografów','Martin Evening','HQ',696,129,'https://static01.helion.com.pl/global/okladki/326x466/b3ede9bebace1d6bc30244a3d3cc0838','phli4p.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (39,'AdWords 360°. Katalog skutecznych kampanii','Paulina Wiktorska','HQ',141,34.9,'https://static01.helion.com.pl/global/okladki/326x466/23c09569e471bed25609cf383bd58d4b','ad360k.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (40,'CRM Zarządzanie kontaktami z klientami','Agnieszka Dejnaka',NULL,168,49,'https://static01.helion.com.pl/global/okladki/326x466/4ffca283355684946bd2987b9d2fc941','crmnit.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (41,'Ajax on Java','Steven Olson','HQ',224,37,'https://static01.helion.com.pl/global/okladki/326x466/ce03152b05f594b44f73a0b3044ae990','ajaxja.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (42,'Ajax on Rails','Scott Raymond','HQ',330,44,'https://static01.helion.com.pl/global/okladki/326x466/5e7b3e84e3852346e3393992b041e2b7','ajaxra.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (43,'Ajax. Implementacje','Shelley Powers','HQ',356,49,'https://static01.helion.com.pl/global/okladki/326x466/97b77237dced2cbdffa2bda819b01165','ajaxim.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (44,'Ajax. Od podstaw','Chris Ullman. Lucinda Dykes','HQ',540,77,'https://static01.helion.com.pl/global/okladki/326x466/2a4ad9564112f2e31ec3e4b8a234790c','ajaodp.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (45,'Ajax. Wzorce projektowe','Michael Mahemoff','HQ',670,69,'https://static01.helion.com.pl/global/okladki/326x466/469e0ab996ccf502c7836d836d0497fd','ajaxwp.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (46,'Alchemia uwodzenia. Czyli erotyczna manipulacja mężczyznami','Agnieszka Ornatowska','HQ',146,24.9,'https://static01.helion.com.pl/global/okladki/326x466/0d0c3b285c4572e880fc6719d7e0295f','podry2.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (47,'Alchemia uwodzenia. Czyli jak wpływać na umysły. uczucia i zachowanie kobiet','Andrzej Batko. Lech Dębski. Paweł Sowa','SKAN',99,39.9,'https://static01.helion.com.pl/global/okladki/326x466/6d19c4bef89b6f1adca115248822c583','uwo2vv.jpg');
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (48,'Alfabet zarządzania projektami. Wydanie II','Michał Kopczewski','HQ',278,NULL,NULL,NULL);
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (49,'Algorytmy bez tajemnic','Thomas H. Cormen','HQ',224,NULL,NULL,NULL);
INSERT INTO book(id,tytul,autor,jakosc,stron,cena,url,url2) VALUES (50,'Algorytmy. struktury danych i techniki programowania. Wydanie IV','Piotr Wróblewski','HQ',352,NULL,NULL,NULL);
