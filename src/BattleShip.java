import util.Input;

public class BattleShip {
    private static Input sc = new Input();

    public int oneOrTwo() {
        return (int) (Math.random() * 1) + 1;
    }

    private int oneThruTen() {
        return (int) (Math.random() * 9) + 1;
    }

    public String giveALetter() {
        int magicNumber = this.oneThruTen();
        switch (magicNumber) {
            case(1):
                return "A";
            case(2):
                return "B";
            case(3):
                return "C";
            case(4):
                return "D";
            case(5):
                return "E";
            case(6):
                return "F";
            case(7):
                return "G";
            case(8):
                return "H";
            case(9):
                return "I";
            default:
                return "J";
        }
    }

    private static String [][] gameBoard = {
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
    };

    private void missShip(int num1, int num2) {
        gameBoard[num1][num2] = "/";
    }

    private static void placeShip(int num1, int num2) {
        gameBoard[num1][num2] = "=";
    }

    private void shipHit(int num1, int num2) {
        if (gameBoard[num1][num2].equalsIgnoreCase("=")) {
            System.out.println("Ship hit!");
            gameBoard[num1][num2] = "X";
        }
    }

    private static void placeDestroyer() {
        System.out.println("Input a letter (a-j) and a number (1-10) to place Destroyer.");
            String coordinates = sc.getString().toLowerCase();
            int letter = 0;
            int num;
            if (coordinates.length() == 3) {
                num = Integer.parseInt(coordinates.substring(1, 3));
            } else {
                num = Integer.parseInt(coordinates.substring(1, 2));
            }
            num -= 1;
            if (num <= 9) {
                switch (coordinates.substring(0, 1)) {
                    case ("a"):
                        break;
                    case ("b"):
                        letter = 1;
                        break;
                    case ("c"):
                        letter = 2;
                        break;
                    case ("d"):
                        letter = 3;
                        break;
                    case ("e"):
                        letter = 4;
                        break;
                    case ("f"):
                        letter = 5;
                        break;
                    case ("g"):
                        letter = 6;
                        break;
                    case ("h"):
                        letter = 7;
                        break;
                    case ("i"):
                        letter = 8;
                        break;
                    case ("j"):
                        letter = 9;
                        break;
                    default:
                        placeDestroyer();
                }
                if (num == 9 && letter == 9) {
                    boolean undecided = true;
                    while (undecided) {
                        System.out.println("Would you like to place this piece vertically?");
                        boolean answer = sc.yesNo();
                        if (!answer) {
                            System.out.println("Would you like to place this piece horizontally?");
                            boolean newAnswer = sc.yesNo();
                            if (newAnswer) {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                undecided = false;
                            }
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            undecided = false;
                        }
                    }
                } else if (num < 9 && letter == 9) {
                    placeShip(letter, num);
                    placeShip(letter, num + 1);
                } else if (num == 9 && letter < 9) {
                    placeShip(letter, num);
                    placeShip(letter + 1, num);
                } else {
                    boolean undecided = true;
                    while (undecided) {
                        System.out.println("Would you like to place this piece vertically?");
                        boolean answer = sc.yesNo();
                        if (!answer) {
                            System.out.println("Would you like to place this piece horizontally?");
                            boolean newAnswer = sc.yesNo();
                            if (newAnswer) {
                                placeShip(letter, num);
                                placeShip(letter, num + 1);
                                undecided = false;
                            }
                        } else {
                            placeShip(letter, num);
                            placeShip(letter + 1, num);
                            undecided = false;
                        }
                    }
                }
            } else {
                placeDestroyer();
            }
    }

