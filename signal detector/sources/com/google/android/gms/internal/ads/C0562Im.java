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
import q2.C2827k0;
import q2.C2841s;
import q2.InterfaceC2831m0;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Im, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0562Im implements InterfaceC1654om, InterfaceC0832Yk {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0790Wc f9150a;

    /* renamed from: b, reason: collision with root package name */
    public final C1867sk f9151b;

    /* renamed from: c, reason: collision with root package name */
    public final C0594Kk f9152c;

    /* renamed from: d, reason: collision with root package name */
    public final C1276hk f9153d;

    /* renamed from: e, reason: collision with root package name */
    public final C2030vl f9154e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f9155f;

    /* renamed from: g, reason: collision with root package name */
    public final Qt f9156g;

    /* renamed from: h, reason: collision with root package name */
    public final C2951a f9157h;
    public final C0960bu i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9158j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9159k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9160l = true;

    /* renamed from: m, reason: collision with root package name */
    public final C0739Tc f9161m;

    /* renamed from: n, reason: collision with root package name */
    public final C0756Uc f9162n;

    public C0562Im(C0739Tc c0739Tc, C0756Uc c0756Uc, InterfaceC0790Wc interfaceC0790Wc, C1867sk c1867sk, C0594Kk c0594Kk, C1276hk c1276hk, C2030vl c2030vl, Context context, Qt qt, C2951a c2951a, C0960bu c0960bu) {
        this.f9161m = c0739Tc;
        this.f9162n = c0756Uc;
        this.f9150a = interfaceC0790Wc;
        this.f9151b = c1867sk;
        this.f9152c = c0594Kk;
        this.f9153d = c1276hk;
        this.f9154e = c2030vl;
        this.f9155f = context;
        this.f9156g = qt;
        this.f9157h = c2951a;
        this.i = c0960bu;
    }

    public static final HashMap w(Map map) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final int A() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void F(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void M() {
        try {
            InterfaceC0790Wc interfaceC0790Wc = this.f9150a;
            if (interfaceC0790Wc != null) {
                interfaceC0790Wc.J();
            }
        } catch (RemoteException e6) {
            u2.k.i("Failed to call destroy", e6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4 A[Catch: RemoteException -> 0x0036, JSONException -> 0x0054, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0054, blocks: (B:46:0x00bb, B:48:0x00d4), top: B:68:0x00bb }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r17, java.util.Map r18, java.util.Map r19, android.view.View.OnTouchListener r20, android.view.View.OnClickListener r21) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0562Im.a(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void b(View view) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0832Yk
    public final void c() {
        try {
            InterfaceC0790Wc interfaceC0790Wc = this.f9150a;
            if (interfaceC0790Wc == null || !interfaceC0790Wc.N()) {
                return;
            }
            Qt qt = this.f9156g;
            if (qt.f10764e != 4 && !qt.f10731D0) {
                return;
            }
            interfaceC0790Wc.u();
            this.f9151b.a();
        } catch (RemoteException e6) {
            u2.k.i("Failed to report impression from an adapter", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final JSONObject d(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void e() {
        this.f9159k = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void f(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final boolean g() {
        return this.f9156g.f10743L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void h(View view, View view2, Map map, Map map2, boolean z6, ImageView.ScaleType scaleType) {
        if (this.f9159k && this.f9156g.f10743L) {
            return;
        }
        x(view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void i(C2827k0 c2827k0) {
        u2.k.h("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void j(View view) {
        try {
            S2.b bVar = new S2.b(view);
            InterfaceC0790Wc interfaceC0790Wc = this.f9150a;
            if (interfaceC0790Wc != null) {
                interfaceC0790Wc.N0(bVar);
                return;
            }
            C0739Tc c0739Tc = this.f9161m;
            if (c0739Tc != null) {
                Parcel parcelH0 = c0739Tc.h0();
                C7.e(parcelH0, bVar);
                c0739Tc.I0(parcelH0, 16);
            } else {
                C0756Uc c0756Uc = this.f9162n;
                if (c0756Uc != null) {
                    Parcel parcelH02 = c0756Uc.h0();
                    C7.e(parcelH02, bVar);
                    c0756Uc.I0(parcelH02, 14);
                }
            }
        } catch (RemoteException e6) {
            u2.k.i("Failed to call untrackView", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final JSONObject l(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void m() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void n(View view, View view2, Map map, Map map2, boolean z6, ImageView.ScaleType scaleType, int i) {
        if (!this.f9159k) {
            u2.k.h("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f9156g.f10743L) {
            x(view2);
        } else {
            u2.k.h("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void o(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void p(InterfaceC2831m0 interfaceC2831m0) {
        u2.k.h("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void q(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void r(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            boolean z6 = this.f9158j;
            Qt qt = this.f9156g;
            if (!z6) {
                this.f9158j = p2.j.f22785C.f22801o.d(this.f9155f, this.f9157h.f23784a, qt.f10728C.toString(), this.i.f13485g);
            }
            if (this.f9160l) {
                InterfaceC0790Wc interfaceC0790Wc = this.f9150a;
                C1867sk c1867sk = this.f9151b;
                if (interfaceC0790Wc != null) {
                    if (qt.f10731D0) {
                        if (interfaceC0790Wc.N()) {
                            return;
                        }
                        interfaceC0790Wc.u();
                        c1867sk.a();
                        return;
                    }
                    if (interfaceC0790Wc.N() && qt.f10764e == 4) {
                        this.f9152c.a();
                        return;
                    } else {
                        interfaceC0790Wc.u();
                        c1867sk.a();
                        return;
                    }
                }
                C0739Tc c0739Tc = this.f9161m;
                if (c0739Tc != null) {
                    Parcel parcelK0 = c0739Tc.k0(c0739Tc.h0(), 13);
                    ClassLoader classLoader = C7.f7544a;
                    boolean z7 = parcelK0.readInt() != 0;
                    parcelK0.recycle();
                    if (!z7) {
                        c0739Tc.I0(c0739Tc.h0(), 10);
                        c1867sk.a();
                        return;
                    }
                }
                C0756Uc c0756Uc = this.f9162n;
                if (c0756Uc != null) {
                    Parcel parcelK02 = c0756Uc.k0(c0756Uc.h0(), 11);
                    ClassLoader classLoader2 = C7.f7544a;
                    boolean z8 = parcelK02.readInt() != 0;
                    parcelK02.recycle();
                    if (z8) {
                        return;
                    }
                    c0756Uc.I0(c0756Uc.h0(), 8);
                    c1867sk.a();
                }
            }
        } catch (RemoteException e6) {
            u2.k.i("Failed to call recordImpression", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0832Yk
    public final void s() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final boolean t(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final boolean u() {
        return true;
    }

    public final void x(View view) {
        try {
            InterfaceC0790Wc interfaceC0790Wc = this.f9150a;
            C2030vl c2030vl = this.f9154e;
            C1276hk c1276hk = this.f9153d;
            if (interfaceC0790Wc != null && !interfaceC0790Wc.W()) {
                interfaceC0790Wc.m0(new S2.b(view));
                c1276hk.onAdClicked();
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.Xb)).booleanValue()) {
                    c2030vl.L();
                    return;
                }
                return;
            }
            C0739Tc c0739Tc = this.f9161m;
            if (c0739Tc != null) {
                Parcel parcelK0 = c0739Tc.k0(c0739Tc.h0(), 14);
                ClassLoader classLoader = C7.f7544a;
                boolean z6 = parcelK0.readInt() != 0;
                parcelK0.recycle();
                if (!z6) {
                    S2.b bVar = new S2.b(view);
                    Parcel parcelH0 = c0739Tc.h0();
                    C7.e(parcelH0, bVar);
                    c0739Tc.I0(parcelH0, 11);
                    c1276hk.onAdClicked();
                    if (((Boolean) C2841s.f23267e.f23270c.a(H9.Xb)).booleanValue()) {
                        c2030vl.L();
                        return;
                    }
                    return;
                }
            }
            C0756Uc c0756Uc = this.f9162n;
            if (c0756Uc != null) {
                Parcel parcelK02 = c0756Uc.k0(c0756Uc.h0(), 12);
                ClassLoader classLoader2 = C7.f7544a;
                boolean z7 = parcelK02.readInt() != 0;
                parcelK02.recycle();
                if (z7) {
                    return;
                }
                S2.b bVar2 = new S2.b(view);
                Parcel parcelH02 = c0756Uc.h0();
                C7.e(parcelH02, bVar2);
                c0756Uc.I0(parcelH02, 9);
                c1276hk.onAdClicked();
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.Xb)).booleanValue()) {
                    c2030vl.L();
                }
            }
        } catch (RemoteException e6) {
            u2.k.i("Failed to call handleClick", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void Z() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void y() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void k(C1481lb c1481lb) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void v(View view, MotionEvent motionEvent) {
    }
}
