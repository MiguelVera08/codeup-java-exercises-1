package wordcounter;

import java.util.HashMap;

public class Counter {
    public static HashMap<String, Integer> countWords (String str) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        str = str.replaceAll("\\p{Punct}", "");
        str = str.toLowerCase();
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.equalsIgnoreCase("")) {
                continue;
            } else if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        return wordCount;
    }

    public static HashMap<Character, Integer> countVowels (String str) {
        HashMap<Character, Integer> vowelCount = new HashMap<>();
        str = str.replaceAll("\\p{Punct}", "");
        str = str.toLowerCase();
        String[] words = str.split("");
        for (String letter : words) {
            if (letter.equalsIgnoreCase("")) {
                continue;
            } else if (vowelCount.containsKey(letter.charAt(0))) {
                vowelCount.put(letter.charAt(0), vowelCount.get(letter.charAt(0)) + 1);
            } else {
                if (containsVowel(letter)) {
                    vowelCount.put(letter.charAt(0), 1);
                }
            }
        }
        return vowelCount;
    }

    public static HashMap<Character, Integer> countLetters (String str) {
        HashMap<Character, Integer> letterCount = new HashMap<>();
        str = str.replaceAll("\\p{Punct}", "");
        str = str.toLowerCase();
        String[] words = str.split("");
        for (String letter : words) {
            if (letter.equalsIgnoreCase("")) {
                continue;
            } else if (letterCount.containsKey(letter.charAt(0))) {
                letterCount.put(letter.charAt(0), letterCount.get(letter.charAt(0)) + 1);
            } else {
                letterCount.put(letter.charAt(0), 1);
            }
        }
        return letterCount;
    }



    private static boolean containsVowel (String str) {
        str = str.toLowerCase();
        return str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u");
    }

    public static int countOfWord(String str, String word) {
        word = word.toLowerCase();
        if (word.length() > 1) {
            HashMap<String, Integer> wordsCounted = countWords(str);
            return wordsCounted.get(word);
        } else {
            HashMap<Character, Integer> lettersCounted = countLetters(str);
            return lettersCounted.get(word.charAt(0));
        }
    }

    public static void main(String[] args) {
        String chapterOneOfATaleOfTwoCities = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way--in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only. There were a king with a large jaw and a queen with a plain face, on the throne of England; there were a king with a large jaw and a queen with a fair face, on the throne of France.  In both countries it was clearer than crystal to the lords of the State preserves of loaves and fishes, that things in general were settled for ever. It was the year of Our Lord one thousand seven hundred and seventy-five.  Spiritual revelations were conceded to England at that favoured period, as at this.  Mrs. Southcott had recently attained her five-and-twentieth blessed birthday, of whom a prophetic private in the Life Guards had heralded the sublime appearance by announcing that arrangements were made for the swallowing up of London and Westminster.  Even the Cock-lane ghost had been laid only a round dozen of years, after rapping out its messages, as the spirits of this very year last past (supernaturally deficient in originality) rapped out theirs. Mere messages in the earthly order of events had lately come to the English Crown and People, from a congress of British subjects in America:  which, strange to relate, have proved more important to the human race than any communications yet received through any of the chickens of the Cock-lane brood. France, less favoured on the whole as to matters spiritual than her sister of the shield and trident, rolled with exceeding smoothness down hill, making paper money and spending it. Under the guidance of her Christian pastors, she entertained herself, besides, with such humane achievements as sentencing a youth to have his hands cut off, his tongue torn out with pincers, and his body burned alive, because he had not kneeled down in the rain to do honour to a dirty procession of monks which passed within his view, at a distance of some fifty or sixty yards.  It is likely enough that, rooted in the woods of France and Norway, there were growing trees, when that sufferer was put to death, already marked by the Woodman, Fate, to come down and be sawn into boards, to make a certain movable framework with a sack and a knife in it, terrible in history.  It is likely enough that in the rough outhouses of some tillers of the heavy lands adjacent to Paris, there were sheltered from the weather that very day, rude carts, bespattered with rustic mire, snuffed about by pigs, and roosted in by poultry, which the Farmer, Death, had already set apart to be his tumbrils of the Revolution. But that Woodman and that Farmer, though they work unceasingly, work silently, and no one heard them as they went about with muffled tread:  the rather, forasmuch as to entertain any suspicion that they were awake, was to be atheistical and traitorous. In England, there was scarcely an amount of order and protection to justify much national boasting.  Daring burglaries by armed men, and highway robberies, took place in the capital itself every night; families were publicly cautioned not to go out of town without removing their furniture to upholsterers' warehouses for security; the highwayman in the dark was a City tradesman in the light, and, being recognised and challenged by his fellow-tradesman whom he stopped in his character of \"the Captain,\" gallantly shot him through the head and rode away; the mail was waylaid by seven robbers, and the guard shot three dead, and then got shot dead himself by the other four, \"in consequence of the failure of his ammunition:\" after which the mail was robbed in peace; that magnificent potentate, the Lord Mayor of London, was made to stand and deliver on Turnham Green, by one highwayman, who despoiled the illustrious creature in sight of all his retinue; prisoners in London gaols fought battles with their turnkeys, and the majesty of the law fired blunderbusses in among them, loaded with rounds of shot and ball; thieves snipped off diamond crosses from the necks of noble lords at Court drawing-rooms; musketeers went into St. Giles's, to search for contraband goods, and the mob fired on the musketeers, and the musketeers fired on the mob, and nobody thought any of these occurrences much out of the common way.  In the midst of them, the hangman, ever busy and ever worse than useless, was in constant requisition; now, stringing up long rows of miscellaneous criminals; now, hanging a housebreaker on Saturday who had been taken on Tuesday; now, burning people in the hand at Newgate by the dozen, and now burning pamphlets at the door of Westminster Hall; to-day, taking the life of an atrocious murderer, and to-morrow of a wretched pilferer who had robbed a farmer's boy of sixpence. All these things, and a thousand like them, came to pass in and close upon the dear old year one thousand seven hundred and seventy-five.  Environed by them, while the Woodman and the Farmer worked unheeded, those two of the large jaws, and those other two of the plain and the fair faces, trod with stir enough, and carried their divine rights with a high hand.  Thus did the year one thousand seven hundred and seventy-five conduct their Greatnesses, and myriads of small creatures--the creatures of this chronicle among the rest--along the roads that lay before them.";
        HashMap<String, Integer> wordCount = countWords(chapterOneOfATaleOfTwoCities);

        for (HashMap.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }

        HashMap<Character, Integer> vowelCount = countVowels(chapterOneOfATaleOfTwoCities);

        for (HashMap.Entry<Character, Integer> entry : vowelCount.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }

        System.out.printf("The letter 'Q' is in the first chapter of A Tale of Two Cities %d time(s).", countOfWord(chapterOneOfATaleOfTwoCities, "Q"));

    }
}
