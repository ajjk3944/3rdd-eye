package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class sb1 {

    /* renamed from: a, reason: collision with root package name */
    public static final qd1 f15985a;

    /* renamed from: b, reason: collision with root package name */
    public static final od1 f15986b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f15987c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f15988d;

    static {
        vl1 vl1VarA = je1.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f15985a = new qd1(sa1.class, ca1.E);
        f15986b = new od1(vl1VarA, ca1.B);
        f15987c = new wc1(qa1.class, ca1.C);
        f15988d = new uc1(vl1VarA, ca1.D);
    }

    public static ii1 a(ja1 ja1Var) throws GeneralSecurityException {
        if (ja1.f12697h.equals(ja1Var)) {
            return ii1.TINK;
        }
        if (ja1.f12698i.equals(ja1Var)) {
            return ii1.CRUNCHY;
        }
        if (ja1.j.equals(ja1Var)) {
            return ii1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ja1Var)));
    }

    public static ja1 b(ii1 ii1Var) throws GeneralSecurityException {
        int iOrdinal = ii1Var.ordinal();
        if (iOrdinal == 1) {
            return ja1.f12697h;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return ja1.j;
            }
            if (iOrdinal != 4) {
                int iB = ii1Var.b();
                throw new GeneralSecurityException(d.h.q(iB, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iB).length() + 34)));
            }
        }
        return ja1.f12698i;
    }
}
