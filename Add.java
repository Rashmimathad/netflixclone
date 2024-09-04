class Add {
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a two-digit number: ");
       int number = scanner.nextInt();
       if (number >= 10 && number <= 99) {
           int tensDigit = number / 10;
           int unitsDigit = number % 10;
           int sum = tensDigit + unitsDigit;
           System.out.println("Sum of the digits: " + sum);
       } else {
           System.out.println("Invalid input. Please enter a valid two-digit number.");
       }

       scanner.close();
   }
}   