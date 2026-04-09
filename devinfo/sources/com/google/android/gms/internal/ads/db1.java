package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class db1 {

    /* renamed from: a, reason: collision with root package name */
    public static final qd1 f10420a;

    /* renamed from: b, reason: collision with root package name */
    public static final od1 f10421b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f10422c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f10423d;

    static {
        vl1 vl1VarA = je1.a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f10420a = new qd1(cb1.class, ca1.f10046m);
        f10421b = new od1(vl1VarA, ca1.j);
        f10422c = new wc1(bb1.class, ca1.f10044k);
        f10423d = new uc1(vl1VarA, ca1.f10045l);
    }

    public static ii1 a(ja1 ja1Var) throws GeneralSecurityException {
        if (ja1.f12699k.equals(ja1Var)) {
            return ii1.TINK;
        }
        if (ja1.f12700l.equals(ja1Var)) {
            return ii1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(ja1Var.f12707b));
    }

    public static ja1 b(ii1 ii1Var) throws GeneralSecurityException {
        int iOrdinal = ii1Var.ordinal();
        if (iOrdinal == 1) {
            return ja1.f12699k;
        }
        if (iOrdinal == 3) {
            return ja1.f12700l;
        }
        int iB = ii1Var.b();
        throw new GeneralSecurityException(d.h.q(iB, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iB).length() + 34)));
    }
}
