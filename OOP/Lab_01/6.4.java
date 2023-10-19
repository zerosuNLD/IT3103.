import java.util.Scanner;

class printDaysOfMonth
{
    private static boolean laThangHopLe(String monthInput)
    {
       String[] thangHopLe = 
       {
        "january", "jan.", "jan", "1",
        "february", "feb.", "feb", "2",
        "march", "mar.", "mar", "3",
        "aprill", "apr.", "apr", "4",
        "may", "5",
        "june", "jun", "6",
        "july","jul", "7",
        "august", "aug.","aug","8",
        "september", "sept.", "sep", "9",
        "october", "ort.", "ort", "10",
        "november", "nov.", "nov", "11",
        "december", "dec.", "dec", "12"
       };
       for(String thang: thangHopLe)
       {
        if(monthInput.equalsIgnoreCase(thang))
        {
            return true;
        }
       }
       return false;
    }

    private static boolean laNamHopLe(String yearInput)
    {
       return yearInput.matches("\\d+") && Integer.parseInt(yearInput) >= 0; 
    }

    private static boolean laNamNhuan(String years)
    {
        int nam = Integer.parseInt(years);
        if(nam % 4 == 0){
            if(nam % 100 == 0){
                if(nam % 400 == 0){
                    return true;
                }else return false;
            }else return true;
        } 
        return false;
    }

    private static int chuyenThangSangDangInt(String month)
    {
      switch (month.toLowerCase()) {
        case "january":
        case "jan.":
        case "jan":
        case "1":
            return 1;
      
        case "february":
        case "feb.":
        case "feb":
        case "2":
            return 2;
        
        case "march":
        case "mar":
        case "3":
            return 3;
        
        case "aprill":
        case "apr.":
        case "apr":
        case "4":
            return 4;

        case "may":
        case "5":
            return 5;

        case "june":
        case "jun":
        case "6":
            return 6;

        case "july":
        case "jul":
        case "7":
            return 7;

        case "august":
        case "aug.":
        case "aug":
        case "8":
            return 8;

        case "september":
        case "sept.":
        case "sep":
        case "9":
            return 9;

        case "october":
        case "oct.":
        case "oct":
        case "10":
            return 10;

        case "november":
        case "nov.":
        case "nov":
        case "11":
            return 11;

        case "december":
        case "dec.":
        case "dec":
        case "12":
            return 12;

        default:
            return -1;
      }  
    }

    private static int soNgayTrongThang(int thang, String nam)
    {
        if(thang == 4 || thang == 6 || thang == 9 || thang == 11)
        {
            return 30;
        }else if(thang == 2){
            if(laNamNhuan(nam)){
                return 29;
            }else return 28;
        }else{
            return 31;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true) 
        {
            System.out.print("Input a month: ");
            String month = sc.nextLine();
            System.out.print("Input a years: ");
            String years = sc.nextLine();
            if(laThangHopLe(month) && laNamHopLe(years))
            {

                System.out.println("So ngay cua nam " + years + " thang " + chuyenThangSangDangInt(month) + " la: "
                                     + soNgayTrongThang(chuyenThangSangDangInt(month),years));

                break;
            }else{
                System.out.println("Invalid input. Please enter a valid month and year.");
            }
        }
        sc.close();

        System.exit(0);
    }
}