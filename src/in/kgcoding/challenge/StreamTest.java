package in.kgcoding.challenge;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = List.of("Prashant","Sanchit" , "KG Coding");
        names.stream()
                .forEach(name -> System.out.println(name));
    }
}
