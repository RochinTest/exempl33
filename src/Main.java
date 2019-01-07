// Дана матрица B[N, M]. Найти в каждой строке матрицы максимальный и
// минимальный элементы и поменять их местами с первым и последним
// элементом строки соответственно.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N = 0; int M = 0;
        System.out.println("Введите размер матрицы B[N,M]");
        Scanner sc = new Scanner(System.in);
        int min = 0;int max = 0;
        if (sc.hasNextInt()) {
            N = sc.nextInt();
            M = sc.nextInt();
        }
        int[][] mass = new int[N][M];
        for (int i = 0; i < N; i++) {
            max = 0;
            int k = 0;
            int p = 0;
            min = 1000;
            int n = 0;
            int l = 0;
            System.out.println();
            for (int j = 0; j < M; j++) {
                mass[i][j] = (int) (Math.random() * 100);
                System.out.print(" " + mass[i][j]);
                if (max < mass[i][j]) {
                    max = mass[i][j];
                    n = j;
                }
                if (min > mass[i][j]) {
                    min = mass[i][j];
                    l = j;
                }
                if (j == (M - 1)) {
                    k = mass[i][0];
                    mass[i][0] = max;
                    mass[i][n] = k;
                    if (l == 0) {
                        l = n;
                        p = mass[i][j];
                        mass[i][j] = min;
                        mass[i][l] = p;
                    } else if (l != 0) {
                        p = mass[i][j];
                        mass[i][j] = min;
                        mass[i][l] = p;
                    }
                }
            }
        }
        System.out.println();
        for (int i = 0; i < N; i++) {

            System.out.println();
            for (int j = 0; j < M; j++) {
                System.out.print(" " + mass[i][j]);
            }
        }
    }
}











