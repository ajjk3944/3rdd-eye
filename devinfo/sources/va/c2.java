package va;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c2 extends qb.a {
    public static final Parcelable.Creator<c2> CREATOR = new f1(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f36037a;

    public c2(int i4) {
        this.f36037a = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 2, 4);
        parcel.writeInt(this.f36037a);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
