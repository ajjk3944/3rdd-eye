package defpackage;

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

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pt2 extends hv1 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, g52 {
    public View f;
    public py2 g;
    public pr2 h;
    public boolean i;
    public boolean j;

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        rr2 rr2Var;
        py2 py2Var = null;
        z12Var = null;
        z12Var = null;
        z12 z12Var = null;
        i52 h52Var = null;
        if (i == 3) {
            ou1.h("#008 Must be called on the main UI thread.");
            if (this.i) {
                gi2.Z("getVideoController: Instream ad should not be used after destroyed");
            } else {
                py2Var = this.g;
            }
            parcel2.writeNoException();
            iv1.e(parcel2, py2Var);
        } else if (i == 4) {
            ou1.h("#008 Must be called on the main UI thread.");
            C3();
            pr2 pr2Var = this.h;
            if (pr2Var != null) {
                pr2Var.o();
            }
            this.h = null;
            this.f = null;
            this.g = null;
            this.i = true;
            parcel2.writeNoException();
        } else if (i == 5) {
            u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                h52Var = iInterfaceQueryLocalInterface instanceof i52 ? (i52) iInterfaceQueryLocalInterface : new h52(strongBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback", 2);
            }
            iv1.f(parcel);
            B3(u10VarX0, h52Var);
            parcel2.writeNoException();
        } else if (i == 6) {
            u10 u10VarX02 = oi0.X0(parcel.readStrongBinder());
            iv1.f(parcel);
            ou1.h("#008 Must be called on the main UI thread.");
            B3(u10VarX02, new ot2("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"));
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            ou1.h("#008 Must be called on the main UI thread.");
            if (this.i) {
                gi2.Z("getVideoController: Instream ad should not be used after destroyed");
            } else {
                pr2 pr2Var2 = this.h;
                if (pr2Var2 != null && (rr2Var = pr2Var2.F) != null) {
                    synchronized (rr2Var) {
                        z12Var = rr2Var.a;
                    }
                }
            }
            parcel2.writeNoException();
            iv1.e(parcel2, z12Var);
        }
        return true;
    }

    public final void B3(u10 u10Var, i52 i52Var) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        ou1.h("#008 Must be called on the main UI thread.");
        if (this.i) {
            gi2.Z("Instream ad can not be shown after destroy().");
            try {
                i52Var.t(2);
                return;
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
                return;
            }
        }
        View view = this.f;
        if (view == null || this.g == null) {
            gi2.Z("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            try {
                i52Var.t(0);
                return;
            } catch (RemoteException e2) {
                gi2.p0("#007 Could not call remote method.", e2);
                return;
            }
        }
        if (this.j) {
            gi2.Z("Instream ad should not be used again.");
            try {
                i52Var.t(1);
                return;
            } catch (RemoteException e3) {
                gi2.p0("#007 Could not call remote method.", e3);
                return;
            }
        }
        this.j = true;
        C3();
        ((ViewGroup) oi0.l1(u10Var)).addView(this.f, new ViewGroup.LayoutParams(-1, -1));
        qd2 qd2Var = hg4.C.B;
        ud2 ud2Var = new ud2(this.f, this);
        View view2 = (View) ((WeakReference) ud2Var.g).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            ud2Var.U1(viewTreeObserver);
        }
        vd2 vd2Var = new vd2(this.f, this);
        View view3 = (View) ((WeakReference) vd2Var.g).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            vd2Var.U1(viewTreeObserver3);
        }
        D3();
        try {
            i52Var.b();
        } catch (RemoteException e4) {
            gi2.p0("#007 Could not call remote method.", e4);
        }
    }

    public final void C3() {
        View view = this.f;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f);
        }
    }

    public final void D3() {
        View view;
        pr2 pr2Var = this.h;
        if (pr2Var == null || (view = this.f) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        pr2Var.t(view, map, map, pr2.d(view));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        D3();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        D3();
    }
}
