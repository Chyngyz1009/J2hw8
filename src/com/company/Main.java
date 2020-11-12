package com.company;

import java.util.*;

public class Main {


            public static void main(String[] args) {

                HashMap<String, String[]> dictionary = new HashMap<>();

                dictionary.put("рассказ", new String[]{"новелла", "притча", "огласка", "доклад"});
                dictionary.put("кирпич", new String[]{"клинкер", "динас", "саман", "керамит"});
                dictionary.put("колесо", new String[]{"шестерня", "маховик", "шкив", "зубчатка"});
                dictionary.put("телефон", new String[]{"мобильник", "таксофон", "смартфон", "трубка"});

                for (Map.Entry<String, String[]> item : dictionary.entrySet()) {
                    System.out.println(item.getKey() + "-" + Arrays.toString(item.getValue()));

                }
                HashMap<String, String[]> bigDictionary = new HashMap<>();
                bigDictionary.putAll(dictionary);
                System.out.println("--------------------------");
                System.out.println(Arrays.toString(bigDictionary.get(" рассказ")));
                System.out.println("--------------------------");
                Set<String> keys = dictionary.keySet();
                Iterator<String> iter = keys.iterator();
                while (iter.hasNext()) {
                    String k = iter.next();
                    for (int i = 0; i < dictionary.get(k).length; i++) {
                        ArrayList<String> strings = new ArrayList<>();
                        Collections.addAll(strings, dictionary.get(k));
                        String l = strings.get(i);
                        strings.set(i, k);
                        String[] arr = new String[strings.size()];
                        for (int m = 0; m < strings.size(); m++) {
                            arr[m] = strings.get(m);
                        }
                        System.out.println("!-------!");
                        bigDictionary.put(l, arr);
                    }
                }

                dictionary.putAll(bigDictionary);

                System.out.println("BigDictionary: ");
                Set<String> keys1 = bigDictionary.keySet();
                Iterator<String> iter1 = keys1.iterator();
                while (iter1.hasNext()) {
                    String k = iter1.next();
                    System.out.println(Arrays.toString(bigDictionary.get(k)));
                }
                System.out.println("--------------------------------------");

            }

        }
