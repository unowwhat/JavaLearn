class LambdaDemo {
    public static void main(String[] args) {
        MyValue myVal;
        myVal = () -> 98.6;
        System.out.println("Постоянное знчение: " + myVal.getValue());
        MyParamValue myPVal = (n) -> 1.0 / n;
        System.out.println("Получаем 1/4: " + myPVal.getValue(4.0));
        System.out.println("Получаем 1/8: " + myPVal.getValue(8.0));
    }
}
