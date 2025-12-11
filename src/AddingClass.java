class AddingClass<T, U> {
    //adds two numbers of different data types (Integer, Double, Long)
    T t;
    U u;

    void setT(T t) {
        this.t = t;
    }

    T getT() {
        return t;
    }

    void setU(U u) {
        this.u = u;
    }

    U getU() {
        return u;
    }

    public <T extends Number> T addingValues(T t, U u) {
        if (t == null || u == null) {
            return null;
        }

        if (t instanceof Integer) {
            return (T) new Integer(t.intValue() + u.intValue());
        } else if (t instanceof Double) {
            return (T) new Double(t.doubleValue() + u.doubleValue());
        } else if (t instanceof Long) {
            return (T) new Long(t.longValue() + u.longValue());
        } else {
            throw new IllegalArgumentException("Invalid type for adding values");
        }
    }
}