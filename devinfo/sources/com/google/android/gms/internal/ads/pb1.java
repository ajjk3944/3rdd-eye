package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class pb1 {

    /* renamed from: a, reason: collision with root package name */
    public static final qd1 f14973a;

    /* renamed from: b, reason: collision with root package name */
    public static final od1 f14974b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f14975c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f14976d;

    static {
        vl1 vl1VarA = je1.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f14973a = new qd1(la1.class, ca1.f10056w);
        f14974b = new od1(vl1VarA, ca1.f10053t);
        f14975c = new wc1(fa1.class, ca1.f10054u);
        f14976d = new uc1(vl1VarA, ca1.f10055v);
    }

    public static ii1 a(ka1 ka1Var) throws GeneralSecurityException {
        if (ka1.f13097c.equals(ka1Var)) {
            return ii1.TINK;
        }
        if (ka1.f13098d.equals(ka1Var)) {
            return ii1.CRUNCHY;
        }
        if (ka1.f13099e.equals(ka1Var)) {
            return ii1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ka1Var)));
    }

    public static ka1 b(ii1 ii1Var) throws GeneralSecurityException {
        int iOrdinal = ii1Var.ordinal();
        if (iOrdinal == 1) {
            return ka1.f13097c;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return ka1.f13099e;
            }
            if (iOrdinal != 4) {
                int iB = ii1Var.b();
                throw new GeneralSecurityException(d.h.q(iB, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iB).length() + 34)));
            }
        }
        return ka1.f13098d;
    }

    public static ja1 c(fh1 fh1Var) throws GeneralSecurityException {
        int iOrdinal = fh1Var.ordinal();
        if (iOrdinal == 1) {
            return ja1.f12693c;
        }
        if (iOrdinal == 2) {
            return ja1.f12696f;
        }
        if (iOrdinal == 3) {
            return ja1.f12695e;
        }
        if (iOrdinal == 4) {
            return ja1.g;
        }
        if (iOrdinal == 5) {
            return ja1.f12694d;
        }
        int iB = fh1Var.b();
        throw new GeneralSecurityException(d.h.q(iB, "Unable to parse HashType: ", new StringBuilder(String.valueOf(iB).length() + 26)));
    }

    public static lh1 d(la1 la1Var) throws GeneralSecurityException {
        fh1 fh1Var;
        kh1 kh1VarC = lh1.C();
        int i4 = la1Var.f13437d;
        kh1VarC.b();
        ((lh1) kh1VarC.f14755b).F(i4);
        ja1 ja1Var = la1Var.f13439f;
        if (ja1.f12693c.equals(ja1Var)) {
            fh1Var = fh1.SHA1;
        } else if (ja1.f12694d.equals(ja1Var)) {
            fh1Var = fh1.SHA224;
        } else if (ja1.f12695e.equals(ja1Var)) {
            fh1Var = fh1.SHA256;
        } else if (ja1.f12696f.equals(ja1Var)) {
            fh1Var = fh1.SHA384;
        } else {
            if (!ja1.g.equals(ja1Var)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(ja1Var)));
            }
            fh1Var = fh1.SHA512;
        }
        kh1VarC.b();
        ((lh1) kh1VarC.f14755b).E(fh1Var);
        return (lh1) kh1VarC.e();
    }
}
