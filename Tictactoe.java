import java.util.Random;
import java.util.Scanner;

public class Tictactoe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean end = false;
        String topleft = " ";
        String left = " ";
        String bottomleft = " ";
        String top = " ";
        String middle = " ";
        String bottom = " ";
        String topright = " ";
        String right = " ";
        String bottomright = " ";
        int x = 0;
        int k = 0;
        boolean entry = false;
        Random rand = new Random();
        System.out.println("Would you like to face a Player or the computer?");
        String comp = scan.nextLine().toLowerCase();
        while (entry == false) {
            if (!comp.equals("player") && !comp.equals("computer")) {
                System.out.println("Please enter Player or Computer.");
                comp = scan.nextLine().toLowerCase();
            } else {
                entry = true;
            }
        }
        if (comp.equals("computer")) {
            while (end == false) {
                if (x % 2 == 0) {
                    while(k == 0) {
                        System.out.print(topleft + "|");
                        System.out.print(top + "|");
                        System.out.println(topright);
                        System.out.print(left + "|");
                        System.out.print(middle + "|");
                        System.out.println(right);
                        System.out.print(bottomleft + "|");
                        System.out.print(bottom + "|");
                        System.out.println(bottomright);
                        System.out.println("Player one choose where to put an x");
                        String input = scan.nextLine();
                        switch (input) {
                            case "topleft":
                            if (topleft.equals(" ")) {
                                topleft = "x";
                                k = 1;
                            }
                            else{
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "left":
                            if (left.equals(" ")) {
                                left = "x";
                                k = 1;
                            }
                            else {
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "bottomleft":
                            if (bottomleft.equals(" ")) {
                                bottomleft = "x";
                                k = 1;
                            }
                            else{
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "top":
                            if (top.equals(" ")) {
                                top = "x";
                                k = 1;
                            }
                            else {
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "middle":
                            if (middle.equals(" ")) {
                                middle = "x";
                                k = 1;
                            }
                            else {
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "bottom":
                            if (bottom.equals(" ")) {
                                bottom = "x";
                                k = 1;
                            }
                            else {
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "topright":
                            if (topright.equals(" ")) {
                                topright = "x";
                                k = 1;
                            }
                            else {
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "right":
                            if (right.equals(" ")) {
                                right = "x";
                                k = 1;
                            }
                            else {
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "bottomright":
                            if (bottomright.equals(" ")) {
                                bottomright = "x";
                                k = 1;
                            }
                            else { 
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            default:
                            System.out.println("Please enter a where you would like to put an x");
                            System.out.println("Eg: Top, Bottomleft, Right, etc");
                            break;
                        }
                    }
                }
                if (x % 2 == 1) {
                    while (k == 0) {
                        int p = rand.nextInt(10);
                        switch (p) {
                            case 1:
                            if (topleft.equals(" ")) {
                                topleft = "o";
                                k = 1;
                            }
                            break;
                            case 2:
                            if (left.equals(" ")) {
                                left = "o";
                                k = 1;
                            }
                            break;
                            case 3:
                            if (bottomleft.equals(" ")) {
                                bottomleft = "o";
                                k = 1;
                            }
                            break;
                            case 4:
                            if (top.equals(" ")) {
                                top = "o";
                                k = 1;
                            }
                            break;
                            case 5:
                            if (middle.equals(" ")) {
                                middle = "o";
                                k = 1;
                            }
                            break;
                            case 6:
                            if (bottom.equals(" ")) {
                                bottom = "o";
                                k = 1;
                            }
                            break;
                            case 7:
                            if (topright.equals(" ")) {
                                topright = "o";
                                k = 1;
                            }
                            break;
                            case 8:
                            if (right.equals(" ")) {
                                right = "o";
                                k = 1;
                            }
                            break;
                            case 9:
                            if (bottomright.equals(" ")) {
                                bottomright = "o";
                                k = 1;
                            }
                            break;
                        }
                    }
                }
                k = 0;
                x++;
                if (topleft.equals(top) && top.equals(topright) && !top.equals(" ")) {
                    end = true;
                }
                if (left.equals(middle) && middle.equals(right) && !middle.equals(" ")) {
                    end = true;
                }
                if (bottomleft.equals(bottom) && bottom.equals(bottomright) && !bottom.equals(" ")) {
                    end = true;
                }
                if (topleft.equals(left) && left.equals(bottomleft) && !left.equals(" ")) {
                    end = true;
                }
                if (top.equals(middle) && middle.equals(bottom) && !middle.equals(" ")) {
                    end = true;
                }
                if (topright.equals(right) && right.equals(bottomright) && !right.equals(" ")) {
                    end = true;
                }
                if (topleft.equals(middle) && middle.equals(bottomright) && !middle.equals(" ")) {
                    end = true;
                }
                if (topright.equals(middle) && middle.equals(bottomleft) && !middle.equals(" ")) {
                    end = true;
                }
                if (!topleft.equals(" ") && !top.equals(" ") && !topright.equals(" ")) {
                    if (!left.equals(" ") && !middle.equals(" ") && !right.equals(" ")) {
                        if (!bottomleft.equals(" ") && !bottom.equals(" ") && !bottomright.equals(" ")) {
                            System.out.println("This game was a tie!");
                            end = true;
                        }
                    }
                }
            }
        }
        else if (comp.equals("player")) {
            while (end == false) {
                if (x % 2 == 0) {
                    while(k == 0) {
                        System.out.print(topleft + "|");
                        System.out.print(top + "|");
                        System.out.println(topright);
                        System.out.print(left + "|");
                        System.out.print(middle + "|");
                        System.out.println(right);
                        System.out.print(bottomleft + "|");
                        System.out.print(bottom + "|");
                        System.out.println(bottomright);
                        System.out.println("Player one choose where to put an x");
                        String input = scan.nextLine();
                        switch (input) {
                            case "topleft":
                            if (topleft.equals(" ")) {
                                topleft = "x";
                                k = 1;
                            }
                            else{
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "left":
                            if (left.equals(" ")) {
                                left = "x";
                                k = 1;
                            }
                            else {
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "bottomleft":
                            if (bottomleft.equals(" ")) {
                                bottomleft = "x";
                                k = 1;
                            }
                            else{
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "top":
                            if (top.equals(" ")) {
                                top = "x";
                                k = 1;
                            }
                            else {
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "middle":
                            if (middle.equals(" ")) {
                                middle = "x";
                                k = 1;
                            }
                            else {
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "bottom":
                            if (bottom.equals(" ")) {
                                bottom = "x";
                                k = 1;
                            }
                            else {
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "topright":
                            if (topright.equals(" ")) {
                                topright = "x";
                                k = 1;
                            }
                            else {
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "right":
                            if (right.equals(" ")) {
                                right = "x";
                                k = 1;
                            }
                            else {
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "bottomright":
                            if (bottomright.equals(" ")) {
                                bottomright = "x";
                                k = 1;
                            }
                            else { 
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            default:
                            System.out.println("Please enter a where you would like to put an x");
                            System.out.println("Eg: Top, Bottomleft, Right, etc");
                            break;
                        }
                    }
                }
                if (x % 2 == 1) {
                    while(k == 0) {
                        System.out.print(topleft + "|");
                        System.out.print(top + "|");
                        System.out.println(topright);
                        System.out.print(left + "|");
                        System.out.print(middle + "|");
                        System.out.println(right);
                        System.out.print(bottomleft + "|");
                        System.out.print(bottom + "|");
                        System.out.println(bottomright);
                        System.out.println("Player two choose where to put an o");
                        String input = scan.nextLine();
                        switch (input) {
                            case "topleft":
                            if (topleft.equals(" ")) {
                                topleft = "o";
                                k = 1;
                            }
                            else{
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "left":
                            if (left.equals(" ")) {
                                left = "o";
                                k = 1;
                            }
                            else {
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "bottomleft":
                            if (bottomleft.equals(" ")) {
                                bottomleft = "o";
                                k = 1;
                            }
                            else{
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "top":
                            if (top.equals(" ")) {
                                top = "o";
                                k = 1;
                            }
                            else {
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "middle":
                            if (middle.equals(" ")) {
                                middle = "o";
                                k = 1;
                            }
                            else {
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "bottom":
                            if (bottom.equals(" ")) {
                                bottom = "o";
                                k = 1;
                            }
                            else {
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "topright":
                            if (topright.equals(" ")) {
                                topright = "o";
                                k = 1;
                            }
                            else {
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "right":
                            if (right.equals(" ")) {
                                right = "o";
                                k = 1;
                            }
                            else {
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            case "bottomright":
                            if (bottomright.equals(" ")) {
                                bottomright = "o";
                                k = 1;
                            }
                            else { 
                                System.out.println("Please enter a location that has not yet been taken");
                            }
                            break;
                            default:
                            System.out.println("Please enter a where you would like to put an xo");
                            System.out.println("Eg: Top, Bottomleft, Right, etc");
                            break;
                        }
                    }
                }
                k = 0;
                x++;
                if (topleft.equals(top) && top.equals(topright) && !top.equals(" ")) {
                    end = true;
                }
                if (left.equals(middle) && middle.equals(right) && !middle.equals(" ")) {
                    end = true;
                }
                if (bottomleft.equals(bottom) && bottom.equals(bottomright) && !bottom.equals(" ")) {
                    end = true;
                }
                if (topleft.equals(left) && left.equals(bottomleft) && !left.equals(" ")) {
                    end = true;
                }
                if (top.equals(middle) && middle.equals(bottom) && !middle.equals(" ")) {
                    end = true;
                }
                if (topright.equals(right) && right.equals(bottomright) && !right.equals(" ")) {
                    end = true;
                }
                if (topleft.equals(middle) && middle.equals(bottomright) && !middle.equals(" ")) {
                    end = true;
                }
                if (topright.equals(middle) && middle.equals(bottomleft) && !middle.equals(" ")) {
                    end = true;
                }
                if (!topleft.equals(" ") && !top.equals(" ") && !topright.equals(" ")) {
                    if (!left.equals(" ") && !middle.equals(" ") && !right.equals(" ")) {
                        if (!bottomleft.equals(" ") && !bottom.equals(" ") && !bottomright.equals(" ")) {
                            System.out.println("This game was a tie!");
                            end = true;
                        }
                    }
                }
            }
        }
        System.out.print(topleft + "|");
        System.out.print(top + "|");
        System.out.println(topright);
        System.out.print(left + "|");
        System.out.print(middle + "|");
        System.out.println(right);
        System.out.print(bottomleft + "|");
        System.out.print(bottom + "|");
        System.out.println(bottomright);
        if (x % 2 == 1) {
            System.out.println("Player 1 wins!");
        } else if (comp.equals("computer")) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
        scan.close();
    }
}