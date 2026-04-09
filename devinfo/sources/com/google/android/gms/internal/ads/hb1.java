package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class hb1 {

    /* renamed from: a, reason: collision with root package name */
    public static final qd1 f11820a;

    /* renamed from: b, reason: collision with root package name */
    public static final od1 f11821b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f11822c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f11823d;

    static {
        vl1 vl1VarA = je1.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f11820a = new qd1(fb1.class, ca1.f10050q);
        f11821b = new od1(vl1VarA, ca1.f10047n);
        f11822c = new wc1(eb1.class, ca1.f10048o);
        f11823d = new uc1(vl1VarA, ca1.f10049p);
    }

    public static ii1 a(m91 m91Var) throws GeneralSecurityException {
        if (m91.f13814l.equals(m91Var)) {
            return ii1.TINK;
        }
        if (m91.f13815m.equals(m91Var)) {
            return ii1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(m91Var)));
    }

    public static hi1 b(fb1 fb1Var) throws GeneralSecurityException {
        byte[] bArrB = ((qh1) ((ce1) md1.f13875b.h(fb1Var.f11092d)).f10095c).b();
        try {
            jn1 jn1Var = jn1.f12801a;
            int i4 = um1.f17262a;
            qh1 qh1VarD = qh1.D(bArrB, jn1.f12802b);
            gi1 gi1VarD = hi1.D();
            String str = fb1Var.f11090b;
            gi1VarD.b();
            ((hi1) gi1VarD.f14755b).F(str);
            gi1VarD.b();
            ((hi1) gi1VarD.f14755b).G(qh1VarD);
            return (hi1) gi1VarD.e();
        } catch (ao1 e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
        }
    }

    public static fb1 c(hi1 hi1Var, ii1 ii1Var) throws GeneralSecurityException {
        ka1 ka1Var;
        m91 m91Var = m91.f13815m;
        Object obj = ka1.f13106n;
        ka1 ka1Var2 = ka1.f13105m;
        ka1 ka1Var3 = ka1.f13104l;
        ka1 ka1Var4 = ka1.j;
        ka1 ka1Var5 = ka1.f13103k;
        ka1 ka1Var6 = ka1.f13102i;
        ph1 ph1VarE = qh1.E();
        ph1VarE.h(hi1Var.B().A());
        ph1VarE.i(hi1Var.B().B());
        ph1VarE.j(ii1.RAW);
        s91 s91VarQ = yr1.q(((qh1) ph1VarE.e()).b());
        if (s91VarQ instanceof sa1) {
            ka1Var = ka1Var6;
        } else if (s91VarQ instanceof ya1) {
            ka1Var = ka1Var5;
        } else if (s91VarQ instanceof ob1) {
            ka1Var = ka1Var4;
        } else if (s91VarQ instanceof la1) {
            ka1Var = ka1Var3;
        } else if (s91VarQ instanceof pa1) {
            ka1Var = ka1Var2;
        } else {
            if (!(s91VarQ instanceof va1)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(s91VarQ.toString()));
            }
            ka1Var = obj;
        }
        int iOrdinal = ii1Var.ordinal();
        if (iOrdinal == 1) {
            m91Var = m91.f13814l;
        } else if (iOrdinal != 3) {
            int iB = ii1Var.b();
            throw new GeneralSecurityException(d.h.q(iB, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iB).length() + 34)));
        }
        String strA = hi1Var.A();
        aa1 aa1Var = (aa1) s91VarQ;
        if (strA == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (aa1Var == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (aa1Var.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((ka1Var.equals(ka1Var6) && (aa1Var instanceof sa1)) || ((ka1Var.equals(ka1Var5) && (aa1Var instanceof ya1)) || ((ka1Var.equals(ka1Var4) && (aa1Var instanceof ob1)) || ((ka1Var.equals(ka1Var3) && (aa1Var instanceof la1)) || ((ka1Var.equals(ka1Var2) && (aa1Var instanceof pa1)) || (ka1Var.equals(obj) && (aa1Var instanceof va1))))))) {
            return new fb1(m91Var, strA, ka1Var, aa1Var);
        }
        String str = ka1Var.f13113b;
        String strValueOf = String.valueOf(aa1Var);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + str.length() + 67 + 1);
        je.u.B(sb2, "Cannot use parsing strategy ", str, " when new keys are picked according to ", strValueOf);
        sb2.append(".");
        throw new GeneralSecurityException(sb2.toString());
    }
}
