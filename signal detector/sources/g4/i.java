package g4;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final i f20223d = new i("", "", false);

    /* renamed from: a, reason: collision with root package name */
    public final String f20224a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20225b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20226c;

    static {
        new i("\n", "  ", true);
    }

    public i(String str, String str2, boolean z6) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f20224a = str;
        this.f20225b = str2;
        this.f20226c = z6;
    }
}
