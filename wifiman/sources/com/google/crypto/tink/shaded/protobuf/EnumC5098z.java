package com.google.crypto.tink.shaded.protobuf;

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
/* renamed from: com.google.crypto.tink.shaded.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5098z {
    private static final /* synthetic */ EnumC5098z[] $VALUES;
    public static final EnumC5098z BOOLEAN;
    public static final EnumC5098z BYTE_STRING;
    public static final EnumC5098z DOUBLE;
    public static final EnumC5098z ENUM;
    public static final EnumC5098z FLOAT;
    public static final EnumC5098z INT;
    public static final EnumC5098z LONG;
    public static final EnumC5098z MESSAGE;
    public static final EnumC5098z STRING;
    public static final EnumC5098z VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        EnumC5098z enumC5098z = new EnumC5098z("VOID", 0, Void.class, Void.class, null);
        VOID = enumC5098z;
        Class cls = Integer.TYPE;
        EnumC5098z enumC5098z2 = new EnumC5098z("INT", 1, cls, Integer.class, 0);
        INT = enumC5098z2;
        EnumC5098z enumC5098z3 = new EnumC5098z("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = enumC5098z3;
        EnumC5098z enumC5098z4 = new EnumC5098z("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = enumC5098z4;
        EnumC5098z enumC5098z5 = new EnumC5098z("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = enumC5098z5;
        EnumC5098z enumC5098z6 = new EnumC5098z("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = enumC5098z6;
        EnumC5098z enumC5098z7 = new EnumC5098z("STRING", 6, String.class, String.class, "");
        STRING = enumC5098z7;
        EnumC5098z enumC5098z8 = new EnumC5098z("BYTE_STRING", 7, AbstractC5081h.class, AbstractC5081h.class, AbstractC5081h.f38499b);
        BYTE_STRING = enumC5098z8;
        EnumC5098z enumC5098z9 = new EnumC5098z("ENUM", 8, cls, Integer.class, null);
        ENUM = enumC5098z9;
        EnumC5098z enumC5098z10 = new EnumC5098z("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = enumC5098z10;
        $VALUES = new EnumC5098z[]{enumC5098z, enumC5098z2, enumC5098z3, enumC5098z4, enumC5098z5, enumC5098z6, enumC5098z7, enumC5098z8, enumC5098z9, enumC5098z10};
    }

    private EnumC5098z(String str, int i10, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static EnumC5098z valueOf(String str) {
        return (EnumC5098z) Enum.valueOf(EnumC5098z.class, str);
    }

    public static EnumC5098z[] values() {
        return (EnumC5098z[]) $VALUES.clone();
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
