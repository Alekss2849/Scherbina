public class NewArr {
    public String[] NewArray(String[] newArray_st)
    {
        NumFunc numFunc = new NumFunc();

        int sum = numFunc.Sum(newArray_st);
        System.out.println("sum = " + sum);

        int middle = numFunc.Middle(sum, newArray_st.length);
        System.out.println("middle = " + middle);

        int countLess = numFunc.CountLess(newArray_st, middle);
        System.out.println("count = " + countLess);


        return numFunc.FillArrayWithLess(newArray_st, countLess, middle);
    }
}
