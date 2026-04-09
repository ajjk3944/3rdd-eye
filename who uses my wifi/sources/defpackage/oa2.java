package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class oa2 extends sb1 {
    public oa2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator", 2);
    }

    public final IBinder l1(oi0 oi0Var, xe4 xe4Var, String str, u62 u62Var, int i) {
        Parcel parcelU = U();
        iv1.e(parcelU, oi0Var);
        iv1.c(parcelU, xe4Var);
        parcelU.writeString(str);
        iv1.e(parcelU, u62Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        parcelU.writeInt(i);
        Parcel parcelY = Y(parcelU, 2);
        IBinder strongBinder = parcelY.readStrongBinder();
        parcelY.recycle();
        return strongBinder;
    }
}
