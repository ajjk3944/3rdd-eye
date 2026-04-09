package ya;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l extends qb.a {
    public static final Parcelable.Creator<l> CREATOR = new j4.g(29);

    /* renamed from: a, reason: collision with root package name */
    public final String f37469a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37470b;

    public l(String str, int i4) {
        this.f37469a = str == null ? "" : str;
        this.f37470b = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 1, this.f37469a);
        com.bumptech.glide.f.N(parcel, 2, 4);
        parcel.writeInt(this.f37470b);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
