import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static String[] solve(String line) {
        StringBuilder evenGroup = new StringBuilder();
        StringBuilder oddGroup = new StringBuilder();

        for (int i = 0; i < line.length(); i += 2) {
            evenGroup.append(line.charAt(i));
        }

        for (int i = 1; i < line.length(); i += 2) {
            oddGroup.append(line.charAt(i));
        }

        return new String[] {String.valueOf(evenGroup), String.valueOf(oddGroup)};
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] lines = new String[n];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            lines[i] = line;
        }

        for (int i = 0; i < n; i++) {
            String[] result = solve(lines[i]);

            System.out.println(result[0] + " " + result[1]);
        }
    }

}
