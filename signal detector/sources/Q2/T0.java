package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.B7;
import com.google.android.gms.internal.ads.C7;

/* loaded from: classes.dex */
public final class T0 extends B7 implements InterfaceC2842s0 {
    public T0() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static InterfaceC2842s0 K3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2842s0 ? (InterfaceC2842s0) iInterfaceQueryLocalInterface : new C2840r0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            C7.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        ClassLoader classLoader = C7.f7544a;
        parcel2.writeInt(1);
        return true;
    }

    @Override // q2.InterfaceC2842s0
    public final boolean d() {
        return true;
    }

    @Override // q2.InterfaceC2842s0
    public final void u1(e1 e1Var) {
    }
}
