package com.google.android.gms.internal.ads;

import android.os.Bundle;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Mq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0634Mq extends AbstractC0617Lq {

    /* renamed from: a, reason: collision with root package name */
    public final C0710Rh f9911a;

    /* renamed from: b, reason: collision with root package name */
    public final C0895ak f9912b;

    /* renamed from: c, reason: collision with root package name */
    public final C1277hl f9913c;

    /* renamed from: d, reason: collision with root package name */
    public final C0702Qq f9914d;

    /* renamed from: e, reason: collision with root package name */
    public final C1228gq f9915e;

    public C0634Mq(C0710Rh c0710Rh, C0895ak c0895ak, C1277hl c1277hl, C0702Qq c0702Qq, C1228gq c1228gq) {
        this.f9911a = c0710Rh;
        this.f9912b = c0895ak;
        this.f9913c = c1277hl;
        this.f9914d = c0702Qq;
        this.f9915e = c1228gq;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0617Lq
    public final Ju c(C0960bu c0960bu, Bundle bundle, Qt qt, Xt xt) {
        C0895ak c0895ak = this.f9912b;
        c0895ak.f13214b = c0960bu;
        c0895ak.f13215c = bundle;
        c0895ak.f13217e = new C1338iu(xt, qt, this.f9914d, 13, false);
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8787m4)).booleanValue()) {
            c0895ak.f13218f = this.f9915e;
        }
        C0710Rh c0710Rh = this.f9911a.f10986b;
        C0895ak c0895ak2 = new C0895ak(c0895ak);
        C1277hl c1277hl = this.f9913c;
        Cr.A(c1277hl, C1277hl.class);
        C0440Bj c0440BjA = new C0761Uh(c0710Rh, new C1437kl(19), c1277hl, c0895ak2, new Nx(23), null, null).a();
        return c0440BjA.c(c0440BjA.b());
    }
}
