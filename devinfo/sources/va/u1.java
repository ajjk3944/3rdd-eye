package va;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.ng;
import com.google.android.gms.internal.ads.yq;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u1 extends ac.a {
    public final t1 k2(vb.b bVar, yq yqVar) {
        t1 s1Var;
        Parcel parcelT = T();
        ng.e(parcelT, bVar);
        ng.e(parcelT, yqVar);
        parcelT.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelR0 = r0(parcelT, 1);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            s1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            s1Var = iInterfaceQueryLocalInterface instanceof t1 ? (t1) iInterfaceQueryLocalInterface : new s1(strongBinder);
        }
        parcelR0.recycle();
        return s1Var;
    }
}
