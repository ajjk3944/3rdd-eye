package R7;

import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BannerType.kt */
/* loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e BANNER = new e("BANNER", 0);
    public static final e LARGE_BANNER = new e("LARGE_BANNER", 1);
    public static final e MEDIUM_RECTANGLE = new e("MEDIUM_RECTANGLE", 2);
    public static final e FULL_BANNER = new e("FULL_BANNER", 3);
    public static final e LEADERBOARD = new e("LEADERBOARD", 4);
    public static final e ADAPTIVE = new e("ADAPTIVE", 5);
    public static final e ADAPTIVE_ANCHORED = new e("ADAPTIVE_ANCHORED", 6);

    private static final /* synthetic */ e[] $values() {
        return new e[]{BANNER, LARGE_BANNER, MEDIUM_RECTANGLE, FULL_BANNER, LEADERBOARD, ADAPTIVE, ADAPTIVE_ANCHORED};
    }

    static {
        e[] eVarArr$values = $values();
        $VALUES = eVarArr$values;
        $ENTRIES = com.google.gson.internal.c.l(eVarArr$values);
    }

    private e(String str, int i) {
    }

    public static InterfaceC4463a<e> getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
