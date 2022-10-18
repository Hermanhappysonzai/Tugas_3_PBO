
public class Nilai {
    protected String nim, nama, grade;
    protected int nilai;

    public Nilai(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    public void setDataMahasiswa(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
        
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getGrade() {
        if(getNilai()>80&&getNilai()<=100){
            grade = "A";
        }
        else if(getNilai()>70&&getNilai()<=79){
            grade = "B";
        }
        else if(getNilai()>60&&getNilai()<=69){
            grade = "C";
        }
        else if(getNilai()>50&&getNilai()<=59){
            grade = "D";
        }
         else if (nilai <49)
        {
            grade = "F";
        }
      
            
        return grade;
    }

    public int getNilai() {
        return nilai;
    }
    
  public void infoMahasiswa(){
      System.out.println("Isikan Nama : "+nama);
      System.out.println("Isikan Nim : "+nim);
      System.out.println("Isikan Nilai : "+nilai);
      System.out.println("Grade : "+grade);
     
      System.out.println("=========================+++++==========================");
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    
}
  

    
    

