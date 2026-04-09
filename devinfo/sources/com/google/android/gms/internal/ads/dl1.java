package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class dl1 {

    /* renamed from: a, reason: collision with root package name */
    public static final qd1 f10509a;

    /* renamed from: b, reason: collision with root package name */
    public static final od1 f10510b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f10511c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f10512d;

    /* renamed from: e, reason: collision with root package name */
    public static final wc1 f10513e;

    /* renamed from: f, reason: collision with root package name */
    public static final uc1 f10514f;
    public static final rt g;

    /* renamed from: h, reason: collision with root package name */
    public static final rt f10515h;

    static {
        vl1 vl1VarA = je1.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        vl1 vl1VarA2 = je1.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        f10509a = new qd1(kk1.class, cl1.g);
        f10510b = new od1(vl1VarA, cl1.f10158b);
        f10511c = new wc1(mk1.class, cl1.f10159c);
        f10512d = new uc1(vl1VarA2, cl1.f10160d);
        f10513e = new wc1(lk1.class, cl1.f10161e);
        f10514f = new uc1(vl1VarA, cl1.f10162f);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ii1 ii1Var = ii1.RAW;
        jk1 jk1Var = jk1.f12773e;
        map.put(ii1Var, jk1Var);
        map2.put(jk1Var, ii1Var);
        ii1 ii1Var2 = ii1.TINK;
        jk1 jk1Var2 = jk1.f12770b;
        map.put(ii1Var2, jk1Var2);
        map2.put(jk1Var2, ii1Var2);
        ii1 ii1Var3 = ii1.CRUNCHY;
        jk1 jk1Var3 = jk1.f12771c;
        map.put(ii1Var3, jk1Var3);
        map2.put(jk1Var3, ii1Var3);
        ii1 ii1Var4 = ii1.LEGACY;
        jk1 jk1Var4 = jk1.f12772d;
        map.put(ii1Var4, jk1Var4);
        map2.put(jk1Var4, ii1Var4);
        g = new rt(26, DesugarCollections.unmodifiableMap(map), DesugarCollections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        fh1 fh1Var = fh1.SHA256;
        ik1 ik1Var = ik1.f12361b;
        map3.put(fh1Var, ik1Var);
        map4.put(ik1Var, fh1Var);
        fh1 fh1Var2 = fh1.SHA384;
        ik1 ik1Var2 = ik1.f12362c;
        map3.put(fh1Var2, ik1Var2);
        map4.put(ik1Var2, fh1Var2);
        fh1 fh1Var3 = fh1.SHA512;
        ik1 ik1Var3 = ik1.f12363d;
        map3.put(fh1Var3, ik1Var3);
        map4.put(ik1Var3, fh1Var3);
        f10515h = new rt(26, DesugarCollections.unmodifiableMap(map3), DesugarCollections.unmodifiableMap(map4));
    }

    public static vi1 a(kk1 kk1Var) {
        ui1 ui1VarD = vi1.D();
        ik1 ik1Var = kk1Var.f13186d;
        rt rtVar = f10515h;
        fh1 fh1Var = (fh1) rtVar.o(ik1Var);
        ui1VarD.b();
        ((vi1) ui1VarD.f14755b).F(fh1Var);
        fh1 fh1Var2 = (fh1) rtVar.o(kk1Var.f13187e);
        ui1VarD.b();
        ((vi1) ui1VarD.f14755b).G(fh1Var2);
        int i4 = kk1Var.f13188f;
        ui1VarD.b();
        ((vi1) ui1VarD.f14755b).H(i4);
        return (vi1) ui1VarD.e();
    }

    public static zi1 b(mk1 mk1Var) {
        yi1 yi1VarF = zi1.F();
        vi1 vi1VarA = a(mk1Var.f13926c);
        yi1VarF.b();
        ((zi1) yi1VarF.f14755b).J(vi1VarA);
        byte[] bArrL = yr1.l(mk1Var.f13927d);
        zm1 zm1Var = bn1.f9729b;
        zm1 zm1VarV = bn1.v(0, bArrL.length, bArrL);
        yi1VarF.b();
        ((zi1) yi1VarF.f14755b).K(zm1VarV);
        byte[] bArrL2 = yr1.l(mk1Var.f13926c.f13184b);
        zm1 zm1VarV2 = bn1.v(0, bArrL2.length, bArrL2);
        yi1VarF.b();
        ((zi1) yi1VarF.f14755b).L(zm1VarV2);
        yi1VarF.b();
        ((zi1) yi1VarF.f14755b).I(0);
        return (zi1) yi1VarF.e();
    }

    public static ne0 c(bn1 bn1Var) {
        return new ne0(24, new BigInteger(1, bn1Var.y()));
    }
}
