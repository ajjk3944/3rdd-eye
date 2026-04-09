package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class wt3 {
    public static final vv3 a;
    public static final tv3 b;
    public static final zu3 c;
    public static final wu3 d;

    static {
        v34 v34VarA = ow3.a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        a = new vv3(hs3.class, vt3.g);
        b = new tv3(v34VarA, su2.B);
        c = new zu3(es3.class, tv2.D);
        d = new wu3(v34VarA, tt3.g);
    }

    public static i04 a(gs3 gs3Var) throws GeneralSecurityException {
        if (gs3.h.equals(gs3Var)) {
            return i04.TINK;
        }
        if (gs3.i.equals(gs3Var)) {
            return i04.CRUNCHY;
        }
        if (gs3.j.equals(gs3Var)) {
            return i04.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(gs3Var)));
    }

    public static gs3 b(i04 i04Var) throws GeneralSecurityException {
        int iOrdinal = i04Var.ordinal();
        if (iOrdinal == 1) {
            return gs3.h;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return gs3.j;
            }
            if (iOrdinal != 4) {
                int iA = i04Var.a();
                throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
            }
        }
        return gs3.i;
    }
}
