package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class st3 {
    public static final vv3 a;
    public static final tv3 b;
    public static final zu3 c;
    public static final wu3 d;

    static {
        v34 v34VarA = ow3.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        a = new vv3(ds3.class, tv2.C);
        b = new tv3(v34VarA, su2.z);
        c = new zu3(xr3.class, tv2.B);
        d = new wu3(v34VarA, su2.A);
    }

    public static i04 a(cs3 cs3Var) throws GeneralSecurityException {
        if (cs3.h.equals(cs3Var)) {
            return i04.TINK;
        }
        if (cs3.i.equals(cs3Var)) {
            return i04.CRUNCHY;
        }
        if (cs3.j.equals(cs3Var)) {
            return i04.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(cs3Var)));
    }

    public static cs3 b(i04 i04Var) throws GeneralSecurityException {
        int iOrdinal = i04Var.ordinal();
        if (iOrdinal == 1) {
            return cs3.h;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return cs3.j;
            }
            if (iOrdinal != 4) {
                int iA = i04Var.a();
                throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
            }
        }
        return cs3.i;
    }

    public static bs3 c(gz3 gz3Var) throws GeneralSecurityException {
        int iOrdinal = gz3Var.ordinal();
        if (iOrdinal == 1) {
            return bs3.h;
        }
        if (iOrdinal == 2) {
            return bs3.k;
        }
        if (iOrdinal == 3) {
            return bs3.j;
        }
        if (iOrdinal == 4) {
            return bs3.l;
        }
        if (iOrdinal == 5) {
            return bs3.i;
        }
        int iA = gz3Var.a();
        throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(iA).length() + 26), "Unable to parse HashType: ", iA));
    }

    public static mz3 d(ds3 ds3Var) {
        gz3 gz3Var;
        lz3 lz3VarC = mz3.C();
        int i = ds3Var.d;
        lz3VarC.b();
        ((mz3) lz3VarC.g).F(i);
        bs3 bs3Var = ds3Var.f;
        if (bs3.h.equals(bs3Var)) {
            gz3Var = gz3.SHA1;
        } else if (bs3.i.equals(bs3Var)) {
            gz3Var = gz3.SHA224;
        } else if (bs3.j.equals(bs3Var)) {
            gz3Var = gz3.SHA256;
        } else if (bs3.k.equals(bs3Var)) {
            gz3Var = gz3.SHA384;
        } else {
            if (!bs3.l.equals(bs3Var)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(bs3Var)));
            }
            gz3Var = gz3.SHA512;
        }
        lz3VarC.b();
        ((mz3) lz3VarC.g).E(gz3Var);
        return (mz3) lz3VarC.d();
    }
}
