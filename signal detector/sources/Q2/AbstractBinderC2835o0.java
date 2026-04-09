package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.B7;
import com.google.android.gms.internal.ads.C7;

/* renamed from: q2.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2835o0 extends B7 implements InterfaceC2837p0 {
    public AbstractBinderC2835o0() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        C2852x0 c2852x0 = (C2852x0) C7.b(parcel, C2852x0.CREATOR);
        C7.f(parcel);
        c0(c2852x0);
        parcel2.writeNoException();
        return true;
    }
}
