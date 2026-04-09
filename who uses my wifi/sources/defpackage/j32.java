package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class j32 extends hv1 implements z22 {
    public final /* synthetic */ int f;
    public final Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j32(int i, Object obj) {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        f32 e32Var;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            e32Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            e32Var = iInterfaceQueryLocalInterface instanceof f32 ? (f32) iInterfaceQueryLocalInterface : new e32(strongBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd", 2);
        }
        iv1.f(parcel);
        a2(e32Var);
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.z22
    public final void a2(f32 f32Var) throws SecurityException {
        String strB;
        String strE;
        String strJ;
        String strG;
        String strI;
        String strN;
        double dK;
        switch (this.f) {
            case 0:
                g4 g4Var = new g4(f32Var);
                rx2 rx2Var = (rx2) this.g;
                rx2Var.getClass();
                hd1 hd1Var = new hd1();
                hd1Var.l = new Bundle();
                f32 f32Var2 = (f32) g4Var.g;
                Object objL1 = null;
                try {
                    strB = f32Var2.b();
                } catch (RemoteException e) {
                    gi2.c0("", e);
                    strB = null;
                }
                hd1Var.a = strB;
                hd1Var.b = (ArrayList) g4Var.j;
                try {
                    strE = f32Var2.e();
                } catch (RemoteException e2) {
                    gi2.c0("", e2);
                    strE = null;
                }
                hd1Var.c = strE;
                hd1Var.d = (c22) g4Var.h;
                try {
                    strJ = f32Var2.j();
                } catch (RemoteException e3) {
                    gi2.c0("", e3);
                    strJ = null;
                }
                hd1Var.e = strJ;
                try {
                    strG = f32Var2.g();
                } catch (RemoteException e4) {
                    gi2.c0("", e4);
                    strG = null;
                }
                hd1Var.f = strG;
                try {
                    dK = f32Var2.k();
                } catch (RemoteException e5) {
                    gi2.c0("", e5);
                }
                Double dValueOf = dK == -1.0d ? null : Double.valueOf(dK);
                hd1Var.g = dValueOf;
                try {
                    strI = f32Var2.i();
                } catch (RemoteException e6) {
                    gi2.c0("", e6);
                    strI = null;
                }
                hd1Var.h = strI;
                try {
                    strN = f32Var2.n();
                } catch (RemoteException e7) {
                    gi2.c0("", e7);
                    strN = null;
                }
                hd1Var.i = strN;
                try {
                    u10 u10VarS = f32Var2.s();
                    if (u10VarS != null) {
                        objL1 = oi0.l1(u10VarS);
                    }
                } catch (RemoteException e8) {
                    gi2.c0("", e8);
                }
                hd1Var.k = objL1;
                hd1Var.m = true;
                hd1Var.n = true;
                j51 j51Var = (j51) g4Var.i;
                try {
                    if (f32Var2.o() != null) {
                        j51Var.a(f32Var2.o());
                    }
                } catch (RemoteException e9) {
                    gi2.c0("Exception occurred while getting video controller", e9);
                }
                hd1Var.j = j51Var;
                jd0 jd0Var = rx2Var.g;
                AbstractAdViewAdapter abstractAdViewAdapter = rx2Var.f;
                xb4 xb4Var = (xb4) jd0Var;
                xb4Var.getClass();
                ou1.h("#008 Must be called on the main UI thread.");
                gi2.U("Adapter called onAdLoaded.");
                xb4Var.h = hd1Var;
                if (!(abstractAdViewAdapter instanceof AdMobAdapter)) {
                    Object obj = new Object();
                    new f72();
                    synchronized (obj) {
                    }
                }
                try {
                    ((z62) xb4Var.g).g();
                    return;
                } catch (RemoteException e10) {
                    gi2.p0("#007 Could not call remote method.", e10);
                    return;
                }
            default:
                ((ig0) this.g).c(new r82(f32Var));
                return;
        }
    }
}
