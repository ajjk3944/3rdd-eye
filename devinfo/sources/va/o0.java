package va;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o0 extends qb.a {
    public static final Parcelable.Creator<o0> CREATOR = new f1(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f36151a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36152b;

    public o0(String str, String str2) {
        this.f36151a = str;
        this.f36152b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 1, this.f36151a);
        com.bumptech.glide.f.I(parcel, 2, this.f36152b);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
