package com.google.android.gms.internal.ads;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class db0 implements ja0, t70 {

    /* renamed from: a, reason: collision with root package name */
    public final lr f10408a;

    /* renamed from: b, reason: collision with root package name */
    public final o60 f10409b;

    /* renamed from: c, reason: collision with root package name */
    public final f70 f10410c;

    /* renamed from: d, reason: collision with root package name */
    public final e60 f10411d;

    /* renamed from: e, reason: collision with root package name */
    public final s80 f10412e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f10413f;
    public final wp0 g;

    /* renamed from: h, reason: collision with root package name */
    public final za.a f10414h;

    /* renamed from: i, reason: collision with root package name */
    public final hq0 f10415i;
    public boolean j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10416k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10417l = true;

    /* renamed from: m, reason: collision with root package name */
    public final ir f10418m;

    /* renamed from: n, reason: collision with root package name */
    public final jr f10419n;

    public db0(ir irVar, jr jrVar, lr lrVar, o60 o60Var, f70 f70Var, e60 e60Var, s80 s80Var, Context context, wp0 wp0Var, za.a aVar, hq0 hq0Var) {
        this.f10418m = irVar;
        this.f10419n = jrVar;
        this.f10408a = lrVar;
        this.f10409b = o60Var;
        this.f10410c = f70Var;
        this.f10411d = e60Var;
        this.f10412e = s80Var;
        this.f10413f = context;
        this.g = wp0Var;
        this.f10414h = aVar;
        this.f10415i = hq0Var;
    }

    public static final HashMap x(Map map) {
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final int M1() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4 A[Catch: RemoteException -> 0x0036, JSONException -> 0x0054, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0054, blocks: (B:46:0x00bb, B:48:0x00d4), top: B:68:0x00bb }] */
    @Override // com.google.android.gms.internal.ads.ja0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r17, java.util.Map r18, java.util.Map r19, android.view.View.OnTouchListener r20, android.view.View.OnClickListener r21) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.db0.a(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final JSONObject c(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void e() {
        this.f10416k = true;
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void f() {
        try {
            lr lrVar = this.f10408a;
            if (lrVar == null || !lrVar.N1()) {
                return;
            }
            wp0 wp0Var = this.g;
            if (wp0Var.f18080e != 4 && !wp0Var.D0) {
                return;
            }
            lrVar.i();
            this.f10409b.a();
        } catch (RemoteException e2) {
            za.i.i("Failed to report impression from an adapter", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void g(View view, View view2, Map map, Map map2, boolean z3, ImageView.ScaleType scaleType) {
        if (this.f10416k && this.g.L) {
            return;
        }
        y(view);
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void h(va.j1 j1Var) {
        za.i.h("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final boolean i() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void j(View view) {
        try {
            vb.b bVar = new vb.b(view);
            lr lrVar = this.f10408a;
            if (lrVar != null) {
                lrVar.e1(bVar);
                return;
            }
            ir irVar = this.f10418m;
            if (irVar != null) {
                Parcel parcelT = irVar.T();
                ng.e(parcelT, bVar);
                irVar.g1(parcelT, 16);
            } else {
                jr jrVar = this.f10419n;
                if (jrVar != null) {
                    Parcel parcelT2 = jrVar.T();
                    ng.e(parcelT2, bVar);
                    jrVar.g1(parcelT2, 14);
                }
            }
        } catch (RemoteException e2) {
            za.i.i("Failed to call untrackView", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final JSONObject m(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void n(View view, View view2, Map map, Map map2, boolean z3, ImageView.ScaleType scaleType, int i4) {
        if (!this.f10416k) {
            za.i.h("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.g.L) {
            y(view2);
        } else {
            za.i.h("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void p(va.l1 l1Var) {
        za.i.h("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void t(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            boolean z3 = this.j;
            wp0 wp0Var = this.g;
            if (!z3) {
                this.j = ua.j.C.f35271o.k(this.f10413f, this.f10414h.f38129a, wp0Var.C.toString(), this.f10415i.g);
            }
            if (this.f10417l) {
                lr lrVar = this.f10408a;
                o60 o60Var = this.f10409b;
                if (lrVar != null) {
                    if (wp0Var.D0) {
                        if (lrVar.N1()) {
                            return;
                        }
                        lrVar.i();
                        o60Var.a();
                        return;
                    }
                    if (lrVar.N1() && wp0Var.f18080e == 4) {
                        this.f10410c.a();
                        return;
                    } else {
                        lrVar.i();
                        o60Var.a();
                        return;
                    }
                }
                ir irVar = this.f10418m;
                if (irVar != null) {
                    Parcel parcelR0 = irVar.r0(irVar.T(), 13);
                    ClassLoader classLoader = ng.f14287a;
                    boolean z10 = parcelR0.readInt() != 0;
                    parcelR0.recycle();
                    if (!z10) {
                        irVar.g1(irVar.T(), 10);
                        o60Var.a();
                        return;
                    }
                }
                jr jrVar = this.f10419n;
                if (jrVar != null) {
                    Parcel parcelR02 = jrVar.r0(jrVar.T(), 11);
                    ClassLoader classLoader2 = ng.f14287a;
                    boolean z11 = parcelR02.readInt() != 0;
                    parcelR02.recycle();
                    if (z11) {
                        return;
                    }
                    jrVar.g1(jrVar.T(), 8);
                    o60Var.a();
                }
            }
        } catch (RemoteException e2) {
            za.i.i("Failed to call recordImpression", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void u() {
        try {
            lr lrVar = this.f10408a;
            if (lrVar != null) {
                lrVar.s();
            }
        } catch (RemoteException e2) {
            za.i.i("Failed to call destroy", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final boolean v(Bundle bundle) {
        return false;
    }

    public final void y(View view) {
        try {
            lr lrVar = this.f10408a;
            s80 s80Var = this.f10412e;
            e60 e60Var = this.f10411d;
            if (lrVar != null && !lrVar.G()) {
                lrVar.w(new vb.b(view));
                e60Var.onAdClicked();
                if (((Boolean) va.s.f36163e.f36166c.a(sk.Zb)).booleanValue()) {
                    s80Var.x();
                    return;
                }
                return;
            }
            ir irVar = this.f10418m;
            if (irVar != null) {
                Parcel parcelR0 = irVar.r0(irVar.T(), 14);
                ClassLoader classLoader = ng.f14287a;
                boolean z3 = parcelR0.readInt() != 0;
                parcelR0.recycle();
                if (!z3) {
                    vb.b bVar = new vb.b(view);
                    Parcel parcelT = irVar.T();
                    ng.e(parcelT, bVar);
                    irVar.g1(parcelT, 11);
                    e60Var.onAdClicked();
                    if (((Boolean) va.s.f36163e.f36166c.a(sk.Zb)).booleanValue()) {
                        s80Var.x();
                        return;
                    }
                    return;
                }
            }
            jr jrVar = this.f10419n;
            if (jrVar != null) {
                Parcel parcelR02 = jrVar.r0(jrVar.T(), 12);
                ClassLoader classLoader2 = ng.f14287a;
                boolean z10 = parcelR02.readInt() != 0;
                parcelR02.recycle();
                if (z10) {
                    return;
                }
                vb.b bVar2 = new vb.b(view);
                Parcel parcelT2 = jrVar.T();
                ng.e(parcelT2, bVar2);
                jrVar.g1(parcelT2, 9);
                e60Var.onAdClicked();
                if (((Boolean) va.s.f36163e.f36166c.a(sk.Zb)).booleanValue()) {
                    s80Var.x();
                }
            }
        } catch (RemoteException e2) {
            za.i.i("Failed to call handleClick", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final boolean z1() {
        return this.g.L;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void K() {
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void l() {
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void r() {
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void z() {
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void b(View view) {
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void d(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void k(vn vnVar) {
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void o(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void q(String str) {
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void w(View view, MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void s(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }
}
