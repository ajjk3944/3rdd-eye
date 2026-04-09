package pb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g0 extends qb.a {
    public static final Parcelable.Creator<g0> CREATOR = new j4.g(18);

    /* renamed from: a, reason: collision with root package name */
    public Bundle f31609a;

    /* renamed from: b, reason: collision with root package name */
    public nb.d[] f31610b;

    /* renamed from: c, reason: collision with root package name */
    public int f31611c;

    /* renamed from: d, reason: collision with root package name */
    public f f31612d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.D(parcel, 1, this.f31609a);
        com.bumptech.glide.f.L(parcel, 2, this.f31610b, i4);
        int i10 = this.f31611c;
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(i10);
        com.bumptech.glide.f.H(parcel, 4, this.f31612d, i4);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
