package nf;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g LATENCY = new g("LATENCY", 0);
    public static final g DOWN = new g("DOWN", 1);
    public static final g UP = new g("UP", 2);

    private static final /* synthetic */ g[] $values() {
        return new g[]{LATENCY, DOWN, UP};
    }

    static {
        g[] gVarArr$values = $values();
        $VALUES = gVarArr$values;
        $ENTRIES = AbstractC5827b.a(gVarArr$values);
    }

    private g(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
