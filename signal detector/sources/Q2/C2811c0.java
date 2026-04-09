package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.BinderC0569Jc;
import com.google.android.gms.internal.ads.C7;
import com.google.android.gms.internal.ads.InterfaceC0603Lc;

/* renamed from: q2.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2811c0 extends W2.a implements InterfaceC2815e0 {
    @Override // q2.InterfaceC2815e0
    public final InterfaceC0603Lc getAdapterCreator() {
        Parcel parcelK0 = k0(h0(), 2);
        InterfaceC0603Lc interfaceC0603LcK3 = BinderC0569Jc.K3(parcelK0.readStrongBinder());
        parcelK0.recycle();
        return interfaceC0603LcK3;
    }

    @Override // q2.InterfaceC2815e0
    public final L0 getLiteSdkVersion() {
        Parcel parcelK0 = k0(h0(), 1);
        L0 l02 = (L0) C7.b(parcelK0, L0.CREATOR);
        parcelK0.recycle();
        return l02;
    }
}
