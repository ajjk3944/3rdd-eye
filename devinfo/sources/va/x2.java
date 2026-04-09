package va;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x2 extends qb.a {
    public static final Parcelable.Creator<x2> CREATOR = new f1(7);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f36183a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f36184b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f36185c;

    public x2(pa.t tVar) {
        this(tVar.f31551a, tVar.f31552b, tVar.f31553c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 2, 4);
        parcel.writeInt(this.f36183a ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(this.f36184b ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 4, 4);
        parcel.writeInt(this.f36185c ? 1 : 0);
        com.bumptech.glide.f.P(parcel, iO);
    }

    public x2(boolean z3, boolean z10, boolean z11) {
        this.f36183a = z3;
        this.f36184b = z10;
        this.f36185c = z11;
    }
}
