package defpackage;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xk2 implements rn2, dn2 {
    public final Context f;
    public final ag2 g;
    public final a83 h;
    public final e51 i;
    public xz2 j;
    public boolean k;
    public final wz2 l;

    public xk2(Context context, ag2 ag2Var, a83 a83Var, e51 e51Var, wz2 wz2Var) {
        this.f = context;
        this.g = ag2Var;
        this.h = a83Var;
        this.i = e51Var;
        this.l = wz2Var;
    }

    @Override // defpackage.dn2
    public final synchronized void D0() {
        boolean z;
        ag2 ag2Var;
        if (((Boolean) tw1.e.c.a(mz1.J5)).booleanValue()) {
            wz2 wz2Var = this.l;
            synchronized (wz2Var) {
                z = wz2Var.f != null;
            }
        }
        if (z) {
            this.l.c();
            return;
        }
        if (!this.k) {
            a();
        }
        if (!this.h.T || this.j == null || (ag2Var = this.g) == null) {
            return;
        }
        ag2Var.a("onSdkImpression", new s8(0));
    }

    public final synchronized void a() {
        ag2 ag2Var;
        int i;
        int i2;
        try {
            a83 a83Var = this.h;
            if (a83Var.T && (ag2Var = this.g) != null) {
                Context context = this.f;
                hg4 hg4Var = hg4.C;
                hg4Var.x.getClass();
                if (su2.d(context)) {
                    e51 e51Var = this.i;
                    int i3 = e51Var.g;
                    int i4 = e51Var.h;
                    StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 1 + String.valueOf(i4).length());
                    sb.append(i3);
                    sb.append(".");
                    sb.append(i4);
                    String string = sb.toString();
                    ug0 ug0Var = a83Var.V;
                    String str = ug0Var.A() + (-1) != 1 ? "javascript" : null;
                    if (ug0Var.A() == 1) {
                        i = 2;
                        i2 = 3;
                    } else if (a83Var.e == 1) {
                        i = 3;
                        i2 = 1;
                    } else {
                        i = 1;
                        i2 = 1;
                    }
                    String str2 = a83Var.l0;
                    su2 su2Var = hg4Var.x;
                    WebView webViewT = ag2Var.t();
                    su2Var.getClass();
                    xz2 xz2VarI = su2.i(i, i2, webViewT, string, str, str2);
                    this.j = xz2VarI;
                    if (xz2VarI != null) {
                        xb3 xb3Var = xz2VarI.a;
                        if (((Boolean) tw1.e.c.a(mz1.I5)).booleanValue()) {
                            su2 su2Var2 = hg4Var.x;
                            WebView webViewT2 = ag2Var.t();
                            su2Var2.getClass();
                            su2.k(xb3Var, webViewT2);
                            ArrayList arrayListA = ag2Var.A();
                            int size = arrayListA.size();
                            int i5 = 0;
                            while (i5 < size) {
                                Object obj = arrayListA.get(i5);
                                i5++;
                                hg4.C.x.getClass();
                                su2.t(new rz2(xb3Var, (View) obj, 0));
                            }
                        } else {
                            View viewP0 = ag2Var.p0();
                            hg4Var.x.getClass();
                            su2.k(xb3Var, viewP0);
                        }
                        ag2Var.m0(this.j);
                        hg4.C.x.getClass();
                        su2.j(xb3Var);
                        this.k = true;
                        ag2Var.a("onSdkLoaded", new s8(0));
                    }
                }
            }
        } finally {
        }
    }

    @Override // defpackage.rn2
    public final synchronized void e() {
        boolean z;
        if (((Boolean) tw1.e.c.a(mz1.J5)).booleanValue()) {
            wz2 wz2Var = this.l;
            synchronized (wz2Var) {
                z = wz2Var.f != null;
            }
        }
        if (z) {
            this.l.b();
        } else {
            if (this.k) {
                return;
            }
            a();
        }
    }
}
