package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ro1 {

    /* renamed from: c, reason: collision with root package name */
    public static final ro1 f15723c = new ro1();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f15725b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final fk0 f15724a = new fk0(1);

    public final xo1 a(Class cls) {
        xo1 xo1VarZ;
        Charset charset = yn1.f18811a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f15725b;
        xo1 xo1Var = (xo1) concurrentHashMap.get(cls);
        if (xo1Var != null) {
            return xo1Var;
        }
        fk0 fk0Var = this.f15724a;
        fk0Var.getClass();
        w5 w5Var = yo1.f18815a;
        if (!qn1.class.isAssignableFrom(cls)) {
            int i4 = um1.f17262a;
        }
        to1 to1VarE = ((ne0) fk0Var.f11194b).e(cls);
        if ((to1VarE.f16912d & 2) == 2) {
            int i10 = um1.f17262a;
            w5 w5Var2 = yo1.f18815a;
            cl1 cl1Var = kn1.f13216a;
            xo1VarZ = new no1(w5Var2, to1VarE.f16909a);
        } else {
            int i11 = um1.f17262a;
            int i12 = oo1.f14763a;
            int i13 = eo1.f10840a;
            w5 w5Var3 = yo1.f18815a;
            cl1 cl1Var2 = to1VarE.a() + (-1) != 1 ? kn1.f13216a : null;
            int i14 = io1.f12404a;
            xo1VarZ = mo1.z(to1VarE, w5Var3, cl1Var2);
        }
        xo1 xo1Var2 = (xo1) concurrentHashMap.putIfAbsent(cls, xo1VarZ);
        return xo1Var2 != null ? xo1Var2 : xo1VarZ;
    }
}
