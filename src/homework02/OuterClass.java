package homework02;

public class OuterClass {
    private static String staticVariale = "Have access to private static variable of outer class. ";
    private String nonStaticVariale = "Have access to private non-static variable of outer class. ";

    public static class StaticNestedClass {
        void showMsg() {
            System.out.println("Hello from StaticNestedClass. " + staticVariale);
        }
    }

    private class InnerClass {
        void showMsg() {
            System.out.println("Hello from InnerClass. " + staticVariale + nonStaticVariale);
        }
    }

    public void print(String string) {
        String methodsStr = "Have acces to methods string";
        class LocalClass {
            void showMsg() {
                System.out.println("Hello from LocalClass. " + staticVariale + nonStaticVariale + methodsStr);
            }
        }
        LocalClass local = new LocalClass();
        local.showMsg();
    }


}
