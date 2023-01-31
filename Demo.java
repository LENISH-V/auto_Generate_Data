import java.util.Random;
import java.util.stream.Stream;

class Demo {
    public static void main(String args[]) {

        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

        String id = "";
        String name = "";
        String email = "";
        String number = "";
        String age = "";
        String salary = "";
        String department = "";
        String position = "";
        String city = "";
        String dob = "";
        String shift = "";
        String technology = "";

        String[] departmentList = new String[] { "human resource", "marketing", "web developer", "app developer",
                "ios developer", "business development", "testing department", "ui/ux designing", "deployment",
                "accountant" };

        String[] positionlist = new String[] { "manager", "hr manager", "senior software developer",
                "junior software developer", "intern", "BDE", "qaulity analysis", "devops engineer" };

        String[] cityList = new String[] { "junagadh", "ahemdabad", "visavadar", "gandhinagar", "juni chavand", "botad",
                "kuba", "gadhda", "mota dadva", "modasa", "godhra", "surat", "jamnagar", "amreli", "mumbai", "delhi",
                "goa", "bengluru", "chennai", "zarkhand", "america", "canada", "uk", "new jeasrey" };

        String[] shiftList = new String[] { "day", "night" };

        String[] technologyList = new String[] { "java", "spring", "dot net", "java script", "django", "python", "odoo",
                "selsforce", "react js", "node js", "android", "swift", "c sharp" };

        for (int val = 0; val <= 500; val++) {

            id = String.valueOf(val);

            name = nameGenerate();

            email = emailGenerate();

            number = numberGenerate();

            age = ageGenrate();

            department = departmentGenerate(departmentList);

            position = positionGenerate(positionlist);

            city = cityGenerate(cityList);

            technology = technologyGenerate(technologyList);

            shift = shiftGenerate(shiftList);

            salary = salaryGenerate(position);

            dob = dobGenerate(age);

            System.out.println("(" + val + "," + '"' + name + '"' + "," + '"' + email + '"' + "," + '"'
                    + number + '"' + "," + age + "," + '"' + department
                    + '"' + "," + '"' + position + '"' + "," + '"' + city + '"' + "," + '"' + technology + '"' + ","
                    + '"' + shift + '"' + "," + '"' + salary + '"' + "),");

        }

    }

    // nameGenerate function
    protected static String nameGenerate() {

        int minn = 4;
        int max = 10;
        int random = (int) (Math.random() * (max - minn + 1) + minn);

        StringBuilder sb = new StringBuilder();
        String NameToken = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < random; i++) {
            int index = (int) (NameToken.length() * Math.random());
            sb.append(NameToken.charAt(index));
        }

        return sb.toString();
    }

    // emailGenerate function
    protected static String emailGenerate() {

        int minn = 8;
        int max = 12;
        int random = (int) (Math.random() * (max - minn + 1) + minn);

        StringBuilder sb = new StringBuilder();
        String NameToken = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz";
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

        for (int i = 0; i < 2; i++) {
            int index = (int) (NameToken.length() * Math.random());
            sb.append(NameToken.charAt(index));
        }
        for (int i = 0; i < random; i++) {
            int index = (int) (AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }

        int mii = 1;
        int mxx = 3;
        int ran = (int) (Math.random() * (mxx - mii + 1) + mii);

        if (ran == 1)
            return sb.toString() + "@gmail.com";
        else if (ran == 2)
            return sb.toString() + "@yahoo.com";
        else
            return sb.toString() + "@hotmail.com";
    }

    // numberGenerate function
    protected static String numberGenerate() {

        StringBuilder sb = new StringBuilder();
        String NameToken = "0123456789";

        for (int i = 0; i < 2; i++) {
            int index = (int) (NameToken.length() * Math.random());
            sb.append(NameToken.charAt(index));
        }

        for (int i = 0; i < 8; i++) {
            int index = (int) (NameToken.length() * Math.random());
            sb.append(NameToken.charAt(index));
        }

        return sb.toString();
    }

    // ageGenerate function
    protected static String ageGenrate() {
        int minn = 16;
        int max = 75;
        int random = (int) (Math.random() * (max - minn + 1) + minn);

        return String.valueOf(random);
    }

    // deparmentGenerate function
    protected static String departmentGenerate(String[] ar) {
        int minn = 0;
        int max = ar.length - 1;
        int random = (int) (Math.random() * (max - minn + 1) + minn);

        return ar[random];
    }

    // positionGenerate function
    protected static String positionGenerate(String[] ar) {
        int minn = 0;
        int max = ar.length - 1;
        int random = (int) (Math.random() * (max - minn + 1) + minn);

        return ar[random];
    }

    // cityGenerate function
    protected static String cityGenerate(String[] ar) {
        int minn = 0;
        int max = ar.length - 1;
        int random = (int) (Math.random() * (max - minn + 1) + minn);

        return ar[random];
    }

    // technologyGenerate function
    protected static String technologyGenerate(String[] ar) {
        int minn = 0;
        int max = ar.length - 1;
        int random = (int) (Math.random() * (max - minn + 1) + minn);

        return ar[random];
    }

    // shiftGenerate function
    protected static String shiftGenerate(String[] ar) {
        int minn = 0;
        int max = ar.length - 1;
        int random = (int) (Math.random() * (max - minn + 1) + minn);

        return ar[random];
    }

    // salaryGenerate function
    protected static String salaryGenerate(String position) {

        String[] positionlist = new String[] { "research analyst", "manager", "hr manager", "senior software developer",
                "junior software developer", "intern", "BDE", "qaulity analysis", "devops engineer" };

        int min = 0;
        int max = 0;

        if (position.equals(positionlist[0])) {
            min = 3000000;
            max = 10000000;
        } else if (position.equals(positionlist[1])) {
            min = 250000;
            max = 800000;
        } else if (position.equals(positionlist[2])) {
            min = 200000;
            max = 500000;
        } else if (position.equals(positionlist[3])) {
            min = 100000;
            max = 300000;
        } else if (position.equals(positionlist[4])) {
            min = 50000;
            max = 200000;
        } else if (position.equals(positionlist[5])) {
            min = 30000;
            max = 150000;
        } else if (position.equals(positionlist[6])) {
            min = 25000;
            max = 90000;
        } else if (position.equals(positionlist[7])) {
            min = 20000;
            max = 80000;
        } else if (position.equals(positionlist[8])) {
            min = 150000;
            max = 600000;
        }
        int random = (int) (Math.random() * (max - min + 1) + min);

        return String.valueOf(random);
    }

    protected static String dobGenerate(String age) {

        int year = 2023 - Integer.parseInt(age);

        int minn = 1;
        int max = 12;
        int randomM = (int) (Math.random() * (max - minn + 1) + minn);

        int minD = 1;
        int maxD = 30;
        int randomD = (int) (Math.random() * (maxD - minD + 1) + minD);

        String s = String.valueOf(year) + "-" + String.valueOf(randomM) + "-" + String.valueOf(randomD);

        return s;
    }

}