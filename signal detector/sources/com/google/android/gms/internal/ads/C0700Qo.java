package com.google.android.gms.internal.ads;

import j$.util.Objects;
import j2.C2556l;

/* renamed from: com.google.android.gms.internal.ads.Qo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0700Qo extends j2.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinderC0751To f10705e;

    public C0700Qo(BinderC0751To binderC0751To, String str) {
        this.f10704d = str;
        Objects.requireNonNull(binderC0751To);
        this.f10705e = binderC0751To;
    }

    @Override // j2.u
    public final void c(C2556l c2556l) {
        this.f10705e.M3(BinderC0751To.P3(c2556l));
    }

    @Override // j2.u
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        String str = this.f10704d;
        this.f10705e.L3((C0890af) obj, str);
    }
}
