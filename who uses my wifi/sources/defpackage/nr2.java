package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class nr2 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ pr2 g;

    public /* synthetic */ nr2(pr2 pr2Var, int i) {
        this.f = i;
        this.g = pr2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                pr2 pr2Var = this.g;
                pr2Var.n.L();
                tr2 tr2Var = pr2Var.m;
                synchronized (tr2Var) {
                    try {
                        ag2 ag2Var = tr2Var.i;
                        if (ag2Var != null) {
                            ag2Var.destroy();
                            tr2Var.i = null;
                        }
                        ag2 ag2Var2 = tr2Var.j;
                        if (ag2Var2 != null) {
                            ag2Var2.destroy();
                            tr2Var.j = null;
                        }
                        ag2 ag2Var3 = tr2Var.k;
                        if (ag2Var3 != null) {
                            ag2Var3.destroy();
                            tr2Var.k = null;
                        }
                        n70 n70Var = tr2Var.m;
                        if (n70Var != null) {
                            n70Var.cancel(false);
                            tr2Var.m = null;
                        }
                        pd2 pd2Var = tr2Var.n;
                        if (pd2Var != null) {
                            pd2Var.cancel(false);
                            tr2Var.n = null;
                        }
                        tr2Var.l = null;
                        tr2Var.v.clear();
                        tr2Var.w.clear();
                        tr2Var.b = null;
                        tr2Var.c = null;
                        tr2Var.d = null;
                        tr2Var.e = null;
                        tr2Var.h = null;
                        tr2Var.o = null;
                        tr2Var.p = null;
                        tr2Var.q = null;
                        tr2Var.s = null;
                        tr2Var.t = null;
                        tr2Var.u = null;
                    } finally {
                    }
                }
                return;
            default:
                pr2 pr2Var2 = this.g;
                yr2 yr2Var = pr2Var2.q;
                try {
                    tr2 tr2Var2 = pr2Var2.m;
                    int iQ = tr2Var2.q();
                    if (iQ == 1) {
                        r22 r22Var = yr2Var.a;
                        if (r22Var != null) {
                            pr2Var2.l();
                            k22 k22Var = (k22) pr2Var2.r.d();
                            Parcel parcelU = r22Var.U();
                            iv1.e(parcelU, k22Var);
                            r22Var.M0(parcelU, 1);
                            return;
                        }
                        return;
                    }
                    if (iQ == 2) {
                        q22 q22Var = yr2Var.b;
                        if (q22Var != null) {
                            pr2Var2.l();
                            j22 j22Var = (j22) pr2Var2.s.d();
                            Parcel parcelU2 = q22Var.U();
                            iv1.e(parcelU2, j22Var);
                            q22Var.M0(parcelU2, 1);
                            return;
                        }
                        return;
                    }
                    if (iQ == 3) {
                        String strG = tr2Var2.g();
                        v22 v22Var = strG == null ? null : (v22) yr2Var.f.get(strG);
                        if (v22Var != null) {
                            if (tr2Var2.h() != null) {
                                pr2Var2.e("Google", true);
                            }
                            v22Var.g3((p22) pr2Var2.v.d());
                            return;
                        }
                        return;
                    }
                    if (iQ == 6) {
                        z22 z22Var = yr2Var.c;
                        if (z22Var != null) {
                            pr2Var2.l();
                            z22Var.a2((f32) pr2Var2.t.d());
                            return;
                        }
                        return;
                    }
                    if (iQ != 7) {
                        gi2.Z("Wrong native template id!");
                        return;
                    }
                    j52 j52Var = yr2Var.e;
                    if (j52Var != null) {
                        g52 g52Var = (g52) pr2Var2.u.d();
                        Parcel parcelU3 = j52Var.U();
                        iv1.e(parcelU3, g52Var);
                        j52Var.M0(parcelU3, 1);
                        return;
                    }
                    return;
                } catch (RemoteException e) {
                    gi2.c0("RemoteException when notifyAdLoad is called", e);
                    return;
                }
        }
    }
}
