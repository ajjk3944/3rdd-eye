package pi;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class N0 {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ N0[] $VALUES;
    public static final N0 INVARIANT = new N0("INVARIANT", 0, "", true, true, 0);
    public static final N0 IN_VARIANCE = new N0("IN_VARIANCE", 1, "in", true, false, -1);
    public static final N0 OUT_VARIANCE = new N0("OUT_VARIANCE", 2, "out", false, true, 1);
    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;
    private final String label;
    private final int superpositionFactor;

    private static final /* synthetic */ N0[] $values() {
        return new N0[]{INVARIANT, IN_VARIANCE, OUT_VARIANCE};
    }

    static {
        N0[] n0Arr$values = $values();
        $VALUES = n0Arr$values;
        $ENTRIES = AbstractC5827b.a(n0Arr$values);
    }

    private N0(String str, int i10, String str2, boolean z10, boolean z11, int i11) {
        this.label = str2;
        this.allowsInPosition = z10;
        this.allowsOutPosition = z11;
        this.superpositionFactor = i11;
    }

    public static N0 valueOf(String str) {
        return (N0) Enum.valueOf(N0.class, str);
    }

    public static N0[] values() {
        return (N0[]) $VALUES.clone();
    }

    public final boolean getAllowsOutPosition() {
        return this.allowsOutPosition;
    }

    public final String getLabel() {
        return this.label;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.label;
    }
}
