package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class yk1 {

    /* renamed from: a, reason: collision with root package name */
    public static final qd1 f18788a;

    /* renamed from: b, reason: collision with root package name */
    public static final od1 f18789b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f18790c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f18791d;

    /* renamed from: e, reason: collision with root package name */
    public static final wc1 f18792e;

    /* renamed from: f, reason: collision with root package name */
    public static final uc1 f18793f;
    public static final rt g;

    /* renamed from: h, reason: collision with root package name */
    public static final rt f18794h;

    static {
        vl1 vl1VarA = je1.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        vl1 vl1VarA2 = je1.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        f18788a = new qd1(ck1.class, df1.E);
        f18789b = new od1(vl1VarA, df1.f10469z);
        f18790c = new wc1(fk1.class, df1.A);
        f18791d = new uc1(vl1VarA2, df1.B);
        f18792e = new wc1(ek1.class, df1.C);
        f18793f = new uc1(vl1VarA, df1.D);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ii1 ii1Var = ii1.RAW;
        bk1 bk1Var = bk1.f9707e;
        map.put(ii1Var, bk1Var);
        map2.put(bk1Var, ii1Var);
        ii1 ii1Var2 = ii1.TINK;
        bk1 bk1Var2 = bk1.f9704b;
        map.put(ii1Var2, bk1Var2);
        map2.put(bk1Var2, ii1Var2);
        ii1 ii1Var3 = ii1.CRUNCHY;
        bk1 bk1Var3 = bk1.f9705c;
        map.put(ii1Var3, bk1Var3);
        map2.put(bk1Var3, ii1Var3);
        ii1 ii1Var4 = ii1.LEGACY;
        bk1 bk1Var4 = bk1.f9706d;
        map.put(ii1Var4, bk1Var4);
        map2.put(bk1Var4, ii1Var4);
        g = new rt(26, DesugarCollections.unmodifiableMap(map), DesugarCollections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        fh1 fh1Var = fh1.SHA256;
        ak1 ak1Var = ak1.f9340b;
        map3.put(fh1Var, ak1Var);
        map4.put(ak1Var, fh1Var);
        fh1 fh1Var2 = fh1.SHA384;
        ak1 ak1Var2 = ak1.f9341c;
        map3.put(fh1Var2, ak1Var2);
        map4.put(ak1Var2, fh1Var2);
        fh1 fh1Var3 = fh1.SHA512;
        ak1 ak1Var3 = ak1.f9342d;
        map3.put(fh1Var3, ak1Var3);
        map4.put(ak1Var3, fh1Var3);
        f18794h = new rt(26, DesugarCollections.unmodifiableMap(map3), DesugarCollections.unmodifiableMap(map4));
    }

    public static ri1 a(fk1 fk1Var) {
        qi1 qi1VarF = ri1.F();
        ck1 ck1Var = fk1Var.f11195c;
        mi1 mi1VarB = ni1.B();
        fh1 fh1Var = (fh1) f18794h.o(ck1Var.f10153d);
        mi1VarB.b();
        ((ni1) mi1VarB.f14755b).D(fh1Var);
        ni1 ni1Var = (ni1) mi1VarB.e();
        qi1VarF.b();
        ((ri1) qi1VarF.f14755b).I(ni1Var);
        byte[] bArrL = yr1.l(fk1Var.f11196d);
        zm1 zm1Var = bn1.f9729b;
        zm1 zm1VarV = bn1.v(0, bArrL.length, bArrL);
        qi1VarF.b();
        ((ri1) qi1VarF.f14755b).J(zm1VarV);
        byte[] bArrL2 = yr1.l(fk1Var.f11195c.f10151b);
        zm1 zm1VarV2 = bn1.v(0, bArrL2.length, bArrL2);
        qi1VarF.b();
        ((ri1) qi1VarF.f14755b).K(zm1VarV2);
        return (ri1) qi1VarF.e();
    }

    public static ne0 b(bn1 bn1Var) {
        return new ne0(24, new BigInteger(1, bn1Var.y()));
    }
}
