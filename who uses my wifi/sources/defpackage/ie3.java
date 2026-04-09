package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ie3 extends sb1 implements je3 {
    @Override // defpackage.je3
    public final void B(int i) {
        Parcel parcelU = U();
        parcelU.writeInt(i);
        M0(parcelU, 7);
    }

    @Override // defpackage.je3
    public final void G2() {
        Parcel parcelU = U();
        parcelU.writeIntArray(null);
        M0(parcelU, 4);
    }

    @Override // defpackage.je3
    public final void J1(oi0 oi0Var, String str) {
        Parcel parcelU = U();
        iv1.e(parcelU, oi0Var);
        parcelU.writeString(str);
        parcelU.writeString(null);
        M0(parcelU, 8);
    }

    @Override // defpackage.je3
    public final void b() {
        M0(U(), 3);
    }

    @Override // defpackage.je3
    public final void t0(byte[] bArr) {
        Parcel parcelU = U();
        parcelU.writeByteArray(bArr);
        M0(parcelU, 5);
    }

    @Override // defpackage.je3
    public final void z(int i) {
        Parcel parcelU = U();
        parcelU.writeInt(i);
        M0(parcelU, 6);
    }
}
