package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class et3 {
    public static final vv3 a;
    public static final tv3 b;
    public static final zu3 c;
    public static final wu3 d;

    static {
        v34 v34VarA = ow3.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        a = new vv3(dt3.class, tv2.z);
        b = new tv3(v34VarA, su2.w);
        c = new zu3(ct3.class, tv2.y);
        d = new wu3(v34VarA, su2.x);
    }

    public static i04 a(er3 er3Var) throws GeneralSecurityException {
        if (er3.k.equals(er3Var)) {
            return i04.TINK;
        }
        if (er3.l.equals(er3Var)) {
            return i04.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(er3Var)));
    }

    public static h04 b(dt3 dt3Var) {
        byte[] bArrB = ((qz3) ((gw3) rv3.b.h(dt3Var.d)).h).b();
        try {
            h54 h54Var = h54.a;
            int i = u44.a;
            qz3 qz3VarD = qz3.D(bArrB, h54.b);
            g04 g04VarD = h04.D();
            String str = dt3Var.b;
            g04VarD.b();
            ((h04) g04VarD.g).F(str);
            g04VarD.b();
            ((h04) g04VarD.g).G(qz3VarD);
            return (h04) g04VarD.d();
        } catch (a64 e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    public static dt3 c(h04 h04Var, i04 i04Var) throws GeneralSecurityException {
        z71 z71Var;
        er3 er3Var = er3.l;
        Object obj = z71.o;
        z71 z71Var2 = z71.n;
        z71 z71Var3 = z71.m;
        z71 z71Var4 = z71.k;
        z71 z71Var5 = z71.l;
        z71 z71Var6 = z71.j;
        pz3 pz3VarE = qz3.E();
        pz3VarE.g(h04Var.B().A());
        pz3VarE.h(h04Var.B().B());
        pz3VarE.i(i04.RAW);
        mr3 mr3VarJ = wl2.J(((qz3) pz3VarE.d()).b());
        if (mr3VarJ instanceof ms3) {
            z71Var = z71Var6;
        } else if (mr3VarJ instanceof us3) {
            z71Var = z71Var5;
        } else if (mr3VarJ instanceof rt3) {
            z71Var = z71Var4;
        } else if (mr3VarJ instanceof ds3) {
            z71Var = z71Var3;
        } else if (mr3VarJ instanceof hs3) {
            z71Var = z71Var2;
        } else {
            if (!(mr3VarJ instanceof qs3)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(mr3VarJ.toString()));
            }
            z71Var = obj;
        }
        int iOrdinal = i04Var.ordinal();
        if (iOrdinal == 1) {
            er3Var = er3.k;
        } else if (iOrdinal != 3) {
            int iA = i04Var.a();
            throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
        }
        String strA = h04Var.A();
        tr3 tr3Var = (tr3) mr3VarJ;
        if (strA == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (tr3Var == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (tr3Var.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((z71Var.equals(z71Var6) && (tr3Var instanceof ms3)) || ((z71Var.equals(z71Var5) && (tr3Var instanceof us3)) || ((z71Var.equals(z71Var4) && (tr3Var instanceof rt3)) || ((z71Var.equals(z71Var3) && (tr3Var instanceof ds3)) || ((z71Var.equals(z71Var2) && (tr3Var instanceof hs3)) || (z71Var.equals(obj) && (tr3Var instanceof qs3))))))) {
            return new dt3(er3Var, strA, z71Var, tr3Var);
        }
        String str = (String) z71Var.g;
        String strValueOf = String.valueOf(tr3Var);
        StringBuilder sb = new StringBuilder(strValueOf.length() + str.length() + 67 + 1);
        ex0.q(sb, "Cannot use parsing strategy ", str, " when new keys are picked according to ", strValueOf);
        sb.append(".");
        throw new GeneralSecurityException(sb.toString());
    }
}
