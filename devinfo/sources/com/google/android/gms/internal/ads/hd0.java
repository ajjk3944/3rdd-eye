package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hd0 implements n70, w60, i60, p60, va.a, y70 {

    /* renamed from: a, reason: collision with root package name */
    public final li f11839a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11840b = false;

    public hd0(li liVar, hp0 hp0Var) {
        this.f11839a = liVar;
        liVar.b(2);
        if (hp0Var != null) {
            liVar.b(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.y70
    public final void H1() {
        this.f11839a.b(1109);
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void e() {
        this.f11839a.b(3);
    }

    @Override // com.google.android.gms.internal.ads.y70
    public final void k(boolean z3) {
        this.f11839a.b(true != z3 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.n70
    public final void l(dq0 dq0Var) {
        this.f11839a.a(new l70(dq0Var));
    }

    @Override // com.google.android.gms.internal.ads.y70
    public final void m(pj pjVar) {
        li liVar = this.f11839a;
        synchronized (liVar) {
            if (liVar.f13496c) {
                try {
                    liVar.f13495b.h(pjVar);
                } catch (NullPointerException e2) {
                    ua.j.C.f35265h.f("AdMobClearcutLogger.modify", e2);
                }
            }
        }
        liVar.b(1103);
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final synchronized void n() {
        this.f11839a.b(6);
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void o(va.w1 w1Var) {
        int i4 = w1Var.f36177a;
        li liVar = this.f11839a;
        switch (i4) {
            case 1:
                liVar.b(101);
                break;
            case 2:
                liVar.b(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH);
                break;
            case 3:
                liVar.b(5);
                break;
            case 4:
                liVar.b(FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT);
                break;
            case 5:
                liVar.b(104);
                break;
            case 6:
                liVar.b(105);
                break;
            case 7:
                liVar.b(106);
                break;
            default:
                liVar.b(4);
                break;
        }
    }

    @Override // va.a
    public final synchronized void onAdClicked() {
        if (this.f11840b) {
            this.f11839a.b(8);
        } else {
            this.f11839a.b(7);
            this.f11840b = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.y70
    public final void p(boolean z3) {
        this.f11839a.b(true != z3 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.y70
    public final void r(pj pjVar) {
        li liVar = this.f11839a;
        synchronized (liVar) {
            if (liVar.f13496c) {
                try {
                    liVar.f13495b.h(pjVar);
                } catch (NullPointerException e2) {
                    ua.j.C.f35265h.f("AdMobClearcutLogger.modify", e2);
                }
            }
        }
        liVar.b(1102);
    }

    @Override // com.google.android.gms.internal.ads.y70
    public final void u(pj pjVar) {
        li liVar = this.f11839a;
        synchronized (liVar) {
            if (liVar.f13496c) {
                try {
                    liVar.f13495b.h(pjVar);
                } catch (NullPointerException e2) {
                    ua.j.C.f35265h.f("AdMobClearcutLogger.modify", e2);
                }
            }
        }
        liVar.b(1104);
    }

    @Override // com.google.android.gms.internal.ads.n70
    public final void t(iu iuVar) {
    }
}
