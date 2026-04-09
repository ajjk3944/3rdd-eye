package pi;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class I0 {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ I0[] $VALUES;
    public static final I0 SUPERTYPE = new I0("SUPERTYPE", 0);
    public static final I0 COMMON = new I0("COMMON", 1);

    private static final /* synthetic */ I0[] $values() {
        return new I0[]{SUPERTYPE, COMMON};
    }

    static {
        I0[] i0Arr$values = $values();
        $VALUES = i0Arr$values;
        $ENTRIES = AbstractC5827b.a(i0Arr$values);
    }

    private I0(String str, int i10) {
    }

    public static I0 valueOf(String str) {
        return (I0) Enum.valueOf(I0.class, str);
    }

    public static I0[] values() {
        return (I0[]) $VALUES.clone();
    }
}
