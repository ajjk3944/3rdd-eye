package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class h01 implements g01 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11676a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11677b;

    /* renamed from: c, reason: collision with root package name */
    public final sz0 f11678c;

    /* renamed from: d, reason: collision with root package name */
    public final zc f11679d;

    /* renamed from: e, reason: collision with root package name */
    public final f21 f11680e;

    public h01(String str, String str2, zc zcVar, sz0 sz0Var, f21 f21Var) {
        this.f11676a = str;
        this.f11677b = str2;
        this.f11679d = zcVar;
        this.f11678c = sz0Var;
        this.f11680e = f21Var;
    }

    public abstract void a(Method method, zc zcVar);

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        f21 f21Var = this.f11680e;
        try {
            f21Var.a();
            Method methodB = this.f11678c.b(this.f11676a, this.f11677b);
            if (methodB != null) {
                a(methodB, this.f11679d);
            }
            f21Var.c();
            return null;
        } finally {
        }
    }
}
