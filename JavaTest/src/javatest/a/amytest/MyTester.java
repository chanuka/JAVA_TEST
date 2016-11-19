/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest.a.amytest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author chanuka
 */
public class MyTester {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("chanu", "locha", "kasun", "gayan", "epic");

        
        System.out.println(myList.stream()			// Convert to steam
	.filter(x -> x.startsWith("k")&& x.endsWith("n"))               // we want "michael" only
	.findAny()					// If 'findAny' then return found
	.orElse(null));
        
        
        List<String> result = myList.stream() //convert list to stream
                .filter(line -> !line.startsWith("c")) //filters the line, equals to "mkyong"
                .collect(Collectors.toList());
//        result.forEach(System.out::println);

        
        
        List<String> changed = myList.stream()
                .map(it -> it.toUpperCase()).collect(Collectors.toList());
//        changed.forEach(System.out::println);

        myList.sort((String o1, String o2) -> o1.compareTo(o2));
//        myList.forEach(System.out::println);

    }

}
