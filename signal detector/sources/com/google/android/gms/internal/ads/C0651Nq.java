package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Nq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0651Nq extends AbstractC0617Lq {

    /* renamed from: a, reason: collision with root package name */
    public final C0710Rh f10073a;

    /* renamed from: b, reason: collision with root package name */
    public final C0895ak f10074b;

    /* renamed from: c, reason: collision with root package name */
    public final C1283hr f10075c;

    /* renamed from: d, reason: collision with root package name */
    public final C1277hl f10076d;

    /* renamed from: e, reason: collision with root package name */
    public final C0697Ql f10077e;

    /* renamed from: f, reason: collision with root package name */
    public final C0679Pk f10078f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f10079g;

    /* renamed from: h, reason: collision with root package name */
    public final C0896al f10080h;
    public final C0702Qq i;

    /* renamed from: j, reason: collision with root package name */
    public final C1228gq f10081j;

    public C0651Nq(C0710Rh c0710Rh, C0895ak c0895ak, C1283hr c1283hr, C1277hl c1277hl, C0697Ql c0697Ql, C0679Pk c0679Pk, ViewGroup viewGroup, C0896al c0896al, C0702Qq c0702Qq, C1228gq c1228gq) {
        this.f10073a = c0710Rh;
        this.f10074b = c0895ak;
        this.f10075c = c1283hr;
        this.f10076d = c1277hl;
        this.f10077e = c0697Ql;
        this.f10078f = c0679Pk;
        this.f10079g = viewGroup;
        this.f10080h = c0896al;
        this.i = c0702Qq;
        this.f10081j = c1228gq;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0617Lq
    public final Ju c(C0960bu c0960bu, Bundle bundle, Qt qt, Xt xt) {
        C0895ak c0895ak = this.f10074b;
        c0895ak.f13214b = c0960bu;
        c0895ak.f13215c = bundle;
        c0895ak.f13217e = new C1338iu(xt, qt, this.i, 13, false);
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8787m4)).booleanValue()) {
            c0895ak.f13218f = this.f10081j;
        }
        C0710Rh c0710Rh = this.f10073a.f10986b;
        C0895ak c0895ak2 = new C0895ak(c0895ak);
        C0889ae c0889ae = new C0889ae(this.f10078f, 16, this.f10080h);
        L6 l6 = new L6(13, this.f10079g);
        C1277hl c1277hl = this.f10076d;
        Cr.A(c1277hl, C1277hl.class);
        C1283hr c1283hr = this.f10075c;
        Cr.A(c1283hr, C1283hr.class);
        Nx nx = new Nx(23);
        C0697Ql c0697Ql = this.f10077e;
        Cr.A(c0697Ql, C0697Ql.class);
        C0440Bj c0440Bj = (C0440Bj) new C0795Wh(c0710Rh, l6, c0697Ql, new C1437kl(19), c1277hl, c0895ak2, nx, c1283hr, c0889ae, null, null).f12297s.c();
        return c0440Bj.c(c0440Bj.b());
    }
}
