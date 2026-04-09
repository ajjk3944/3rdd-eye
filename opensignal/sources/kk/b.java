package kk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final a Companion;
    private final String platformName;
    public static final b YOUTUBE = new b("YOUTUBE", 0, "YOUTUBE");
    public static final b FACEBOOK = new b("FACEBOOK", 1, "FACEBOOK");
    public static final b NETFLIX = new b("NETFLIX", 2, "NETFLIX");
    public static final b UNKNOWN = new b("UNKNOWN", 3, "UNKNOWN");
    public static final b CLOUDFRONT = new b("CLOUDFRONT", 4, "CLOUDFRONT");
    public static final b CLOUDFLARE = new b("CLOUDFLARE", 5, "CLOUDFLARE");
    public static final b GOOGLECLOUD = new b("GOOGLECLOUD", 6, "GOOGLECLOUD");
    public static final b AKAMAI = new b("AKAMAI", 7, "AKAMAI");
    public static final b TWITCH = new b("TWITCH", 8, "TWITCH");

    private static final /* synthetic */ b[] $values() {
        return new b[]{YOUTUBE, FACEBOOK, NETFLIX, UNKNOWN, CLOUDFRONT, CLOUDFLARE, GOOGLECLOUD, AKAMAI, TWITCH};
    }

    static {
        b[] bVarArr$values = $values();
        $VALUES = bVarArr$values;
        $ENTRIES = a.a.j(bVarArr$values);
        Companion = new a();
    }

    private b(String str, int i10, String str2) {
        this.platformName = str2;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String getPlatformName() {
        return this.platformName;
    }
}
