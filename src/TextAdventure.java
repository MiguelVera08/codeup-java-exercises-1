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
        String frontYardNoSheepDog = "You have returned to your front yard. Behind you is your cottage, ruined by arrows, and " +
                "only barely still standing despite the fire. You notice in front of you that all of your animals have been " +
                "killed. Before you are the remains of your cow. Your path may go west, north, or east.";
        String frontYardNoCowDog = "You have returned to your front yard. Behind you is your cottage, ruined by arrows, and " +
                "only barely still standing despite the fire. You notice in front of you that all of your animals have been " +
                "killed. Before you are the remains of your sheep. Your path may go west, north, or east.";
        String frontYardNoSheepCow = "You have returned to your front yard. Behind you is your cottage, ruined by arrows, and " +
                "only barely still standing despite the fire. You notice in front of you that all of your animals have been " +
                "killed. Before you are the remains of your dog. Your path may go west, north, or east.";
        String frontYardNoSheep = "You have returned to your front yard. Behind you is your cottage, ruined by arrows, and " +
                "only barely still standing despite the fire. You notice in front of you that all of your animals have been " +
                "killed. Before you are the remains of your cow and dog. Your path may go west, north, or east.";
        String frontYardNoCow = "You have returned to your front yard. Behind you is your cottage, ruined by arrows, and " +
                "only barely still standing despite the fire. You notice in front of you that all of your animals have been " +
                "killed. Before you are the remains of your sheep and dog. Your path may go west, north, or east.";
        String frontYardNoDog = "You have returned to your front yard. Behind you is your cottage, ruined by arrows, and " +
                "only barely still standing despite the fire. You notice in front of you that all of your animals have been " +
                "killed. Before you are the remains of your cow and sheep. Your path may go west, north, or east.";
        String frontYardNoAnimals = "You have returned to your front yard. Behind you is your cottage, ruined by arrows, and " +
                "only barely still standing despite the fire. You notice in front of you that all of your animals have been " +
                "killed. Your path may go west, north, or east.";
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
                "of the merchants here. You see some vagrants on the street as well as a blacksmith. Your path can continue east" +
                " and north.";
        String merchantVillageNoVagrants = "You are now in a village of merchants. Your society is one of barterers, and not one of money like many " +
                "of the merchants here. You see a blacksmith. Your path can continue east and north.";
        String merchantVillageNoSmith = "You are now in a village of merchants. Your society is one of barterers, and not one of money like many " +
                "of the merchants here. You see some vagrants on the street. Your path can continue east and north.";
        String merchantVillageNoExtras = "You are now in a village of merchants. Your society is one of barterers, and not one of money like many " +
                "of the merchants here. Your path can continue east and north.";
        String vagrants = "You decide to talk to the vagrants. The vagrants, however, are too cold to say much of anything.";
        String vagrantsWithWool = "You decide to talk to the vagrants. The vagrants see that you are carrying wool, and ask for your sheep pelt. " +
                "They inform you that they have a lamp that they'd be willing to trade for your wool. The lamp does not have oil.\nTRADE FOR LAMP?";
        String noTrade = "You decide not to trade with the vagrants. They are unoffended, but return to shivering.";
        String yesTrade = "You decide to trade with the vagrants. They appreciate your willingness to help and give you the lamp." +
                "\n    WOOL LOST.\n    GET LAMP.";
        String blacksmith = "You decide to talk to the blacksmith. The blacksmith however, is uninterested in anything you have to offer, and ignores you.";
        String blacksmithWithHide = "You decide to talk to the blacksmith. The blacksmith is interested in your cowhide, and offers to give you " +
                "a free sword. He admits that it is not his best sword, but it is better than anyone else's in the village. You accept the trade. " +
                "You have little use for an untanned hide.\n    HIDE LOST.\n    GET SWORD.";
        String merchants = "You decided to talk to the merchants. They have no interest in what you have to say, and you cannot " +
                "understand them.";
        String merchantsWithDog = "You decided to talk to the merchants. They notice your dog, and give it a loving pet. They have no interest in " +
                "what you have to say, and you cannot understand them.";
        String harbor = "You find yourself at a harbor. Ahead of you, you see a crusty old fisherman, as well as, a group of sailors, and " +
                "a ferryman. Your path can continue east and south.";
        String fisherMan = "The fisherman notices you, but ignores you. You have nothing he wants.";
        String fisherManWithDog = "The fisherman notices you, but ignores you. He is more interested in your dog. He gives him a loving " +
                "pet, and some fish chow down on. Your belly grumbles at the thought of eating food, but the fisherman merely farts at " +
                "you. Well... at least your dog is happy.";
        String sailors = "The sailors are busy doing their job. You were raised not to bother people at work. The thought of talking to " +
                "them makes you ashamed of yourself.";
        String ferryman = "You decide to talk to the ferryman. He's a bit excitable for your tastes, but he does let you know he can get you " +
                "across the sea. However, without payment, it will be a one way trip.\n    GET ON BOAT?";
        String crossingSea = "You board the ferry. The ferryman inform you he used to be quite the womanizer back in the day. The " +
                "conversation makes you uncomfortable. Luckily, he doesn't try anything. You have landed on a new continent.";
        String noCross = "You step away from the ferryman, slowly.";
        String coast = "You have come to the coast of the ocean. Sand surrounds your feet. You remember that you hate sand. It's rough " +
                "coarse, and it gets everywhere... Your path can continue south and west.";
        String swim = "You decide to go for a swim. A giant shark emerges and looks very hungry. You are his favorite meal. \n    " +
                "YOUR GAME HAS ENDED. PLEASE RELOAD PROGRAM.";
        String swimWithDog = "You decide to go for a swim. A giant shark emerges and looks very hungry. Your dog is very eager " +
                "to protect you. He drags you away from the water, and the shark. Your dog is disappointed in you...";
        String sandCastle = "You decided to make a sand castle in memorial to your lost family. Your's is one hell of a weird society...";
        String coastWithSandCastle = "You have come to the coast of the ocean. Sand surrounds your feet. You remember that you hate sand. It's rough " +
                "coarse, and it gets everywhere... At least you still have your sand castle... Your path can continue south and west.";
        String destroySandCastle = "Your hatred of sand was too strong. With a swift kick, the castle is no more. You wonder why you " +
                "bothered wasting time making the crown molding...";
        String destroySandCastleAgain = "You try to destroy the sand castle but the effort is wasted. A hermit crab emerges from the castle. " +
                "It's kind of cute, actually. Nice little beard, nested itself in a bejeweled little shell. Not so cute, however, you see it " +
                "clutching a saber in its claw. It points the blade at you, and drops it. Before you can react, a battalion of crabs crawl onto you. " +
                "They all begin to pinch you. The pain is too much...\n    YOUR GAME HAS ENDED. PLEASE RELOAD PROGRAM.";
        String landFall = "You now find yourself in a new land. You can recognize that the language is the same as the merchants in the village " +
                "not far from your house. You never understood their language, however. Regardless, you see a pub, the ferryman and a bard. Your " +
                "path can continue north.";
        String sunvale = "You find yourself in the city of Sunvale. You can recognize that the language is the same as the merchants in the village " +
                "not far from your house. You never understood their language, however. Regardless, you see a pub, the ferryman and a bard. Your " +
                "path can continue north.";
        String pub = "You are now in a pub. Inside there are many loud and frankly, bit rude customers. The loud shouts of an argument " +
                "can be heard. There is the bartender and a shadowy figure in the corner of the pub. You may leave through the door.";
        String pubNoFigure = "You are now in a pub. Inside there are many loud and frankly, bit rude customers. The loud shouts of an argument " +
                "can be heard. There is the bartender. You may leave through the door.";
        String endArguement = "You walk over to attempt to end the argument. The meanest and tallest participant looks over at you. Your neck is " +
                "looking very twistable...\n    YOUR GAME HAS ENDED. PLEASE RELOAD PROGRAM.";
        String endArguementWithSword = "You walk over to end the argument. The meanest and tallest participant looks over at you. He notices the " +
                "sword you are carrying and backs down for the argument. However, you do see him motion to people behind you. They have now " +
                "blocked the exit...";
        String pubNoArguement = "You are now in a pub. Inside there are many loud and frankly, bit rude customers. The loud comments seem harmonious, " +
                "however. There is the bartender and a shady figure in the corner of the pub. You may not leave through the door.";
        String pubNoArguementNoFigure = "You are now in a pub. Inside there are many loud and frankly, bit rude customers. The loud comments seem harmonious, " +
                "however. There is the bartender. You may not leave through the door.";
        String blockedDoor = "Though you'd like to leave, the way is blocked by two burly men. Their arms are crossed.";
        String blockedDoorWithDog = "Though you'd like to leave, the way is blocked by two burly men. They notice your dog and give it loving " +
                "pets. However, whenever you try to sneak past they shove you back.";
        String bartender = "You approach the bartender. Luckily, you can understand him. He asks if you'd like anything to drink, on the house. " +
                "You ask for a beer, and are handed one. You ask the bartender for any information. He tells you he just moved here, actually, " +
                "and doesn't know a whole terrible lot about the city of Sunvale, i.e. where you are now, but perhaps the information broker in " +
                "the corner does. You finish your drink and return to the middle of the pub.";
        String shadowyFigure = "You go to talk to the shadowy figure, but it turns out to be a dress form. You feel a bit embarrassed, but " +
                "try to cover your stupidity by having a frank discussion about the growing feud between the orcs and goblins. Noticing that " +
                "no one is actually paying attention to you, you go red in the face and walk away from the dress form.";
        String infoBroker = "You go to the corner of the bar and decide to speak to the information broker. Luckily, you can understand him. " +
                "You begin to ask for information on Thor Oakenbelly, and are informed that his stronghold is on the continent. However, it's " +
                "exact location is unknown... for free. He knows your people are ones of barterers. He doesn't see anything worthwhile, though, and " +
                "informs you this conversation is over.";
        String infoBrokerWithLamp = "You go to the corner of the bar and decide to speak to the information broker. Luckily, you can understand him. " +
                "You begin to ask for information on Thor Oakenbelly, and are informed that his stronghold is on the continent. However, it's " +
                "exact location is unknown... for free. He knows your people are ones of barterers. He notices the lamp you are carrying. He " +
                "asks if the lamp was made by Leonardo Vivaldi, a name you've never heard of. He informs you, before you can respond, he can " +
                "trade the location for the lamp.\n    TRADE THE LAMP?";
        String tradeLamp = "You decide to trade the lamp. He tells you that Thor Oakenbelly can be found in the mountain village of Hooverdale. " +
                "You thank the information broker and go back to the middle of the pub.\n    LAMP LOST";
        String tradeLampNo = "You decide against trading the lamp. Perhaps it actually IS of greater value than originally thought...";
        String infoBrokerAgain = "You see the information broker fawning over that lamp you gave him. You decide it best to leave him alone.";
        String takeDressForm = "You decide to take the dress form. It's out of place here anyway.\n    GET DRESS FORM";
        String blockedDoorNoFigure = "Though you'd like to leave, the way is blocked by two burly men. You take the dress form you picked up " +
                "and hurl it at the two men. They are both bowled over and force the doors open as they fall. In the confusion you scurry out.\n    DRESS FORM LOST";
        String pubNoArguementNoFigureBroker = "You are now in a pub. Inside there are many loud and frankly, bit rude customers. The loud comments seem harmonious, " +
                "however. There is the bartender and an information broker in the corner of the pub. You may not leave through the door.";
        String pubBrokerNoFigure = "You are now in a pub. Inside there are many loud and frankly, bit rude customers. The loud shouts of an argument " +
                "can be heard. There is the bartender and an information broker in the corner of the pub. You may leave through the door.";
        String pubNoArguementBroker = "You are now in a pub. Inside there are many loud and frankly, bit rude customers. The loud comments seem harmonious, " +
                "however. There is the bartender, an information broker and a shadowy figure in the corner of the pub. You may not leave through the door.";
        String pubBroker = "You are now in a pub. Inside there are many loud and frankly, bit rude customers. The loud shouts of an argument " +
                "can be heard. There is the bartender, an information broker, and a shadowy figure in the corner of the pub. You may leave through the door.";
        String ferrymanAfterRide = "You go to talk to the ferryman, but it turns out you are talking to his twin brother. Your ferryman was arrested for tax evasion. The new ferryman " +
                "is not to keen on free rides. There is no talking to him, for now.";
        String ferrymanAfterRideDog = "You go to talk to the ferryman, but it turns out you are talking to his twin brother. Your ferryman was arrested for tax evasion. The new ferryman " +
                "is not to keen on free rides. He sees your dog and gives it a loving pet. There is no talking to him, for now.";
        String bard = "You decide to talk to the bard. He begins to regale you with tales of your conquests, all made up. You decide to not talk to the bard ever again.";
        String bardAgain = "You remember your promise to yourself. You will never talk to the bard ever again.";
        String valley = "You find yourself in a valley, with many beautiful flowers. ";

        boolean gameOver = false;
        boolean newGame = true;
        boolean inHome = false;
        boolean inYard = false;
        boolean inMV = false;
        boolean inHarbor = false;
        boolean inCoast = false;
        boolean inSunvale = false;
        boolean inPub = false;
        boolean hasKnife = false;
        boolean hasDog = false;
        boolean hasHide = false;
        boolean hasWool = false;
        boolean hasLamp = false;
        boolean hasSword = false;
        boolean hasDressForm = false;
        boolean dogIsDisAp = false;
        boolean builtSandCastle = false;
        boolean destroyedSandCastle = false;
        boolean tookFerry = false;
        boolean brokerFound = false;
        boolean doorBlocked = false;
        boolean dressFormFound = false;
        boolean tradedLamp = false;
        boolean sunvaleDiscovered = false;
        boolean talkedToTheBard = false;

        // The actual Game itself...


        while (!gameOver) {
            if (newGame) {
                System.out.println(home);
            }

            while (newGame) {
                System.out.println("Now what?");
                String homeCommand = sc.nextLine();
                if (homeCommand.equalsIgnoreCase("Search Wreckage")) {
                    System.out.println(wreckage);
                    hasKnife = true;
                } else if (homeCommand.equalsIgnoreCase("Go To Door")) {
                    System.out.println(frontYard);
                    inYard = true;
                    newGame = false;
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

            while (inHome) {
                System.out.println("Now what?");
                String homeCommand = sc.nextLine();
                if (homeCommand.equalsIgnoreCase("Search Wreckage")) {
                    System.out.println(wreckage);
                    hasKnife = true;
                } else if (homeCommand.equalsIgnoreCase("Go To Door")) {
                    if ((hasSword || hasHide) && (hasLamp || hasWool) && hasDog) {
                        System.out.println(frontYardNoAnimals);
                    } else if (hasDog) {
                        if (!(hasSword || hasHide) && !(hasLamp || hasWool)) {
                            System.out.println(frontYardNoDog);
                        } else if (!(hasSword || hasHide) && (hasLamp || hasWool)) {
                            System.out.println(frontYardNoSheepDog);
                        } else {
                            System.out.println(frontYardNoCowDog);
                        }
                    } else if ((hasLamp || hasWool)) {
                        if (!(hasSword || hasHide) && !hasDog) {
                            System.out.println(frontYardNoSheep);
                        } else if (!(hasSword || hasHide) && hasDog) {
                            System.out.println(frontYardNoSheepDog);
                        } else {
                            System.out.println(frontYardNoSheepCow);
                        }
                    } else if ((hasSword || hasHide)) {
                        if (!(hasLamp || hasWool) && !hasDog) {
                            System.out.println(frontYardNoCow);
                        } else if (!(hasLamp || hasWool) && hasDog) {
                            System.out.println(frontYardNoCowDog);
                        } else {
                            System.out.println(frontYardNoSheepCow);
                        }
                    } else {
                        System.out.println(frontYardAgain);
                    }
                    inYard = true;
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

            while (inMV) {
                System.out.println("Now what?");
                String mVCommand = sc.nextLine();
                if (mVCommand.equalsIgnoreCase("Talk to Merchants") && hasDog == false) {
                    System.out.println(merchants);
                } else if (mVCommand.equalsIgnoreCase("Talk to Merchants") && hasDog == true) {
                    System.out.println(merchantsWithDog);
                } else if (mVCommand.equalsIgnoreCase("Talk to Vagrants") && hasWool == false && hasLamp == false) {
                    System.out.println(vagrants);
                } else if (mVCommand.equalsIgnoreCase("Talk to Vagrants") && hasWool == true && hasLamp == false) {
                    System.out.println(vagrantsWithWool);
                    String willTrade = sc.nextLine();
                    if (willTrade.equalsIgnoreCase("Yes")) {
                        System.out.println(yesTrade);
                        hasLamp = true;
                        hasWool = false;
                    } else {
                        System.out.println(noTrade);
                    }
                } else if (mVCommand.equalsIgnoreCase("Talk to Vagrants") && hasLamp == true) {
                    System.out.println("The vagrants are no longer available.");
                } else if (mVCommand.equalsIgnoreCase("Talk to Blacksmith") && (hasHide == false)) {
                    System.out.println(blacksmith);
                } else if (mVCommand.equalsIgnoreCase("Talk to Blacksmith") && hasHide == true) {
                    System.out.println(blacksmithWithHide);
                    hasHide = false;
                    hasSword = true;
                } else if (mVCommand.equalsIgnoreCase("Go to East")) {
                    if ((hasSword || hasHide) && (hasLamp || hasWool) && hasDog) {
                        System.out.println(frontYardNoAnimals);
                    } else if (hasDog) {
                        if (!(hasSword || hasHide) && !(hasLamp || hasWool)) {
                            System.out.println(frontYardNoDog);
                        } else if (!(hasSword || hasHide) && (hasLamp || hasWool)) {
                            System.out.println(frontYardNoSheepDog);
                        } else {
                            System.out.println(frontYardNoCowDog);
                        }
                    } else if ((hasLamp || hasWool)) {
                        if (!(hasSword || hasHide) && !hasDog) {
                            System.out.println(frontYardNoSheep);
                        } else if (!(hasSword || hasHide) && hasDog) {
                            System.out.println(frontYardNoSheepDog);
                        } else {
                            System.out.println(frontYardNoSheepCow);
                        }
                    } else if ((hasSword || hasHide)) {
                        if (!(hasLamp || hasWool) && !hasDog) {
                            System.out.println(frontYardNoCow);
                        } else if (!(hasLamp || hasWool) && hasDog) {
                            System.out.println(frontYardNoCowDog);
                        } else {
                            System.out.println(frontYardNoSheepCow);
                        }
                    } else {
                        System.out.println(frontYardAgain);
                    }
                    inMV = false;
                    inYard = true;
                } else if (mVCommand.equalsIgnoreCase("Go to North")) {
                    System.out.println(harbor);
                    inMV = false;
                    inHarbor = true;
                } else if (mVCommand.equalsIgnoreCase("Where am I?")) {
                    if (hasLamp && hasSword) {
                        System.out.println(merchantVillageNoExtras);
                    } else if (hasLamp) {
                        System.out.println(merchantVillageNoVagrants);
                    } else if (hasSword) {
                        System.out.println(merchantVillageNoSmith);
                    } else {
                        System.out.println(merchantVillage);
                    }
                } else {
                    System.out.println("I don't understand \"" + mVCommand + ".\"");
                }
            }

            while (inHarbor) {
                System.out.println("Now what?");
                String harborCommand = sc.nextLine();
                if ((harborCommand.equalsIgnoreCase("Talk to Fisherman")) && !hasDog) {
                    System.out.println(fisherMan);
                } else if ((harborCommand.equalsIgnoreCase("Talk to Fisherman")) && hasDog) {
                    System.out.println(fisherManWithDog);
                    if (dogIsDisAp) {
                        System.out.println("Your dog is no longer disappointed in you!");
                        dogIsDisAp = false;
                    }
                } else if (harborCommand.equalsIgnoreCase("Talk to Sailors")) {
                    System.out.println(sailors);
                } else if (harborCommand.equalsIgnoreCase("Talk to Ferryman")) {
                    System.out.println(ferryman);
                    String answer = sc.nextLine();
                    if (answer.equalsIgnoreCase("Yes")) {
                        System.out.println(crossingSea);
                        System.out.println(landFall);
                        inHarbor = false;
                        tookFerry = true;
                        inSunvale = true;
                    } else {
                        System.out.println(noCross);
                    }
                } else if (harborCommand.equalsIgnoreCase("Go to East")) {
                    if (builtSandCastle) {
                        System.out.println(coastWithSandCastle);
                    } else {
                        System.out.println(coast);
                    }
                    inHarbor = false;
                    inCoast = true;
                } else if (harborCommand.equalsIgnoreCase("Go to South")) {
                    if (hasLamp && hasSword) {
                        System.out.println(merchantVillageNoExtras);
                    } else if (hasLamp) {
                        System.out.println(merchantVillageNoVagrants);
                    } else if (hasSword) {
                        System.out.println(merchantVillageNoSmith);
                    } else {
                        System.out.println(merchantVillage);
                    }
                    inHarbor = false;
                    inMV = true;
                } else {
                    System.out.println("I don't understand \"" + harborCommand + ".\"");
                }
            }

            while (inCoast) {
                System.out.println("Now what?");
                String coastCommand = sc.nextLine();
                if (coastCommand.equalsIgnoreCase("Go to West")) {
                    System.out.println(harbor);
                    inCoast = false;
                    inHarbor = true;
                } else if (coastCommand.equalsIgnoreCase("Go to South")) {
                    if ((hasSword || hasHide) && (hasLamp || hasWool) && hasDog) {
                        System.out.println(frontYardNoAnimals);
                    } else if (hasDog) {
                        if (!(hasSword || hasHide) && !(hasLamp || hasWool)) {
                            System.out.println(frontYardNoDog);
                        } else if (!(hasSword || hasHide) && (hasLamp || hasWool)) {
                            System.out.println(frontYardNoSheepDog);
                        } else {
                            System.out.println(frontYardNoCowDog);
                        }
                    } else if ((hasLamp || hasWool)) {
                        if (!(hasSword || hasHide) && !hasDog) {
                            System.out.println(frontYardNoSheep);
                        } else if (!(hasSword || hasHide) && hasDog) {
                            System.out.println(frontYardNoSheepDog);
                        } else {
                            System.out.println(frontYardNoSheepCow);
                        }
                    } else if ((hasSword || hasHide)) {
                        if (!(hasLamp || hasWool) && !hasDog) {
                            System.out.println(frontYardNoCow);
                        } else if (!(hasLamp || hasWool) && hasDog) {
                            System.out.println(frontYardNoCowDog);
                        } else {
                            System.out.println(frontYardNoSheepCow);
                        }
                    } else {
                        System.out.println(frontYardAgain);
                    }
                    inCoast = false;
                    inYard = true;
                } else if (coastCommand.equalsIgnoreCase("Swim")) {
                    if ((!hasDog) || (dogIsDisAp)) {
                        System.out.println(swim);
                        inCoast = false;
                        gameOver = true;
                    } else if (hasDog) {
                        System.out.println(swimWithDog);
                        dogIsDisAp = true;
                    }
                } else if (coastCommand.equalsIgnoreCase("Build Sand Castle") && !builtSandCastle) {
                    System.out.println(sandCastle);
                    builtSandCastle = true;
                } else if ((coastCommand.equalsIgnoreCase("Destroy Sand Castle")) && !destroyedSandCastle && builtSandCastle) {
                    System.out.println(destroySandCastle);
                    builtSandCastle = false;
                    destroyedSandCastle = true;
                } else if ((coastCommand.equalsIgnoreCase("Destroy Sand Castle")) && destroyedSandCastle && builtSandCastle) {
                    System.out.println(destroySandCastleAgain);
                    inCoast = false;
                    gameOver = true;
                } else if (coastCommand.equalsIgnoreCase("Where am I")) {
                    if (builtSandCastle) {
                        System.out.println(coastWithSandCastle);
                    } else {
                        System.out.println(coast);
                    }
                } else {
                    System.out.println("I don't understand \"" + coastCommand + ".\"");
                }
            }

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
                    if (hasKnife) {
                        System.out.println(homeWithKnife);
                    } else {
                        System.out.println(homeAgain);
                    }
                    inYard = false;
                    inHome = true;
                } else if (yardCommand.equalsIgnoreCase("Go To West")) {
                    if (hasLamp && hasSword) {
                        System.out.println(merchantVillageNoExtras);
                    } else if (hasLamp) {
                        System.out.println(merchantVillageNoVagrants);
                    } else if (hasSword) {
                        System.out.println(merchantVillageNoSmith);
                    } else {
                        System.out.println(merchantVillage);
                    }
                    inYard = false;
                    inMV = true;
                } else if (yardCommand.equalsIgnoreCase("Go To North")) {
                    if (builtSandCastle) {
                        System.out.println(coastWithSandCastle);
                    } else {
                        System.out.println(coast);
                    }
                    inCoast = true;
                    inYard = false;
                } else if (yardCommand.equalsIgnoreCase("Where Am I")) {
                    if ((hasSword || hasHide) && (hasLamp || hasWool) && hasDog) {
                        System.out.println(frontYardNoAnimals);
                    } else if (hasDog) {
                        if (!(hasSword || hasHide) && !(hasLamp || hasWool)) {
                            System.out.println(frontYardNoDog);
                        } else if (!(hasSword || hasHide) && (hasLamp || hasWool)) {
                            System.out.println(frontYardNoSheepDog);
                        } else {
                            System.out.println(frontYardNoCowDog);
                        }
                    } else if ((hasLamp || hasWool)) {
                        if (!(hasSword || hasHide) && !hasDog) {
                            System.out.println(frontYardNoSheep);
                        } else if (!(hasSword || hasHide) && hasDog) {
                            System.out.println(frontYardNoSheepDog);
                        } else {
                            System.out.println(frontYardNoSheepCow);
                        }
                    } else if ((hasSword || hasHide)) {
                        if (!(hasLamp || hasWool) && !hasDog) {
                            System.out.println(frontYardNoCow);
                        } else if (!(hasLamp || hasWool) && hasDog) {
                            System.out.println(frontYardNoCowDog);
                        } else {
                            System.out.println(frontYardNoSheepCow);
                        }
                    } else {
                        System.out.println(frontYardAgain);
                    }
                } else {
                    System.out.println("I don't understand \"" + yardCommand + ".\"");
                }
            }

            while (inSunvale) {
                System.out.println("Now what?");
                String sVCommand = sc.nextLine();
                if (sVCommand.equalsIgnoreCase("Go to North")) {
                    System.out.println("END OF DEMO");
                    gameOver = true;
                    inSunvale = false;
                } else if (sVCommand.equalsIgnoreCase("Go to Pub")) {
                    if (doorBlocked && brokerFound && hasDressForm) {
                        System.out.println(pubNoArguementNoFigureBroker);
                    } else if (doorBlocked && brokerFound && !hasDressForm) {
                        System.out.println(pubNoArguementBroker);
                    } else if (doorBlocked && !brokerFound && hasDressForm) {
                        System.out.println(pubNoArguementNoFigure);
                    } else if (doorBlocked && !brokerFound && !hasDressForm) {
                        System.out.println(pubNoArguement);
                    } else if (!doorBlocked && brokerFound && hasDressForm) {
                        System.out.println(pubBrokerNoFigure);
                    } else if (!doorBlocked && !brokerFound && hasDressForm) {
                        System.out.println(pubNoFigure);
                    } else if (!doorBlocked && brokerFound && !hasDressForm) {
                        System.out.println(pubBroker);
                    } else {
                        System.out.println(pub);
                    }
                    inSunvale = false;
                    inPub = true;
                } else if (sVCommand.equalsIgnoreCase("Where Am I")) {
                    if (sunvaleDiscovered) {
                        System.out.println(sunvale);
                    } else {
                        System.out.println(landFall);
                    }
                } else if (sVCommand.equalsIgnoreCase("Talk to Bard")) {
                    if (talkedToTheBard){
                        System.out.println(bardAgain);
                    } else {
                        System.out.println(bard);
                        talkedToTheBard = true;
                    }
                } else if (sVCommand.equalsIgnoreCase("Talk to Ferryman")) {
                    if (hasDog){
                        System.out.println(ferrymanAfterRideDog);
                    } else {
                        System.out.println(ferrymanAfterRide);
                    }
                } else {
                    System.out.println("I don't understand \"" + sVCommand + ".\"");
                }
            }

            while (inPub) {
                System.out.println("Now what?");
                String pubCommand = sc.nextLine();
                if (pubCommand.equalsIgnoreCase("Go to Door")) {
                    if (doorBlocked && hasDressForm) {
                        System.out.println(blockedDoorNoFigure);
                        System.out.println(sunvale);
                        hasDressForm = false;
                        inPub = false;
                        inSunvale = true;
                    } else if (doorBlocked && hasDog) {
                        System.out.println(blockedDoorWithDog);
                    } else if (doorBlocked && !hasDog && !hasDressForm) {
                        System.out.println(blockedDoor);
                    } else {
                        if (sunvaleDiscovered) {
                            System.out.println(sunvale);
                        } else {
                            System.out.println(landFall);
                        }
                        inPub = false;
                        inSunvale = true;
                    }
                } else if (pubCommand.equalsIgnoreCase("End Argument")) {
                    if (hasSword) {
                        System.out.println(endArguementWithSword);
                        doorBlocked = true;
                    } else {
                        System.out.println(endArguement);
                        inPub = false;
                        gameOver = true;
                    }
                } else if (pubCommand.equalsIgnoreCase("Talk to Bartender")) {
                    System.out.println(bartender);
                    brokerFound = true;
                    sunvaleDiscovered = true;
                } else if (pubCommand.equalsIgnoreCase("Talk to Shadowy Figure")) {
                    System.out.println(shadowyFigure);
                    dressFormFound = true;
                } else if (dressFormFound && pubCommand.equalsIgnoreCase("Take Dress Form")) {
                    System.out.println(takeDressForm);
                    hasDressForm = true;
                } else if (brokerFound && pubCommand.equalsIgnoreCase("Talk to Information Broker")) {
                    if (hasLamp){
                        System.out.println(infoBrokerWithLamp);
                        String answer = sc.nextLine();
                        if (answer.equalsIgnoreCase("Yes")) {
                            System.out.println(tradeLamp);
                            hasLamp = false;
                            tradedLamp = true;
                        } else {
                            System.out.println(tradeLampNo);
                        }
                    } else if (tradedLamp) {
                        System.out.println(infoBrokerAgain);
                    } else {
                        System.out.println(infoBroker);
                    }
                } else if (pubCommand.equalsIgnoreCase("Where Am I")) {
                    if (doorBlocked && brokerFound && hasDressForm) {
                        System.out.println(pubNoArguementNoFigureBroker);
                    } else if (doorBlocked && brokerFound && !hasDressForm) {
                        System.out.println(pubNoArguementBroker);
                    } else if (doorBlocked && !brokerFound && hasDressForm) {
                        System.out.println(pubNoArguementNoFigure);
                    } else if (doorBlocked && !brokerFound && !hasDressForm) {
                        System.out.println(pubNoArguement);
                    } else if (!doorBlocked && brokerFound && hasDressForm) {
                        System.out.println(pubBrokerNoFigure);
                    } else if (!doorBlocked && !brokerFound && hasDressForm) {
                        System.out.println(pubNoFigure);
                    } else if (!doorBlocked && brokerFound && !hasDressForm) {
                        System.out.println(pubBroker);
                    } else {
                        System.out.println(pub);
                    }
                } else {
                    System.out.println("I don't understand \"" + pubCommand + ".\"");
                }
            }


        }
    }
}