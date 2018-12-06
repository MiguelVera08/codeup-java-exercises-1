public class DavidIsLazy {
    public static void main(String[] args) {
        int g = 27;
        String message = "";
        for (int i = 1; i <= 26; i++) {
            for (int j = 1; j <= 26; j++) {
                if (i == j) {
                    break;
                } else {
                    if (("" + g).length() == 1) {
                        message += "('0000" + g + "', '";
                    } else if (("" + g).length() == 2) {
                        message += "('000" + g + "', '";
                    }  else if (("" + g).length() == 3) {
                        message += "('00" + g + "', '";
                    } else if (("" + g).length() == 4) {
                        message += "('0" + g + "', '";
                    } else {
                        message += "('" + g + "', '";
                    }

                    if (("" + i).length() == 1) {
                        message += "00" + i + "'), ";
                    } else if (("" + i).length() == 2) {
                        message += "0" + i + "'), ";
                    } else {
                        message += i + "'), ";
                    }

                    if (("" + g).length() == 1) {
                        message += "('0000" + g + "', '";
                    } else if (("" + g).length() == 2) {
                        message += "('000" + g + "', '";
                    }  else if (("" + g).length() == 3) {
                        message += "('00" + g + "', '";
                    } else if (("" + g).length() == 4) {
                        message += "('0" + g + "', '";
                    } else {
                        message += "('" + g + "', '";
                    }

                    if (("" + j).length() == 1) {
                        message += "00" + j + "'), ";
                    } else if (("" + j).length() == 2) {
                        message += "0" + j + "'), ";
                    } else {
                        message += j + "'), ";
                    }

                    System.out.println(message);
                    g++;
                }
            }
        }
    }
}
