Feature: US1008 Scenario outline kullanarak farkli degerlerle negative login test
@SO
  Scenario Outline: TC13 farkli kullanici adi ve password

    Given kullanici "HMCUrl" sayfasina gider
    Then login linkine tiklar
    Then scenario outline'dan kullanici adi olarak "<username>" yazar
    And scenario outline'dan password olarak "<password>" yazar
    Then login butonuna basar
    And giris yapilamadigini test eder
    And sayfayi kapatir



    Examples:
      |username|password|
      |MANAGER|MANAGER1|
      |MANager|manaGer1|
      |mana Er|manager1!|
