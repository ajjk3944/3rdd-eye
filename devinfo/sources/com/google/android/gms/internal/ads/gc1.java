package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class gc1 {

    /* renamed from: a, reason: collision with root package name */
    public static final qd1 f11493a;

    /* renamed from: b, reason: collision with root package name */
    public static final od1 f11494b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f11495c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f11496d;

    static {
        vl1 vl1VarA = je1.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f11493a = new qd1(ob1.class, ub1.f17160q);
        f11494b = new od1(vl1VarA, ub1.f17157n);
        f11495c = new wc1(mb1.class, ub1.f17158o);
        f11496d = new uc1(vl1VarA, ub1.f17159p);
    }

    public static ii1 a(ka1 ka1Var) throws GeneralSecurityException {
        if (ka1.f13107o.equals(ka1Var)) {
            return ii1.TINK;
        }
        if (ka1.f13108p.equals(ka1Var)) {
            return ii1.CRUNCHY;
        }
        if (ka1.f13109q.equals(ka1Var)) {
            return ii1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(ka1Var.f13113b));
    }

    public static ka1 b(ii1 ii1Var) throws GeneralSecurityException {
        int iOrdinal = ii1Var.ordinal();
        if (iOrdinal == 1) {
            return ka1.f13107o;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return ka1.f13109q;
            }
            if (iOrdinal != 4) {
                int iB = ii1Var.b();
                throw new GeneralSecurityException(d.h.q(iB, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iB).length() + 34)));
            }
        }
        return ka1.f13108p;
    }
}
