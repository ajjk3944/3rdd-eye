package nb;

import android.os.Parcel;
import android.os.Parcelable;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s extends qb.a {
    public static final Parcelable.Creator<s> CREATOR = new j4.g(8);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29929a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29930b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29931c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29932d;

    /* renamed from: e, reason: collision with root package name */
    public final long f29933e;

    public s(boolean z3, String str, int i4, int i10, long j) {
        this.f29929a = z3;
        this.f29930b = str;
        this.f29931c = i0.x(i4) - 1;
        this.f29932d = pk.a.A(i10) - 1;
        this.f29933e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f29929a ? 1 : 0);
        com.bumptech.glide.f.I(parcel, 2, this.f29930b);
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(this.f29931c);
        com.bumptech.glide.f.N(parcel, 4, 4);
        parcel.writeInt(this.f29932d);
        com.bumptech.glide.f.N(parcel, 5, 8);
        parcel.writeLong(this.f29933e);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
