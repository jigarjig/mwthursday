package midhw5;

public class Marksheet12th {
        public static void main(String [] rugs){

        int a=70, b=85, c=90,d=70,e=85,f=90;
        int total_marks  = a+b+c+d+e+f;

        System.out.println("Gujarat Secondary and Higher secondary Education Board, Gandhinagar"  );
        System.out.println("                     Examination Wing Vadodra                       " );
        System.out.println("Statement Showing the MArks in each Subject obtained in SSC Exam 2010");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Months & Year of Exam                     Centre                     ");
        System.out.println("March - 2010                              Nadiad                     ");

        System.out.println("Seat No.                  Candidate Name           Sr.No.of Statement");
        System.out.println("A 100001           PATEL PRAMUKHRAJ RAJESHVAR             112233     ");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Name of Subject      Total    Marks Obtained                         ");
        System.out.println(" ");
        System.out.println("ENGLISH FL            100        "+(a));
        System.out.println("MATHEMATICS           100        "+(b));
        System.out.println("CHEMISTRY             100        "+(c));
        System.out.println("PHYSICS               100        "+(d));
        System.out.println("SCIENCE               100        "+(e));
        System.out.println("COMPUTER              100        "+(f));
        System.out.println(" TOTAL                600        "+(total_marks));
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------");

        System.out.println("Month & Year of Exam     Total Subject      Result         Percentage");
        System.out.println("March  -  2010                7              Pass          "+(total_marks*100/600));

}

}
