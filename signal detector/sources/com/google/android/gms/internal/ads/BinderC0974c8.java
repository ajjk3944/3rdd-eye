package com.google.android.gms.internal.ads;

import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.c8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0974c8 extends AbstractBinderC1301i8 {

    /* renamed from: a, reason: collision with root package name */
    public final E2.b f13535a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13536b;

    public BinderC0974c8(E2.b bVar, String str) {
        this.f13535a = bVar;
        this.f13536b = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1407k8
    public final void E(int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1407k8
    public final void c2(InterfaceC1193g8 interfaceC1193g8) {
        E2.b bVar = this.f13535a;
        if (bVar != null) {
            bVar.f(new C1029d8(interfaceC1193g8, this.f13536b));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1407k8
    public final void j0(C2852x0 c2852x0) {
        E2.b bVar = this.f13535a;
        if (bVar != null) {
            bVar.c(c2852x0.b());
        }
    }
}
