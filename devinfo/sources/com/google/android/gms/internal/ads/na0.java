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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class na0 extends mg implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, bb0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f14191a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f14192b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f14193c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f14194d;

    /* renamed from: e, reason: collision with root package name */
    public ca0 f14195e;

    /* renamed from: f, reason: collision with root package name */
    public final yg f14196f;

    public na0(View view, HashMap map, HashMap map2) {
        ViewTreeObserver viewTreeObserver;
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        this.f14192b = new HashMap();
        this.f14193c = new HashMap();
        this.f14194d = new HashMap();
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        hl hlVar = ua.j.C.B;
        jx jxVar = new jx(view, this);
        View view2 = (View) ((WeakReference) jxVar.f11937a).get();
        ViewTreeObserver viewTreeObserver2 = null;
        ViewTreeObserver viewTreeObserver3 = (view2 == null || (viewTreeObserver3 = view2.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            jxVar.v1(viewTreeObserver3);
        }
        kx kxVar = new kx(view, this);
        View view3 = (View) ((WeakReference) kxVar.f11937a).get();
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            kxVar.v1(viewTreeObserver2);
        }
        this.f14191a = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view4 = (View) entry.getValue();
            if (view4 != null) {
                this.f14192b.put(str, new WeakReference(view4));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view4.setOnTouchListener(this);
                    view4.setClickable(true);
                    view4.setOnClickListener(this);
                }
            }
        }
        this.f14194d.putAll(this.f14192b);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view5 = (View) entry2.getValue();
            if (view5 != null) {
                this.f14193c.put((String) entry2.getKey(), new WeakReference(view5));
                view5.setOnTouchListener(this);
                view5.setClickable(false);
            }
        }
        this.f14194d.putAll(this.f14193c);
        this.f14196f = new yg(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final synchronized Map A1() {
        return this.f14194d;
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final synchronized Map B1() {
        return this.f14193c;
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final synchronized Map D1() {
        return this.f14192b;
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final synchronized JSONObject E1() {
        ca0 ca0Var = this.f14195e;
        if (ca0Var == null) {
            return null;
        }
        return ca0Var.B(f2(), A1(), D1());
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.bb0
    public final synchronized String G1() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final synchronized vb.a H1() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final synchronized JSONObject I1() {
        return null;
    }

    public final synchronized void I2(vb.a aVar) {
        Object objU0 = vb.b.U0(aVar);
        if (!(objU0 instanceof ca0)) {
            za.i.h("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        ca0 ca0Var = this.f14195e;
        if (ca0Var != null) {
            ca0Var.w(this);
        }
        ca0 ca0Var2 = (ca0) objU0;
        if (!ca0Var2.f10026p.b()) {
            za.i.e("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.f14195e = ca0Var2;
        ca0Var2.v(this);
        this.f14195e.h(f2());
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final synchronized View O(String str) {
        WeakReference weakReference = (WeakReference) this.f14194d.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final FrameLayout O3() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final View f2() {
        return (View) this.f14191a.get();
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
            ng.f(parcel);
            I2(aVarR0);
        } else if (i4 == 2) {
            h();
        } else {
            if (i4 != 3) {
                return false;
            }
            vb.a aVarR02 = vb.b.r0(parcel.readStrongBinder());
            ng.f(parcel);
            synchronized (this) {
                try {
                    if (this.f14195e != null) {
                        Object objU0 = vb.b.U0(aVarR02);
                        if (!(objU0 instanceof View)) {
                            za.i.h("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                        }
                        this.f14195e.C((View) objU0);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void h() {
        ca0 ca0Var = this.f14195e;
        if (ca0Var != null) {
            ca0Var.w(this);
            this.f14195e = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        ca0 ca0Var = this.f14195e;
        if (ca0Var != null) {
            ca0Var.x(view, f2(), A1(), D1(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        ca0 ca0Var = this.f14195e;
        if (ca0Var != null) {
            ca0Var.z(f2(), A1(), D1(), ca0.f(f2()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        ca0 ca0Var = this.f14195e;
        if (ca0Var != null) {
            ca0Var.z(f2(), A1(), D1(), ca0.f(f2()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        ca0 ca0Var = this.f14195e;
        if (ca0Var != null) {
            ca0Var.y(view, motionEvent, f2());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final synchronized void u3(View view, String str) {
        this.f14194d.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f14192b.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.bb0
    public final yg z1() {
        return this.f14196f;
    }
}
