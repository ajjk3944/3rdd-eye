package cc;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class h0 extends com.google.android.gms.internal.measurement.x implements i0 {
    @Override // cc.i0
    public final int a() {
        Parcel parcelD = d(R(), 2);
        int i10 = parcelD.readInt();
        parcelD.recycle();
        return i10;
    }

    @Override // cc.i0
    public final jc.b c() {
        Parcel parcelD = d(R(), 1);
        jc.b bVarU = jc.d.U(parcelD.readStrongBinder());
        parcelD.recycle();
        return bVarU;
    }
}
