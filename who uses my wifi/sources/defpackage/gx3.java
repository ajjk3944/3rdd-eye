package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class gx3 {
    public static final vv3 a;
    public static final tv3 b;
    public static final zu3 c;
    public static final wu3 d;

    static {
        v34 v34VarA = ow3.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        a = new vv3(rw3.class, vt3.v);
        b = new tv3(v34VarA, tt3.v);
        c = new zu3(pw3.class, vt3.u);
        d = new wu3(v34VarA, tt3.w);
    }

    public static i04 a(gs3 gs3Var) throws GeneralSecurityException {
        if (gs3.k.equals(gs3Var)) {
            return i04.TINK;
        }
        if (gs3.l.equals(gs3Var)) {
            return i04.CRUNCHY;
        }
        if (gs3.n.equals(gs3Var)) {
            return i04.RAW;
        }
        if (gs3.m.equals(gs3Var)) {
            return i04.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(gs3Var)));
    }

    public static gs3 b(i04 i04Var) throws GeneralSecurityException {
        int iOrdinal = i04Var.ordinal();
        if (iOrdinal == 1) {
            return gs3.k;
        }
        if (iOrdinal == 2) {
            return gs3.m;
        }
        if (iOrdinal == 3) {
            return gs3.n;
        }
        if (iOrdinal == 4) {
            return gs3.l;
        }
        int iA = i04Var.a();
        throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
    }
}
