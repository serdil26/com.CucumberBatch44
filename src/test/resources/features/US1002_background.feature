@paralel2
Feature: US1002 Background ile amazon search testi

Background: amazon sayfasina giris
Given kullanici amazon sayfasina gider
  # yorum yazmak icin diyez kullanilir

  @wip
  Scenario: TC02_Amazon iphone Search Test

    And iphone icin arama yapar
    Then sonuclarin iphone icerdigini test eder

    @toplu
  Scenario: TC03_Amazon tea pot Search Test
    And tea pot icin arama yapar
    Then sonuclarin tea pot icerdigini test eder

  Scenario: TC04_Amazon flower Search Test
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder
