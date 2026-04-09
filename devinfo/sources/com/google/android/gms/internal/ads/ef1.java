package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class ef1 {

    /* renamed from: a, reason: collision with root package name */
    public static final rt f10777a;

    /* renamed from: b, reason: collision with root package name */
    public static final rt f10778b;

    /* renamed from: c, reason: collision with root package name */
    public static final qd1 f10779c;

    /* renamed from: d, reason: collision with root package name */
    public static final od1 f10780d;

    /* renamed from: e, reason: collision with root package name */
    public static final wc1 f10781e;

    /* renamed from: f, reason: collision with root package name */
    public static final uc1 f10782f;

    static {
        vl1 vl1VarA = je1.a("type.googleapis.com/google.crypto.tink.HmacKey");
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ii1 ii1Var = ii1.RAW;
        te1 te1Var = te1.f16801e;
        map.put(ii1Var, te1Var);
        map2.put(te1Var, ii1Var);
        ii1 ii1Var2 = ii1.TINK;
        te1 te1Var2 = te1.f16798b;
        map.put(ii1Var2, te1Var2);
        map2.put(te1Var2, ii1Var2);
        ii1 ii1Var3 = ii1.LEGACY;
        te1 te1Var3 = te1.f16800d;
        map.put(ii1Var3, te1Var3);
        map2.put(te1Var3, ii1Var3);
        ii1 ii1Var4 = ii1.CRUNCHY;
        te1 te1Var4 = te1.f16799c;
        map.put(ii1Var4, te1Var4);
        map2.put(te1Var4, ii1Var4);
        f10777a = new rt(26, DesugarCollections.unmodifiableMap(map), DesugarCollections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        fh1 fh1Var = fh1.SHA1;
        se1 se1Var = se1.f15998b;
        map3.put(fh1Var, se1Var);
        map4.put(se1Var, fh1Var);
        fh1 fh1Var2 = fh1.SHA224;
        se1 se1Var2 = se1.f15999c;
        map3.put(fh1Var2, se1Var2);
        map4.put(se1Var2, fh1Var2);
        fh1 fh1Var3 = fh1.SHA256;
        se1 se1Var3 = se1.f16000d;
        map3.put(fh1Var3, se1Var3);
        map4.put(se1Var3, fh1Var3);
        fh1 fh1Var4 = fh1.SHA384;
        se1 se1Var4 = se1.f16001e;
        map3.put(fh1Var4, se1Var4);
        map4.put(se1Var4, fh1Var4);
        fh1 fh1Var5 = fh1.SHA512;
        se1 se1Var5 = se1.f16002f;
        map3.put(fh1Var5, se1Var5);
        map4.put(se1Var5, fh1Var5);
        f10778b = new rt(26, DesugarCollections.unmodifiableMap(map3), DesugarCollections.unmodifiableMap(map4));
        f10779c = new qd1(ue1.class, df1.f10448c);
        f10780d = new od1(vl1VarA, ub1.C);
        f10781e = new wc1(qe1.class, ub1.D);
        f10782f = new uc1(vl1VarA, df1.f10447b);
    }
}
