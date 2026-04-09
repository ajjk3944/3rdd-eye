package wa;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.f;
import j4.g;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends qb.a {
    public static final Parcelable.Creator<a> CREATOR = new g(25);

    /* renamed from: a, reason: collision with root package name */
    public final String f36576a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36577b;

    /* renamed from: c, reason: collision with root package name */
    public final String f36578c;

    public a(String str, String str2, String str3) {
        this.f36576a = str;
        this.f36577b = str2;
        this.f36578c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = f.O(parcel, 20293);
        f.I(parcel, 1, this.f36576a);
        f.I(parcel, 2, this.f36577b);
        f.I(parcel, 3, this.f36578c);
        f.P(parcel, iO);
    }
}
