package P7;

import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdType.kt */
/* loaded from: classes3.dex */
public final class r {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r INTERSTITIAL = new r("INTERSTITIAL", 0);
    public static final r BANNER = new r("BANNER", 1);
    public static final r NATIVE = new r("NATIVE", 2);
    public static final r REWARDED = new r("REWARDED", 3);

    private static final /* synthetic */ r[] $values() {
        return new r[]{INTERSTITIAL, BANNER, NATIVE, REWARDED};
    }

    static {
        r[] rVarArr$values = $values();
        $VALUES = rVarArr$values;
        $ENTRIES = com.google.gson.internal.c.l(rVarArr$values);
    }

    private r(String str, int i) {
    }

    public static InterfaceC4463a<r> getEntries() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
