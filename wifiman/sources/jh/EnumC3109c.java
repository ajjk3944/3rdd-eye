package Jh;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Jh.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3109c {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC3109c[] $VALUES;
    private final String javaTarget;
    public static final EnumC3109c METHOD_RETURN_TYPE = new EnumC3109c("METHOD_RETURN_TYPE", 0, "METHOD");
    public static final EnumC3109c VALUE_PARAMETER = new EnumC3109c("VALUE_PARAMETER", 1, "PARAMETER");
    public static final EnumC3109c FIELD = new EnumC3109c("FIELD", 2, "FIELD");
    public static final EnumC3109c TYPE_USE = new EnumC3109c("TYPE_USE", 3, "TYPE_USE");
    public static final EnumC3109c TYPE_PARAMETER_BOUNDS = new EnumC3109c("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
    public static final EnumC3109c TYPE_PARAMETER = new EnumC3109c("TYPE_PARAMETER", 5, "TYPE_PARAMETER");

    private static final /* synthetic */ EnumC3109c[] $values() {
        return new EnumC3109c[]{METHOD_RETURN_TYPE, VALUE_PARAMETER, FIELD, TYPE_USE, TYPE_PARAMETER_BOUNDS, TYPE_PARAMETER};
    }

    static {
        EnumC3109c[] enumC3109cArr$values = $values();
        $VALUES = enumC3109cArr$values;
        $ENTRIES = AbstractC5827b.a(enumC3109cArr$values);
    }

    private EnumC3109c(String str, int i10, String str2) {
        this.javaTarget = str2;
    }

    public static EnumC3109c valueOf(String str) {
        return (EnumC3109c) Enum.valueOf(EnumC3109c.class, str);
    }

    public static EnumC3109c[] values() {
        return (EnumC3109c[]) $VALUES.clone();
    }

    public final String getJavaTarget() {
        return this.javaTarget;
    }
}
