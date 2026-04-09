package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Kc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0586Kc extends W2.a implements InterfaceC0603Lc {
    @Override // com.google.android.gms.internal.ads.InterfaceC0603Lc
    public final boolean F(String str) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        Parcel parcelK0 = k0(parcelH0, 4);
        ClassLoader classLoader = C7.f7544a;
        boolean z6 = parcelK0.readInt() != 0;
        parcelK0.recycle();
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0603Lc
    public final boolean O(String str) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        Parcel parcelK0 = k0(parcelH0, 2);
        ClassLoader classLoader = C7.f7544a;
        boolean z6 = parcelK0.readInt() != 0;
        parcelK0.recycle();
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0603Lc
    public final InterfaceC0637Nc v(String str) {
        InterfaceC0637Nc c0620Mc;
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        Parcel parcelK0 = k0(parcelH0, 1);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            c0620Mc = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            c0620Mc = iInterfaceQueryLocalInterface instanceof InterfaceC0637Nc ? (InterfaceC0637Nc) iInterfaceQueryLocalInterface : new C0620Mc(strongBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter", 2);
        }
        parcelK0.recycle();
        return c0620Mc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0603Lc
    public final InterfaceC1860sd x(String str) {
        InterfaceC1860sd c1806rd;
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        Parcel parcelK0 = k0(parcelH0, 3);
        IBinder strongBinder = parcelK0.readStrongBinder();
        int i = BinderC2076wd.f17450f;
        if (strongBinder == null) {
            c1806rd = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            c1806rd = iInterfaceQueryLocalInterface instanceof InterfaceC1860sd ? (InterfaceC1860sd) iInterfaceQueryLocalInterface : new C1806rd(strongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter", 2);
        }
        parcelK0.recycle();
        return c1806rd;
    }
}
