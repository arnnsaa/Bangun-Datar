
package bangundatar;

public class Segitiga extends BangunDatar{
    float alas;
    float tinggi;
    
    @Override
    double luas(){
        float luas = 1/2 * (alas * tinggi);
        System.out.println("Luas Segotiga: " + luas );
        return luas;
}
}