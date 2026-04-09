package Bh;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Bh.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2496f {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC2496f[] $VALUES;
    private final String codeRepresentation;
    public static final EnumC2496f CLASS = new EnumC2496f("CLASS", 0, "class");
    public static final EnumC2496f INTERFACE = new EnumC2496f("INTERFACE", 1, "interface");
    public static final EnumC2496f ENUM_CLASS = new EnumC2496f("ENUM_CLASS", 2, "enum class");
    public static final EnumC2496f ENUM_ENTRY = new EnumC2496f("ENUM_ENTRY", 3, null);
    public static final EnumC2496f ANNOTATION_CLASS = new EnumC2496f("ANNOTATION_CLASS", 4, "annotation class");
    public static final EnumC2496f OBJECT = new EnumC2496f("OBJECT", 5, "object");

    private static final /* synthetic */ EnumC2496f[] $values() {
        return new EnumC2496f[]{CLASS, INTERFACE, ENUM_CLASS, ENUM_ENTRY, ANNOTATION_CLASS, OBJECT};
    }

    static {
        EnumC2496f[] enumC2496fArr$values = $values();
        $VALUES = enumC2496fArr$values;
        $ENTRIES = AbstractC5827b.a(enumC2496fArr$values);
    }

    private EnumC2496f(String str, int i10, String str2) {
        this.codeRepresentation = str2;
    }

    public static EnumC2496f valueOf(String str) {
        return (EnumC2496f) Enum.valueOf(EnumC2496f.class, str);
    }

    public static EnumC2496f[] values() {
        return (EnumC2496f[]) $VALUES.clone();
    }

    public final boolean isSingleton() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
