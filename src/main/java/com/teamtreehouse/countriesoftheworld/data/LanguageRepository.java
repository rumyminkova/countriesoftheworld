package com.teamtreehouse.countriesoftheworld.data;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rumy on 5/29/2017.
 */
@Component
public class LanguageRepository {
        private static final Map<Integer,String> ALL_LANGUAGES;
        static {
            ALL_LANGUAGES=new HashMap<>();
            ALL_LANGUAGES.put(1,"English");
            ALL_LANGUAGES.put(2,"French");
            ALL_LANGUAGES.put(3,"German");
            ALL_LANGUAGES.put(4,"Russian");
            ALL_LANGUAGES.put(5,"Dutch");
            ALL_LANGUAGES.put(6,"Spanish");
        }

        public String findById(int id){
            if (ALL_LANGUAGES.containsKey(id)){
                return ALL_LANGUAGES.get(id);
            }else return null;
        }

}

