public class PartyWinnerSelector {

    public static void main(String[] args) {

        int winningTicketNumber = generateWinningTicketNumber(1000, 1040);
        System.out.println("The winner of the party reward has an ticketNumber: " + winningTicketNumber );

    }

    private static int generateWinningTicketNumber(int a , int b) {

        double u = Math.random();
        int winningTicketNumber = (int) (a + u * (b - a ));

        return winningTicketNumber;
    }
}


