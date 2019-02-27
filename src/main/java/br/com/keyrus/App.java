package br.com.keyrus;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new Pojo("Renã", 24));


        System.out.println(json);
    }


    private static class Pojo {
        String name;
        int age;


        public Pojo(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
