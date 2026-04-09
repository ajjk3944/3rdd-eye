package va;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.ar;
import com.google.android.gms.internal.ads.ng;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m0 extends ac.a {
    public m0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator", 1);
    }

    public final IBinder k2(vb.b bVar, c3 c3Var, String str, ar arVar, int i4) {
        Parcel parcelT = T();
        ng.e(parcelT, bVar);
        ng.c(parcelT, c3Var);
        parcelT.writeString(str);
        ng.e(parcelT, arVar);
        parcelT.writeInt(ModuleDescriptor.MODULE_VERSION);
        parcelT.writeInt(i4);
        Parcel parcelR0 = r0(parcelT, 2);
        IBinder strongBinder = parcelR0.readStrongBinder();
        parcelR0.recycle();
        return strongBinder;
    }
}
