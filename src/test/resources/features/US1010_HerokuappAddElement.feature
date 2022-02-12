Feature: US1010 Herokuapp sayfasinda add butonu testi
@heroku
  Scenario: TC15 sonradan gorunen elemanlar calismali

    Given kullanici "HerokuappAddElementUrl" sayfasina gider
   When Add Element butonuna basar
  Then Delete butonu gorununceye kadar bekler
  And Delete butonunun gorundugunu test eder
  Then Delete butonuna basarak butonu siler
  And sayfayi kapatir