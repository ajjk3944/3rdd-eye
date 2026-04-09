package q2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.C7;
import com.google.android.gms.internal.ads.InterfaceC0603Lc;

/* loaded from: classes.dex */
public final class M extends W2.a {
    public M(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator", 2);
    }

    public final IBinder n1(S2.b bVar, d1 d1Var, String str, InterfaceC0603Lc interfaceC0603Lc, int i) {
        Parcel parcelH0 = h0();
        C7.e(parcelH0, bVar);
        C7.c(parcelH0, d1Var);
        parcelH0.writeString(str);
        C7.e(parcelH0, interfaceC0603Lc);
        parcelH0.writeInt(ModuleDescriptor.MODULE_VERSION);
        parcelH0.writeInt(i);
        Parcel parcelK0 = k0(parcelH0, 2);
        IBinder strongBinder = parcelK0.readStrongBinder();
        parcelK0.recycle();
        return strongBinder;
    }
}
