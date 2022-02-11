Feature: US1007 scenario outline ile amazon search

  Scenario Outline: TC12 amazonda bir listedeki tum elementleri aratma
   Given kullanici amazon sayfasina gider
    Then "<aranacakEleman>" icin arama yapar
    And sonuclarin "<aranacakEleman>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      |aranacakEleman  |
      |Apple  |
      |Java  |
      |Samsung  |
      |Nutella  |


