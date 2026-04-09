package ou;

/* loaded from: classes.dex */
public final class g0 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static h0 a(String str) {
        br.l.e(str, "javaName");
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return h0.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return h0.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return h0.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return h0.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return h0.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }
}
