1. Заменил магические строки на константы
final String textMajorityWinner = "majority winner"; // Текстовое сообщение победителя
final String textNoWinner = "no winner"; //Текстовое сообщение не победителя
final String textMinorityWinner = "minority winner"; // Текстовое сообщение победителя

2. Заменил магический символ
final char SEPARATE_CHARACTER = ' '; // разделитель слов в строке

3. Использовал логические переменные
boolean isDraw = ((rus1+rus2) == (brz1+brz2));
if(isDraw) {}
boolean isRussiaWinner = ((rus1+rus2) > (brz1+brz2));
if(isRussiaWinner) {}

4. Использовал логические переменные
boolean isThirtyOneDay = (numberOfMonth == 1
        || numberOfMonth == 3
        || numberOfMonth == 5
        || numberOfMonth == 7
        || numberOfMonth == 8
        || numberOfMonth == 10
        || numberOfMonth == 12); // тридцать один день
boolean isThirtyDay = (numberOfMonth == 4
        || numberOfMonth == 6
        || numberOfMonth == 9
        || numberOfMonth == 11 ); // тридцать дней
if(isThirtyOneDay) {}
if(isThirtyDay) {}

5. Использовал логические переменные
boolean isSpring = (numberOfMonth >= 3 && numberOfMonth <= 5);
boolean isAutumn = (numberOfMonth >= 9 && numberOfMonth <= 11 );
boolean isWinter = (numberOfMonth == 1 || numberOfMonth == 2 || numberOfMonth == 12);
boolean isSummer = (numberOfMonth >= 6 && numberOfMonth <= 8);

6. Использовал логические переменные
boolean isHuman = (HID % 5 == 0 && HID % 11 == 0);

7. Заменил магическую строку
final String fileName = "./Objects.txt";

8. Заменил магический символ
const char SIGN_FOR_SEARCH = '*' // знак для поиска

9. Использовал логическую переменную
boolean found = (c1 != '*' && c1 != '.');

10. Использовал логическую переменную
boolean odd = (number % 2 != 0);

11. Заменил магическую строку
final String happyTicket = "Счастливый билет. Надо есть.";
final String notHappyTicket = "Несчастливый билет. Не надо есть";

12. Использовал логическую переменную
boolean notLeapYear = (yearOfBirthday % 4 != 0);
