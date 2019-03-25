package homework02;

public class Computer {

    private String HDD;
    private String RAM;

    public Computer(String HDD, String RAM) {
        this.HDD = HDD;
        this.RAM = RAM;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
    }


    public static class ComputerBuilder {
        private String HDD;
        private String RAM;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public Computer build() {
            return new Computer(this);
        }

    }
}
