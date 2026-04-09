package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class cu3 {
    public static final vv3 a;
    public static final tv3 b;
    public static final zu3 c;
    public static final wu3 d;

    static {
        v34 v34VarA = ow3.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        a = new vv3(us3.class, vt3.m);
        b = new tv3(v34VarA, tt3.l);
        c = new zu3(rs3.class, vt3.l);
        d = new wu3(v34VarA, tt3.m);
    }

    public static i04 a(ts3 ts3Var) throws GeneralSecurityException {
        if (ts3.h.equals(ts3Var)) {
            return i04.TINK;
        }
        if (ts3.i.equals(ts3Var)) {
            return i04.CRUNCHY;
        }
        if (ts3.j.equals(ts3Var)) {
            return i04.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(ts3Var.g));
    }

    public static ts3 b(i04 i04Var) throws GeneralSecurityException {
        int iOrdinal = i04Var.ordinal();
        if (iOrdinal == 1) {
            return ts3.h;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return ts3.j;
            }
            if (iOrdinal != 4) {
                int iA = i04Var.a();
                throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
            }
        }
        return ts3.i;
    }
}
