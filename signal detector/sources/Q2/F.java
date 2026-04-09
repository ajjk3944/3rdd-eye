package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.C0499Fa;
import com.google.android.gms.internal.ads.C7;
import com.google.android.gms.internal.ads.InterfaceC1050db;
import com.google.android.gms.internal.ads.InterfaceC1159fb;
import com.google.android.gms.internal.ads.InterfaceC1427kb;

/* loaded from: classes.dex */
public final class F extends W2.a implements H {
    public F(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder", 2);
    }

    @Override // q2.H
    public final void F0(InterfaceC1427kb interfaceC1427kb) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, interfaceC1427kb);
        I0(parcelH0, 10);
    }

    @Override // q2.H
    public final void Y1(InterfaceC2853y interfaceC2853y) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, interfaceC2853y);
        I0(parcelH0, 2);
    }

    @Override // q2.H
    public final E b() {
        E c2804c;
        Parcel parcelK0 = k0(h0(), 1);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            c2804c = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            c2804c = iInterfaceQueryLocalInterface instanceof E ? (E) iInterfaceQueryLocalInterface : new C2804C(strongBinder, "com.google.android.gms.ads.internal.client.IAdLoader", 2);
        }
        parcelK0.recycle();
        return c2804c;
    }

    @Override // q2.H
    public final void l2(C0499Fa c0499Fa) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, c0499Fa);
        I0(parcelH0, 6);
    }

    @Override // q2.H
    public final void v2(String str, InterfaceC1159fb interfaceC1159fb, InterfaceC1050db interfaceC1050db) {
        Parcel parcelH0 = h0();
        parcelH0.writeString(str);
        C7.e(parcelH0, interfaceC1159fb);
        C7.e(parcelH0, interfaceC1050db);
        I0(parcelH0, 5);
    }
}
