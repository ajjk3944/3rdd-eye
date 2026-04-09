package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class cf1 {

    /* renamed from: a, reason: collision with root package name */
    public static final qd1 f10100a;

    /* renamed from: b, reason: collision with root package name */
    public static final od1 f10101b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f10102c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f10103d;

    static {
        vl1 vl1VarA = je1.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f10100a = new qd1(me1.class, ub1.B);
        f10101b = new od1(vl1VarA, ub1.f17168y);
        f10102c = new wc1(ke1.class, ub1.f17169z);
        f10103d = new uc1(vl1VarA, ub1.A);
    }

    public static ii1 a(m91 m91Var) throws GeneralSecurityException {
        if (m91.f13816n.equals(m91Var)) {
            return ii1.TINK;
        }
        if (m91.f13817o.equals(m91Var)) {
            return ii1.CRUNCHY;
        }
        if (m91.f13819q.equals(m91Var)) {
            return ii1.RAW;
        }
        if (m91.f13818p.equals(m91Var)) {
            return ii1.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(m91Var)));
    }

    public static m91 b(ii1 ii1Var) throws GeneralSecurityException {
        int iOrdinal = ii1Var.ordinal();
        if (iOrdinal == 1) {
            return m91.f13816n;
        }
        if (iOrdinal == 2) {
            return m91.f13818p;
        }
        if (iOrdinal == 3) {
            return m91.f13819q;
        }
        if (iOrdinal == 4) {
            return m91.f13817o;
        }
        int iB = ii1Var.b();
        throw new GeneralSecurityException(d.h.q(iB, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iB).length() + 34)));
    }
}
