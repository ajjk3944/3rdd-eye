package bh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final f Companion;

    /* renamed from: id, reason: collision with root package name */
    private final int f2752id;
    public static final g TESTING = new g("TESTING", 0, 1);
    public static final g CONNECTED_VIA_MOBILE = new g("CONNECTED_VIA_MOBILE", 1, 2);
    public static final g CONNECTED_VIA_WIFI = new g("CONNECTED_VIA_WIFI", 2, 3);
    public static final g CONNECTED_TO_MOBILE_NO_INTERNET = new g("CONNECTED_TO_MOBILE_NO_INTERNET", 3, 4);
    public static final g CONNECTED_TO_WIFI_NO_INTERNET = new g("CONNECTED_TO_WIFI_NO_INTERNET", 4, 5);
    public static final g CONNECTED_TO_MOBILE_POSSIBLE_ISSUES = new g("CONNECTED_TO_MOBILE_POSSIBLE_ISSUES", 5, 6);
    public static final g CONNECTED_TO_WIFI_POSSIBLE_ISSUES = new g("CONNECTED_TO_WIFI_POSSIBLE_ISSUES", 6, 7);
    public static final g WEAK_MOBILE_CONNECTION = new g("WEAK_MOBILE_CONNECTION", 7, 8);
    public static final g WEAK_WIFI_CONNECTION = new g("WEAK_WIFI_CONNECTION", 8, 9);
    public static final g NO_MOBILE_CONNECTION = new g("NO_MOBILE_CONNECTION", 9, 10);
    public static final g NO_WIFI_CONNECTION = new g("NO_WIFI_CONNECTION", 10, 11);

    private static final /* synthetic */ g[] $values() {
        return new g[]{TESTING, CONNECTED_VIA_MOBILE, CONNECTED_VIA_WIFI, CONNECTED_TO_MOBILE_NO_INTERNET, CONNECTED_TO_WIFI_NO_INTERNET, CONNECTED_TO_MOBILE_POSSIBLE_ISSUES, CONNECTED_TO_WIFI_POSSIBLE_ISSUES, WEAK_MOBILE_CONNECTION, WEAK_WIFI_CONNECTION, NO_MOBILE_CONNECTION, NO_WIFI_CONNECTION};
    }

    static {
        g[] gVarArr$values = $values();
        $VALUES = gVarArr$values;
        $ENTRIES = a.a.j(gVarArr$values);
        Companion = new f();
    }

    private g(String str, int i10, int i11) {
        this.f2752id = i11;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final int getId() {
        return this.f2752id;
    }
}
