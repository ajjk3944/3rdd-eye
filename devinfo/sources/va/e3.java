package va;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e3 extends qb.a {
    public static final Parcelable.Creator<e3> CREATOR = new f1(11);

    /* renamed from: a, reason: collision with root package name */
    public final String f36083a;

    /* renamed from: b, reason: collision with root package name */
    public long f36084b;

    /* renamed from: c, reason: collision with root package name */
    public w1 f36085c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f36086d;

    /* renamed from: e, reason: collision with root package name */
    public final String f36087e;

    /* renamed from: f, reason: collision with root package name */
    public final String f36088f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final String f36089h;

    public e3(String str, long j, w1 w1Var, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f36083a = str;
        this.f36084b = j;
        this.f36085c = w1Var;
        this.f36086d = bundle;
        this.f36087e = str2;
        this.f36088f = str3;
        this.g = str4;
        this.f36089h = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 1, this.f36083a);
        long j = this.f36084b;
        com.bumptech.glide.f.N(parcel, 2, 8);
        parcel.writeLong(j);
        com.bumptech.glide.f.H(parcel, 3, this.f36085c, i4);
        com.bumptech.glide.f.D(parcel, 4, this.f36086d);
        com.bumptech.glide.f.I(parcel, 5, this.f36087e);
        com.bumptech.glide.f.I(parcel, 6, this.f36088f);
        com.bumptech.glide.f.I(parcel, 7, this.g);
        com.bumptech.glide.f.I(parcel, 8, this.f36089h);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
