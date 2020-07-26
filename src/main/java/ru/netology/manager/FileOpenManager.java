package ru.netology.manager;

import java.util.*;

public class FileOpenManager {
    private Map<String, String> map = new HashMap<>();

    public void register(String key, String value){
        map.put(key.toLowerCase(), value);
    }

    public String getNameOfApp(String key){
        return map.get(key.toLowerCase());
    }

    public void deleteApp(String key){
        map.remove(key.toLowerCase());
    }

    public List<String> showAllApps(){
        List<String> list = new ArrayList<>(map.values());
        list.sort(Comparator.comparing(String::toLowerCase));
        return list;
    }

    public Set<String> showAllExtensions(){
        return map.keySet();
    }
}
