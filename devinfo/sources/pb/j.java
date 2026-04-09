package pb;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j extends qb.a {
    public static final Parcelable.Creator<j> CREATOR = new j4.g(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f31623a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31624b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31625c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31626d;

    /* renamed from: e, reason: collision with root package name */
    public final long f31627e;

    /* renamed from: f, reason: collision with root package name */
    public final String f31628f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final int f31629h;

    /* renamed from: i, reason: collision with root package name */
    public final int f31630i;

    public j(int i4, int i10, int i11, long j, long j8, String str, String str2, int i12, int i13) {
        this.f31623a = i4;
        this.f31624b = i10;
        this.f31625c = i11;
        this.f31626d = j;
        this.f31627e = j8;
        this.f31628f = str;
        this.g = str2;
        this.f31629h = i12;
        this.f31630i = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f31623a);
        com.bumptech.glide.f.N(parcel, 2, 4);
        parcel.writeInt(this.f31624b);
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(this.f31625c);
        com.bumptech.glide.f.N(parcel, 4, 8);
        parcel.writeLong(this.f31626d);
        com.bumptech.glide.f.N(parcel, 5, 8);
        parcel.writeLong(this.f31627e);
        com.bumptech.glide.f.I(parcel, 6, this.f31628f);
        com.bumptech.glide.f.I(parcel, 7, this.g);
        com.bumptech.glide.f.N(parcel, 8, 4);
        parcel.writeInt(this.f31629h);
        com.bumptech.glide.f.N(parcel, 9, 4);
        parcel.writeInt(this.f31630i);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
