package labcode;


public class CountIt {

    public long SnippetBigN(long n) {
        long i, j, x = 0;

        // for (i = 0; i < 2 * n; i+= 1) {
        //	   if (i == 10)
        //	      stmt1;
        //	   stmt2;
        //
        // }

        // 8n + 3

        i = 0;
        x++;
        while (i < 2 * n) {
            x++;    // i < 2 * n
            x++;    // if ( i == 10)
            if (i == 10) {
                x++;   // stmt 1
            }
            x++;    // stmt2
            i += 1;
            x++;  // i++;
        }
        x++;
        return x;

    }

    public int linearLoop(int N) {

        int x = 0;
        int i = 0; //1
        x++;
        while (i < N) {//n+1
            x++;   // while loop:
            x++;   // stmt
            System.out.println(".");  // slow things do, does not count
            i++; //n
            x++;
        }
        x++; //1
        return x; //1
    }

    public long SnippetNestedLoop(long n) {

        // 3n2 + 6n + 2
        // for (i = 0; i < n; i++) {
        //    stmt
        //    for (j = 0; j < n; j++)
        //		 stmt;
        //    stmt;
        //    }
        long i, j, x = 0;

        i = 0;
        x++;
        while (i < n) {
            x++;    // i < n
            x++;    // s
            j = 0;
            x++;      // j = 0;
            while (j < n) {
                x++;   // j < n
                x++;   // s

                j++;
                x++;   // j++;
            }
            x++; // Can you explain why is this here? Ans:

            x++;    // stmt
            i++;
            x++;  // i++;
        }
        x++; // Can you explain why is this here? Ans: i < n
        return x;

    }


//    public long SnippetLog(long n) {
//        long i, j, x = 0;
//
//        // 11Log(n) + 2
//
//        i = 1;
//        x++;
//        while (i < n) {
//            x++;
//            x++;  // s
//            x++;  // s
//            x++;  // s
//            x++;  // s
//            x++;  // s
//            x++;  // s
//            x++;  // s
//            x++;  // s
//            x++;  // s
//
//
//            i = i * 2;
//            x++;
//        }
//        x++; // Can you explain why is this here?
//
//        return x;
//    }

    // other generic examples

    public long SnippetOtherExample(long n) {
        long i, j, x = 0;

        // for (i = 0; i < n; i++) {
        //  	if (i > 10)
        //			stmt;
        //		stmt;
        //  }
        //

        i = 0;
        x++;
        while (i < n) {
            x++;    // i < n
            x++;    // i > 10;
            if (i > 10)
                x++;
            x++;    // stmt;
            i++;
            x++;
        }
        x++;
        return x;

    }

    public long SnippetLog(long n) {
        long i, j, x = 0;

        i = 1;  x++;
        while (i < n) {	x++;
            x++;  			// SomeStatement
            x++;  			// SomeStatement
            i = i * 2;  x++;
        }
        x++; 				// Can you explain why is this here?
        return x;
    }
    private long fib(int n) {
        if (n < 3)
            return 1;
        else
            return fib(n - 1) + fib (n - 2);

    }




    public static void main(String[] args) {
        CountIt r = new CountIt();
        Long t = System.currentTimeMillis();
        System.out.println("x = " + r.SnippetNestedLoop(100000));
        System.out.println ("Time:" + (System.currentTimeMillis() - t));
        Long time = System.currentTimeMillis();
        System.out.println("x = " + r. SnippetLog (1000000));
        System.out.println ("Time:" + (System.currentTimeMillis() - time));
        Long timer = System.currentTimeMillis();
        int N  = 20;
        System.out.println("Fib of " + N + " = " + r. fib (N));
        System.out.println ("Time:" + (System.currentTimeMillis() - timer));


    }
}