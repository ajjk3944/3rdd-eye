package S5;

import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BalloonHighlightAnimation.kt */
/* loaded from: classes2.dex */
public final class n {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n NONE = new n("NONE", 0);
    public static final n HEARTBEAT = new n("HEARTBEAT", 1);
    public static final n SHAKE = new n("SHAKE", 2);
    public static final n BREATH = new n("BREATH", 3);
    public static final n ROTATE = new n("ROTATE", 4);

    private static final /* synthetic */ n[] $values() {
        return new n[]{NONE, HEARTBEAT, SHAKE, BREATH, ROTATE};
    }

    static {
        n[] nVarArr$values = $values();
        $VALUES = nVarArr$values;
        $ENTRIES = com.google.gson.internal.c.l(nVarArr$values);
    }

    private n(String str, int i) {
    }

    public static InterfaceC4463a<n> getEntries() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
