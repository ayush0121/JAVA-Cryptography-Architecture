import java.security.MessageDigest;

public class simplehash {
    public static void main(String[] args) throws Exception {
        String simple = "A string";
        MessageDigest md = MessageDigest.getInstance("MD5"); // messagedisgest is the central class to create hashes

        // we create a byte for a hashes and in output too we will get the hash in byte
        // form
        byte[] ret = md.digest(simple.getBytes("UTF-8")); // digest method create a direct output

        System.out.println("the length of the hash is : " + ret.length);

        for (byte b : ret) {
            System.out.print(b + ",");
        }

    }

}