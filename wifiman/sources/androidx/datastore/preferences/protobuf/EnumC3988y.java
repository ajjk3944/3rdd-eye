package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3988y {
    private static final /* synthetic */ EnumC3988y[] $VALUES;
    public static final EnumC3988y BOOLEAN;
    public static final EnumC3988y BYTE_STRING;
    public static final EnumC3988y DOUBLE;
    public static final EnumC3988y ENUM;
    public static final EnumC3988y FLOAT;
    public static final EnumC3988y INT;
    public static final EnumC3988y LONG;
    public static final EnumC3988y MESSAGE;
    public static final EnumC3988y STRING;
    public static final EnumC3988y VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        EnumC3988y enumC3988y = new EnumC3988y("VOID", 0, Void.class, Void.class, null);
        VOID = enumC3988y;
        Class cls = Integer.TYPE;
        EnumC3988y enumC3988y2 = new EnumC3988y("INT", 1, cls, Integer.class, 0);
        INT = enumC3988y2;
        EnumC3988y enumC3988y3 = new EnumC3988y("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = enumC3988y3;
        EnumC3988y enumC3988y4 = new EnumC3988y("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = enumC3988y4;
        EnumC3988y enumC3988y5 = new EnumC3988y("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = enumC3988y5;
        EnumC3988y enumC3988y6 = new EnumC3988y("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = enumC3988y6;
        EnumC3988y enumC3988y7 = new EnumC3988y("STRING", 6, String.class, String.class, "");
        STRING = enumC3988y7;
        EnumC3988y enumC3988y8 = new EnumC3988y("BYTE_STRING", 7, AbstractC3971g.class, AbstractC3971g.class, AbstractC3971g.f30858b);
        BYTE_STRING = enumC3988y8;
        EnumC3988y enumC3988y9 = new EnumC3988y("ENUM", 8, cls, Integer.class, null);
        ENUM = enumC3988y9;
        EnumC3988y enumC3988y10 = new EnumC3988y("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = enumC3988y10;
        $VALUES = new EnumC3988y[]{enumC3988y, enumC3988y2, enumC3988y3, enumC3988y4, enumC3988y5, enumC3988y6, enumC3988y7, enumC3988y8, enumC3988y9, enumC3988y10};
    }

    private EnumC3988y(String str, int i10, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static EnumC3988y valueOf(String str) {
        return (EnumC3988y) Enum.valueOf(EnumC3988y.class, str);
    }

    public static EnumC3988y[] values() {
        return (EnumC3988y[]) $VALUES.clone();
    }

    public Class<?> getBoxedType() {
        return this.boxedType;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public Class<?> getType() {
        return this.type;
    }

    public boolean isValidType(Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }
}
