package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import i6.a;
import java.util.Arrays;
import qb.v;

/* loaded from: classes.dex */
public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator<ColorInfo> CREATOR = new a(17);

    /* renamed from: a, reason: collision with root package name */
    public final int f4755a;

    /* renamed from: d, reason: collision with root package name */
    public final int f4756d;

    /* renamed from: g, reason: collision with root package name */
    public final int f4757g;

    /* renamed from: r, reason: collision with root package name */
    public final byte[] f4758r;

    /* renamed from: x, reason: collision with root package name */
    public int f4759x;

    public ColorInfo(int i10, int i11, int i12, byte[] bArr) {
        this.f4755a = i10;
        this.f4756d = i11;
        this.f4757g = i12;
        this.f4758r = bArr;
    }

    public static int d(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ColorInfo.class == obj.getClass()) {
            ColorInfo colorInfo = (ColorInfo) obj;
            if (this.f4755a == colorInfo.f4755a && this.f4756d == colorInfo.f4756d && this.f4757g == colorInfo.f4757g && Arrays.equals(this.f4758r, colorInfo.f4758r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f4759x == 0) {
            this.f4759x = Arrays.hashCode(this.f4758r) + ((((((527 + this.f4755a) * 31) + this.f4756d) * 31) + this.f4757g) * 31);
        }
        return this.f4759x;
    }

    public final String toString() {
        boolean z10 = this.f4758r != null;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("ColorInfo(");
        sb2.append(this.f4755a);
        sb2.append(", ");
        sb2.append(this.f4756d);
        sb2.append(", ");
        sb2.append(this.f4757g);
        sb2.append(", ");
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4755a);
        parcel.writeInt(this.f4756d);
        parcel.writeInt(this.f4757g);
        byte[] bArr = this.f4758r;
        int i11 = bArr != null ? 1 : 0;
        int i12 = v.f20828a;
        parcel.writeInt(i11);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public ColorInfo(Parcel parcel) {
        this.f4755a = parcel.readInt();
        this.f4756d = parcel.readInt();
        this.f4757g = parcel.readInt();
        int i10 = v.f20828a;
        this.f4758r = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
