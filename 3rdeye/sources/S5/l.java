package S5;

import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BalloonAnimation.kt */
/* loaded from: classes2.dex */
public final class l {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l NONE = new l("NONE", 0);
    public static final l ELASTIC = new l("ELASTIC", 1);
    public static final l FADE = new l("FADE", 2);
    public static final l CIRCULAR = new l("CIRCULAR", 3);
    public static final l OVERSHOOT = new l("OVERSHOOT", 4);

    private static final /* synthetic */ l[] $values() {
        return new l[]{NONE, ELASTIC, FADE, CIRCULAR, OVERSHOOT};
    }

    static {
        l[] lVarArr$values = $values();
        $VALUES = lVarArr$values;
        $ENTRIES = com.google.gson.internal.c.l(lVarArr$values);
    }

    private l(String str, int i) {
    }

    public static InterfaceC4463a<l> getEntries() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
