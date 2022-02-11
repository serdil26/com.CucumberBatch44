Feature: US1009 editor kayit

  @editor
  Scenario : TC14 kullanici yeni kayit ekleyebilmeli

    When kullanici https://editor.datatables.net/ adresine gider
    Then new butonuna basar
    And first name olarak "<firstname>" yazar
    And last name olarak "<lastname>" yazar
    And position olarak "<position>" yazar
    And office olarak "<office>" yazar
    And extension olarak "<extension>" yazar
    And start date olarak "<startDate>" yazar
    And salary olarak "<salary>" yazar
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    Then isim bolumunde "<firstname>" oldugunu dogrular


