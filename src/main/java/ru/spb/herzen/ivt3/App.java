package ru.spb.herzen.ivt3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App 
{
    public static void main( String[] args )
    {
        Function<Integer, Integer> NumberCrusher = n -> n*2;

        System.out.println("List of numbers");
        List<Integer> numbers = new Random().ints(10, 0, 100).mapToObj(i -> new Integer(i)).collect(Collectors.toList());
        numbers.forEach(System.out::println);

        System.out.println("List of even numbers");
        numbers = numbers.stream().filter(i -> i%2==0).sorted().collect(Collectors.toList());
        numbers.forEach(System.out::println);

        System.out.println("List of even numbers");
        numbers.stream().map(NumberCrusher).forEach(System.out::println);
    }
}
