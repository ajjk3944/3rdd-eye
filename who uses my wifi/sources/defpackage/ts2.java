package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ts2 implements wr2, to2 {
    public final e72 f;
    public final cn2 g;
    public final co2 h;
    public final sm2 i;
    public final wp2 j;
    public final Context k;
    public final a83 l;
    public final e51 m;
    public final l83 n;
    public boolean o = false;
    public boolean p = false;
    public boolean q = true;
    public final b72 r;
    public final c72 s;

    public ts2(b72 b72Var, c72 c72Var, e72 e72Var, cn2 cn2Var, co2 co2Var, sm2 sm2Var, wp2 wp2Var, Context context, a83 a83Var, e51 e51Var, l83 l83Var) {
        this.r = b72Var;
        this.s = c72Var;
        this.f = e72Var;
        this.g = cn2Var;
        this.h = co2Var;
        this.i = sm2Var;
        this.j = wp2Var;
        this.k = context;
        this.l = a83Var;
        this.m = e51Var;
        this.n = l83Var;
    }

    public static final HashMap y(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map2;
    }

    @Override // defpackage.wr2
    public final void L() {
        try {
            e72 e72Var = this.f;
            if (e72Var != null) {
                e72Var.F();
            }
        } catch (RemoteException unused) {
            gi2.q0(5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1 A[Catch: JSONException -> 0x0051, RemoteException -> 0x0153, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0051, blocks: (B:44:0x00b8, B:46:0x00d1), top: B:64:0x00b8 }] */
    @Override // defpackage.wr2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r17, java.util.Map r18, java.util.Map r19, android.view.View.OnTouchListener r20, android.view.View.OnClickListener r21) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts2.a(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    @Override // defpackage.wr2
    public final void b(oo2 oo2Var) {
        gi2.i0("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // defpackage.wr2
    public final void c(View view) {
        try {
            oi0 oi0Var = new oi0(view);
            e72 e72Var = this.f;
            if (e72Var != null) {
                e72Var.W0(oi0Var);
                return;
            }
            b72 b72Var = this.r;
            if (b72Var != null) {
                Parcel parcelU = b72Var.U();
                iv1.e(parcelU, oi0Var);
                b72Var.M0(parcelU, 16);
            } else {
                c72 c72Var = this.s;
                if (c72Var != null) {
                    Parcel parcelU2 = c72Var.U();
                    iv1.e(parcelU2, oi0Var);
                    c72Var.M0(parcelU2, 14);
                }
            }
        } catch (RemoteException unused) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.wr2
    public final void e() {
        this.p = true;
    }

    @Override // defpackage.wr2
    public final boolean f() {
        return this.l.L;
    }

    @Override // defpackage.wr2
    public final JSONObject h(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // defpackage.wr2
    public final void j(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.p) {
            gi2.i0("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.l.L) {
            z(view2);
        } else {
            gi2.i0("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // defpackage.wr2
    public final void l(nq2 nq2Var) {
        gi2.i0("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // defpackage.wr2
    public final JSONObject m(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // defpackage.to2
    public final void p() {
        try {
            e72 e72Var = this.f;
            if (e72Var == null || !e72Var.N()) {
                return;
            }
            a83 a83Var = this.l;
            if (a83Var.e == 4 || a83Var.D0) {
                e72Var.s();
                this.g.a();
            }
        } catch (RemoteException unused) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.wr2
    public final void q(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.p && this.l.L) {
            return;
        }
        z(view);
    }

    @Override // defpackage.wr2
    public final void r(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            boolean z = this.o;
            a83 a83Var = this.l;
            if (!z) {
                this.o = hg4.C.o.d(this.k, this.m.f, a83Var.C.toString(), this.n.g);
            }
            if (this.q) {
                e72 e72Var = this.f;
                cn2 cn2Var = this.g;
                if (e72Var != null) {
                    if (a83Var.D0) {
                        if (e72Var.N()) {
                            return;
                        }
                        e72Var.s();
                        cn2Var.a();
                        return;
                    }
                    if (e72Var.N() && a83Var.e == 4) {
                        this.h.a();
                        return;
                    } else {
                        e72Var.s();
                        cn2Var.a();
                        return;
                    }
                }
                b72 b72Var = this.r;
                if (b72Var != null) {
                    Parcel parcelY = b72Var.Y(b72Var.U(), 13);
                    ClassLoader classLoader = iv1.a;
                    boolean z2 = parcelY.readInt() != 0;
                    parcelY.recycle();
                    if (!z2) {
                        b72Var.M0(b72Var.U(), 10);
                        cn2Var.a();
                        return;
                    }
                }
                c72 c72Var = this.s;
                if (c72Var != null) {
                    Parcel parcelY2 = c72Var.Y(c72Var.U(), 11);
                    ClassLoader classLoader2 = iv1.a;
                    boolean z3 = parcelY2.readInt() != 0;
                    parcelY2.recycle();
                    if (z3) {
                        return;
                    }
                    c72Var.M0(c72Var.U(), 8);
                    cn2Var.a();
                }
            }
        } catch (RemoteException unused) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.wr2
    public final boolean s() {
        return true;
    }

    @Override // defpackage.wr2
    public final boolean t(Bundle bundle) {
        return false;
    }

    @Override // defpackage.wr2
    public final int v() {
        return 0;
    }

    public final void z(View view) {
        try {
            e72 e72Var = this.f;
            wp2 wp2Var = this.j;
            sm2 sm2Var = this.i;
            if (e72Var != null && !e72Var.h0()) {
                e72Var.l0(new oi0(view));
                sm2Var.C();
                if (((Boolean) tw1.e.c.a(mz1.Ab)).booleanValue()) {
                    wp2Var.s0();
                    return;
                }
                return;
            }
            b72 b72Var = this.r;
            if (b72Var != null) {
                Parcel parcelY = b72Var.Y(b72Var.U(), 14);
                ClassLoader classLoader = iv1.a;
                boolean z = parcelY.readInt() != 0;
                parcelY.recycle();
                if (!z) {
                    oi0 oi0Var = new oi0(view);
                    Parcel parcelU = b72Var.U();
                    iv1.e(parcelU, oi0Var);
                    b72Var.M0(parcelU, 11);
                    sm2Var.C();
                    if (((Boolean) tw1.e.c.a(mz1.Ab)).booleanValue()) {
                        wp2Var.s0();
                        return;
                    }
                    return;
                }
            }
            c72 c72Var = this.s;
            if (c72Var != null) {
                Parcel parcelY2 = c72Var.Y(c72Var.U(), 12);
                ClassLoader classLoader2 = iv1.a;
                boolean z2 = parcelY2.readInt() != 0;
                parcelY2.recycle();
                if (z2) {
                    return;
                }
                oi0 oi0Var2 = new oi0(view);
                Parcel parcelU2 = c72Var.U();
                iv1.e(parcelU2, oi0Var2);
                c72Var.M0(parcelU2, 9);
                sm2Var.C();
                if (((Boolean) tw1.e.c.a(mz1.Ab)).booleanValue()) {
                    wp2Var.s0();
                }
            }
        } catch (RemoteException unused) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.wr2
    public final void d() {
    }

    @Override // defpackage.wr2
    public final void j0() {
    }

    @Override // defpackage.to2
    public final void w() {
    }

    @Override // defpackage.wr2
    public final void x() {
    }

    @Override // defpackage.wr2
    public final void J(String str) {
    }

    @Override // defpackage.wr2
    public final void g(View view) {
    }

    @Override // defpackage.wr2
    public final void i(a32 a32Var) {
    }

    @Override // defpackage.wr2
    public final void k(Bundle bundle) {
    }

    @Override // defpackage.wr2
    public final void n(Bundle bundle) {
    }

    @Override // defpackage.wr2
    public final void u(View view, MotionEvent motionEvent) {
    }

    @Override // defpackage.wr2
    public final void o(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }
}
