package sa;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends qb.a {
    public static final Parcelable.Creator<a> CREATOR = new j4.g(22);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33510a;

    public a(boolean z3) {
        this.f33510a = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f33510a ? 1 : 0);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
