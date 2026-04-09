package ou;

import java.io.IOException;

/* loaded from: classes.dex */
public enum z {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final y Companion = new y();
    private final String protocol;

    z(String str) {
        this.protocol = str;
    }

    public static final z get(String str) throws IOException {
        Companion.getClass();
        return y.a(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
