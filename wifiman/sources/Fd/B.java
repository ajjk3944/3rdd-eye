package Fd;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class B {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ B[] $VALUES;
    public static final B REACHABLE = new B("REACHABLE", 0);
    public static final B UNSTABLE = new B("UNSTABLE", 1);
    public static final B UNREACHABLE = new B("UNREACHABLE", 2);

    private static final /* synthetic */ B[] $values() {
        return new B[]{REACHABLE, UNSTABLE, UNREACHABLE};
    }

    static {
        B[] bArr$values = $values();
        $VALUES = bArr$values;
        $ENTRIES = AbstractC5827b.a(bArr$values);
    }

    private B(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) $VALUES.clone();
    }
}
