package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import tc.c;

/* loaded from: classes.dex */
public final class Tile extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Tile> CREATOR = new c(29);

    /* renamed from: a, reason: collision with root package name */
    public final int f5374a;

    /* renamed from: d, reason: collision with root package name */
    public final int f5375d;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f5376g;

    public Tile(byte[] bArr, int i10, int i11) {
        this.f5374a = i10;
        this.f5375d = i11;
        this.f5376g = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 2, 4);
        parcel.writeInt(this.f5374a);
        i4.S(parcel, 3, 4);
        parcel.writeInt(this.f5375d);
        byte[] bArr = this.f5376g;
        if (bArr != null) {
            int iU2 = i4.U(parcel, 4);
            parcel.writeByteArray(bArr);
            i4.W(parcel, iU2);
        }
        i4.W(parcel, iU);
    }
}
