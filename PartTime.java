package SOAL;

public class PartTime extends teacher {

        private int hoursworked;

        public PartTime() {
            super();
            hoursworked = 0;
        }

        public PartTime(int hoursworked, String name, int age, String subject) {
            super(name, age, subject);
            this.hoursworked = hoursworked;
        }

        public int getHoursworked() {
            return hoursworked;
        }

        public void setHoursworked(int hoursworked) {
            this.hoursworked = hoursworked;
        }
        public void print() {
            System.out.println("----Part Time Teacher-----");
            super.print();
            System.out.println("Hours Worked: " + hoursworked);
        }
    }

