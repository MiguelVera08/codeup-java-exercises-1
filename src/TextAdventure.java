import java.util.Scanner;

public class TextAdventure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String home = "You are at home in a comfortable cottage on the countryside when you are attacked by " +
                "a fierce and wild band of barbarians. Your dinner disrupted and your family slain, you are " +
                "the only survivor. Your heart is filled with rage and you must defeat the leader, Thor Oakenbelly, " +
                "in order to avenge your family, and your lost sandwich. Ahead of you is a door, which can be used " +
                "to exit out into the world, and wreckage surrounds your feet.";
        String homeAgain = "You reenter your home. The wreckage remains on the floor, and you are forced to relive the dark event that befell " +
                "your homestead. Thor Oakenbelly will pay for this!";
        String homeWithKnife = "You reenter your home. The wreckage has been cleared, as you searched for goods before hand. All that remains to be " +
                "done is exact revenge.";
        String wreckage = "You decide to search the wreckage for anything useful for your journey. In the rubble, you notice a knife " +
                "that had been left behind by the raiders. \n    GET KNIFE.";
        String frontYard = "You have exited into your front yard. Behind you is your cottage, ruined by arrows, and " +
                "only barely still standing despite the fire. You notice in front of you that all of your animals have been " +
                "killed. Before you are the remains of your cow, sheep, and dog. Your path may go west, north, or east.";
        String frontYardAgain = "You have returned to your front yard. Behind you is your cottage, ruined by arrows, and " +
                "only barely still standing despite the fire. You notice in front of you that all of your animals have been " +
                "killed. Before you are the remains of your cow, sheep, and dog. Your path may go west, north, or east.";
        String dog = "Upon inspecting your dog's corpse, you actually notice he was just playing dead. Happy to have atleast " +
                "one friend left in the world, you pat his head. You get up to move away, but the dog follows you. He too wants " +
                "revenge... \n    DOG ADDED TO PARTY.";
        String cow = "Inspecting your cow, you decide it best to not let anything go to waste. You go to strip the cow of it's hide, " +
                "but you lack a knife...";
        String cowWithKnife = "Inspecting your cow, you decide it best to not let anything go to waste. You go to strip the cow of it's hide, " +
                "and remember the knife you had picked up from the rubble. You skillfully strip the cow, and now have the hide for trade. " +
                "\n    GET COW HIDE.";
        String sheep = "Inspecting your sheep, you decide it best to let nothing go to waste. You go to strip the sheep of its hide, but " +
                "you don't have a knife...";
        String sheepWithKnife = "Inspecting your sheep, you decide it best to let nothing go to waste. You go to strip the sheep of it's hide, " +
                "and remember that you pulled a knife from the wreckage. You skillfully strip the sheep of it's hide. \n    GET WOOL.";
        String merchantVillage = "You are now in a village of merchants. Your society is one of barterers, and not one of money like many " +
                "of the merchants here. You see some vagrants on the street as well as a blacksmith. Your path can continue west" +
                " and north.";
        String merchantVillageNoVagrants = "You are now in a village of merchants. Your society is one of barterers, and not one of money like many " +
                "of the merchants here. You see a blacksmith. Your path can continue west and north.";
        String merchantVillageNoSmith = "You are now in a village of merchants. Your society is one of barterers, and not one of money like many " +
                "of the merchants here. You see some vagrants on the street. Your path can continue west and north.";
        String merchantVillageNoExtras = "You are now in a village of merchants. Your society is one of barterers, and not one of money like many " +
                "of the merchants here. Your path can continue west and north.";
        String vagrants = "You decide to talk to the vagrants. The vagrants, however, are too cold to say much of anything.";
        String vagrantsWithWool = "You decide to talk to the vagrants. The vagrants see that you are carrying wool, and ask for your sheep pelt. " +
                "They inform you that they have a lamp that they'd be willing to trade for your wool. The lamp does not have oil.\nTRADE FOR LAMP?";
        String noTrade = "You decide not to trade with the vagrants. They are unoffended, but return to shivering.";
        String yesTrade = "You decide to trade with the vagrants. They appreciate your willingness to help and give you the lamp." +
                "\n    WOOL LOST.\n    GET LAMP.";
        String blacksmith = "You decide to talk to the blacksmith. The blacksmith however, is uninterested in anything you have to offer, and ignores you.";
        String blacksmithWithHide = "You decide to talk to the blacksmith. The blacksmith is interested in your cowhide, and offers to give you " +
                "a free sword. He admits that it is not his best sword, but it is better than anyone else's in the village. You accept the trade. " +
                "You have little use for an untanned hide.\n    GET SWORD.";
        String merchants = "You decided to talk to the merchants. They have no interest in what you have to say, and you cannot " +
                "understand them.";
        String merchantsWithDog = "You decided to talk to the merchants. They notice your dog, and give it a loving pet. They have no interest in" +
                "what you have to say, and you cannot understand them.";


        boolean hasKnife = false;
        boolean hasDog = false;
        boolean hasHide = false;
        boolean hasWool = false;
        boolean hasLamp = false;
        boolean hasSword = false;
        boolean vagrantTrade = false;
        boolean smithTrade = false;

        // The actual Game itself...

        System.out.println(home);
        boolean inHome = true;
        while (inHome) {
            System.out.println("Now what?");
            String homeCommand = sc.nextLine();
            if (homeCommand.equalsIgnoreCase("Search Wreckage")) {
                System.out.println(wreckage);
                hasKnife = true;
            } else if (homeCommand.equalsIgnoreCase("Go To Door")){
                inHome = false;
            } else if (homeCommand.equalsIgnoreCase("Where Am I?")) {
                if (hasKnife) {
                    System.out.println(homeWithKnife);
                } else {
                    System.out.println(homeAgain);
                }
            } else {
                System.out.println("I don't understand \"" + homeCommand + ".\"");
            }
        }
        System.out.println(frontYard);
        boolean inYard = true;
        while (inYard) {
            System.out.println("Now what?");
            String yardCommand = sc.nextLine();
            if (yardCommand.equalsIgnoreCase("Search Dog")) {
                System.out.println(dog);
                hasDog = true;
            } else if (yardCommand.equalsIgnoreCase("Search Cow") && hasKnife == false) {
                System.out.println(cow);
            } else if (yardCommand.equalsIgnoreCase("Search Cow") && hasKnife == true) {
                System.out.println(cowWithKnife);
                hasHide = true;
            } else if (yardCommand.equalsIgnoreCase("Search Sheep") && hasKnife == false) {
                System.out.println(sheep);
            } else if (yardCommand.equalsIgnoreCase("Search Sheep") && hasKnife == true) {
                System.out.println(sheepWithKnife);
                hasWool = true;
            } else if (yardCommand.equalsIgnoreCase("Go To East")) {
                inHome = true;
                if (hasKnife) {
                    System.out.println(homeWithKnife);
                } else {
                    System.out.println(homeAgain);
                }
                while (inHome) {
                    System.out.println("Now what?");
                    String newHomeCommand = sc.nextLine();
                    if (newHomeCommand.equalsIgnoreCase("Search Wreckage")) {
                        System.out.println(wreckage);
                        hasKnife = true;
                    } else if (newHomeCommand.equalsIgnoreCase("Go To Door")){
                        inHome = false;
                    } else {
                        System.out.println("I don't understand \"" + newHomeCommand + ".\"");
                    }
                }
                System.out.println(frontYard);
            } else if (yardCommand.equalsIgnoreCase("Go To West") || yardCommand.equalsIgnoreCase("Go To North")) {
                inYard = false;
            } else if (yardCommand.equalsIgnoreCase("Where Am I")) {
                System.out.println(frontYard);
            } else {
                System.out.println("I don't understand \"" + yardCommand + ".\"");
            }
        }

    }
}
