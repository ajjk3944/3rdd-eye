package com.google.android.gms.internal.ads;

import android.content.Context;
import q2.C2852x0;

/* loaded from: classes.dex */
public final class Pu implements InterfaceC1599nl, InterfaceC1813rk, InterfaceC1707pl {

    /* renamed from: a, reason: collision with root package name */
    public final Xu f10535a;

    /* renamed from: b, reason: collision with root package name */
    public final Su f10536b;

    public Pu(Context context, Xu xu) {
        this.f10535a = xu;
        this.f10536b = AbstractC1135f5.y(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1707pl
    public final void a() {
        if (((Boolean) AbstractC1049da.f13769d.v()).booleanValue()) {
            Su su = this.f10536b;
            su.b(true);
            this.f10535a.a(su);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1599nl
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1813rk
    public final void f(C2852x0 c2852x0) {
        if (((Boolean) AbstractC1049da.f13769d.v()).booleanValue()) {
            String string = c2852x0.a().toString();
            Su su = this.f10536b;
            su.g(string);
            su.b(false);
            this.f10535a.a(su);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1599nl
    public final void g() {
        if (((Boolean) AbstractC1049da.f13769d.v()).booleanValue()) {
            this.f10536b.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1707pl
    public final void z() {
    }
}
