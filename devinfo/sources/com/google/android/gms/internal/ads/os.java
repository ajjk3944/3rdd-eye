package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class os extends qb.a {
    public static final Parcelable.Creator<os> CREATOR = new ci(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f14775a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14776b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14777c;

    public os(int i4, int i10, int i11) {
        this.f14775a = i4;
        this.f14776b = i10;
        this.f14777c = i11;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof os)) {
            os osVar = (os) obj;
            if (osVar.f14777c == this.f14777c && osVar.f14776b == this.f14776b && osVar.f14775a == this.f14775a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f14775a, this.f14776b, this.f14777c});
    }

    public final String toString() {
        int i4 = this.f14775a;
        int length = String.valueOf(i4).length();
        int i10 = this.f14776b;
        int length2 = String.valueOf(i10).length();
        int i11 = this.f14777c;
        StringBuilder sb2 = new StringBuilder(length + 1 + length2 + 1 + String.valueOf(i11).length());
        je.u.x(i4, i10, ".", ".", sb2);
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f14775a);
        com.bumptech.glide.f.N(parcel, 2, 4);
        parcel.writeInt(this.f14776b);
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(this.f14777c);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
