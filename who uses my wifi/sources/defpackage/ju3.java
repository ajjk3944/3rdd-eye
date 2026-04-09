package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ju3 {
    public static final vv3 a;
    public static final tv3 b;
    public static final zu3 c;
    public static final wu3 d;

    static {
        v34 v34VarA = ow3.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        a = new vv3(rt3.class, vt3.q);
        b = new tv3(v34VarA, tt3.p);
        c = new zu3(pt3.class, vt3.p);
        d = new wu3(v34VarA, tt3.q);
    }

    public static i04 a(cs3 cs3Var) throws GeneralSecurityException {
        if (cs3.k.equals(cs3Var)) {
            return i04.TINK;
        }
        if (cs3.l.equals(cs3Var)) {
            return i04.CRUNCHY;
        }
        if (cs3.m.equals(cs3Var)) {
            return i04.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(cs3Var.g));
    }

    public static cs3 b(i04 i04Var) throws GeneralSecurityException {
        int iOrdinal = i04Var.ordinal();
        if (iOrdinal == 1) {
            return cs3.k;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return cs3.m;
            }
            if (iOrdinal != 4) {
                int iA = i04Var.a();
                throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
            }
        }
        return cs3.l;
    }
}
