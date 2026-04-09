package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class qb1 {

    /* renamed from: a, reason: collision with root package name */
    public static final qd1 f15286a;

    /* renamed from: b, reason: collision with root package name */
    public static final od1 f15287b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f15288c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f15289d;

    static {
        vl1 vl1VarA = je1.a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f15286a = new qd1(pa1.class, ca1.A);
        f15287b = new od1(vl1VarA, ca1.f10057x);
        f15288c = new wc1(ma1.class, ca1.f10058y);
        f15289d = new uc1(vl1VarA, ca1.f10059z);
    }

    public static ii1 a(m91 m91Var) throws GeneralSecurityException {
        if (m91.f13810f.equals(m91Var)) {
            return ii1.TINK;
        }
        if (m91.g.equals(m91Var)) {
            return ii1.CRUNCHY;
        }
        if (m91.f13811h.equals(m91Var)) {
            return ii1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(m91Var)));
    }

    public static m91 b(ii1 ii1Var) throws GeneralSecurityException {
        int iOrdinal = ii1Var.ordinal();
        if (iOrdinal == 1) {
            return m91.f13810f;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return m91.f13811h;
            }
            if (iOrdinal != 4) {
                int iB = ii1Var.b();
                throw new GeneralSecurityException(d.h.q(iB, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iB).length() + 34)));
            }
        }
        return m91.g;
    }
}
