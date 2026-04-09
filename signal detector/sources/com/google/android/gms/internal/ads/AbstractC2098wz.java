package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.ads.wz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2098wz implements InterfaceCallableC2044vz {

    /* renamed from: a, reason: collision with root package name */
    public final String f17524a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17525b;

    /* renamed from: c, reason: collision with root package name */
    public final C1291hz f17526c;

    /* renamed from: d, reason: collision with root package name */
    public final S5 f17527d;

    /* renamed from: e, reason: collision with root package name */
    public final C1894tA f17528e;

    public AbstractC2098wz(String str, String str2, S5 s5, C1291hz c1291hz, C1894tA c1894tA) {
        this.f17524a = str;
        this.f17525b = str2;
        this.f17527d = s5;
        this.f17526c = c1291hz;
        this.f17528e = c1894tA;
    }

    public abstract void a(Method method, S5 s5);

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1894tA c1894tA = this.f17528e;
        try {
            c1894tA.a();
            Method methodB = this.f17526c.b(this.f17524a, this.f17525b);
            if (methodB != null) {
                a(methodB, this.f17527d);
            }
            c1894tA.c();
            return null;
        } finally {
        }
    }
}
