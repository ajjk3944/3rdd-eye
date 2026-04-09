package ls;

/* loaded from: classes.dex */
public enum i implements rs.q {
    CLASS(0, 0),
    INTERFACE(1, 1),
    ENUM_CLASS(2, 2),
    ENUM_ENTRY(3, 3),
    ANNOTATION_CLASS(4, 4),
    OBJECT(5, 5),
    COMPANION_OBJECT(6, 6);

    private static rs.r internalValueMap = new sm.f(15);
    private final int value;

    i(int i10, int i11) {
        this.value = i11;
    }

    @Override // rs.q
    public final int getNumber() {
        return this.value;
    }

    public static i valueOf(int i10) {
        switch (i10) {
            case 0:
                return CLASS;
            case 1:
                return INTERFACE;
            case 2:
                return ENUM_CLASS;
            case 3:
                return ENUM_ENTRY;
            case 4:
                return ANNOTATION_CLASS;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return OBJECT;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return COMPANION_OBJECT;
            default:
                return null;
        }
    }
}
