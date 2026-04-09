package ls;

/* loaded from: classes.dex */
public enum c implements rs.q {
    BYTE(0, 0),
    CHAR(1, 1),
    SHORT(2, 2),
    INT(3, 3),
    LONG(4, 4),
    FLOAT(5, 5),
    DOUBLE(6, 6),
    BOOLEAN(7, 7),
    STRING(8, 8),
    CLASS(9, 9),
    ENUM(10, 10),
    ANNOTATION(11, 11),
    ARRAY(12, 12);

    private static rs.r internalValueMap = new io.sentry.hints.i(15);
    private final int value;

    c(int i10, int i11) {
        this.value = i11;
    }

    @Override // rs.q
    public final int getNumber() {
        return this.value;
    }

    public static c valueOf(int i10) {
        switch (i10) {
            case 0:
                return BYTE;
            case 1:
                return CHAR;
            case 2:
                return SHORT;
            case 3:
                return INT;
            case 4:
                return LONG;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return FLOAT;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return DOUBLE;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return BOOLEAN;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return STRING;
            case 9:
                return CLASS;
            case 10:
                return ENUM;
            case 11:
                return ANNOTATION;
            case 12:
                return ARRAY;
            default:
                return null;
        }
    }
}
