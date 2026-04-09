package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wb0 extends mg implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, pp {

    /* renamed from: a, reason: collision with root package name */
    public View f17961a;

    /* renamed from: b, reason: collision with root package name */
    public va.a2 f17962b;

    /* renamed from: c, reason: collision with root package name */
    public ca0 f17963c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17964d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17965e;

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        ea0 ea0Var;
        va.a2 a2Var = null;
        vmVarA = null;
        vmVarA = null;
        vm vmVarA = null;
        rp qpVar = null;
        if (i4 == 3) {
            pb.y.d("#008 Must be called on the main UI thread.");
            if (this.f17964d) {
                za.i.e("getVideoController: Instream ad should not be used after destroyed");
            } else {
                a2Var = this.f17962b;
            }
            parcel2.writeNoException();
            ng.e(parcel2, a2Var);
        } else if (i4 == 4) {
            pb.y.d("#008 Must be called on the main UI thread.");
            i4();
            ca0 ca0Var = this.f17963c;
            if (ca0Var != null) {
                ca0Var.s();
            }
            this.f17963c = null;
            this.f17961a = null;
            this.f17962b = null;
            this.f17964d = true;
            parcel2.writeNoException();
        } else if (i4 == 5) {
            vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                qpVar = iInterfaceQueryLocalInterface instanceof rp ? (rp) iInterfaceQueryLocalInterface : new qp(strongBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback", 1);
            }
            ng.f(parcel);
            h4(aVarR0, qpVar);
            parcel2.writeNoException();
        } else if (i4 == 6) {
            vb.a aVarR02 = vb.b.r0(parcel.readStrongBinder());
            ng.f(parcel);
            pb.y.d("#008 Must be called on the main UI thread.");
            h4(aVarR02, new vb0("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"));
            parcel2.writeNoException();
        } else {
            if (i4 != 7) {
                return false;
            }
            pb.y.d("#008 Must be called on the main UI thread.");
            if (this.f17964d) {
                za.i.e("getVideoController: Instream ad should not be used after destroyed");
            } else {
                ca0 ca0Var2 = this.f17963c;
                if (ca0Var2 != null && (ea0Var = ca0Var2.F) != null) {
                    vmVarA = ea0Var.a();
                }
            }
            parcel2.writeNoException();
            ng.e(parcel2, vmVarA);
        }
        return true;
    }

    public final void h4(vb.a aVar, rp rpVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        pb.y.d("#008 Must be called on the main UI thread.");
        if (this.f17964d) {
            za.i.e("Instream ad can not be shown after destroy().");
            try {
                rpVar.K1(2);
                return;
            } catch (RemoteException e2) {
                za.i.k("#007 Could not call remote method.", e2);
                return;
            }
        }
        View view = this.f17961a;
        if (view == null || this.f17962b == null) {
            za.i.e("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            try {
                rpVar.K1(0);
                return;
            } catch (RemoteException e10) {
                za.i.k("#007 Could not call remote method.", e10);
                return;
            }
        }
        if (this.f17965e) {
            za.i.e("Instream ad should not be used again.");
            try {
                rpVar.K1(1);
                return;
            } catch (RemoteException e11) {
                za.i.k("#007 Could not call remote method.", e11);
                return;
            }
        }
        this.f17965e = true;
        i4();
        ((ViewGroup) vb.b.U0(aVar)).addView(this.f17961a, new ViewGroup.LayoutParams(-1, -1));
        hl hlVar = ua.j.C.B;
        jx jxVar = new jx(this.f17961a, this);
        View view2 = (View) ((WeakReference) jxVar.f11937a).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            jxVar.v1(viewTreeObserver);
        }
        kx kxVar = new kx(this.f17961a, this);
        View view3 = (View) ((WeakReference) kxVar.f11937a).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            kxVar.v1(viewTreeObserver3);
        }
        j4();
        try {
            rpVar.c();
        } catch (RemoteException e12) {
            za.i.k("#007 Could not call remote method.", e12);
        }
    }

    public final void i4() {
        View view = this.f17961a;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f17961a);
        }
    }

    public final void j4() {
        View view;
        ca0 ca0Var = this.f17963c;
        if (ca0Var == null || (view = this.f17961a) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        ca0Var.z(view, map, map, ca0.f(view));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        j4();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        j4();
    }
}
