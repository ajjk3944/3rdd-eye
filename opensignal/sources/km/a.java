package km;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final String value;
    public static final a SD = new a("SD", 0, "360p");
    public static final a HD = new a("HD", 1, "720p");
    public static final a SD_144 = new a("SD_144", 2, "144p");
    public static final a SD_240 = new a("SD_240", 3, "240p");
    public static final a SD_360 = new a("SD_360", 4, "360p");
    public static final a SD_480 = new a("SD_480", 5, "480p");
    public static final a HD_720 = new a("HD_720", 6, "720p");
    public static final a HD_1080 = new a("HD_1080", 7, "1080p");
    public static final a HD_1440 = new a("HD_1440", 8, "1440p");
    public static final a HD_2160 = new a("HD_2160", 9, "2160p");
    public static final a HD_4320 = new a("HD_4320", 10, "4320p");
    public static final a ADAPTIVE = new a("ADAPTIVE", 11, "Adaptive");
    public static final a LIVE = new a("LIVE", 12, "Live");

    private static final /* synthetic */ a[] $values() {
        return new a[]{SD, HD, SD_144, SD_240, SD_360, SD_480, HD_720, HD_1080, HD_1440, HD_2160, HD_4320, ADAPTIVE, LIVE};
    }

    static {
        a[] aVarArr$values = $values();
        $VALUES = aVarArr$values;
        $ENTRIES = a.a.j(aVarArr$values);
    }

    private a(String str, int i10, String str2) {
        this.value = str2;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
