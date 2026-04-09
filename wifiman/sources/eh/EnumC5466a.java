package eh;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: eh.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC5466a {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC5466a[] $VALUES;
    public static final EnumC5466a COROUTINE_SUSPENDED = new EnumC5466a("COROUTINE_SUSPENDED", 0);
    public static final EnumC5466a UNDECIDED = new EnumC5466a("UNDECIDED", 1);
    public static final EnumC5466a RESUMED = new EnumC5466a("RESUMED", 2);

    private static final /* synthetic */ EnumC5466a[] $values() {
        return new EnumC5466a[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    static {
        EnumC5466a[] enumC5466aArr$values = $values();
        $VALUES = enumC5466aArr$values;
        $ENTRIES = AbstractC5827b.a(enumC5466aArr$values);
    }

    private EnumC5466a(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5466a valueOf(String str) {
        return (EnumC5466a) Enum.valueOf(EnumC5466a.class, str);
    }

    public static EnumC5466a[] values() {
        return (EnumC5466a[]) $VALUES.clone();
    }
}
