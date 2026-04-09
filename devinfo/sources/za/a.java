package za;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends qb.a {
    public static final Parcelable.Creator<a> CREATOR = new m(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f38129a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38130b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38131c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f38132d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f38133e;

    public a(String str, int i4, int i10, boolean z3, boolean z10) {
        this.f38129a = str;
        this.f38130b = i4;
        this.f38131c = i10;
        this.f38132d = z3;
        this.f38133e = z10;
    }

    public static a a() {
        return new a(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 2, this.f38129a);
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(this.f38130b);
        com.bumptech.glide.f.N(parcel, 4, 4);
        parcel.writeInt(this.f38131c);
        com.bumptech.glide.f.N(parcel, 5, 4);
        parcel.writeInt(this.f38132d ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 6, 4);
        parcel.writeInt(this.f38133e ? 1 : 0);
        com.bumptech.glide.f.P(parcel, iO);
    }

    public a(int i4, int i10, boolean z3) {
        this(i4, i10, 0, z3, false);
    }

    public a(int i4, int i10, int i11, boolean z3, boolean z10) {
        String str;
        if (z3) {
            str = "0";
        } else {
            str = "1";
        }
        int length = String.valueOf(i4).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + length + 13 + 2);
        r5.c.q(i4, i10, "afma-sdk-a-v", ".", sb2);
        this(d.h.w(sb2, ".", str), i4, i10, z3, z10);
    }
}
