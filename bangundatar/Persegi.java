package bangundatar;


public class Persegi extends BangunDatar{
    float sisi;
    
    @Override
    double luas(){
        float hasil = sisi * sisi;
        System.out.println("Luas = " + hasil);
        return hasil;
    }
    
    @Override
    double keliling(){
        float hasil = 4 * sisi;
        System.out.println("Keliling Persegi " + "= " + hasil);
        return hasil;
    }
    
}
