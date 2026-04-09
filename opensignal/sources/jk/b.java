package jk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final a Companion;
    private final int code;
    private final String digestName;
    public static final b SHA256 = new b("SHA256", 0, 1, "SHA-256");
    public static final b SHA384 = new b("SHA384", 1, 2, "SHA-384");
    public static final b SHA512 = new b("SHA512", 2, 3, "SHA-512");
    public static final b MD5 = new b("MD5", 3, 4, "MD5");

    private static final /* synthetic */ b[] $values() {
        return new b[]{SHA256, SHA384, SHA512, MD5};
    }

    static {
        b[] bVarArr$values = $values();
        $VALUES = bVarArr$values;
        $ENTRIES = a.a.j(bVarArr$values);
        Companion = new a();
    }

    private b(String str, int i10, int i11, String str2) {
        this.code = i11;
        this.digestName = str2;
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

    public final int getCode() {
        return this.code;
    }

    public final String getDigestName() {
        return this.digestName;
    }
}
