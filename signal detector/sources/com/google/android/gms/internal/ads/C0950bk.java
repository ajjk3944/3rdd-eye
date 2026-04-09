package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.bk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0950bk implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13456a;

    /* renamed from: b, reason: collision with root package name */
    public final C0895ak f13457b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f13458c;

    public /* synthetic */ C0950bk(C0895ak c0895ak, InterfaceC2069wN interfaceC2069wN, int i) {
        this.f13456a = i;
        this.f13457b = c0895ak;
        this.f13458c = interfaceC2069wN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f13456a) {
            case 0:
                String str = (String) this.f13458c.c();
                C1228gq c1228gq = (C1228gq) this.f13457b.f13218f;
                return c1228gq != null ? c1228gq : new C1228gq(str);
            default:
                ((C0540Hh) this.f13458c).a();
                Context context = this.f13457b.f13213a;
                Cr.v(context);
                return context;
        }
    }
}
