package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ax2 implements ye4, ug2 {
    public final Context f;
    public final e51 g;
    public zw2 h;
    public ag2 i;
    public boolean j;
    public boolean k;
    public long l;
    public ms2 m;
    public boolean n;

    public ax2(Context context, e51 e51Var) {
        this.f = context;
        this.g = e51Var;
    }

    @Override // defpackage.ye4
    public final synchronized void G1(int i) {
        this.i.destroy();
        if (!this.n) {
            gi2.G("Inspector closed.");
            ms2 ms2Var = this.m;
            if (ms2Var != null) {
                try {
                    ms2Var.g0(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.k = false;
        this.j = false;
        this.l = 0L;
        this.n = false;
        this.m = null;
    }

    public final synchronized void a(ms2 ms2Var, z32 z32Var, k32 k32Var, z32 z32Var2) {
        if (c(ms2Var)) {
            try {
                hg4 hg4Var = hg4.C;
                sd2 sd2Var = hg4Var.d;
                ag2 ag2VarB = sd2.b(this.f, new zq(0, 0, 0), "", false, false, null, null, this.g, null, null, new cx1(), null, null, null, null, null);
                this.i = ag2VarB;
                sg2 sg2VarE0 = ag2VarB.e0();
                if (sg2VarE0 == null) {
                    gi2.i0("Failed to obtain a web view for the ad inspector");
                    try {
                        hg4Var.h.d("InspectorUi.openInspector 2", new NullPointerException("Failed to obtain a web view for the ad inspector"));
                        ms2Var.g0(zt0.Q(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e) {
                        hg4.C.h.d("InspectorUi.openInspector 3", e);
                        return;
                    }
                }
                this.m = ms2Var;
                Context context = this.f;
                sg2VarE0.p(null, null, null, null, null, false, null, null, null, null, null, null, null, z32Var, null, new k32(6, context), k32Var, z32Var2, null, null, null);
                sg2VarE0.l = this;
                this.i.loadUrl((String) tw1.e.c.a(mz1.J9));
                y24.b(context, new AdOverlayInfoParcel(this, this.i, this.g), true, null);
                hg4Var.k.getClass();
                this.l = System.currentTimeMillis();
            } catch (hg2 e2) {
                gi2.q0(5);
                try {
                    hg4.C.h.d("InspectorUi.openInspector 0", e2);
                    ms2Var.g0(zt0.Q(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e3) {
                    hg4.C.h.d("InspectorUi.openInspector 1", e3);
                }
            }
        }
    }

    public final synchronized void b() {
        if (this.j && this.k) {
            md2.f.execute(new bs2(3, this));
        }
    }

    public final synchronized boolean c(ms2 ms2Var) {
        if (!((Boolean) tw1.e.c.a(mz1.I9)).booleanValue()) {
            gi2.i0("Ad inspector had an internal error.");
            try {
                ms2Var.g0(zt0.Q(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.h == null) {
            gi2.i0("Ad inspector had an internal error.");
            try {
                hg4.C.h.d("InspectorUi.shouldOpenUi", new NullPointerException("InspectorManager null"));
                ms2Var.g0(zt0.Q(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.j && !this.k) {
            hg4.C.k.getClass();
            if (System.currentTimeMillis() >= this.l + ((Integer) r1.c.a(mz1.L9)).intValue()) {
                return true;
            }
        }
        gi2.i0("Ad inspector cannot be opened because it is already open.");
        try {
            ms2Var.g0(zt0.Q(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // defpackage.ye4
    public final synchronized void f() {
        this.k = true;
        b();
    }

    @Override // defpackage.ug2
    public final synchronized void v(String str, int i, String str2, boolean z) {
        if (z) {
            gi2.G("Ad inspector loaded.");
            this.j = true;
            b();
            return;
        }
        gi2.i0("Ad inspector failed to load.");
        try {
            gd2 gd2Var = hg4.C.h;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb.append("Failed to load UI. Error code: ");
            sb.append(i);
            sb.append(", Description: ");
            sb.append(str);
            sb.append(", Failing URL: ");
            sb.append(str2);
            gd2Var.d("InspectorUi.onAdWebViewFinishedLoading 0", new Exception(sb.toString()));
            ms2 ms2Var = this.m;
            if (ms2Var != null) {
                ms2Var.g0(zt0.Q(17, null, null));
            }
        } catch (RemoteException e) {
            hg4.C.h.d("InspectorUi.onAdWebViewFinishedLoading 1", e);
        }
        this.n = true;
        this.i.destroy();
    }

    @Override // defpackage.ye4
    public final void B1() {
    }

    @Override // defpackage.ye4
    public final void E1() {
    }

    @Override // defpackage.ye4
    public final void M1() {
    }

    @Override // defpackage.ye4
    public final void R2() {
    }

    @Override // defpackage.ye4
    public final void U() {
    }

    @Override // defpackage.ye4
    public final void Y() {
    }

    @Override // defpackage.ye4
    public final void f3() {
    }

    @Override // defpackage.ye4
    public final void h3() {
    }

    @Override // defpackage.ye4
    public final void m2() {
    }
}
