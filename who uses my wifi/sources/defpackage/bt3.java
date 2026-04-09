package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class bt3 {
    public static final vv3 a;
    public static final tv3 b;
    public static final zu3 c;
    public static final wu3 d;

    static {
        v34 v34VarA = ow3.a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        a = new vv3(at3.class, tv2.x);
        b = new tv3(v34VarA, su2.u);
        c = new zu3(ys3.class, tv2.w);
        d = new wu3(v34VarA, su2.v);
    }

    public static i04 a(zs3 zs3Var) throws GeneralSecurityException {
        if (zs3.c.equals(zs3Var)) {
            return i04.TINK;
        }
        if (zs3.d.equals(zs3Var)) {
            return i04.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zs3Var.b));
    }

    public static zs3 b(i04 i04Var) throws GeneralSecurityException {
        int iOrdinal = i04Var.ordinal();
        if (iOrdinal == 1) {
            return zs3.c;
        }
        if (iOrdinal == 3) {
            return zs3.d;
        }
        int iA = i04Var.a();
        throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
    }
}
