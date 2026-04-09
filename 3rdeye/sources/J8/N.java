package J8;

import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SingularUtils.kt */
/* loaded from: classes3.dex */
public final class N {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ N[] $VALUES;
    public static final N ADMOB = new N("ADMOB", 0, "AdMob");
    public static final N APPLOVIN = new N("APPLOVIN", 1, "AppLovin");
    private final String type;

    private static final /* synthetic */ N[] $values() {
        return new N[]{ADMOB, APPLOVIN};
    }

    static {
        N[] nArr$values = $values();
        $VALUES = nArr$values;
        $ENTRIES = com.google.gson.internal.c.l(nArr$values);
    }

    private N(String str, int i, String str2) {
        this.type = str2;
    }

    public static InterfaceC4463a<N> getEntries() {
        return $ENTRIES;
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) $VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }
}
