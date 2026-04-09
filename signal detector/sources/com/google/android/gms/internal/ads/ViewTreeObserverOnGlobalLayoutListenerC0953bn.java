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

/* renamed from: com.google.android.gms.internal.ads.bn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0953bn extends B7 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceC0996cc {

    /* renamed from: a, reason: collision with root package name */
    public View f13461a;

    /* renamed from: b, reason: collision with root package name */
    public q2.B0 f13462b;

    /* renamed from: c, reason: collision with root package name */
    public C1278hm f13463c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13464d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13465e;

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        C1384jm c1384jm;
        q2.B0 b0 = null;
        interfaceC0601LaA = null;
        interfaceC0601LaA = null;
        InterfaceC0601La interfaceC0601LaA = null;
        InterfaceC1105ec c1051dc = null;
        if (i == 3) {
            M2.u.c("#008 Must be called on the main UI thread.");
            if (this.f13464d) {
                u2.k.e("getVideoController: Instream ad should not be used after destroyed");
            } else {
                b0 = this.f13462b;
            }
            parcel2.writeNoException();
            C7.e(parcel2, b0);
        } else if (i == 4) {
            M2.u.c("#008 Must be called on the main UI thread.");
            L3();
            C1278hm c1278hm = this.f13463c;
            if (c1278hm != null) {
                c1278hm.t();
            }
            this.f13463c = null;
            this.f13461a = null;
            this.f13462b = null;
            this.f13464d = true;
            parcel2.writeNoException();
        } else if (i == 5) {
            S2.a aVarD1 = S2.b.d1(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                c1051dc = iInterfaceQueryLocalInterface instanceof InterfaceC1105ec ? (InterfaceC1105ec) iInterfaceQueryLocalInterface : new C1051dc(strongBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback", 2);
            }
            C7.f(parcel);
            K3(aVarD1, c1051dc);
            parcel2.writeNoException();
        } else if (i == 6) {
            S2.a aVarD12 = S2.b.d1(parcel.readStrongBinder());
            C7.f(parcel);
            M2.u.c("#008 Must be called on the main UI thread.");
            K3(aVarD12, new BinderC0898an("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"));
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            M2.u.c("#008 Must be called on the main UI thread.");
            if (this.f13464d) {
                u2.k.e("getVideoController: Instream ad should not be used after destroyed");
            } else {
                C1278hm c1278hm2 = this.f13463c;
                if (c1278hm2 != null && (c1384jm = c1278hm2.f14562F) != null) {
                    interfaceC0601LaA = c1384jm.a();
                }
            }
            parcel2.writeNoException();
            C7.e(parcel2, interfaceC0601LaA);
        }
        return true;
    }

    public final void K3(S2.a aVar, InterfaceC1105ec interfaceC1105ec) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        M2.u.c("#008 Must be called on the main UI thread.");
        if (this.f13464d) {
            u2.k.e("Instream ad can not be shown after destroy().");
            try {
                interfaceC1105ec.t(2);
                return;
            } catch (RemoteException e6) {
                u2.k.k("#007 Could not call remote method.", e6);
                return;
            }
        }
        View view = this.f13461a;
        if (view == null || this.f13462b == null) {
            u2.k.e("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            try {
                interfaceC1105ec.t(0);
                return;
            } catch (RemoteException e7) {
                u2.k.k("#007 Could not call remote method.", e7);
                return;
            }
        }
        if (this.f13465e) {
            u2.k.e("Instream ad should not be used again.");
            try {
                interfaceC1105ec.t(1);
                return;
            } catch (RemoteException e8) {
                u2.k.k("#007 Could not call remote method.", e8);
                return;
            }
        }
        this.f13465e = true;
        L3();
        ((ViewGroup) S2.b.n1(aVar)).addView(this.f13461a, new ViewGroup.LayoutParams(-1, -1));
        W9 w9 = p2.j.f22785C.f22787B;
        ViewTreeObserverOnGlobalLayoutListenerC0708Rf viewTreeObserverOnGlobalLayoutListenerC0708Rf = new ViewTreeObserverOnGlobalLayoutListenerC0708Rf(this.f13461a, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC0708Rf.f11985a).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            viewTreeObserverOnGlobalLayoutListenerC0708Rf.H1(viewTreeObserver);
        }
        ViewTreeObserverOnScrollChangedListenerC0725Sf viewTreeObserverOnScrollChangedListenerC0725Sf = new ViewTreeObserverOnScrollChangedListenerC0725Sf(this.f13461a, this);
        View view3 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC0725Sf.f11985a).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnScrollChangedListenerC0725Sf.H1(viewTreeObserver3);
        }
        M3();
        try {
            interfaceC1105ec.b();
        } catch (RemoteException e9) {
            u2.k.k("#007 Could not call remote method.", e9);
        }
    }

    public final void L3() {
        View view = this.f13461a;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f13461a);
        }
    }

    public final void M3() {
        View view;
        C1278hm c1278hm = this.f13463c;
        if (c1278hm == null || (view = this.f13461a) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        c1278hm.A(view, map, map, C1278hm.f(view));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        M3();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        M3();
    }
}
