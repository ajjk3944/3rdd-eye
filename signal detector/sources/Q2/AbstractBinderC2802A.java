package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.B7;
import com.google.android.gms.internal.ads.C7;

/* renamed from: q2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2802A extends B7 implements InterfaceC2803B {
    public AbstractBinderC2802A() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            z();
        } else {
            if (i != 2) {
                return false;
            }
            C2852x0 c2852x0 = (C2852x0) C7.b(parcel, C2852x0.CREATOR);
            C7.f(parcel);
            V(c2852x0);
        }
        parcel2.writeNoException();
        return true;
    }
}
