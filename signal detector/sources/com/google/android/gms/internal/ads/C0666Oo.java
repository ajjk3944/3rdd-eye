package com.google.android.gms.internal.ads;

import j$.util.Objects;
import j2.C2556l;
import v2.AbstractC2960a;

/* renamed from: com.google.android.gms.internal.ads.Oo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0666Oo extends E2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinderC0751To f10249e;

    public C0666Oo(BinderC0751To binderC0751To, String str) {
        this.f10248d = str;
        Objects.requireNonNull(binderC0751To);
        this.f10249e = binderC0751To;
    }

    @Override // j2.u
    public final void c(C2556l c2556l) {
        this.f10249e.M3(BinderC0751To.P3(c2556l));
    }

    @Override // j2.u
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        String str = this.f10248d;
        this.f10249e.L3((AbstractC2960a) obj, str);
    }
}
