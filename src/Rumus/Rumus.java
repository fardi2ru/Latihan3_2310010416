package Rumus;

//Nama :Muhammad Farid Syuhada
//Npm :2310010416
//Kelas :4B

public class Rumus {
    private int sisi;
            int panjang;
            int lebar;
            int hasil;
            
            public rumus(int sisi, int panjang, int lebar, int hasil){
                this.sisi = 0;
                this.panjang = 0;
                this.lebar = 0;
                this.hasil = 0;
            }
            
    public int setLuasPersegi(int sisi){
        this.sisi = sisi;
        this.hasil = sisi * sisi;
        return this.hasil;
    }
    
    public int setLuasPersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        this.hasil = panjang * lebar;
        return this.hasil;
    }
    
    
}
