package ec;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v3 extends qb.a {
    public static final Parcelable.Creator<v3> CREATOR = new androidx.recyclerview.widget.i0(17);

    /* renamed from: a, reason: collision with root package name */
    public final String f23101a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23102b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23103c;

    public v3(int i4, long j, String str) {
        this.f23101a = str;
        this.f23102b = j;
        this.f23103c = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 1, this.f23101a);
        com.bumptech.glide.f.N(parcel, 2, 8);
        parcel.writeLong(this.f23102b);
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(this.f23103c);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
