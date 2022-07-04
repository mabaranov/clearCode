1. Закоментированный код: Функцию breakIntTolines_v2 была закоментарена чтобы добавить новый вариант - удалил.
2. Избыточный комментарий: удалил
	// Заполняем массив суммами столбцов
        for(int i=0; i<maxLengthRow; i++) {
            int sumCol = 0;
            for(int j=0; j<arr.length; j++) {
                if(i < arr[j].length)
                    sumCol += arr[j][i];
            }
            arrSumCols[i] = sumCol;
        }
3. Недостоверный комментарий: заменил на  // определение не високосного года согласно задачи 
// не високосный год 
boolean notLeapYear = (yearOfBirthday % 4 != 0);
4. Неиспользовать комментарий там где можно использовать функцию или переменную: удалил комменатарий и заменил на calcCountWords
// Подсчет количество слов в строке
static int countWords(String str) 
5. Неиспользовать комментарий там где можно использовать функцию или переменную: заменил на функцию convertToString(int precision)
	// Переводим число в строку с точностю до 5 знака
    	int sum5 = (int) (sum * 100000);

         if(sum*100000 - sum5 >= 0.5)
             sum5 += 1;

         String tmp = "";
         while( sum5 > 0 ) {

             int rightNumber = sum5%10;
             sum5 = (int)sum5/10;

             if (rightNumber != 0) {
                 tmp += rightNumber;
             }
         }

         String res = "";
         for(int i=tmp.length()-1; i>=0; i--) {
             res += tmp.charAt(i);
         }
6. Неиспользовать комментарий там где можно использовать функцию или переменную: заменил на функцию isMirrorString
    for (int i=i1, j=i2; i>=0; i--, j++) {
             char c1 = line.charAt(i);
             if (c1 != '*' && c1 != '.') return false;
             char c2 = line.charAt(j);
             if (c2 != '*' && c2 != '.') return false;
             if (c1 != c2) return false;
         }
7. Избыточный комментарий: удалил
       public T get(String key)
        {
            // возвращает value для key,
            // или null если ключ не найден
            if ( isKey( key ) )
            {
                int index = hashFun( key );
                return values[index];
            }
            return null;
        }
8. Можно расценить как избыточный: можно удалить, еще лучше вынести в функцию transpositionMatrix
      // транспонирование матрицы
        int[][] arrT = new int[arr[0].length][arr.length];

        for (int i = 0; i < arrT.length; i++)
            for (int j = 0; j < arrT[i].length; j++)
                arrT[i][j] = arr[j][i];
9. Вынести в функцию defineMaxLength
	// Определим максимальную строку
        int maxLengthRow = 0;
        for(int i=0; i<arr.length; i++)
            if(arr[i].length > maxLengthRow)
                maxLengthRow = arr[i].length;
10. Удалил избыточный комментарий
    // вывод после сортировки
      System.out.println("");
      for(int i=0; i<n; i++) {
        System.out.print(m[i]+",");
      }
11. Удалил избыточный комментарий
    //вывод до сортировки 
      for(int i=0; i<n; i++) {
        System.out.print(m[i]+",");
      } 
12. Удалил шум - первый комменатарий     
		// разберем по цифрам
        int n1 = (int) (X/100000);// первая цифра билета
        int n2 = (int) ((X - 100000*n1)/10000); // вторая цифра билета
        int n3 = (int) ((X - 100000*n1 - 10000*n2)/1000); // третья цифра билета
        int n4 = (int) ((X - 100000*n1 - 10000*n2 - 1000*n3)/100); // четвертая цифра билета
        int n5 = (int) ((X - 100000*n1 - 10000*n2 - 1000*n3 - 100*n4)/10); // пятая цифра билета
        int n6 = (int) (X - 100000*n1 - 10000*n2 - 1000*n3 - 100*n4 -10*n5); // шестая цифра билета

13. Шум - удалил
	// суммируем в цикле только нечетные
    for( i = 1; i <= N; i = i + 2 )
        sum = sum + i;
14. Вынести в функцию calcFullJars
	// вычисляем количество целых банок для покраски дома
    if ( S % V == 0 )
      n = S / V;
    else
      n = (int) (S / V) + 1;
15. Шум - удалил
	// выводим сезон
    if ( numberOfMonth >= 3 && numberOfMonth <= 5 )
      System.out.println("Весна");
    else
      if (numberOfMonth >= 6 && numberOfMonth <= 8 )
        System.out.println("Лето");
      else
        if (numberOfMonth >= 9 && numberOfMonth <= 11 )
          System.out.println("Осень");
        else
          if (numberOfMonth == 1 || numberOfMonth == 2 || numberOfMonth == 12 )
            System.out.println("Зима");
          else
            System.out.println("Введен неправильный номер месяца");