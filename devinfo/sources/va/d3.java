package va;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d3 extends qb.a {
    public static final Parcelable.Creator<d3> CREATOR = new f1(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f36064a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36065b;

    /* renamed from: c, reason: collision with root package name */
    public final String f36066c;

    /* renamed from: d, reason: collision with root package name */
    public final long f36067d;

    public d3(int i4, long j, int i10, String str) {
        this.f36064a = i4;
        this.f36065b = i10;
        this.f36066c = str;
        this.f36067d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f36064a);
        com.bumptech.glide.f.N(parcel, 2, 4);
        parcel.writeInt(this.f36065b);
        com.bumptech.glide.f.I(parcel, 3, this.f36066c);
        com.bumptech.glide.f.N(parcel, 4, 8);
        parcel.writeLong(this.f36067d);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
