public class cricketmatch {
    public static void main(String[] args) {
        int nob=678;
        String s=String.valueOf(Math.round(nob/6));
        String s1=String.valueOf(nob%6);
        double nofover=Double.valueOf(s+"."+s1);
        System.out.println(nofover);
    }
    
}
