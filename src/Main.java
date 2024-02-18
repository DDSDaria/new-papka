import java.security.PublicKey;

public class Main {
    

    public static void main(String[] args) {

        record Student (String name, int age) {
            private static final int adultAge = 18;
            public  boolean isAdult() {
                return age >= adultAge;
            }
                public static Student createAdultStudent(String name){
                    return new Student(name, adultAge);
                }
            }
        }
    }
