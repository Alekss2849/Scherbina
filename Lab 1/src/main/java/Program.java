public class Program {
    public static void main(String[] args) {
        NewArr newArr = new NewArr();
        String strings[] = new String[]{"123456", "12345", "1234", "123", "12", "1", "123", "1", "1", "1"};
        PrintArray(strings);
        System.out.println(" ");
        PrintArray(newArr.NewArray(strings));

    }

    public static void PrintArray(String[] Arr)
    {
        for(int i = 0; i<Arr.length; i++)
        {
            System.out.print(Arr[i] + " ");
        }
    }
}
