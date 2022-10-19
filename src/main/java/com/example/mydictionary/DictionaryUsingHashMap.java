package com.example.mydictionary;

import java.util.HashMap;

public class DictionaryUsingHashMap {
    private HashMap<String, String> dictionary;

    DictionaryUsingHashMap(){
        dictionary = new HashMap<>();

        addWord("Famished", "extremly hungry");
        addWord("hobies", "love of life");
        addWord("family ", "Everything ");
        addWord("Music", "realise a stress");
        addWord("assimilate", "to learn something new");
        addWord("Cricket", "is a game");
        addWord("angad", "im the meaning ✌");
        addWord("acciojob", "placement");
        addWord("aesthetic", "concered with beauty or art");
        addWord("Solitary", "Alone");
        addWord("Almanack", "Diary");
        addWord("Serene", "Calm");
        addWord("Ecstatic", "Very excited");
        addWord("solitude", "Happy while being alone");
        addWord("dog", "opposite of cat");
        addWord("abc", "first letters of alphabet");
        addWord("deepfake", "An image or recording that has been convincingly altered to misrepresent someone as doing or saying something that was not actually done or said");
        addWord("de-extinction", "The (proposed or imagined) revival of an extinct species, typically by cloning or selective breeding.");
        addWord("deleter", "A person who or thing which deletes something.");
        addWord("delicense", "To deprive (a person, business, vehicle, etc.) of a license providing official permission to operate");
        addWord("denialism", "The policy or stance of denying the existence or reality of something, esp. something which is supported by the majority of scientific evidence.");
        addWord("denialist", "A person who denies the existence or reality of something, esp. something which is supported by the majority of scientific or historical evidence");
        addWord("destigmatizing", "The action or process of removing the negative connotation or social stigma associated with something");
        addWord("dof", "Stupid, dim-witted; uninformed, clueless.");
        addWord("droning", "The action of using a military drone or a similar commercially available device");
        addWord("e-bike", "An electric bike");
    }

    public  boolean addWord(String word, String meaning){
        dictionary.put(word, meaning);
        return true;
    }

    public String findMeaning(String word){
        if(!dictionary.containsKey(word)){
            return "Given word not found";
        }
        else{
            return dictionary.get(word);
        }
    }
}
