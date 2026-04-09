package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class or implements bb.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f14771a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14772b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14773c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f14774d;

    public or(HashSet hashSet, boolean z3, int i4, boolean z10) {
        this.f14774d = hashSet;
        this.f14772b = z3;
        this.f14771a = i4;
        this.f14773c = z10;
    }

    @Override // bb.f
    public int a() {
        return this.f14771a;
    }

    @Override // bb.f
    public boolean b() {
        return this.f14773c;
    }

    @Override // bb.f
    public Set c() {
        return (Set) this.f14774d;
    }

    public void d(String str) {
        ((ec.s0) this.f14774d).K(this.f14771a, this.f14772b, this.f14773c, str, null, null, null);
    }

    public void e(Object obj, String str) {
        ((ec.s0) this.f14774d).K(this.f14771a, this.f14772b, this.f14773c, str, obj, null, null);
    }

    public void f(Object obj, Object obj2, String str) {
        ((ec.s0) this.f14774d).K(this.f14771a, this.f14772b, this.f14773c, str, obj, obj2, null);
    }

    public void g(String str, Object obj, Object obj2, Object obj3) {
        ((ec.s0) this.f14774d).K(this.f14771a, this.f14772b, this.f14773c, str, obj, obj2, obj3);
    }

    @Override // bb.f
    public boolean isTesting() {
        return this.f14772b;
    }

    public or(ec.s0 s0Var, int i4, boolean z3, boolean z10) {
        this.f14774d = s0Var;
        this.f14771a = i4;
        this.f14772b = z3;
        this.f14773c = z10;
    }
}