    private static void placeSubmarine() {
        System.out.println("Input a letter (a-j) and a number (1-10) to place Submarine.");
        String coordinates = sc.getString().toLowerCase();
        int letter = 0;
        int num;
        if (coordinates.length() == 3) {
            num = Integer.parseInt(coordinates.substring(1, 3));
        } else {
            num = Integer.parseInt(coordinates.substring(1, 2));
        }
        num -= 1;
        if (num <= 9) {
            switch (coordinates.substring(0, 1)) {
                case ("a"):
                    break;
                case ("b"):
                    letter = 1;
                    break;
                case ("c"):
                    letter = 2;
                    break;
                case ("d"):
                    letter = 3;
                    break;
                case ("e"):
                    letter = 4;
                    break;
                case ("f"):
                    letter = 5;
                    break;
                case ("g"):
                    letter = 6;
                    break;
                case ("h"):
                    letter = 7;
                    break;
                case ("i"):
                    letter = 8;
                    break;
                case ("j"):
                    letter = 9;
                    break;
                default:
                    placeSubmarine();
            }
            if (num == 9 && letter == 9) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num - 2].equalsIgnoreCase("=")){
                                undecided = false;
                                placeSubmarine();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num - 2);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter - 2][num].equalsIgnoreCase("=")){
                            undecided = false;
                            placeSubmarine();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter - 2, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 8 && letter == 9) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=")){
                                undecided = false;
                                placeSubmarine();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num + 1);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter - 2][num].equalsIgnoreCase("=")){
                            undecided = false;
                            placeSubmarine();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter - 2, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 9 && letter == 8) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num - 2].equalsIgnoreCase("=")){
                                undecided = false;
                                placeSubmarine();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num - 2);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=")){
                            undecided = false;
                            placeSubmarine();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter + 1, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 9 && letter < 8){
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num - 2].equalsIgnoreCase("=")){
                                undecided = false;
                                placeSubmarine();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num - 2);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=") || gameBoard[letter + 2][num].equalsIgnoreCase("=")){
                            undecided = false;
                            placeSubmarine();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter + 1, num);
                            placeShip(letter + 2, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num < 8 && letter == 9){
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=") || gameBoard[letter][num + 2].equalsIgnoreCase("=")){
                                undecided = false;
                                placeSubmarine();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num + 1);
                                placeShip(letter, num + 2);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter - 2][num].equalsIgnoreCase("=")){
                            undecided = false;
                            placeSubmarine();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter - 2, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 8 && letter == 8){
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=")){
                                undecided = false;
                                placeSubmarine();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num + 1);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=")){
                            undecided = false;
                            placeSubmarine();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter + 1, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 8 && letter < 8){
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=")){
                                undecided = false;
                                placeSubmarine();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num + 1);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=") || gameBoard[letter + 2][num].equalsIgnoreCase("=")){
                            undecided = false;
                            placeSubmarine();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter + 1, num);
                            placeShip(letter + 2, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num < 8 && letter == 8){
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=") || gameBoard[letter][num + 2].equalsIgnoreCase("=")){
                                undecided = false;
                                placeSubmarine();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num + 1);
                                placeShip(letter, num + 2);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=")){
                            undecided = false;
                            placeSubmarine();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter + 1, num);
                            undecided = false;
                        }
                    }
                }
            } else {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=") || gameBoard[letter][num + 2].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeSubmarine();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num + 1);
                                placeShip(letter, num + 2);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=") || gameBoard[letter + 2][num].equalsIgnoreCase("=")){
                            undecided = false;
                            placeSubmarine();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter + 1, num);
                            placeShip(letter + 2, num);
                            undecided = false;
                        }
                    }
                }
            }
        } else {
            placeSubmarine();
        }
    }

    private static void placeCruiser() {
        System.out.println("Input a letter (a-j) and a number (1-10) to place Cruiser.");
        String coordinates = sc.getString().toLowerCase();
        int letter = 0;
        int num;
        if (coordinates.length() == 3) {
            num = Integer.parseInt(coordinates.substring(1, 3));
        } else {
            num = Integer.parseInt(coordinates.substring(1, 2));
        }
        num -= 1;
        if (num <= 9) {
            switch (coordinates.substring(0, 1)) {
                case ("a"):
                    break;
                case ("b"):
                    letter = 1;
                    break;
                case ("c"):
                    letter = 2;
                    break;
                case ("d"):
                    letter = 3;
                    break;
                case ("e"):
                    letter = 4;
                    break;
                case ("f"):
                    letter = 5;
                    break;
                case ("g"):
                    letter = 6;
                    break;
                case ("h"):
                    letter = 7;
                    break;
                case ("i"):
                    letter = 8;
                    break;
                case ("j"):
                    letter = 9;
                    break;
                default:
                    placeCruiser();
            }
            if (num == 9 && letter == 9) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num - 2].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeCruiser();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num - 2);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter - 2][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeCruiser();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter - 2, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 8 && letter == 9) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeCruiser();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num + 1);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter - 2][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeCruiser();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter - 2, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 9 && letter == 8) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num - 2].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeCruiser();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num - 2);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeCruiser();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter + 1, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 9 && letter < 8) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num - 2].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeCruiser();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num - 2);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=") || gameBoard[letter + 2][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeCruiser();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter + 1, num);
                            placeShip(letter + 2, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num < 8 && letter == 9) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=") || gameBoard[letter][num + 2].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeCruiser();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num + 1);
                                placeShip(letter, num + 2);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter - 2][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeCruiser();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter - 2, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 8 && letter == 8) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeCruiser();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num + 1);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeCruiser();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter + 1, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 8 && letter < 8) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeCruiser();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num + 1);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=") || gameBoard[letter + 2][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeCruiser();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter + 1, num);
                            placeShip(letter + 2, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num < 8 && letter == 8) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=") || gameBoard[letter][num + 2].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeCruiser();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num + 1);
                                placeShip(letter, num + 2);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeCruiser();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter + 1, num);
                            undecided = false;
                        }
                    }
                }
            } else {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=") || gameBoard[letter][num + 2].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeCruiser();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num + 1);
                                placeShip(letter, num + 2);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=") || gameBoard[letter + 2][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeCruiser();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter + 1, num);
                            placeShip(letter + 2, num);
                            undecided = false;
                        }
                    }
                }
            }
        } else {
            placeCruiser();
        }
    }

    private static void placeBattleship() {
        System.out.println("Input a letter (a-j) and a number (1-10) to place Battleship.");
        String coordinates = sc.getString().toLowerCase();
        int letter = 0;
        int num;
        if (coordinates.length() == 3) {
            num = Integer.parseInt(coordinates.substring(1, 3));
        } else {
            num = Integer.parseInt(coordinates.substring(1, 2));
        }
        num -= 1;
        if (num <= 9) {
            switch (coordinates.substring(0, 1)) {
                case ("a"):
                    break;
                case ("b"):
                    letter = 1;
                    break;
                case ("c"):
                    letter = 2;
                    break;
                case ("d"):
                    letter = 3;
                    break;
                case ("e"):
                    letter = 4;
                    break;
                case ("f"):
                    letter = 5;
                    break;
                case ("g"):
                    letter = 6;
                    break;
                case ("h"):
                    letter = 7;
                    break;
                case ("i"):
                    letter = 8;
                    break;
                case ("j"):
                    letter = 9;
                    break;
                default:
                    placeBattleship();
            }
            if (num == 9 && letter == 9) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num - 2].equalsIgnoreCase("=") || gameBoard[letter][num - 3].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num - 2);
                                placeShip(letter, num - 3);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter - 2][num].equalsIgnoreCase("=") || gameBoard[letter - 3][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter - 2, num);
                            placeShip(letter - 3, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 8 && letter == 9) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 2].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 2);
                                placeShip(letter, num - 1);
                                placeShip(letter, num + 1);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter - 2][num].equalsIgnoreCase("=") || gameBoard[letter - 3][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter - 2, num);
                            placeShip(letter - 3, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 9 && letter == 8) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num - 2].equalsIgnoreCase("=") || gameBoard[letter][num - 3].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num - 2);
                                placeShip(letter, num - 3);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 2][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 2, num);
                            placeShip(letter - 1, num);
                            placeShip(letter + 1, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 9 && letter < 7) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num - 2].equalsIgnoreCase("=") || gameBoard[letter][num - 3].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num - 2);
                                placeShip(letter, num - 3);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=") || gameBoard[letter + 2][num].equalsIgnoreCase("=") || gameBoard[letter + 3][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter + 1, num);
                            placeShip(letter + 2, num);
                            placeShip(letter + 3, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num < 7 && letter == 9) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=") || gameBoard[letter][num + 2].equalsIgnoreCase("=") || gameBoard[letter][num + 3].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num + 1);
                                placeShip(letter, num + 2);
                                placeShip(letter, num + 3);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter - 2][num].equalsIgnoreCase("=") || gameBoard[letter - 3][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter - 2, num);
                            placeShip(letter - 3, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 8 && letter == 8) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 2].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 2);
                                placeShip(letter, num - 1);
                                placeShip(letter, num + 1);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 2][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 2, num);
                            placeShip(letter - 1, num);
                            placeShip(letter + 1, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 8 && letter < 7) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 2].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 2);
                                placeShip(letter, num - 1);
                                placeShip(letter, num + 1);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=") || gameBoard[letter + 2][num].equalsIgnoreCase("=") || gameBoard[letter + 3][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter + 1, num);
                            placeShip(letter + 2, num);
                            placeShip(letter + 3, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num < 7 && letter == 8) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=") || gameBoard[letter][num + 2].equalsIgnoreCase("=") || gameBoard[letter][num + 3].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num + 1);
                                placeShip(letter, num + 2);
                                placeShip(letter, num + 3);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 2][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 2, num);
                            placeShip(letter - 1, num);
                            placeShip(letter + 1, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 7 && letter == 7) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=") || gameBoard[letter][num + 2].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num + 1);
                                placeShip(letter, num + 2);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=") || gameBoard[letter + 2][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter + 1, num);
                            placeShip(letter + 2, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 7 && letter < 7) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=") || gameBoard[letter][num + 2].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num + 1);
                                placeShip(letter, num + 2);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=") || gameBoard[letter + 2][num].equalsIgnoreCase("=") || gameBoard[letter + 3][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter + 1, num);
                            placeShip(letter + 2, num);
                            placeShip(letter + 3, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num < 7 && letter == 7) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=") || gameBoard[letter][num + 2].equalsIgnoreCase("=") || gameBoard[letter][num + 3].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num + 1);
                                placeShip(letter, num + 2);
                                placeShip(letter, num + 3);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=") || gameBoard[letter + 2][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter + 1, num);
                            placeShip(letter + 2, num);
                            undecided = false;
                        }
                    }
                }
            } else {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=") || gameBoard[letter][num + 2].equalsIgnoreCase("=") || gameBoard[letter][num + 3].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num + 1);
                                placeShip(letter, num + 2);
                                placeShip(letter, num + 3);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=") || gameBoard[letter + 2][num].equalsIgnoreCase("=") || gameBoard[letter + 3][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter + 1, num);
                            placeShip(letter + 2, num);
                            placeShip(letter + 3, num);
                            undecided = false;
                        }
                    }
                }
            }
        } else {
            placeBattleship();
        }
    }

    private static void placeCarrier() {
        System.out.println("Input a letter (a-j) and a number (1-10) to place Aircraft Carrier.");
        String coordinates = sc.getString().toLowerCase();
        int letter = 0;
        int num;
        if (coordinates.length() == 3) {
            num = Integer.parseInt(coordinates.substring(1, 3));
        } else {
            num = Integer.parseInt(coordinates.substring(1, 2));
        }
        num -= 1;
        if (num <= 9) {
            switch (coordinates.substring(0, 1)) {
                case ("a"):
                    break;
                case ("b"):
                    letter = 1;
                    break;
                case ("c"):
                    letter = 2;
                    break;
                case ("d"):
                    letter = 3;
                    break;
                case ("e"):
                    letter = 4;
                    break;
                case ("f"):
                    letter = 5;
                    break;
                case ("g"):
                    letter = 6;
                    break;
                case ("h"):
                    letter = 7;
                    break;
                case ("i"):
                    letter = 8;
                    break;
                case ("j"):
                    letter = 9;
                    break;
                default:
                    placeBattleship();
            }
            if (num == 9 && letter == 9) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num - 2].equalsIgnoreCase("=") || gameBoard[letter][num - 3].equalsIgnoreCase("=") || gameBoard[letter][num - 4].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeCarrier();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num - 2);
                                placeShip(letter, num - 3);
                                placeShip(letter, num - 4);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter - 2][num].equalsIgnoreCase("=") || gameBoard[letter - 3][num].equalsIgnoreCase("=") || gameBoard[letter - 4][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeCarrier();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter - 2, num);
                            placeShip(letter - 3, num);
                            placeShip(letter - 4, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 8 && letter == 9) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 3].equalsIgnoreCase("=") || gameBoard[letter][num - 2].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeCarrier();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 3);
                                placeShip(letter, num - 2);
                                placeShip(letter, num - 1);
                                placeShip(letter, num + 1);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter - 2][num].equalsIgnoreCase("=") || gameBoard[letter - 3][num].equalsIgnoreCase("=") || gameBoard[letter - 4][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeCarrier();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter - 2, num);
                            placeShip(letter - 3, num);
                            placeShip(letter - 4, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 9 && letter == 8) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num - 2].equalsIgnoreCase("=") || gameBoard[letter][num - 3].equalsIgnoreCase("=") || gameBoard[letter][num - 4].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeCarrier();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num - 2);
                                placeShip(letter, num - 3);
                                placeShip(letter, num - 4);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 3][num].equalsIgnoreCase("=") || gameBoard[letter - 2][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeCarrier();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 3, num);
                            placeShip(letter - 2, num);
                            placeShip(letter - 1, num);
                            placeShip(letter + 1, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 9 && letter == 7) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num - 2].equalsIgnoreCase("=") || gameBoard[letter][num - 3].equalsIgnoreCase("=") || gameBoard[letter][num - 4].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num - 2);
                                placeShip(letter, num - 3);
                                placeShip(letter, num - 4);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=") || gameBoard[letter + 2][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter - 2][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter - 2, num);
                            placeShip(letter - 1, num);
                            placeShip(letter, num);
                            placeShip(letter + 1, num);
                            placeShip(letter + 2, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num < 7 && letter == 9) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=") || gameBoard[letter][num + 2].equalsIgnoreCase("=") || gameBoard[letter][num + 3].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num + 1);
                                placeShip(letter, num + 2);
                                placeShip(letter, num - 1);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter - 2][num].equalsIgnoreCase("=") || gameBoard[letter - 3][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter - 2, num);
                            placeShip(letter - 3, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 8 && letter == 8) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 2].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 2);
                                placeShip(letter, num - 1);
                                placeShip(letter, num + 1);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 2][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 2, num);
                            placeShip(letter - 1, num);
                            placeShip(letter + 1, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 8 && letter < 7) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 2].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 2);
                                placeShip(letter, num - 1);
                                placeShip(letter, num + 1);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=") || gameBoard[letter + 2][num].equalsIgnoreCase("=") || gameBoard[letter + 3][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter + 1, num);
                            placeShip(letter + 2, num);
                            placeShip(letter + 3, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num < 7 && letter == 8) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=") || gameBoard[letter][num + 2].equalsIgnoreCase("=") || gameBoard[letter][num + 3].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num + 1);
                                placeShip(letter, num + 2);
                                placeShip(letter, num + 3);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 2][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 2, num);
                            placeShip(letter - 1, num);
                            placeShip(letter + 1, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 7 && letter == 7) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=") || gameBoard[letter][num + 2].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num + 1);
                                placeShip(letter, num + 2);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=") || gameBoard[letter + 2][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter + 1, num);
                            placeShip(letter + 2, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num == 7 && letter < 7) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num - 1].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=") || gameBoard[letter][num + 2].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num - 1);
                                placeShip(letter, num + 1);
                                placeShip(letter, num + 2);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=") || gameBoard[letter + 2][num].equalsIgnoreCase("=") || gameBoard[letter + 3][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter + 1, num);
                            placeShip(letter + 2, num);
                            placeShip(letter + 3, num);
                            undecided = false;
                        }
                    }
                }
            } else if (num < 7 && letter == 7) {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=") || gameBoard[letter][num + 2].equalsIgnoreCase("=") || gameBoard[letter][num + 3].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num + 1);
                                placeShip(letter, num + 2);
                                placeShip(letter, num + 3);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter - 1][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=") || gameBoard[letter + 2][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter - 1, num);
                            placeShip(letter + 1, num);
                            placeShip(letter + 2, num);
                            undecided = false;
                        }
                    }
                }
            } else {
                boolean undecided = true;
                while (undecided) {
                    System.out.println("Would you like to place this piece vertically?");
                    boolean answer = sc.yesNo();
                    if (!answer) {
                        System.out.println("Would you like to place this piece horizontally?");
                        boolean newAnswer = sc.yesNo();
                        if (newAnswer) {
                            if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter][num + 1].equalsIgnoreCase("=") || gameBoard[letter][num + 2].equalsIgnoreCase("=") || gameBoard[letter][num + 3].equalsIgnoreCase("=")) {
                                undecided = false;
                                placeBattleship();
                            } else {
                                placeShip(letter, num);
                                placeShip(letter, num + 1);
                                placeShip(letter, num + 2);
                                placeShip(letter, num + 3);
                                undecided = false;
                            }
                        }
                    } else {
                        if (gameBoard[letter][num].equalsIgnoreCase("=") || gameBoard[letter + 1][num].equalsIgnoreCase("=") || gameBoard[letter + 2][num].equalsIgnoreCase("=") || gameBoard[letter + 3][num].equalsIgnoreCase("=")) {
                            undecided = false;
                            placeBattleship();
                        } else {
                            placeShip(letter, num);
                            placeShip(letter + 1, num);
                            placeShip(letter + 2, num);
                            placeShip(letter + 3, num);
                            undecided = false;
                        }
                    }
                }
            }
        } else {
            placeBattleship();
        }
    }

    public static void buildBoard() {
        for (int i = 0; i < gameBoard.length;i++) {
            if (i == 0) {
                System.out.println("+===~~~---** Player's  Board **---~~~===+");
            } else {
                System.out.println("+===~~~---**---**~~~*~~~**---**---~~~===+");
            }
            System.out.print("| ");
            for (String field : gameBoard [i]) {
                System.out.print(field + " | ");
            }
            System.out.println();
        }
        System.out.println("+===~~~---**---**~~~*~~~**---**---~~~===+");
    }

    public static void main(String[] args) {
        placeDestroyer();
        placeSubmarine();
        placeCruiser();
        placeBattleship();
        buildBoard();
    }

}
