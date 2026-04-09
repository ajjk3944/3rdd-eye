package U9;

import java.io.IOException;

/* compiled from: Protocol.kt */
/* loaded from: classes3.dex */
public enum y {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final a Companion = new a();
    private final String protocol;

    /* compiled from: Protocol.kt */
    public static final class a {
        public static y a(String protocol) throws IOException {
            kotlin.jvm.internal.l.f(protocol, "protocol");
            y yVar = y.HTTP_1_0;
            if (protocol.equals(yVar.protocol)) {
                return yVar;
            }
            y yVar2 = y.HTTP_1_1;
            if (protocol.equals(yVar2.protocol)) {
                return yVar2;
            }
            y yVar3 = y.H2_PRIOR_KNOWLEDGE;
            if (protocol.equals(yVar3.protocol)) {
                return yVar3;
            }
            y yVar4 = y.HTTP_2;
            if (protocol.equals(yVar4.protocol)) {
                return yVar4;
            }
            y yVar5 = y.SPDY_3;
            if (protocol.equals(yVar5.protocol)) {
                return yVar5;
            }
            y yVar6 = y.QUIC;
            if (protocol.equals(yVar6.protocol)) {
                return yVar6;
            }
            throw new IOException("Unexpected protocol: ".concat(protocol));
        }
    }

    y(String str) {
        this.protocol = str;
    }

    public static final y get(String str) throws IOException {
        Companion.getClass();
        return a.a(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
