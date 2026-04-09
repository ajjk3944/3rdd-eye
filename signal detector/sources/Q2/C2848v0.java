package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.BinderC0569Jc;
import com.google.android.gms.internal.ads.C7;

/* renamed from: q2.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2848v0 extends W2.a {
    public final InterfaceC2846u0 n1(S2.b bVar, BinderC0569Jc binderC0569Jc) {
        InterfaceC2846u0 c2844t0;
        Parcel parcelH0 = h0();
        C7.e(parcelH0, bVar);
        C7.e(parcelH0, binderC0569Jc);
        parcelH0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelK0 = k0(parcelH0, 1);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            c2844t0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c2844t0 = iInterfaceQueryLocalInterface instanceof InterfaceC2846u0 ? (InterfaceC2846u0) iInterfaceQueryLocalInterface : new C2844t0(strongBinder);
        }
        parcelK0.recycle();
        return c2844t0;
    }
}
