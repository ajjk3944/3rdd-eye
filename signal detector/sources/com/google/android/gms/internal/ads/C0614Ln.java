package com.google.android.gms.internal.ads;

import q2.C2852x0;
import q2.InterfaceC2806a;

/* renamed from: com.google.android.gms.internal.ads.Ln, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0614Ln implements InterfaceC0730Sk, InterfaceC0441Bk, InterfaceC1544mk, InterfaceC1921tk, InterfaceC2806a, InterfaceC1005cl {

    /* renamed from: a, reason: collision with root package name */
    public final A8 f9756a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9757b = false;

    public C0614Ln(A8 a8, Ct ct) {
        this.f9756a = a8;
        a8.b(2);
        if (ct != null) {
            a8.b(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1005cl
    public final void A(boolean z6) {
        this.f9756a.b(true != z6 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1005cl
    public final void B(C1084e9 c1084e9) {
        A8 a8 = this.f9756a;
        synchronized (a8) {
            if (a8.f6938c) {
                try {
                    a8.f6937b.g(c1084e9);
                } catch (NullPointerException e6) {
                    p2.j.f22785C.f22795h.f("AdMobClearcutLogger.modify", e6);
                }
            }
        }
        a8.b(1102);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1544mk
    public final void D(C2852x0 c2852x0) {
        int i = c2852x0.f23273a;
        A8 a8 = this.f9756a;
        switch (i) {
            case 1:
                a8.b(101);
                break;
            case 2:
                a8.b(102);
                break;
            case 3:
                a8.b(5);
                break;
            case 4:
                a8.b(103);
                break;
            case 5:
                a8.b(104);
                break;
            case 6:
                a8.b(105);
                break;
            case 7:
                a8.b(106);
                break;
            default:
                a8.b(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0730Sk
    public final void E(C1807re c1807re) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1005cl
    public final void H(C1084e9 c1084e9) {
        A8 a8 = this.f9756a;
        synchronized (a8) {
            if (a8.f6938c) {
                try {
                    a8.f6937b.g(c1084e9);
                } catch (NullPointerException e6) {
                    p2.j.f22785C.f22795h.f("AdMobClearcutLogger.modify", e6);
                }
            }
        }
        a8.b(1104);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0441Bk
    public final void e() {
        this.f9756a.b(3);
    }

    @Override // q2.InterfaceC2806a
    public final synchronized void onAdClicked() {
        if (this.f9757b) {
            this.f9756a.b(8);
        } else {
            this.f9756a.b(7);
            this.f9757b = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1005cl
    public final void p() {
        this.f9756a.b(1109);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0730Sk
    public final void w(Xt xt) {
        this.f9756a.a(new C0696Qk(xt));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1005cl
    public final void x(boolean z6) {
        this.f9756a.b(true != z6 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1005cl
    public final void y(C1084e9 c1084e9) {
        A8 a8 = this.f9756a;
        synchronized (a8) {
            if (a8.f6938c) {
                try {
                    a8.f6937b.g(c1084e9);
                } catch (NullPointerException e6) {
                    p2.j.f22785C.f22795h.f("AdMobClearcutLogger.modify", e6);
                }
            }
        }
        a8.b(1103);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1921tk
    public final synchronized void z() {
        this.f9756a.b(6);
    }
}
