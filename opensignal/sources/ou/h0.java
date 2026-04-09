package ou;

/* loaded from: classes.dex */
public enum h0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public static final g0 Companion = new g0();
    private final String javaName;

    h0(String str) {
        this.javaName = str;
    }

    public static final h0 forJavaName(String str) {
        Companion.getClass();
        return g0.a(str);
    }

    @lq.c
    /* renamed from: -deprecated_javaName, reason: not valid java name */
    public final String m45deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }
}
