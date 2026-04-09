package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xd3 extends l0 {
    public static final Parcelable.Creator<xd3> CREATOR = new p92(20);
    public final int f;
    public qr1 g = null;
    public byte[] h;

    public xd3(int i, byte[] bArr) {
        this.f = i;
        this.h = bArr;
        a();
    }

    public final void a() {
        qr1 qr1Var = this.g;
        if (qr1Var != null || this.h == null) {
            if (qr1Var == null || this.h != null) {
                if (qr1Var != null && this.h != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (qr1Var != null || this.h != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.T(parcel, 1, 4);
        parcel.writeInt(this.f);
        byte[] bArrB = this.h;
        if (bArrB == null) {
            bArrB = this.g.b();
        }
        uk2.A(parcel, 2, bArrB);
        uk2.O(parcel, I);
    }
}
