package com.google.firebase.crashlytics.internal.common;

import p5.b;

/* renamed from: com.google.firebase.crashlytics.internal.common.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5111m implements p5.b {

    /* renamed from: a, reason: collision with root package name */
    private final G f38797a;

    /* renamed from: b, reason: collision with root package name */
    private final C5110l f38798b;

    public C5111m(G g10, Q4.g gVar) {
        this.f38797a = g10;
        this.f38798b = new C5110l(gVar);
    }

    @Override // p5.b
    public void a(b.C2029b c2029b) {
        I4.g.f().b("App Quality Sessions session changed: " + c2029b);
        this.f38798b.h(c2029b.a());
    }

    @Override // p5.b
    public boolean b() {
        return this.f38797a.d();
    }

    @Override // p5.b
    public b.a c() {
        return b.a.CRASHLYTICS;
    }

    public String d(String str) {
        return this.f38798b.c(str);
    }

    public void e(String str) {
        this.f38798b.i(str);
    }
}
