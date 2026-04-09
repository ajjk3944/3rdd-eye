package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bo extends mg implements un {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9731a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9732b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(int i4, Object obj) {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        this.f9731a = i4;
        this.f9732b = obj;
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        xn wnVar;
        if (i4 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            wnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            wnVar = iInterfaceQueryLocalInterface instanceof xn ? (xn) iInterfaceQueryLocalInterface : new wn(strongBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd", 1);
        }
        ng.f(parcel);
        y1(wnVar);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.un
    public final void y1(xn xnVar) throws SecurityException {
        String strC;
        String strE;
        String strC1;
        String strA1;
        String strB1;
        String strF1;
        double dD1;
        switch (this.f9731a) {
            case 0:
                r7 r7Var = new r7(xnVar);
                com.google.ads.mediation.e eVar = (com.google.ads.mediation.e) this.f9732b;
                eVar.getClass();
                com.google.ads.mediation.a aVar = new com.google.ads.mediation.a();
                xn xnVar2 = (xn) r7Var.f15557b;
                Object objU0 = null;
                try {
                    strC = xnVar2.c();
                } catch (RemoteException e2) {
                    za.i.f("", e2);
                    strC = null;
                }
                aVar.f2094a = strC;
                aVar.f2095b = (ArrayList) r7Var.f15558c;
                try {
                    strE = xnVar2.e();
                } catch (RemoteException e10) {
                    za.i.f("", e10);
                    strE = null;
                }
                aVar.f2096c = strE;
                aVar.f2097d = (ym) r7Var.f15559d;
                try {
                    strC1 = xnVar2.C1();
                } catch (RemoteException e11) {
                    za.i.f("", e11);
                    strC1 = null;
                }
                aVar.f2098e = strC1;
                try {
                    strA1 = xnVar2.A1();
                } catch (RemoteException e12) {
                    za.i.f("", e12);
                    strA1 = null;
                }
                aVar.f2099f = strA1;
                try {
                    dD1 = xnVar2.D1();
                } catch (RemoteException e13) {
                    za.i.f("", e13);
                }
                Double dValueOf = dD1 == -1.0d ? null : Double.valueOf(dD1);
                aVar.g = dValueOf;
                try {
                    strB1 = xnVar2.B1();
                } catch (RemoteException e14) {
                    za.i.f("", e14);
                    strB1 = null;
                }
                aVar.f2100h = strB1;
                try {
                    strF1 = xnVar2.F1();
                } catch (RemoteException e15) {
                    za.i.f("", e15);
                    strF1 = null;
                }
                aVar.f2101i = strF1;
                try {
                    vb.a aVarI = xnVar2.i();
                    if (aVarI != null) {
                        objU0 = vb.b.U0(aVarI);
                    }
                } catch (RemoteException e16) {
                    za.i.f("", e16);
                }
                aVar.f2105n = objU0;
                aVar.f2107p = true;
                aVar.f2108q = true;
                pa.s sVar = (pa.s) r7Var.f15560e;
                try {
                    if (xnVar2.G1() != null) {
                        sVar.a(xnVar2.G1());
                    }
                } catch (RemoteException e17) {
                    za.i.f("Exception occurred while getting video controller", e17);
                }
                aVar.j = sVar;
                bb.v vVar = (bb.v) eVar.f9005c;
                AbstractAdViewAdapter abstractAdViewAdapter = (AbstractAdViewAdapter) eVar.f9004b;
                pq0 pq0Var = (pq0) vVar;
                pq0Var.getClass();
                pb.y.d("#008 Must be called on the main UI thread.");
                za.i.c("Adapter called onAdLoaded.");
                pq0Var.f15074c = aVar;
                if (!(abstractAdViewAdapter instanceof AdMobAdapter)) {
                    pa.s sVar2 = new pa.s();
                    sVar2.a(new mr());
                    if (aVar.f2102k) {
                        aVar.j = sVar2;
                    }
                }
                try {
                    ((fr) pq0Var.f15073b).A1();
                    break;
                } catch (RemoteException e18) {
                    za.i.k("#007 Could not call remote method.", e18);
                    return;
                }
            default:
                ((eb.c) this.f9732b).d(new xs(xnVar));
                break;
        }
    }
}
