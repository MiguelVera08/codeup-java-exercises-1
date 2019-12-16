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
                "They inform you that they have a lamp that they'd be willing to trade for your wool. The lamp does not have oil.\n    TRADE FOR LAMP?";
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
                "trade the location for the lamp.\n    TRADE FOR INFORMATION?";
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
                "is not too keen on free rides. There is no talking to him, for now.";
        String ferrymanAfterRideDog = "You go to talk to the ferryman, but it turns out you are talking to his twin brother. Your ferryman was arrested for tax evasion. The new ferryman " +
                "is not too keen on free rides. He sees your dog and gives it a loving pet. There is no talking to him, for now.";
        String bard = "You decide to talk to the bard. He begins to regale you with tales of your conquests, all made up. You decide to not talk to the bard ever again.";
        String bardAgain = "You remember your promise to yourself. You will never talk to the bard ever again.";
        String valley = "You find yourself in a valley, with many beautiful flowers. You see a goat munching on the flowers. Your path can continue south and north.";
        String goat = "The goat stops munching on the flowers and backs away from you. Once you are out of sight, the goat wanders back and continues " +
                "to munch on the flowers.";
        String fork = "You have reached a three-pronged fork in the road. You see a sign posted as well as an old woman. You path can continue north, east, south, and west.";
        String signPost = "You walk up to the sign. It has three different arrows, each pointing to a city. The one headed east is pointing to Hooverdale, the north to Blackridge, and west to Spur's Village.";
        String oldWoman = "You approach the old woman. She seems a bit confused. She asks if you know the way to Bilgarden. You do not know how to get there. The woman turns away, back to the sign, and she looks at it puzzled.";
        String forest = "You find yourself in a forest. The forest is fairly dark and densely populated with many woodland creatures. You see a twig, a squirrel, and a rabbit. You path can continue north, east, south, and west, however only north and south have a pathway to walk on...";
        String westForest = "You decide, unforunately, to go west. There is nothing to be found here however. The darkness encircles you this day...\n    YOUR GAME HAS ENDED. PLEASE RELOAD PROGRAM.";
        String eastForest = "You decide to go east. You find a small chest.\n    OPEN CHEST?";
        String chestNoKey = "You lack the key to open this chest...";
        String forestChest = "Using your key, you unlock the chest to find a pair of goggles. When you remove the key, it snaps in half.\n    KEY LOST.\n    GET GOGGLES.";
        String blackRidge = "You find yourself in the frosted village of Blackridge. Despite the name it is very bright and white. You find it difficult to see much of anything here. Your path can continue south.";
        String blackRidgeGoggs = "You find yourself in the frosted village of Blackridge. Despite the name it is very bright and white. Putting on your goggles you can see the town. There is a pub here, and very few people outside. You see a bard. Your path can continue east and south.";
        String spurs = "You find yourself in a very small village known as Spur's Village. There is a young woman, and a cat. Your path can continue east, south, and west.";
        String spursNoCat = "You find yourself in a very small village known as Spur's Village. There is a young woman. Your path can continue east, south, and west.";
        String yWoman = "You decide to talk to the young woman. She can smell death on you. She refuses to talk to you.";
        String yWomanDog = "You decide to talk to the young woman. She notices your dog and gives it a loving pet. She can smell death on you. She refuses to talk to you.";
        String cat = "You approach the cat and as you do, you notice that this is actually your cat. It notices you after you call to it and walks over, unaware of any wrong doing on its part. It is happy to see you though.\n    CAT HAS JOINED PARTY";
        String lake = "You find yourself at Spur's Lake. It is said to have some kind of healing properties for those that bath in it. Your path can continue north.";
        String batheLake = "You decide to take this opportunity to bathe in Spur's lake. You don't really feel healed persay, but hey, atleast you're clean!";
        String yWomanBath = "You decide to talk to the young woman. She is very sorry to hear of your loss, and invites you to her restaurant, Bilgarden. The food is very nice, and helps to ease many of your aches from the journey so far.";
        String bilgarden = "You remember the old woman at the fork who had asked about Bilgarden...";
        String oldWomanBilgarden = "You approach the old woman. She seems a bit confused. She asks if you know the way to Bilgarden. You inform her that the restaurant is in Spur's Village. Overjoyed, she hands you a canteen. It is empty, but better than nothing!\n    GET CANTEEN.";
        String fillCanteen = "You decide to fill your canteen with water from Spur's Lake.\n    CANTEEN FULL.";
        String swimLake = "You decided to go swimming in the lake. Your decision to go for a swim is rewarded when you notice a glimmer in the lake bed. Swimming down to it, you retrieve the item.\n    GET KEY.";
        String hooverDale = "You are now at Hooverdale. It is a quite mountain town. There is a blacksmith, a shadowy figure, and a bard. You path can continue north and west.";
        String thorReminder = "You remember that this was supposed to be the location of Thor Oakenbelly. However, you have no reason to believe that he is here...";
        String blacksmithHD = "You decide to talk to the blacksmith. He seems less than interested in what you have to offer, but is willing to listen to your story.";
        String blacksmithWithCat = "You decide to talk to the blacksmith. He seems less than interested in what you have to offer, but is willing to listen to your story. He looks up from his work and notices your cat. He puts down the iron he was working with, walks over to you and gives the cat a loving pet. He then returns to his work.";
        String blacksmithWithCatSword = "You decide to talk to the blacksmith. He seems less than interested in what you have to offer, but is willing to listen to your story. He looks up from his work and notices your cat. He puts down the iron he was working with, walks over to you and gives the cat a loving pet. He also notices the sword you happen to be carrying. He takes it from you and looks at with confusion. He informs you the sword is very low quality, and informs you that he'd be willing to take the sword from you and give you a proper weapon. He walks back to his work area, and reveals a glimmering axe.\n    TRADE FOR AXE?";
        String bsmithHDNoTrade = "You decline to trade with the blacksmith, and retrieve your sword.";
        String bsmithHDTrade = "You decide to trade with the blacksmith, and are handed the weighty axe.\n    SWORD LOST.\n    GET AXE.";
        String hDaleShadowNoLamp = "You decide to talk to the shadowy figure. The figure informs you they know of the location of a key to a chest somewhere in the forest. All they would require is a certain lamp... He notices, however you do not have this lamp. and shoos you away.";
        String hDaleShadow = "You decide to talk to the shadowy figure. The figure informs you they know of the location of a key to a chest somewhere in the forest. All they would require is a certain lamp...\n    TRADE FOR INFORMATION?";
        String hDaleNoTradeLamp = "You decline to trade the lamp. The shadowy figure turns it's back to you.";
        String hDaleTradeLamp = "You decide to trade the lamp. The figure informs you that the key can be found at the bottom of a lake near Spur's Village.\n    LAMP LOST.";
        String farmland = "You find yourself in a large area of farmland. It would appear to be the land that provides the food for Spur's Village. You see a farm hand, a dog, and the crops being grown on the field. Your path can continue east, south, and west.";
        String farmlandNoDog = "You find yourself in a large area of farmland. It would appear to be the land that provides the food for Spur's Village. You see a farm hand, and the crops being grown on the field. Your path can continue east, south, and west.";
        String farmlandDog = "You decided to look over at the dog. The dog looks up at you and begins to bark. It looks at you with love in it's eyes. It appears to understand your pain, and wants to be your friend.\n    DOG ADDED TO PARTY.";
        String fDogWithDog = "You decided to look over at the dog. The dog looks at your dog and give a playful bark. The two begin to play as you smile wryly. You give both dogs a loving pet, and the farmland dog trots away.";
        String farmHand = "You decide to talk to the farmhand. He notices you are on a quest and is will to give you something that might be useful. All they want is a drink of water.";
        String giveWater = "\n    LET FARMHAND DRINK FROM CANTEEN?";

        boolean gameOver = false;
        boolean newGame = true;
        boolean inHome = false;
        boolean inYard = false;
        boolean inMV = false;
        boolean inHarbor = false;
        boolean inCoast = false;
        boolean inSunvale = false;
        boolean inPub = false;
        boolean inValley = false;
        boolean inFork = false;
        boolean inHDale = false;
        boolean inForest = false;
        boolean inBRidge = false;
        boolean inSVill = false;
        boolean inSLake = false;
        boolean inFarm = false;
        boolean hasKnife = false;
        boolean hasDog = false;
        boolean hasHide = false;
        boolean hasWool = false;
        boolean hasLamp = false;
        boolean hasSword = false;
        boolean hasDressForm = false;
        boolean hasCat = false;
        boolean hasKey = false;
        boolean hasGoggles = false;
        boolean hasCanteen = false;
        boolean filledCanteen = false;
        boolean hasBathed = false;
        boolean talkedToOldWoman = false;
        boolean knowBilgarden = false;
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
        boolean farmDog = false;

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
                    if (!hasDog) {
                        System.out.println(dog);
                        hasDog = true;
                    } else {
                        System.out.println("Dog already in party...");
                    }
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
                    System.out.println(valley);
                    inValley = true;
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
                } else if (dressFormFound && pubCommand.equalsIgnoreCase("Search Dress Form")) {
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

            while(inValley) {
                System.out.println("Now what?");
                String valCommand = sc.nextLine();
                if (valCommand.equalsIgnoreCase("Go to North")) {
                    System.out.println(fork);
                    inValley = false;
                    inFork = true;
                } else if (valCommand.equalsIgnoreCase("Go to South")) {
                    if (sunvaleDiscovered) {
                        System.out.println(sunvale);
                    } else {
                        System.out.println(landFall);
                    }
                    inValley = false;
                    inSunvale = true;
                } else if (valCommand.equalsIgnoreCase("Search Goat")) {
                    System.out.println(goat);
                } else if (valCommand.equalsIgnoreCase("Where am I")) {
                    System.out.println(valley);
                } else {
                    System.out.println("I don't understand \"" + valCommand + ".\"");
                }
            }

            while (inFork) {
                System.out.println("Now what?");
                String forkCommand = sc.nextLine();
                if (forkCommand.equalsIgnoreCase("Go to South")) {
                    System.out.println(valley);
                    inFork = false;
                    inValley = true;
                } else if (forkCommand.equalsIgnoreCase("Go to East")) {
                    System.out.println(hooverDale);
                    if (tradedLamp) {
                        System.out.println(thorReminder);
                    }
                    inFork = false;
                    inHDale = true;
                } else if (forkCommand.equalsIgnoreCase("Go to North")) {
                    System.out.println(forest);
                    inFork = false;
                    inForest = true;
                } else if (forkCommand.equalsIgnoreCase("Go to West")) {
                    if (!hasCat) {
                        System.out.println(spurs);
                    } else {
                        System.out.println(spursNoCat);
                    }
                    inFork = false;
                    inSVill = true;
                } else if (forkCommand.equalsIgnoreCase("Talk to Old Woman")) {
                    if (knowBilgarden) {
                        System.out.println(oldWomanBilgarden);
                        hasCanteen = true;
                    } else {
                        System.out.println(oldWoman);
                        talkedToOldWoman = true;
                    }
                } else if (forkCommand.equalsIgnoreCase("Search Sign")) {
                    System.out.println(signPost);
                } else if (forkCommand.equalsIgnoreCase("Where Am I")) {
                    System.out.println(fork);
                } else {
                    System.out.println("I don't understand \"" + forkCommand + ".\"");
                }
            }

            while(inForest) {
                System.out.println("Now what?");
                String forestCommand = sc.nextLine();
                if (forestCommand.equalsIgnoreCase("Go to North")) {
                    if (hasGoggles) {
                        System.out.println(blackRidgeGoggs);
                    } else {
                        System.out.println(blackRidge);
                    }
                    inForest = false;
                    inBRidge = true;
                } else if (forestCommand.equalsIgnoreCase("Go to East")) {
                    if (!hasGoggles) {
                        System.out.println(eastForest);
                        String answer = sc.nextLine();
                        if (answer.equalsIgnoreCase("yes")) {
                            if (hasKey) {
                                System.out.println(forestChest);
                                hasKey = false;
                                hasGoggles = true;
                            } else {
                                System.out.println(chestNoKey);
                            }
                        } else {
                            System.out.println("You back away from the chest and return to the path.");
                        }
                    } else {
                        System.out.println("You turn to walk to the east, but the trees are too thick to walk through.");
                    }
                } else if (forestCommand.equalsIgnoreCase("Go to West")) {
                    System.out.println(westForest);
                    inForest = false;
                    gameOver = true;
                } else if (forestCommand.equalsIgnoreCase("Go to South")) {
                    System.out.println(fork);
                    inForest = false;
                    inFork = true;
                } else if (forestCommand.equalsIgnoreCase("Where am I")) {
                    System.out.println(forest);
                } else {
                    System.out.println("I don't understand \"" + forestCommand + ".\"");
                }
            }

            while (inBRidge) {
                System.out.println("Now what?");
                String bRCommand = sc.nextLine();
                if (bRCommand.equalsIgnoreCase("Go to South")) {
                    System.out.println(forest);
                    inBRidge = false;
                    inForest = true;
                } else if (bRCommand.equalsIgnoreCase("Go to East")) {
                    if (hasGoggles) {
                        System.out.println("END OF DEMO");
                        inBRidge = false;
                        gameOver = true;
                    } else {
                        System.out.println("It is impossible to see where you are going.");
                    }
                } else if (!hasGoggles && (bRCommand.equalsIgnoreCase("Go to North") || bRCommand.equalsIgnoreCase("Go to West"))) {
                    System.out.println("It is impossible to see where you are going.");
                }  else if (bRCommand.equalsIgnoreCase("Go to Pub") && hasGoggles) {
                    System.out.println("END OF DEMO");
                    inBRidge = false;
                    gameOver = true;
                } else if (bRCommand.equalsIgnoreCase("Talk to Bard") && hasGoggles) {
                    if (talkedToTheBard){
                        System.out.println(bardAgain);
                    } else {
                        System.out.println(bard);
                        talkedToTheBard = true;
                    }
                } else if (bRCommand.equalsIgnoreCase("Where Am I")) {
                    if (hasGoggles) {
                        System.out.println(blackRidgeGoggs);
                    } else {
                        System.out.println(blackRidge);
                    }
                } else {
                    System.out.println("I don't understand \"" + bRCommand + ".\"");
                }
            }

            while (inSVill) {
                System.out.println("Now what?");
                String sVilCommand = sc.nextLine();
                if (sVilCommand.equalsIgnoreCase("Go to South")) {
                    System.out.println(lake);
                    inSVill = false;
                    inSLake = true;
                } else if (sVilCommand.equalsIgnoreCase("Go to East")) {
                    System.out.println(fork);
                    inSVill = false;
                    inFork = true;
                } else if (sVilCommand.equalsIgnoreCase("Go to West")) {
                    if (!farmDog) {
                        System.out.println(farmland);
                    } else {
                        System.out.println(farmlandNoDog);
                    }
                    inSVill = false;
                    inFarm = true;
                } else if (sVilCommand.equalsIgnoreCase("Talk to Young Woman")) {
                    if (hasBathed) {
                        System.out.println(yWomanBath);
                        knowBilgarden = true;
                        if (talkedToOldWoman) {
                            System.out.println(bilgarden);
                        }
                    } else if (hasDog) {
                        System.out.println(yWomanDog);
                    } else {
                        System.out.println(yWoman);
                    }
                } else if (sVilCommand.equalsIgnoreCase("Search Cat") || sVilCommand.equalsIgnoreCase("Talk to Cat")) {
                    if (!hasCat) {
                        System.out.println(cat);
                        hasCat = true;
                    } else {
                        System.out.println("Cat already in the party.");
                    }
                } else if (sVilCommand.equalsIgnoreCase("Where Am I")) {
                    if (!hasCat) {
                        System.out.println(spurs);
                    } else {
                        System.out.println(spursNoCat);
                    }
                } else {
                    System.out.println("I don't understand \"" + sVilCommand + ".\"");
                }
            }

            while (inSLake) {
                System.out.println("Now what?");
                String sLakeCommand = sc.nextLine();
                if (sLakeCommand.equalsIgnoreCase("Go to North")) {
                    if (!hasCat) {
                        System.out.println(spurs);
                    } else {
                        System.out.println(spursNoCat);
                    }
                    inSLake = false;
                    inSVill = true;
                } else if (sLakeCommand.equalsIgnoreCase("Swim")) {
                    System.out.println(swimLake);
                    hasKey = true;
                } else if (sLakeCommand.equalsIgnoreCase("Take Bath") || sLakeCommand.equalsIgnoreCase("Bathe")) {
                    System.out.println(batheLake);
                    hasBathed = true;
                } else if (sLakeCommand.equalsIgnoreCase("Fill Canteen") && hasCanteen) {
                    System.out.println(fillCanteen);
                    filledCanteen = true;
                } else if (sLakeCommand.equalsIgnoreCase("Where Am I")) {
                    System.out.println(lake);
                } else {
                    System.out.println("I don't understand \"" + sLakeCommand + ".\"");
                }
            }

            while (inFarm) {
                System.out.println("Now what?");
                String farmCommand = sc.nextLine();
                if (farmCommand.equalsIgnoreCase("Go to East")) {
                    if (!hasCat) {
                        System.out.println(spurs);
                    } else {
                        System.out.println(spursNoCat);
                    }
                    inFarm = false;
                    inSVill= true;
                } else if (farmCommand.equalsIgnoreCase("Go to South")) {
                    System.out.println("END OF DEMO");
                    inFarm = false;
                    gameOver = true;
                } else if (farmCommand.equalsIgnoreCase("Go to West")) {
                    System.out.println("END OF DEMO");
                    inFarm = false;
                    gameOver = true;
                } else if (farmCommand.equalsIgnoreCase("Search Dog")) {
                    if (hasDog && !farmDog) {
                        System.out.println(fDogWithDog);
                        farmDog = true;
                    } else if (!hasDog && !farmDog){
                        System.out.println(farmlandDog);
                        hasDog = true;
                        farmDog = true;
                    } else {
                        System.out.println("Your dog looks up at you and gives a slight whine. You give it a loving pet.");
                    }
                } else if (farmCommand.equalsIgnoreCase("Where Am I")) {
                    if (!farmDog) {
                        System.out.println(farmland);
                    } else {
                        System.out.println(farmlandNoDog);
                    }
                } else {
                    System.out.println("I don't understand \"" + farmCommand + ".\"");
                }
            }

            while (inHDale){
                System.out.println("Now what?");
                String hDCommand = sc.nextLine();
                if (hDCommand.equalsIgnoreCase("Go to North")) {
                    System.out.println("END OF DEMO");
                    inHDale = false;
                    gameOver = true;
                } else if (hDCommand.equalsIgnoreCase("Go to West")){
                    System.out.println(fork);
                    inHDale = false;
                    inFork = true;
                } else if (hDCommand.equalsIgnoreCase("Talk to Blacksmith")) {
                    if (hasCat && hasSword){
                        System.out.println(blacksmithWithCatSword);
                        String answer = sc.nextLine();
                        if (answer.equalsIgnoreCase("yes")){
                            System.out.println(bsmithHDTrade);
                        } else {
                            System.out.println(bsmithHDNoTrade);
                        }
                    } else if (hasCat) {
                        System.out.println(blacksmithWithCat);
                    } else {
                        System.out.println(blacksmithHD);
                    }
                } else if (hDCommand.equalsIgnoreCase("Talk to Shadowy Figure")) {
                    if (hasLamp) {
                        System.out.println(hDaleShadow);
                        String answer = sc.nextLine();
                        if (answer.equalsIgnoreCase("yes")) {
                            System.out.println(hDaleTradeLamp);
                            hasLamp = false;
                        } else {
                            System.out.println(hDaleNoTradeLamp);
                        }
                    } else {
                        System.out.println(hDaleShadowNoLamp);
                    }
                } else if (hDCommand.equalsIgnoreCase("Talk to Bard")) {
                    if (talkedToTheBard){
                        System.out.println(bardAgain);
                    } else {
                        System.out.println(bard);
                        talkedToTheBard = true;
                    }
                } else if (hDCommand.equalsIgnoreCase("Where Am I")) {
                    System.out.println(hooverDale);
                    if (tradedLamp) {
                        System.out.println(thorReminder);
                    }
                } else {
                    System.out.println("I don't understand \"" + hDCommand + ".\"");
                }
            }
        }
    }
}