3.1. 
1. В функции ConquestCampaign :
// Помечаем клетки для захвата
    for( int i=0; i<N; i++) {
                 for (int j=0; j<M; j++) {

                     int k = arealFill[i][j];
                     if(k == 0) isFill = false;
                     else {
                         if (i + 1 < N) arealFill1[i + 1][j] = 1;
                         if (i - 1 >= 0) arealFill1[i - 1][j] = 1;
                         if (j + 1 < M) arealFill1[i][j + 1] = 1;
                         if (j - 1 >= 0) arealFill1[i][j - 1] = 1;
                     }
                 }
             }
2. В функции ConquestCampaign :
// Захват начальных точек (высадка десанта)
for(int i=0; i<battalion.length; i+=2) {
            int x = battalion[i];
            int y = battalion[i+1];
            arealFill[x-1][y-1] = 1;
            arealFill1[x-1][y-1] = 1;
        }

3. В функции PatternUnlock :
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
4. В функции BigMinus :
	// Пропускаем ведущие нули
	if(isFirstZero && tmp[i] == 0 && i!=tmp.length-1) continue;
5. В функции UFO :
// Переводим число в десятичную систему счисления
         while( nBase >= 1 ) {
                 int n = nBase % 10;
                 n10 += n * Math.pow(base, pow);
                 nBase /= 10;
                 pow += 1;
             }
6. В функции LineAnalysis :
	// Проверяем строку на наличие разрешенных символов и зеркальность
    for (int i=i1, j=i2; i>=0; i--, j++) {
             char c1 = line.charAt(i);
             if (c1 != '*' && c1 != '.') return false;
             char c2 = line.charAt(j);
             if (c2 != '*' && c2 != '.') return false;
             if (c1 != c2) return false;
         }
7.  В функции Football :
	// Возвращаем можно ли улучшить расстановку игроков
	if (priem1(copy1, N)) return true;
    if (priem2(copy2, N)) return true;

    return false;


 3.2. Нет комментарии не писал, т.к. было сказано что сервер при проверке может их "не понять".