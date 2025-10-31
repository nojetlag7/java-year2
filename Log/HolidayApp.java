import java.util.*;

public class HolidayApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Map<String, String> nameToPhone = new HashMap<>();
        Map<String, Integer> nameToRating = new HashMap<>();
        Map<Integer, Integer> ratingFrequency = new HashMap<>();

        System.out.println("=== Student Holiday App ===");

        while (true) {
            System.out.print("Enter student's name (or 'z' to stop): ");
            String name = input.nextLine().trim();

            if (name.equalsIgnoreCase("z")) {
                break;
            }

            if (nameToPhone.containsKey(name)) {
                System.out.println("This student has already been entered. Try another.");
                continue;
            }

            // Phone number validation
            String phone = "";
            while (true) {
                System.out.print("Enter phone number (10 digits): ");
                phone = input.nextLine().trim();

                if (isValidPhoneNumber(phone)) {
                    break;
                } else {
                    System.out.println("Invalid phone number. It must be exactly 10 digits.");
                }
            }

            int rating = 0;
            while (true) {
                try {
                    System.out.print("Enter holiday destination rating (1-7): ");
                    rating = Integer.parseInt(input.nextLine().trim());
                    if (rating < 1 || rating > 7) {
                        throw new NumberFormatException();
                        //System.out.println("Rating must be between 1 and 7. Try again.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number from 1 to 7.");
                }
            }

            // Store the values
            nameToPhone.put(name, phone);
            nameToRating.put(name, rating);
            ratingFrequency.put(rating, ratingFrequency.getOrDefault(rating, 0) + 1);
        }

        // Display count
        System.out.println("\nTotal students entered: " + nameToPhone.size());

        // Sort and display rating frequency
        System.out.println("\nRating Frequencies (Descending):");
        List<Map.Entry<Integer, Integer>> sortedRatings = new ArrayList<>(ratingFrequency.entrySet());
        sortedRatings.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<Integer, Integer> entry : sortedRatings) {
            System.out.println("Rating " + entry.getKey() + ": " + entry.getValue() + " time(s)");
        }

        // Allow user to look up a name
        System.out.println("\n--- Lookup Student Info ---");
        while (true) {
            System.out.print("Enter a name to look up (or 'z' to quit): ");
            String searchName = input.nextLine().trim();
            if (searchName.equalsIgnoreCase("z")) {
                break;
            }

            if (nameToPhone.containsKey(searchName)) {
                System.out.println("Phone: " + nameToPhone.get(searchName));
                System.out.println("Rating: " + nameToRating.get(searchName));
            } else {
                System.out.println("Student not found.");
            }
        }

        System.out.println("=== Application Ended ===");
        input.close();
    }

    // Static method for phone number validation
    public static boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\d{10}"); //  \\d means is a number and {10} sets the required length
    }
}
