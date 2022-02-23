# Author: fruizga
  @stories
  Feature: Utest World
    As user, I want to join the uTest community by filling in the registration form
  @scenario1
  Scenario: Register in uTest community
    Given than Evaristo wants to join the uTest community
    | strFirstName | strLastName | strEmail           | strBirthMonth | strBirthDay | strBirthYear | strLanguage |
    |   Sam        | Petersburg  | sampete@exampler.com |   August      |  23         |    1973      |  Russian    |
    |   Timo       | Kotipelto   | timo@stratoex.com   |   March       |  15         |    1969      |  Finnish    |
    |              |             |           |               |             |              |             |
    When  he search for the registration form in the uTest community web page
    | strCity  | strZipCode | strComputerOS | strOsVersion | strOSLanguage | strMobile | strMobileModel | strMobileOS | strPassword  | strConfirmPass |
    | Moscow   | 102301     |  Linux        | Manjaro      | Russian       | AGM       | A9 (AGM)       | Android 8.1 | mc!E*1dzTIRw | mc!E*1dzTIRw   |
    | Porvoo   | 06530      |  Debian       | 8.5 64 Bit   | Finnish       | Nokia     | C2             | Android 8.1 | SACLuJ$!u4#z | SACLuJ$!u4#z   |
    |         |            |               |              |               |           |                |             |             |                |
    Then he registers his information and see the Welcome to the world's largest community of freelance software testers!