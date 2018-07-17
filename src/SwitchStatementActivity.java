import java.util.Scanner;

public class SwitchStatementActivity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Code");
        String code = sc.next();

        String item;
        switch (code) {
            case "BALL":
                item = "Golf Balls (1 dozen)\t $38.00";
                break;

            case "DRV01":
                item = "Big Bertha Driver\t $449.95";
                break;

            case "DRV02":
                item = "Vaporizer Driver\t $375.00";
                break;

            case "DRV03":
                item = "Fly-Z Driver\t $179.00";
                break;

            case "SET01":
                item = "Project Manager Gold Club Set\t $179.00";
                break;

            case "SET02":
                item = "Junior VP Golf Club Set\t $225.00";
                break;

            case "SET03":
                item = "Executive Golf Club Set\t $299.95";
                break;

            case "SET04":
                item = "CEO Golf Club Set\t $374.95";
                break;

            case "SET05":
                item = "Chairman of the Board Club Set\t $495.00";
                break;

            default:
                item = "Item cannot be found.";
        }

        System.out.println(item);

    }
}

/**//*
Create a program for the Hole in Ten Golf Company. It will prompt the user for a product code. The program will then display the corresponding price and description from the table below.

    Use switches and number formats!

    Code	Description	Price
    BALL	Golf Balls (1 dozen)	$38.00
    DRV01	Big Bertha Driver	$449.95
    DRV02	Vaporizer Driver	$375.00
    DRV03	Fly-Z Driver	$179.00
    SET01	Project Manager Gold Club Set	$179.00
    SET02	Junior VP Golf Club Set	$225.00
    SET03	Executive Golf Club Set	$299.95
    SET04	CEO Golf Club Set	$374.95
    SET05	Chairman of the Board Club Set	$495.00


    Previous Next
*/
