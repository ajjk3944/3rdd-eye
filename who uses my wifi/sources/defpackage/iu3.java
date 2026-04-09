package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class iu3 {
    public static final vv3 a;
    public static final tv3 b;
    public static final zu3 c;
    public static final wu3 d;

    static {
        v34 v34VarA = ow3.a("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        a = new vv3(ot3.class, vt3.o);
        b = new tv3(v34VarA, tt3.n);
        c = new zu3(mt3.class, vt3.n);
        d = new wu3(v34VarA, tt3.o);
    }

    public static i04 a(bs3 bs3Var) throws GeneralSecurityException {
        if (bs3Var.equals(bs3.m)) {
            return i04.TINK;
        }
        if (bs3Var.equals(bs3.n)) {
            return i04.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(bs3Var.g));
    }

    public static bs3 b(i04 i04Var) throws GeneralSecurityException {
        int iOrdinal = i04Var.ordinal();
        if (iOrdinal == 1) {
            return bs3.m;
        }
        if (iOrdinal == 3) {
            return bs3.n;
        }
        int iA = i04Var.a();
        throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
    }
}
