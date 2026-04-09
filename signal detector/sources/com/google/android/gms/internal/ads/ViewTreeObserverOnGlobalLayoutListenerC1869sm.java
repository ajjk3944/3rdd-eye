package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1869sm extends B7 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceViewOnClickListenerC0528Gm {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f16777a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f16778b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f16779c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f16780d;

    /* renamed from: e, reason: collision with root package name */
    public C1278hm f16781e;

    /* renamed from: f, reason: collision with root package name */
    public final N7 f16782f;

    public ViewTreeObserverOnGlobalLayoutListenerC1869sm(View view, HashMap map, HashMap map2) {
        ViewTreeObserver viewTreeObserver;
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        this.f16778b = new HashMap();
        this.f16779c = new HashMap();
        this.f16780d = new HashMap();
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        W9 w9 = p2.j.f22785C.f22787B;
        ViewTreeObserverOnGlobalLayoutListenerC0708Rf viewTreeObserverOnGlobalLayoutListenerC0708Rf = new ViewTreeObserverOnGlobalLayoutListenerC0708Rf(view, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC0708Rf.f11985a).get();
        ViewTreeObserver viewTreeObserver2 = null;
        ViewTreeObserver viewTreeObserver3 = (view2 == null || (viewTreeObserver3 = view2.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC0708Rf.H1(viewTreeObserver3);
        }
        ViewTreeObserverOnScrollChangedListenerC0725Sf viewTreeObserverOnScrollChangedListenerC0725Sf = new ViewTreeObserverOnScrollChangedListenerC0725Sf(view, this);
        View view3 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC0725Sf.f11985a).get();
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnScrollChangedListenerC0725Sf.H1(viewTreeObserver2);
        }
        this.f16777a = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view4 = (View) entry.getValue();
            if (view4 != null) {
                this.f16778b.put(str, new WeakReference(view4));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view4.setOnTouchListener(this);
                    view4.setClickable(true);
                    view4.setOnClickListener(this);
                }
            }
        }
        this.f16780d.putAll(this.f16778b);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view5 = (View) entry2.getValue();
            if (view5 != null) {
                this.f16779c.put((String) entry2.getKey(), new WeakReference(view5));
                view5.setOnTouchListener(this);
                view5.setClickable(false);
            }
        }
        this.f16780d.putAll(this.f16779c);
        this.f16782f = new N7(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            S2.a aVarD1 = S2.b.d1(parcel.readStrongBinder());
            C7.f(parcel);
            o1(aVarD1);
        } else if (i == 2) {
            s();
        } else {
            if (i != 3) {
                return false;
            }
            S2.a aVarD12 = S2.b.d1(parcel.readStrongBinder());
            C7.f(parcel);
            synchronized (this) {
                try {
                    if (this.f16781e != null) {
                        Object objN1 = S2.b.n1(aVarD12);
                        if (!(objN1 instanceof View)) {
                            u2.k.h("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                        }
                        this.f16781e.D((View) objN1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final View N1() {
        return (View) this.f16777a.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final synchronized void Y2(View view, String str) {
        this.f16780d.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f16778b.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final synchronized View a2(String str) {
        WeakReference weakReference = (WeakReference) this.f16780d.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final N7 g() {
        return this.f16782f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final synchronized Map h() {
        return this.f16780d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final synchronized Map i() {
        return this.f16779c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final synchronized Map k() {
        return this.f16778b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final synchronized JSONObject l() {
        C1278hm c1278hm = this.f16781e;
        if (c1278hm == null) {
            return null;
        }
        return c1278hm.C(N1(), h(), k());
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final synchronized String o() {
        return "1007";
    }

    public final synchronized void o1(S2.a aVar) {
        Object objN1 = S2.b.n1(aVar);
        if (!(objN1 instanceof C1278hm)) {
            u2.k.h("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        C1278hm c1278hm = this.f16781e;
        if (c1278hm != null) {
            c1278hm.x(this);
        }
        C1278hm c1278hm2 = (C1278hm) objN1;
        if (!c1278hm2.f14570p.b()) {
            u2.k.e("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.f16781e = c1278hm2;
        c1278hm2.w(this);
        this.f16781e.h(N1());
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        C1278hm c1278hm = this.f16781e;
        if (c1278hm != null) {
            c1278hm.y(view, N1(), h(), k(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        C1278hm c1278hm = this.f16781e;
        if (c1278hm != null) {
            c1278hm.A(N1(), h(), k(), C1278hm.f(N1()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        C1278hm c1278hm = this.f16781e;
        if (c1278hm != null) {
            c1278hm.A(N1(), h(), k(), C1278hm.f(N1()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        C1278hm c1278hm = this.f16781e;
        if (c1278hm != null) {
            c1278hm.z(view, motionEvent, N1());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final synchronized S2.a p() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final synchronized JSONObject q() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0528Gm
    public final FrameLayout q3() {
        return null;
    }

    public final synchronized void s() {
        C1278hm c1278hm = this.f16781e;
        if (c1278hm != null) {
            c1278hm.x(this);
            this.f16781e = null;
        }
    }
}
