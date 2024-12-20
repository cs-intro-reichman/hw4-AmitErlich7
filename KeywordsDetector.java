public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        int i = 0;
        String [] lowerSentences = new String [sentences.length];
        while (i < sentences.length) {
            lowerSentences[i] = MyString.lowerCase(sentences[i]);
            int j = 0;
            while (j < keywords.length) {
                String word = MyString.lowerCase(keywords[j]);
                if (lowerSentences[i].indexOf(word) != -1) {
                    System.out.println(sentences[i]);
                    break;
                }
                j++;
            }   
            i++;
        }
            
     }
}

