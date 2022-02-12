Feature: US1011 webdriver university windowhandle
  @webUn
  Scenario Outline: TC16 reusable methods ile window handle testi

    Given kullanici "WebUniversityUrl" sayfasina gider
    And Login Portal'a kadar asagi iner
    And Login Portal'a tiklar
    Then acilan diger window'a gecer
    And "<username>" ve "<password>" kutularina deger yazdirir
    Then WebUniversity login butonuna basar
    And 2 saniye bekler
    And Popupta cikan yazinin "validation failed" oldugunu test eder
    Then Ok diyerek popup'i kapatir
    And ilk sayfaya geri doner
    And ilk sayfaya donuldugunu test eder
    Examples:
      | username | password |
      | nur | kiz |


