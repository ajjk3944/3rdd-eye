package defpackage;

import android.os.Parcel;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class as2 extends hv1 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, rs2 {
    public final WeakReference f;
    public final HashMap g;
    public final HashMap h;
    public final HashMap i;
    public pr2 j;
    public final pv1 k;

    public as2(View view, HashMap map, HashMap map2) {
        ViewTreeObserver viewTreeObserver;
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new HashMap();
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        qd2 qd2Var = hg4.C.B;
        ud2 ud2Var = new ud2(view, this);
        View view2 = (View) ((WeakReference) ud2Var.g).get();
        ViewTreeObserver viewTreeObserver2 = null;
        ViewTreeObserver viewTreeObserver3 = (view2 == null || (viewTreeObserver3 = view2.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            ud2Var.U1(viewTreeObserver3);
        }
        vd2 vd2Var = new vd2(view, this);
        View view3 = (View) ((WeakReference) vd2Var.g).get();
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            vd2Var.U1(viewTreeObserver2);
        }
        this.f = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view4 = (View) entry.getValue();
            if (view4 != null) {
                this.g.put(str, new WeakReference(view4));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view4.setOnTouchListener(this);
                    view4.setClickable(true);
                    view4.setOnClickListener(this);
                }
            }
        }
        this.i.putAll(this.g);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view5 = (View) entry2.getValue();
            if (view5 != null) {
                this.h.put((String) entry2.getKey(), new WeakReference(view5));
                view5.setOnTouchListener(this);
                view5.setClickable(false);
            }
        }
        this.i.putAll(this.h);
        this.k = new pv1(view.getContext(), view);
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
            iv1.f(parcel);
            synchronized (this) {
                Object objL1 = oi0.l1(u10VarX0);
                if (objL1 instanceof pr2) {
                    pr2 pr2Var = this.j;
                    if (pr2Var != null) {
                        pr2Var.r(this);
                    }
                    pr2 pr2Var2 = (pr2) objL1;
                    if (pr2Var2.p.b()) {
                        this.j = pr2Var2;
                        pr2Var2.q(this);
                        this.j.f(X0());
                    } else {
                        gi2.Z("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                    }
                } else {
                    gi2.i0("Not an instance of InternalNativeAd. This is most likely a transient error");
                }
            }
        } else if (i == 2) {
            synchronized (this) {
                pr2 pr2Var3 = this.j;
                if (pr2Var3 != null) {
                    pr2Var3.r(this);
                    this.j = null;
                }
            }
        } else {
            if (i != 3) {
                return false;
            }
            u10 u10VarX02 = oi0.X0(parcel.readStrongBinder());
            iv1.f(parcel);
            synchronized (this) {
                try {
                    if (this.j != null) {
                        Object objL12 = oi0.l1(u10VarX02);
                        if (!(objL12 instanceof View)) {
                            gi2.i0("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                        }
                        pr2 pr2Var4 = this.j;
                        View view = (View) objL12;
                        synchronized (pr2Var4) {
                            pr2Var4.n.g(view);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.rs2
    public final FrameLayout M0() {
        return null;
    }

    @Override // defpackage.rs2
    public final View X0() {
        return (View) this.f.get();
    }

    @Override // defpackage.rs2
    public final synchronized void X1(View view, String str) {
        this.i.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.g.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // defpackage.rs2
    public final pv1 f() {
        return this.k;
    }

    @Override // defpackage.rs2
    public final synchronized Map g() {
        return this.i;
    }

    @Override // defpackage.rs2
    public final synchronized Map i() {
        return this.h;
    }

    @Override // defpackage.rs2
    public final synchronized Map k() {
        return this.g;
    }

    @Override // defpackage.rs2
    public final synchronized JSONObject m() {
        JSONObject jSONObjectH;
        pr2 pr2Var = this.j;
        if (pr2Var == null) {
            return null;
        }
        View viewX0 = X0();
        Map mapG = g();
        Map mapK = k();
        synchronized (pr2Var) {
            jSONObjectH = pr2Var.n.h(viewX0, mapG, mapK, pr2Var.k());
        }
        return jSONObjectH;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // defpackage.rs2
    public final synchronized String o() {
        return "1007";
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        pr2 pr2Var = this.j;
        if (pr2Var != null) {
            pr2Var.s(view, X0(), g(), k(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        pr2 pr2Var = this.j;
        if (pr2Var != null) {
            pr2Var.t(X0(), g(), k(), pr2.d(X0()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        pr2 pr2Var = this.j;
        if (pr2Var != null) {
            pr2Var.t(X0(), g(), k(), pr2.d(X0()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        pr2 pr2Var = this.j;
        if (pr2Var != null) {
            View viewX0 = X0();
            synchronized (pr2Var) {
                pr2Var.n.u(viewX0, motionEvent);
            }
        }
        return false;
    }

    @Override // defpackage.rs2
    public final synchronized u10 p() {
        return null;
    }

    @Override // defpackage.rs2
    public final synchronized JSONObject q() {
        return null;
    }

    @Override // defpackage.rs2
    public final synchronized View y3(String str) {
        WeakReference weakReference = (WeakReference) this.i.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }
}
