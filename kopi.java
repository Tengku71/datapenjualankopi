import java.util.Scanner;
public class kopi {
    int jumlahmenu = 4;
    static int totalJumlahCupKopi = 1250;
    public static String[] kopillate = new String[400];
    public static String[] kopigoncangjiwa = new String[300];
    public static String[] kopijalankenangan = new String[300];
    public static String[] kopipahittanparasa = new String[250];

    public static void Transaksi(){
        int totalkopilatte=0;
        int totalSisaKopi = 0;
        for(int index=0; index<kopillate.length; index++){
            if(kopillate[index] != null){
                totalkopilatte++;
            }
        }
        int totalkopigoncangjiwa=0;
        for(int index=0; index<kopigoncangjiwa.length; index++){
            if(kopigoncangjiwa[index] != null){
                totalkopigoncangjiwa++;
            }
        }
        int totalkopijalankenangan=0;
        for(int index=0; index<kopijalankenangan.length; index++){
            if(kopijalankenangan[index] != null){
                totalkopijalankenangan++;
            }
        }
        int totalkopipahittanparasa=0;
        for(int index=0; index<kopipahittanparasa.length; index++){
            if(kopipahittanparasa[index] != null){
                totalkopipahittanparasa++;
            }
        }
        PrintInfoTransaksi(totalkopilatte, totalkopigoncangjiwa, totalkopijalankenangan, totalkopipahittanparasa);
    }
    public static void PrintInfoTransaksi(int latte, int goncang, int kenangan, int pahit){
        int sisakopilate = kopillate.length - latte;
        int sisakopigoncang = kopigoncangjiwa.length - goncang;
        int sisakopikenangan = kopijalankenangan.length - kenangan;
        int sisakopipahit = kopipahittanparasa.length - pahit;
        int totalterjual = latte+goncang+kenangan+pahit;
        int sisakopi = sisakopilate+sisakopigoncang+sisakopikenangan+sisakopipahit;
//        Max(sisakopilate, sisakopigoncang, sisakopikenangan, sisakopipahit);
        System.out.println("Pembeli Kopi Latte Don't Be Late : " + latte + " | Sisa Kopi Latte Don't Be Late : " + sisakopilate);
        System.out.println("Pembeli Kopi Goncang Jiwa : " + goncang + " | Sisa Kopi Goncang Jiwa : " + sisakopigoncang);
        System.out.println("Pembeli Kopi Jalan Kenangan : " + kenangan + " | Sisa Kopi Jalan Kenangan : " + sisakopikenangan);
        System.out.println("Pembeli Kopi Pahit Tanpa Rasa : " + pahit + " | Sisa Kopi Pahit Tanpa Rasa : " + sisakopipahit);
        System.out.println("=====================================================================");
        System.out.println("Total Kopi Terjual : " + totalterjual);
        System.out.println("Total Kopi Tersisa : " + sisakopi );
    }
    // Bingung Kenapa ini tidak Jalan
//    public static void Max(int a, int b, int c, int d){
//        if(a>(b+c+d)){
//            System.out.println("Kopi Paling Disuaki Adalah Kopi Latte Don't Be Late, terjual : " + a + " cup");
//        }else if(b>(a+c+d)){
//            System.out.println("Kopi Paling Disuaki Adalah Kopi Goncang Jiwa, terjual : " + b + " cup");
//        }else if(c>(a+b+d)){
//            System.out.println("Kopi Paling Disuaki Adalah Kopi Jalan Kenangan, terjual : " + c + " cup");
//        }else if(d>(a+b+c)){
//            System.out.println("Kopi Paling Disuaki Adalah Kopi Pahit Tanpa Rasa, terjual : " + d + " cup");
//        }
//    }
    public static void CheckIndexArray(String[] myArray, String kopi){
        int indexNow=0;
        for(int index=0; index<myArray.length; index++){
            if(myArray[index] != null){
                indexNow = index+1;
            }
        }
        if(indexNow < myArray.length){
            myArray[indexNow] = kopi;
        }
    }
    public static void Menu(int pilihan, String pembeli){
        switch (pilihan){
            case 1:
                CheckIndexArray(kopillate,pembeli);
                System.out.println("Anda Memesan Kopi Latte Don't Be Latte");
                System.out.println("==========================================");
                Transaksi();
                break;
            case 2:
                CheckIndexArray(kopigoncangjiwa,pembeli);
                System.out.println("Anda Memesan Kopi Goncang Jiwa");
                System.out.println("==========================================");
                Transaksi();
                break;
            case 3:
                CheckIndexArray(kopijalankenangan,pembeli);
                System.out.println("Anda Memesan Kopi Jalan Kenangan");
                System.out.println("==========================================");
                Transaksi();
                break;
            case 4:
                CheckIndexArray(kopipahittanparasa,pembeli);
                System.out.println("Anda Memesan Kopi Pahit Tanpa Rasa");
                System.out.println("==========================================");
                Transaksi();
                break;
        }
    }
    public static void inputPilihan(){
        Scanner inputData = new Scanner(System.in);
        while(true){
            System.out.print("Masukkan Nama Pembeli : ");
            String nama = inputData.next();
            System.out.println("1. Kopi Latte Don't Be Late \n"+"2. Kopi Goncang Jiwa \n"+"3. Kopi Jalan Kenangan \n"+"4. Kopi Pahit Tanpa Rasa \n");
            System.out.print("Masukkan Pilihan : ");
            int pilihan = inputData.nextInt();
                Menu(pilihan,nama);
            }
        }

    public static void main(String[] args) {

        inputPilihan();
    }
}
