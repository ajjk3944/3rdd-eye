package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.p7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractCallableC1676p7 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final X6 f16130a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16131b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16132c;

    /* renamed from: d, reason: collision with root package name */
    public final S5 f16133d;

    /* renamed from: e, reason: collision with root package name */
    public Method f16134e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16135f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16136g;

    public AbstractCallableC1676p7(X6 x6, String str, String str2, S5 s5, int i, int i3) {
        this.f16130a = x6;
        this.f16131b = str;
        this.f16132c = str2;
        this.f16133d = s5;
        this.f16135f = i;
        this.f16136g = i3;
    }

    public abstract void a();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        try {
            long jNanoTime = System.nanoTime();
            X6 x6 = this.f16130a;
            Method methodD = x6.d(this.f16131b, this.f16132c);
            this.f16134e = methodD;
            if (methodD == null) {
                return null;
            }
            a();
            E6 e6 = x6.f12384k;
            if (e6 == null || (i = this.f16135f) == Integer.MIN_VALUE) {
                return null;
            }
            e6.a(this.f16136g, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
