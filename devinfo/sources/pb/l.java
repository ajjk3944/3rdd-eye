package pb;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l extends qb.a {
    public static final Parcelable.Creator<l> CREATOR = new j4.g(17);

    /* renamed from: a, reason: collision with root package name */
    public final int f31643a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31644b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f31645c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31646d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31647e;

    public l(int i4, int i10, int i11, boolean z3, boolean z10) {
        this.f31643a = i4;
        this.f31644b = z3;
        this.f31645c = z10;
        this.f31646d = i10;
        this.f31647e = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f31643a);
        com.bumptech.glide.f.N(parcel, 2, 4);
        parcel.writeInt(this.f31644b ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(this.f31645c ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 4, 4);
        parcel.writeInt(this.f31646d);
        com.bumptech.glide.f.N(parcel, 5, 4);
        parcel.writeInt(this.f31647e);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
