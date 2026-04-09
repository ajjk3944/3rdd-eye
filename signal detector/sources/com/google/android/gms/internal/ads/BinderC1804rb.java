package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.rb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1804rb extends B7 implements InterfaceC1427kb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16567a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16568b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1804rb(int i, Object obj) {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        this.f16567a = i;
        this.f16568b = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427kb
    public final void C1(InterfaceC1589nb interfaceC1589nb) throws SecurityException {
        String strB;
        String strE;
        String strJ;
        String strH;
        String strI;
        String strN;
        double dK;
        switch (this.f16567a) {
            case 0:
                C1726q3 c1726q3 = new C1726q3(interfaceC1589nb);
                com.google.ads.mediation.e eVar = (com.google.ads.mediation.e) this.f16568b;
                eVar.getClass();
                com.google.ads.mediation.a aVar = new com.google.ads.mediation.a();
                InterfaceC1589nb interfaceC1589nb2 = (InterfaceC1589nb) c1726q3.f16312b;
                Object objN1 = null;
                try {
                    strB = interfaceC1589nb2.b();
                } catch (RemoteException e6) {
                    u2.k.f("", e6);
                    strB = null;
                }
                aVar.f23953a = strB;
                aVar.f23954b = (ArrayList) c1726q3.f16313c;
                try {
                    strE = interfaceC1589nb2.e();
                } catch (RemoteException e7) {
                    u2.k.f("", e7);
                    strE = null;
                }
                aVar.f23955c = strE;
                aVar.f23956d = (C0652Oa) c1726q3.f16314d;
                try {
                    strJ = interfaceC1589nb2.j();
                } catch (RemoteException e8) {
                    u2.k.f("", e8);
                    strJ = null;
                }
                aVar.f23957e = strJ;
                try {
                    strH = interfaceC1589nb2.h();
                } catch (RemoteException e9) {
                    u2.k.f("", e9);
                    strH = null;
                }
                aVar.f23958f = strH;
                try {
                    dK = interfaceC1589nb2.k();
                } catch (RemoteException e10) {
                    u2.k.f("", e10);
                }
                Double dValueOf = dK == -1.0d ? null : Double.valueOf(dK);
                aVar.f23959g = dValueOf;
                try {
                    strI = interfaceC1589nb2.i();
                } catch (RemoteException e11) {
                    u2.k.f("", e11);
                    strI = null;
                }
                aVar.f23960h = strI;
                try {
                    strN = interfaceC1589nb2.n();
                } catch (RemoteException e12) {
                    u2.k.f("", e12);
                    strN = null;
                }
                aVar.i = strN;
                try {
                    S2.a aVarU = interfaceC1589nb2.u();
                    if (aVarU != null) {
                        objN1 = S2.b.n1(aVarU);
                    }
                } catch (RemoteException e13) {
                    u2.k.f("", e13);
                }
                aVar.f23964m = objN1;
                aVar.f23966o = true;
                aVar.f23967p = true;
                j2.s sVar = (j2.s) c1726q3.f16315e;
                try {
                    if (interfaceC1589nb2.o() != null) {
                        sVar.a(interfaceC1589nb2.o());
                    }
                } catch (RemoteException e14) {
                    u2.k.f("Exception occurred while getting video controller", e14);
                }
                aVar.f23961j = sVar;
                w2.s sVar2 = (w2.s) eVar.f6843c;
                AbstractAdViewAdapter abstractAdViewAdapter = (AbstractAdViewAdapter) eVar.f6842b;
                C1338iu c1338iu = (C1338iu) sVar2;
                c1338iu.getClass();
                M2.u.c("#008 Must be called on the main UI thread.");
                u2.k.c("Adapter called onAdLoaded.");
                c1338iu.f14823c = aVar;
                if (!(abstractAdViewAdapter instanceof AdMobAdapter)) {
                    Object obj = new Object();
                    new BinderC0807Xc();
                    synchronized (obj) {
                    }
                }
                try {
                    ((InterfaceC0688Qc) c1338iu.f14822b).h();
                    return;
                } catch (RemoteException e15) {
                    u2.k.k("#007 Could not call remote method.", e15);
                    return;
                }
            default:
                ((z2.b) this.f16568b).c(new C0536Hd(interfaceC1589nb));
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC1589nb c1535mb;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c1535mb = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            c1535mb = iInterfaceQueryLocalInterface instanceof InterfaceC1589nb ? (InterfaceC1589nb) iInterfaceQueryLocalInterface : new C1535mb(strongBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd", 2);
        }
        C7.f(parcel);
        C1(c1535mb);
        parcel2.writeNoException();
        return true;
    }
}
