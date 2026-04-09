package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.bQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0938bQ implements InterfaceC1964uQ, AP {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13377a;

    /* renamed from: b, reason: collision with root package name */
    public C2233zP f13378b;

    /* renamed from: c, reason: collision with root package name */
    public C2233zP f13379c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1047dQ f13380d;

    public C0938bQ(AbstractC1047dQ abstractC1047dQ, Object obj) {
        this.f13380d = abstractC1047dQ;
        this.f13378b = new C2233zP(abstractC1047dQ.f12424c.f17875b, null);
        this.f13379c = new C2233zP(abstractC1047dQ.f12425d.f17875b, null);
        this.f13377a = obj;
    }

    public final boolean a(C1749qQ c1749qQ) {
        C1749qQ c1749qQV;
        Object obj = this.f13377a;
        AbstractC1047dQ abstractC1047dQ = this.f13380d;
        if (c1749qQ != null) {
            c1749qQV = abstractC1047dQ.v(obj, c1749qQ);
            if (c1749qQV == null) {
                return false;
            }
        } else {
            c1749qQV = null;
        }
        abstractC1047dQ.u(obj);
        C2233zP c2233zP = this.f13378b;
        c2233zP.getClass();
        if (!Objects.equals(c2233zP.f17874a, c1749qQV)) {
            this.f13378b = new C2233zP(abstractC1047dQ.f12424c.f17875b, c1749qQV);
        }
        C2233zP c2233zP2 = this.f13379c;
        c2233zP2.getClass();
        if (Objects.equals(c2233zP2.f17874a, c1749qQV)) {
            return true;
        }
        this.f13379c = new C2233zP(abstractC1047dQ.f12425d.f17875b, c1749qQV);
        return true;
    }

    public final void b(C1587nQ c1587nQ, C1749qQ c1749qQ) {
        long j6 = c1587nQ.f15780c;
        AbstractC1047dQ abstractC1047dQ = this.f13380d;
        Object obj = this.f13377a;
        abstractC1047dQ.w(j6, obj);
        abstractC1047dQ.w(c1587nQ.f15781d, obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1964uQ
    public final void j(int i, C1749qQ c1749qQ, C1319iQ c1319iQ, C1587nQ c1587nQ) {
        if (a(c1749qQ)) {
            C2233zP c2233zP = this.f13378b;
            b(c1587nQ, c1749qQ);
            c2233zP.getClass();
            c2233zP.a(new C1910tQ(c2233zP, c1319iQ, c1587nQ, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1964uQ
    public final void n(int i, C1749qQ c1749qQ, C1319iQ c1319iQ, C1587nQ c1587nQ, IOException iOException, boolean z6) {
        if (a(c1749qQ)) {
            C2233zP c2233zP = this.f13378b;
            b(c1587nQ, c1749qQ);
            c2233zP.getClass();
            c2233zP.a(new Ww(c2233zP, c1319iQ, c1587nQ, iOException, z6));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1964uQ
    public final void o(int i, C1749qQ c1749qQ, C1319iQ c1319iQ, C1587nQ c1587nQ) {
        if (a(c1749qQ)) {
            C2233zP c2233zP = this.f13378b;
            b(c1587nQ, c1749qQ);
            c2233zP.getClass();
            c2233zP.a(new C1910tQ(c2233zP, c1319iQ, c1587nQ, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1964uQ
    public final void p(int i, C1749qQ c1749qQ, C1587nQ c1587nQ) {
        if (a(c1749qQ)) {
            C2233zP c2233zP = this.f13378b;
            b(c1587nQ, c1749qQ);
            c2233zP.getClass();
            c2233zP.a(new C1879sw(c2233zP, 13, c1587nQ));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1964uQ
    public final void s(int i, C1749qQ c1749qQ, C1319iQ c1319iQ, C1587nQ c1587nQ, int i3) {
        if (a(c1749qQ)) {
            C2233zP c2233zP = this.f13378b;
            b(c1587nQ, c1749qQ);
            c2233zP.getClass();
            c2233zP.a(new C1728q5(c2233zP, c1319iQ, c1587nQ, i3));
        }
    }
}
