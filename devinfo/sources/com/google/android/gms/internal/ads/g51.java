package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class g51 extends g41 implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final transient z51 f11381d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f11382e;

    /* renamed from: f, reason: collision with root package name */
    public transient f51 f11383f;

    public g51(z51 z51Var, int i4) {
        this.f11381d = z51Var;
        this.f11382e = i4;
        Object[] objArr = a61.f9224i;
    }

    @Override // com.google.android.gms.internal.ads.f41
    public final /* synthetic */ Collection a() {
        return new c51(this);
    }

    @Override // com.google.android.gms.internal.ads.f41
    public final Map b() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.f41
    public final boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // com.google.android.gms.internal.ads.f41
    public /* synthetic */ Map d() {
        return this.f11381d;
    }
}
