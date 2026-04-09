package ec;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y3 extends qb.a {
    public static final Parcelable.Creator<y3> CREATOR = new androidx.recyclerview.widget.i0(18);

    /* renamed from: a, reason: collision with root package name */
    public final long f23210a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f23211b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23212c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f23213d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23214e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23215f;
    public String g;

    public y3(long j, byte[] bArr, String str, Bundle bundle, int i4, long j8, String str2) {
        this.f23210a = j;
        this.f23211b = bArr;
        this.f23212c = str;
        this.f23213d = bundle;
        this.f23214e = i4;
        this.f23215f = j8;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 1, 8);
        parcel.writeLong(this.f23210a);
        com.bumptech.glide.f.E(parcel, 2, this.f23211b);
        com.bumptech.glide.f.I(parcel, 3, this.f23212c);
        com.bumptech.glide.f.D(parcel, 4, this.f23213d);
        com.bumptech.glide.f.N(parcel, 5, 4);
        parcel.writeInt(this.f23214e);
        com.bumptech.glide.f.N(parcel, 6, 8);
        parcel.writeLong(this.f23215f);
        com.bumptech.glide.f.I(parcel, 7, this.g);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
