package MyHomeWork.HomeWork12;

public class Restaurant {

    String restaurantName;
    int maxGuestCapacity;
    int currentGuestCount = 0;
    int totalGuestCount;

    public Restaurant(String restaurantName, int maxGuestCapacity) {
        this.restaurantName = restaurantName;
        this.maxGuestCapacity = maxGuestCapacity;
    }

    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Olive Garden", 250);
        Restaurant restaurant2 = new Restaurant("Black night", 300);

        restaurant1.seatsParty(150);
        restaurant1.seatsParty(10);
        restaurant1.availableSeats(50);
        restaurant1.removeParty(20);
        restaurant1.restaurantSummary();


        restaurant2.seatsParty(50);
        restaurant2.seatsParty(23);
        restaurant2.availableSeats(40);
        restaurant2.removeParty(10);
        restaurant2.restaurantSummary();
    }

    public void availableSeats(int seatsRequest) {
        if (seatsRequest <= 0) {
            System.out.printf("\nInvalid data entered");
        } else if (seatsRequest <= (maxGuestCapacity - currentGuestCount)) {
            System.out.printf("\nCongratulations! We have " + seatsRequest + " available seats.");
        } else {
            System.out.printf("\nSorry, we do not have any available seats at this moment.");
        }
    }

    public void seatsParty(int addSeats) {
        if (addSeats <= 0) {
            System.out.printf("\nInvalid data entered");
        } else if (addSeats > (maxGuestCapacity - currentGuestCount)) {
            System.out.printf("\nNot able to add " + addSeats + " seats.");
        } else {
            currentGuestCount = currentGuestCount + addSeats;
            totalGuestCount = currentGuestCount;
            System.out.printf("\nAdded " + addSeats + " seats.");
        }
    }

    public void removeParty(int removeSeats) {
        if (removeSeats <= 0) {
            System.out.printf("\nInvalid data entered");
        } else if (removeSeats > (currentGuestCount)) {
            System.out.printf("\nNot able to remove " + removeSeats + " seats. The current guest current is " + currentGuestCount);
        } else {
            currentGuestCount = currentGuestCount - removeSeats;
            totalGuestCount = currentGuestCount;
            System.out.printf("\nRemoved " + removeSeats + " seats.");
        }
    }

    public void restaurantSummary() {
        System.out.println("\n\nRestaurant Name: " + restaurantName +
                "\nMaximum Restaurant Capacity: " + maxGuestCapacity +
                "\nCurrent Guest count: " + currentGuestCount +
                "\nTotal Guests served so far: " + totalGuestCount);
    }


}


