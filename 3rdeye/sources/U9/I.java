package U9;

/* compiled from: TlsVersion.kt */
/* loaded from: classes3.dex */
public enum I {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public static final a Companion = new a();
    private final String javaName;

    /* compiled from: TlsVersion.kt */
    public static final class a {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static I a(String javaName) {
            kotlin.jvm.internal.l.f(javaName, "javaName");
            int iHashCode = javaName.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return I.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return I.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return I.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return I.TLS_1_0;
                }
            } else if (javaName.equals("SSLv3")) {
                return I.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
        }
    }

    I(String str) {
        this.javaName = str;
    }

    public static final I forJavaName(String str) {
        Companion.getClass();
        return a.a(str);
    }

    /* renamed from: -deprecated_javaName, reason: not valid java name */
    public final String m1deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }
}
