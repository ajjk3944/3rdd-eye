package q2;

import android.os.Parcel;

/* renamed from: q2.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2829l0 extends W2.a implements InterfaceC2831m0 {
    @Override // q2.InterfaceC2831m0
    public final String b() {
        Parcel parcelK0 = k0(h0(), 1);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // q2.InterfaceC2831m0
    public final String d() {
        Parcel parcelK0 = k0(h0(), 2);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }
}
