package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dw2 extends sb1 {
    public final uv2 l1(oi0 oi0Var, s62 s62Var) {
        uv2 dv2Var;
        Parcel parcelU = U();
        iv1.e(parcelU, oi0Var);
        iv1.e(parcelU, s62Var);
        parcelU.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelY = Y(parcelU, 1);
        IBinder strongBinder = parcelY.readStrongBinder();
        if (strongBinder == null) {
            dv2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            dv2Var = iInterfaceQueryLocalInterface instanceof uv2 ? (uv2) iInterfaceQueryLocalInterface : new dv2(strongBinder);
        }
        parcelY.recycle();
        return dv2Var;
    }
}
