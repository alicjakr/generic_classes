class Addition<T extends Number, U extends Number> {
    double add(T x, U y) {
        if(isValidType(x) && isValidType(y)) {
            return x.doubleValue() + y.doubleValue();
        } else {
            throw new IllegalArgumentException();
        }
    }

    //helper method for checking the type
    private boolean isValidType(Number num) {
        return num instanceof Integer || num instanceof Double || num instanceof Long;
    }
}
