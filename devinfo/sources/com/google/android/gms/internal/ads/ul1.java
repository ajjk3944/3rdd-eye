package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class ul1 implements u91 {

    /* renamed from: a, reason: collision with root package name */
    public static final rt f17257a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f17258b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f17259c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ol1 ol1Var = ol1.f14731a;
        ik1 ik1Var = ik1.f12361b;
        map.put(ol1Var, ik1Var);
        map2.put(ik1Var, ol1Var);
        ol1 ol1Var2 = ol1.f14732b;
        ik1 ik1Var2 = ik1.f12362c;
        map.put(ol1Var2, ik1Var2);
        map2.put(ik1Var2, ol1Var2);
        ol1 ol1Var3 = ol1.f14733c;
        ik1 ik1Var3 = ik1.f12363d;
        map.put(ol1Var3, ik1Var3);
        map2.put(ik1Var3, ol1Var3);
        f17257a = new rt(26, DesugarCollections.unmodifiableMap(map), DesugarCollections.unmodifiableMap(map2));
        f17258b = new byte[0];
        f17259c = new byte[]{0};
    }
}
