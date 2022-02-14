@parametreliTest
Feature: US1003 parametre ile step definition olusturma
@paralel1
  Scenario: TC05_parametreKullanimi

    Given kullanici amazon sayfasina gider
    And "iphone" icin arama yapar
    Then sonuclarin "iphone" icerdigini test eder
    And sayfayi kapatir