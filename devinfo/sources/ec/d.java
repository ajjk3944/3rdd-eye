package ec;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends qb.a {
    public static final Parcelable.Creator<d> CREATOR = new androidx.recyclerview.widget.i0(12);

    /* renamed from: a, reason: collision with root package name */
    public final long f22613a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22614b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22615c;

    public d(long j, long j8, int i4) {
        this.f22613a = j;
        this.f22614b = i4;
        this.f22615c = j8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 8);
        parcel.writeLong(this.f22613a);
        com.bumptech.glide.f.N(parcel, 2, 4);
        parcel.writeInt(this.f22614b);
        com.bumptech.glide.f.N(parcel, 3, 8);
        parcel.writeLong(this.f22615c);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
