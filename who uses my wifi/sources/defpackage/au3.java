package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class au3 {
    public static final vv3 a;
    public static final tv3 b;
    public static final zu3 c;
    public static final wu3 d;

    static {
        v34 v34VarA = ow3.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        a = new vv3(qs3.class, vt3.k);
        b = new tv3(v34VarA, tt3.j);
        c = new zu3(ns3.class, vt3.j);
        d = new wu3(v34VarA, tt3.k);
    }

    public static i04 a(ps3 ps3Var) throws GeneralSecurityException {
        if (ps3.h.equals(ps3Var)) {
            return i04.TINK;
        }
        if (ps3.i.equals(ps3Var)) {
            return i04.CRUNCHY;
        }
        if (ps3.j.equals(ps3Var)) {
            return i04.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ps3Var)));
    }

    public static ps3 b(i04 i04Var) throws GeneralSecurityException {
        int iOrdinal = i04Var.ordinal();
        if (iOrdinal == 1) {
            return ps3.h;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return ps3.j;
            }
            if (iOrdinal != 4) {
                int iA = i04Var.a();
                throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
            }
        }
        return ps3.i;
    }
}
