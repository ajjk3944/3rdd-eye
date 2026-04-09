package g4;

/* loaded from: classes.dex */
public enum i {
    BOOLEAN(1),
    FLOAT(2),
    INTEGER(3),
    LONG(4),
    STRING(5),
    STRING_SET(6),
    DOUBLE(7),
    BYTES(8),
    VALUE_NOT_SET(0);

    private final int value;

    i(int i10) {
        this.value = i10;
    }

    public static i forNumber(int i10) {
        switch (i10) {
            case 0:
                return VALUE_NOT_SET;
            case 1:
                return BOOLEAN;
            case 2:
                return FLOAT;
            case 3:
                return INTEGER;
            case 4:
                return LONG;
            case j.STRING_FIELD_NUMBER /* 5 */:
                return STRING;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return STRING_SET;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return DOUBLE;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                return BYTES;
            default:
                return null;
        }
    }

    public int getNumber() {
        return this.value;
    }

    @Deprecated
    public static i valueOf(int i10) {
        return forNumber(i10);
    }
}
