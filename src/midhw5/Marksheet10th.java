package midhw5;
public class Marksheet10th {

    public static void main(String [] rugs){
        int a=75, b=80, c=85,d=71,e=79,f=72,g=89;
        int total_marks  = a+b+c+d+e+f+g;


        System.out.println("Gujarat Secondary and Higher secondary Education Board, Gandhinagar"  );
        System.out.println("                     Examination Wing Vadodra                       " );
        System.out.println("Statement Showing the MArks in each Subject obtained in SSC Exam 2008");
        System.out.println("--------------------------------------------------------------------=");

        System.out.println("Seat No.                  Candidate Name           Sr.No.of Statement");
        System.out.println("A 100100           PATEL PRAMUKHRAJ RAJESHVAR             100101     ");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Name of Subject      Total    Marks Obtained                         ");
        System.out.println(" ");
        System.out.println("GUJARATI              100        "+(a));
        System.out.println("ENGLISH               100        "+(b));
        System.out.println("SANKRIT               100        "+(c));
        System.out.println("SOCIAL STUDIES        100        "+(d));
        System.out.println("SCIENCE               100        "+(e));
        System.out.println("MATHEMATICS           100        "+(f));
        System.out.println("PHYSICAL EDU.         100        "+(g));
        System.out.println(" TOTAL                700        "+(total_marks));
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------");

        System.out.println("Month & Year of Exam     Total Subject      Result         Percentage");
        System.out.println("March  -  2008                7              Pass          "+(total_marks*100/700));
    }

}
