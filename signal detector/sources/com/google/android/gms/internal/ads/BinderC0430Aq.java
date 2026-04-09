package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Aq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0430Aq extends AbstractBinderC0486Ee implements InterfaceC2245zk {

    /* renamed from: a, reason: collision with root package name */
    public BinderC0838Yq f7052a;

    /* renamed from: b, reason: collision with root package name */
    public A1.w f7053b;

    /* renamed from: c, reason: collision with root package name */
    public C1431kf f7054c;

    @Override // com.google.android.gms.internal.ads.InterfaceC0503Fe
    public final synchronized void D(S2.a aVar) {
        A1.w wVar = this.f7053b;
        if (wVar != null) {
            wVar.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0503Fe
    public final synchronized void L(S2.a aVar) {
        BinderC0838Yq binderC0838Yq = this.f7052a;
        if (binderC0838Yq != null) {
            binderC0838Yq.f12712c.H1();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0503Fe
    public final synchronized void Q(S2.a aVar) {
        BinderC0838Yq binderC0838Yq = this.f7052a;
        if (binderC0838Yq != null) {
            binderC0838Yq.f12710a.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0503Fe
    public final synchronized void T1(S2.a aVar, C0520Ge c0520Ge) {
        BinderC0838Yq binderC0838Yq = this.f7052a;
        if (binderC0838Yq != null) {
            binderC0838Yq.f12713d.N(c0520Ge);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0503Fe
    public final synchronized void W0(S2.a aVar) {
        BinderC0838Yq binderC0838Yq = this.f7052a;
        if (binderC0838Yq != null) {
            binderC0838Yq.f12713d.N(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0503Fe
    public final synchronized void X1(S2.a aVar) {
        BinderC0838Yq binderC0838Yq = this.f7052a;
        if (binderC0838Yq != null) {
            binderC0838Yq.f12713d.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0503Fe
    public final synchronized void b3(S2.a aVar) {
        BinderC0838Yq binderC0838Yq = this.f7052a;
        if (binderC0838Yq != null) {
            binderC0838Yq.f12712c.C1(C1652ok.f16045h);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0503Fe
    public final synchronized void n0(S2.a aVar, int i) {
        C1431kf c1431kf = this.f7054c;
        if (c1431kf != null) {
            u2.k.h("Fail to initialize adapter ".concat(String.valueOf(((C1119eq) c1431kf.f15175d).f13986a)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0503Fe
    public final synchronized void p0(S2.a aVar) {
        C1431kf c1431kf = this.f7054c;
        if (c1431kf != null) {
            C1119eq c1119eq = (C1119eq) c1431kf.f15175d;
            ((C0770Uq) c1431kf.f15176e).f11800c.execute(new RunnableC0912b0((Xt) c1431kf.f15173b, (Qt) c1431kf.f15174c, c1119eq, 8));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0503Fe
    public final synchronized void p2(S2.a aVar) {
        BinderC0838Yq binderC0838Yq = this.f7052a;
        if (binderC0838Yq != null) {
            binderC0838Yq.f12711b.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2245zk
    public final synchronized void s2(A1.w wVar) {
        this.f7053b = wVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0503Fe
    public final synchronized void u3(S2.a aVar, int i) {
        A1.w wVar = this.f7053b;
        if (wVar != null) {
            wVar.j(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0503Fe
    public final synchronized void y1(S2.a aVar) {
        BinderC0838Yq binderC0838Yq = this.f7052a;
        if (binderC0838Yq != null) {
            binderC0838Yq.y1(aVar);
        }
    }
}
