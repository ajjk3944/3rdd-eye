package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class vb1 {

    /* renamed from: a, reason: collision with root package name */
    public static final qd1 f17577a;

    /* renamed from: b, reason: collision with root package name */
    public static final od1 f17578b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f17579c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f17580d;

    static {
        vl1 vl1VarA = je1.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f17577a = new qd1(va1.class, ub1.f17150e);
        f17578b = new od1(vl1VarA, ub1.f17147b);
        f17579c = new wc1(ta1.class, ub1.f17148c);
        f17580d = new uc1(vl1VarA, ub1.f17149d);
    }

    public static ii1 a(ka1 ka1Var) throws GeneralSecurityException {
        if (ka1.f13100f.equals(ka1Var)) {
            return ii1.TINK;
        }
        if (ka1.g.equals(ka1Var)) {
            return ii1.CRUNCHY;
        }
        if (ka1.f13101h.equals(ka1Var)) {
            return ii1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ka1Var)));
    }

    public static ka1 b(ii1 ii1Var) throws GeneralSecurityException {
        int iOrdinal = ii1Var.ordinal();
        if (iOrdinal == 1) {
            return ka1.f13100f;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return ka1.f13101h;
            }
            if (iOrdinal != 4) {
                int iB = ii1Var.b();
                throw new GeneralSecurityException(d.h.q(iB, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iB).length() + 34)));
            }
        }
        return ka1.g;
    }
}
