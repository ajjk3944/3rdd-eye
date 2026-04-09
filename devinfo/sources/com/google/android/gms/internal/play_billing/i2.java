package com.google.android.gms.internal.play_billing;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i2 {

    /* renamed from: c, reason: collision with root package name */
    public static final i2 f20149c = new i2();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f20151b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final a2 f20150a = new a2();

    public final l2 a(Class cls) {
        l2 l2VarU;
        Charset charset = u1.f20233a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f20151b;
        l2 l2Var = (l2) concurrentHashMap.get(cls);
        if (l2Var != null) {
            return l2Var;
        }
        a2 a2Var = this.f20150a;
        a2Var.getClass();
        n1 n1Var = m2.f20187a;
        p1.class.isAssignableFrom(cls);
        k2 k2VarD = ((a2) a2Var.f20082a).d(cls);
        if ((k2VarD.f20176d & 2) == 2) {
            n1 n1Var2 = m2.f20187a;
            n1 n1Var3 = j1.f20159a;
            l2VarU = new g2(n1Var2, k2VarD.f20173a);
        } else {
            int i4 = h2.f20142a;
            int i10 = y1.f20263a;
            n1 n1Var4 = m2.f20187a;
            n1 n1Var5 = k2VarD.a() + (-1) != 1 ? j1.f20159a : null;
            int i11 = c2.f20096a;
            l2VarU = f2.u(k2VarD, n1Var4, n1Var5);
        }
        l2 l2Var2 = (l2) concurrentHashMap.putIfAbsent(cls, l2VarU);
        return l2Var2 != null ? l2Var2 : l2VarU;
    }
}
