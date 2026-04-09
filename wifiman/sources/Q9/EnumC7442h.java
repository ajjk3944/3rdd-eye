package q9;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q9.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC7442h {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC7442h[] $VALUES;
    public static final EnumC7442h DEFAULT = new EnumC7442h("DEFAULT", 0);
    public static final EnumC7442h EDIT = new EnumC7442h("EDIT", 1);

    private static final /* synthetic */ EnumC7442h[] $values() {
        return new EnumC7442h[]{DEFAULT, EDIT};
    }

    static {
        EnumC7442h[] enumC7442hArr$values = $values();
        $VALUES = enumC7442hArr$values;
        $ENTRIES = AbstractC5827b.a(enumC7442hArr$values);
    }

    private EnumC7442h(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC7442h valueOf(String str) {
        return (EnumC7442h) Enum.valueOf(EnumC7442h.class, str);
    }

    public static EnumC7442h[] values() {
        return (EnumC7442h[]) $VALUES.clone();
    }
}
