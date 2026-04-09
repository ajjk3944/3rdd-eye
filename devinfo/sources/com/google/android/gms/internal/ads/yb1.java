package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class yb1 {

    /* renamed from: a, reason: collision with root package name */
    public static final qd1 f18700a;

    /* renamed from: b, reason: collision with root package name */
    public static final od1 f18701b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f18702c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f18703d;

    static {
        vl1 vl1VarA = je1.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f18700a = new qd1(ya1.class, ub1.f17153i);
        f18701b = new od1(vl1VarA, ub1.f17151f);
        f18702c = new wc1(wa1.class, ub1.g);
        f18703d = new uc1(vl1VarA, ub1.f17152h);
    }

    public static ii1 a(m91 m91Var) throws GeneralSecurityException {
        if (m91.f13812i.equals(m91Var)) {
            return ii1.TINK;
        }
        if (m91.j.equals(m91Var)) {
            return ii1.CRUNCHY;
        }
        if (m91.f13813k.equals(m91Var)) {
            return ii1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(m91Var.f13825b));
    }

    public static m91 b(ii1 ii1Var) throws GeneralSecurityException {
        int iOrdinal = ii1Var.ordinal();
        if (iOrdinal == 1) {
            return m91.f13812i;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return m91.f13813k;
            }
            if (iOrdinal != 4) {
                int iB = ii1Var.b();
                throw new GeneralSecurityException(d.h.q(iB, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iB).length() + 34)));
            }
        }
        return m91.j;
    }
}
