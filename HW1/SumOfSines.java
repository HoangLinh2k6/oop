public class SumOfSines
{
    public static void main(String[] args)
    {
        double DegAngle = Double.parseDouble( args[0] );
        double RadAngle = Math.toRadians( DegAngle );
        double sum = Math.sin( RadAngle * 2 ) + Math.sin( RadAngle * 3 );
        System.out.println( sum );
    }    
}
