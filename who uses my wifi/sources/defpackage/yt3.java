package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class yt3 {
    public static final vv3 a;
    public static final tv3 b;
    public static final zu3 c;
    public static final wu3 d;

    static {
        v34 v34VarA = ow3.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        a = new vv3(ms3.class, vt3.i);
        b = new tv3(v34VarA, tt3.h);
        c = new zu3(is3.class, vt3.h);
        d = new wu3(v34VarA, tt3.i);
    }

    public static i04 a(ls3 ls3Var) throws GeneralSecurityException {
        if (ls3.c.equals(ls3Var)) {
            return i04.TINK;
        }
        if (ls3.d.equals(ls3Var)) {
            return i04.CRUNCHY;
        }
        if (ls3.e.equals(ls3Var)) {
            return i04.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ls3Var)));
    }

    public static ls3 b(i04 i04Var) throws GeneralSecurityException {
        int iOrdinal = i04Var.ordinal();
        if (iOrdinal == 1) {
            return ls3.c;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return ls3.e;
            }
            if (iOrdinal != 4) {
                int iA = i04Var.a();
                throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
            }
        }
        return ls3.d;
    }
}
