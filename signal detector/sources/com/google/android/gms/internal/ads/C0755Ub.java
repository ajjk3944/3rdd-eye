package com.google.android.gms.internal.ads;

import M2.InterfaceC0163c;
import b4.C0355t;

/* renamed from: com.google.android.gms.internal.ads.Ub, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0755Ub implements InterfaceC0163c, InterfaceC0674Pf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0657Of f11699a;

    public /* synthetic */ C0755Ub(C0657Of c0657Of) {
        this.f11699a = c0657Of;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0674Pf, com.google.android.gms.internal.ads.InterfaceC0482Ea, com.google.android.gms.internal.ads.Dr
    /* renamed from: a */
    public void mo6a() {
        this.f11699a.c(new C0355t("Cannot get Javascript Engine"));
    }

    @Override // M2.InterfaceC0163c
    public void k0(J2.b bVar) {
        this.f11699a.c(new RuntimeException("Connection failed."));
    }

    public C0755Ub(H1.h hVar, C0657Of c0657Of) {
        this.f11699a = c0657Of;
    }
}
