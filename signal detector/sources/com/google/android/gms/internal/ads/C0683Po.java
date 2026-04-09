package com.google.android.gms.internal.ads;

import j$.util.Objects;
import j2.C2556l;

/* renamed from: com.google.android.gms.internal.ads.Po, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0683Po extends E2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinderC0751To f10513e;

    public C0683Po(BinderC0751To binderC0751To, String str) {
        this.f10512d = str;
        Objects.requireNonNull(binderC0751To);
        this.f10513e = binderC0751To;
    }

    @Override // j2.u
    public final void c(C2556l c2556l) {
        this.f10513e.M3(BinderC0751To.P3(c2556l));
    }

    @Override // j2.u
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        String str = this.f10512d;
        this.f10513e.L3((C0758Ue) obj, str);
    }
}
