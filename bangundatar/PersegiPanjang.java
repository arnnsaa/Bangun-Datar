
package bangundatar;


public class PersegiPanjang extends BangunDatar{
    float panjang;
    float lebar;
    
    @Override
    double luas(){
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang:" + luas);
        return luas;   
    }
    
    @Override
    double keliling(){
        float kll = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang: " + kll);
        return kll;
    }
}   
    

