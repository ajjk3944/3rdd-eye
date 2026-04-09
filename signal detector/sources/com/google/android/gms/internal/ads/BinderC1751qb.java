package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.qb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1751qb extends B7 implements InterfaceC1159fb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1338iu f16381a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1751qb(C1338iu c1338iu) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        this.f16381a = c1338iu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159fb
    public final void B3(InterfaceC0839Za interfaceC0839Za) {
        Rx rx;
        String strG;
        C1338iu c1338iu = this.f16381a;
        com.google.ads.mediation.e eVar = (com.google.ads.mediation.e) c1338iu.f14822b;
        synchronized (c1338iu) {
            rx = (Rx) c1338iu.f14824d;
            if (rx == null) {
                rx = new Rx(interfaceC0839Za);
                c1338iu.f14824d = rx;
            }
        }
        C1338iu c1338iu2 = (C1338iu) ((w2.s) eVar.f6843c);
        c1338iu2.getClass();
        M2.u.c("#008 Must be called on the main UI thread.");
        try {
            strG = ((InterfaceC0839Za) rx.f11090b).g();
        } catch (RemoteException e6) {
            u2.k.f("", e6);
            strG = null;
        }
        u2.k.c("Adapter called onAdLoaded with template id ".concat(String.valueOf(strG)));
        c1338iu2.f14824d = rx;
        try {
            ((InterfaceC0688Qc) c1338iu2.f14822b).h();
        } catch (RemoteException e7) {
            u2.k.k("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC0839Za c0822Ya;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c0822Ya = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            c0822Ya = iInterfaceQueryLocalInterface instanceof InterfaceC0839Za ? (InterfaceC0839Za) iInterfaceQueryLocalInterface : new C0822Ya(strongBinder);
        }
        C7.f(parcel);
        B3(c0822Ya);
        parcel2.writeNoException();
        return true;
    }
}
