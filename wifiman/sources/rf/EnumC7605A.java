package rf;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: rf.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class EnumC7605A {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC7605A[] $VALUES;
    public static final EnumC7605A NONE = new EnumC7605A("NONE", 0);
    public static final EnumC7605A CHECKMARK = new EnumC7605A("CHECKMARK", 1);
    public static final EnumC7605A DOTS = new EnumC7605A("DOTS", 2);

    private static final /* synthetic */ EnumC7605A[] $values() {
        return new EnumC7605A[]{NONE, CHECKMARK, DOTS};
    }

    static {
        EnumC7605A[] enumC7605AArr$values = $values();
        $VALUES = enumC7605AArr$values;
        $ENTRIES = AbstractC5827b.a(enumC7605AArr$values);
    }

    private EnumC7605A(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC7605A valueOf(String str) {
        return (EnumC7605A) Enum.valueOf(EnumC7605A.class, str);
    }

    public static EnumC7605A[] values() {
        return (EnumC7605A[]) $VALUES.clone();
    }
}
