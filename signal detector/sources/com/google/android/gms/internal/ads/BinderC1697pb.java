package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.pb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1697pb extends B7 implements InterfaceC1050db {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1338iu f16178a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1697pb(C1338iu c1338iu) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        this.f16178a = c1338iu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1050db
    public final void E1(InterfaceC0839Za interfaceC0839Za, String str) {
        Rx rx;
        C1338iu c1338iu = this.f16178a;
        if (((com.google.ads.mediation.e) c1338iu.f14823c) == null) {
            return;
        }
        synchronized (c1338iu) {
            rx = (Rx) c1338iu.f14824d;
            if (rx == null) {
                rx = new Rx(interfaceC0839Za);
                c1338iu.f14824d = rx;
            }
        }
        C1338iu c1338iu2 = (C1338iu) ((w2.s) ((com.google.ads.mediation.e) c1338iu.f14823c).f6843c);
        c1338iu2.getClass();
        try {
            ((InterfaceC0688Qc) c1338iu2.f14822b).t1((InterfaceC0839Za) rx.f11090b, str);
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
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
        String string = parcel.readString();
        C7.f(parcel);
        E1(c0822Ya, string);
        parcel2.writeNoException();
        return true;
    }
}
