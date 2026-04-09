package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class zf implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final ff f19072a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19073b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19074c;

    /* renamed from: d, reason: collision with root package name */
    public final zc f19075d;

    /* renamed from: e, reason: collision with root package name */
    public Method f19076e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19077f;
    public final int g;

    public zf(ff ffVar, String str, String str2, zc zcVar, int i4, int i10) {
        this.f19072a = ffVar;
        this.f19073b = str;
        this.f19074c = str2;
        this.f19075d = zcVar;
        this.f19077f = i4;
        this.g = i10;
    }

    public abstract void a();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i4;
        try {
            long jNanoTime = System.nanoTime();
            ff ffVar = this.f19072a;
            Method methodD = ffVar.d(this.f19073b, this.f19074c);
            this.f19076e = methodD;
            if (methodD == null) {
                return null;
            }
            a();
            le leVar = ffVar.f11124k;
            if (leVar == null || (i4 = this.f19077f) == Integer.MIN_VALUE) {
                return null;
            }
            leVar.a(this.g, i4, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
