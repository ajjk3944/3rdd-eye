package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ls1 implements js1 {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f13610c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile fs1 f13611a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f13612b;

    public static js1 b(fs1 fs1Var) {
        if ((fs1Var instanceof ls1) || (fs1Var instanceof es1)) {
            return fs1Var;
        }
        ls1 ls1Var = new ls1();
        ls1Var.f13612b = f13610c;
        ls1Var.f13611a = fs1Var;
        return ls1Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        Object obj = this.f13612b;
        if (obj != f13610c) {
            return obj;
        }
        fs1 fs1Var = this.f13611a;
        if (fs1Var == null) {
            return this.f13612b;
        }
        Object objA = fs1Var.a();
        this.f13612b = objA;
        this.f13611a = null;
        return objA;
    }
}
