package pb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m extends qb.a {
    public static final Parcelable.Creator<m> CREATOR = new j4.g(13);

    /* renamed from: a, reason: collision with root package name */
    public final int f31650a;

    /* renamed from: b, reason: collision with root package name */
    public List f31651b;

    public m(int i4, List list) {
        this.f31650a = i4;
        this.f31651b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 4);
        parcel.writeInt(this.f31650a);
        com.bumptech.glide.f.M(parcel, 2, this.f31651b);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
