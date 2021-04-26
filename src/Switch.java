public class Switch {

    public static void valueSwitch(int value) {

//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        // More code here
        // Challenge below
        char charValue = 'A';

        switch (charValue) {

            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");
                break;

            default:
                System.out.println("Could not find A, B, C, D or E");
                break;
        }

        String month = "january";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
                break;


        }

        String month2 = "JuNE";
        switch(month2.toUpperCase()) {
            case "JANUARY":
                System.out.println("Jan");
                break;

            case "JUNE":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
                break;
        }
    }
}
