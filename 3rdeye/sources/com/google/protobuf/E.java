package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: JavaType.java */
/* loaded from: classes2.dex */
public final class E {
    private static final /* synthetic */ E[] $VALUES;
    public static final E BOOLEAN;
    public static final E BYTE_STRING;
    public static final E DOUBLE;
    public static final E ENUM;
    public static final E FLOAT;
    public static final E INT;
    public static final E LONG;
    public static final E MESSAGE;
    public static final E STRING;
    public static final E VOID = new E("VOID", 0, Void.class, Void.class, null);
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    private static /* synthetic */ E[] $values() {
        return new E[]{VOID, INT, LONG, FLOAT, DOUBLE, BOOLEAN, STRING, BYTE_STRING, ENUM, MESSAGE};
    }

    static {
        Class cls = Integer.TYPE;
        INT = new E("INT", 1, cls, Integer.class, 0);
        LONG = new E("LONG", 2, Long.TYPE, Long.class, 0L);
        FLOAT = new E("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        DOUBLE = new E("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        BOOLEAN = new E("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        STRING = new E("STRING", 6, String.class, String.class, "");
        BYTE_STRING = new E("BYTE_STRING", 7, AbstractC4026i.class, AbstractC4026i.class, AbstractC4026i.EMPTY);
        ENUM = new E("ENUM", 8, cls, Integer.class, null);
        MESSAGE = new E("MESSAGE", 9, Object.class, Object.class, null);
        $VALUES = $values();
    }

    private E(String str, int i, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) $VALUES.clone();
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
