package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import q2.C2841s;
import q2.InterfaceC2837p0;
import t2.AbstractC2907C;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Lo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0615Lo implements s2.k, InterfaceC1864sh {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9758a;

    /* renamed from: b, reason: collision with root package name */
    public final C2951a f9759b;

    /* renamed from: c, reason: collision with root package name */
    public C0581Jo f9760c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0828Yg f9761d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9762e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9763f;

    /* renamed from: g, reason: collision with root package name */
    public long f9764g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC2837p0 f9765h;
    public boolean i;

    public C0615Lo(Context context, C2951a c2951a) {
        this.f9758a = context;
        this.f9759b = c2951a;
    }

    @Override // s2.k
    public final void I0() {
    }

    @Override // s2.k
    public final void K1() {
    }

    @Override // s2.k
    public final void N2() {
    }

    @Override // s2.k
    public final void R1() {
    }

    public final synchronized void a(InterfaceC2837p0 interfaceC2837p0, C0483Eb c0483Eb, C1858sb c1858sb, C0483Eb c0483Eb2) {
        if (c(interfaceC2837p0)) {
            try {
                p2.j jVar = p2.j.f22785C;
                W9 w9 = jVar.f22791d;
                InterfaceC0828Yg interfaceC0828YgG = W9.g(this.f9758a, new T2.d(0, 0, 0), "", false, false, null, null, this.f9759b, null, null, new A8(), null, null, null, null, null);
                this.f9761d = interfaceC0828YgG;
                C1649oh c1649ohL0 = interfaceC0828YgG.l0();
                if (c1649ohL0 == null) {
                    u2.k.h("Failed to obtain a web view for the ad inspector");
                    try {
                        jVar.f22795h.f("InspectorUi.openInspector 2", new NullPointerException("Failed to obtain a web view for the ad inspector"));
                        interfaceC2837p0.c0(AbstractC1984ut.A(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e6) {
                        p2.j.f22785C.f22795h.f("InspectorUi.openInspector 3", e6);
                        return;
                    }
                }
                this.f9765h = interfaceC2837p0;
                Context context = this.f9758a;
                c1649ohL0.u(null, null, null, null, null, false, null, null, null, null, null, null, null, c0483Eb, null, new C1858sb(6, context), c1858sb, c0483Eb2, null, null, null, null);
                c1649ohL0.f16014g = this;
                this.f9761d.loadUrl((String) C2841s.f23267e.f23270c.a(H9.ga));
                p1.e.i(context, new AdOverlayInfoParcel(this, this.f9761d, this.f9759b), true, null);
                jVar.f22797k.getClass();
                this.f9764g = System.currentTimeMillis();
            } catch (C1165fh e7) {
                u2.k.i("Failed to obtain a web view for the ad inspector", e7);
                try {
                    p2.j.f22785C.f22795h.f("InspectorUi.openInspector 0", e7);
                    interfaceC2837p0.c0(AbstractC1984ut.A(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e8) {
                    p2.j.f22785C.f22795h.f("InspectorUi.openInspector 1", e8);
                }
            }
        }
    }

    public final synchronized void b() {
        if (this.f9762e && this.f9763f) {
            AbstractC0640Nf.f10010f.execute(new RunnableC0558Ii(11, this));
        }
    }

    public final synchronized boolean c(InterfaceC2837p0 interfaceC2837p0) {
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.fa)).booleanValue()) {
            u2.k.h("Ad inspector had an internal error.");
            try {
                interfaceC2837p0.c0(AbstractC1984ut.A(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f9760c == null) {
            u2.k.h("Ad inspector had an internal error.");
            try {
                p2.j.f22785C.f22795h.f("InspectorUi.shouldOpenUi", new NullPointerException("InspectorManager null"));
                interfaceC2837p0.c0(AbstractC1984ut.A(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f9762e && !this.f9763f) {
            p2.j.f22785C.f22797k.getClass();
            if (System.currentTimeMillis() >= this.f9764g + ((Integer) r1.f23270c.a(H9.ia)).intValue()) {
                return true;
            }
        }
        u2.k.h("Ad inspector cannot be opened because it is already open.");
        try {
            interfaceC2837p0.c0(AbstractC1984ut.A(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // s2.k
    public final void d1() {
    }

    @Override // s2.k
    public final synchronized void g() {
        this.f9763f = true;
        b();
    }

    @Override // s2.k
    public final void h0() {
    }

    @Override // s2.k
    public final void j2() {
    }

    @Override // s2.k
    public final synchronized void k0(int i) {
        this.f9761d.destroy();
        if (!this.i) {
            AbstractC2907C.m("Inspector closed.");
            InterfaceC2837p0 interfaceC2837p0 = this.f9765h;
            if (interfaceC2837p0 != null) {
                try {
                    interfaceC2837p0.c0(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f9763f = false;
        this.f9762e = false;
        this.f9764g = 0L;
        this.i = false;
        this.f9765h = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1864sh
    public final synchronized void l(String str, int i, String str2, boolean z6) {
        if (z6) {
            AbstractC2907C.m("Ad inspector loaded.");
            this.f9762e = true;
            b();
            return;
        }
        u2.k.h("Ad inspector failed to load.");
        try {
            C0538Hf c0538Hf = p2.j.f22785C.f22795h;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb.append("Failed to load UI. Error code: ");
            sb.append(i);
            sb.append(", Description: ");
            sb.append(str);
            sb.append(", Failing URL: ");
            sb.append(str2);
            c0538Hf.f("InspectorUi.onAdWebViewFinishedLoading 0", new Exception(sb.toString()));
            InterfaceC2837p0 interfaceC2837p0 = this.f9765h;
            if (interfaceC2837p0 != null) {
                interfaceC2837p0.c0(AbstractC1984ut.A(17, null, null));
            }
        } catch (RemoteException e6) {
            p2.j.f22785C.f22795h.f("InspectorUi.onAdWebViewFinishedLoading 1", e6);
        }
        this.i = true;
        this.f9761d.destroy();
    }

    @Override // s2.k
    public final void n1() {
    }

    @Override // s2.k
    public final void x1() {
    }
}
