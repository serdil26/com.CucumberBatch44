Feature: US1004 parametre ile istenen websitesine gitme

  Scenario: TC06 Eski usul amazona gitme

    Given kullanici amazon sayfasina gider
    #Then kullanici techproeducation sayfasina gider

  Scenario: TC07 parametre ile istenen websitesine gitme
    Given kullanici "AmazonUrl" sayfasina gider
    Then kullanici "TechproedUrl" sayfasina gider
    Then kullanici "BestbuyUrl" sayfasina gider
    And sayfayi kapatir