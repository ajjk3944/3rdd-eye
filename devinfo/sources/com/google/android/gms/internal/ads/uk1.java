package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class uk1 {

    /* renamed from: a, reason: collision with root package name */
    public static final qd1 f17235a;

    /* renamed from: b, reason: collision with root package name */
    public static final od1 f17236b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f17237c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f17238d;

    /* renamed from: e, reason: collision with root package name */
    public static final wc1 f17239e;

    /* renamed from: f, reason: collision with root package name */
    public static final uc1 f17240f;
    public static final rt g;

    static {
        vl1 vl1VarA = je1.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        vl1 vl1VarA2 = je1.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        f17235a = new qd1(qj1.class, df1.f10468y);
        f17236b = new od1(vl1VarA, df1.f10463t);
        f17237c = new wc1(tj1.class, df1.f10464u);
        f17238d = new uc1(vl1VarA2, df1.f10465v);
        f17239e = new wc1(rj1.class, df1.f10466w);
        f17240f = new uc1(vl1VarA, df1.f10467x);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ii1 ii1Var = ii1.RAW;
        pj1 pj1Var = pj1.f15022e;
        map.put(ii1Var, pj1Var);
        map2.put(pj1Var, ii1Var);
        ii1 ii1Var2 = ii1.TINK;
        pj1 pj1Var2 = pj1.f15019b;
        map.put(ii1Var2, pj1Var2);
        map2.put(pj1Var2, ii1Var2);
        ii1 ii1Var3 = ii1.CRUNCHY;
        pj1 pj1Var3 = pj1.f15020c;
        map.put(ii1Var3, pj1Var3);
        map2.put(pj1Var3, ii1Var3);
        ii1 ii1Var4 = ii1.LEGACY;
        pj1 pj1Var4 = pj1.f15021d;
        map.put(ii1Var4, pj1Var4);
        map2.put(pj1Var4, ii1Var4);
        g = new rt(26, DesugarCollections.unmodifiableMap(map), DesugarCollections.unmodifiableMap(map2));
    }

    public static eh1 a(tj1 tj1Var) {
        dh1 dh1VarD = eh1.D();
        byte[] bArrB = tj1Var.f16831d.b();
        zm1 zm1VarV = bn1.v(0, bArrB.length, bArrB);
        dh1VarD.b();
        ((eh1) dh1VarD.f14755b).G(zm1VarV);
        return (eh1) dh1VarD.e();
    }
}
