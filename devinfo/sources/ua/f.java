package ua;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f extends qb.a {
    public static final Parcelable.Creator<f> CREATOR = new j4.g(24);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f35244a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f35245b;

    /* renamed from: c, reason: collision with root package name */
    public final String f35246c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f35247d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35248e;

    /* renamed from: f, reason: collision with root package name */
    public final int f35249f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f35250h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f35251i;

    public f(boolean z3, boolean z10, String str, boolean z11, float f10, int i4, boolean z12, boolean z13, boolean z14) {
        this.f35244a = z3;
        this.f35245b = z10;
        this.f35246c = str;
        this.f35247d = z11;
        this.f35248e = f10;
        this.f35249f = i4;
        this.g = z12;
        this.f35250h = z13;
        this.f35251i = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.N(parcel, 2, 4);
        parcel.writeInt(this.f35244a ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(this.f35245b ? 1 : 0);
        com.bumptech.glide.f.I(parcel, 4, this.f35246c);
        com.bumptech.glide.f.N(parcel, 5, 4);
        parcel.writeInt(this.f35247d ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 6, 4);
        parcel.writeFloat(this.f35248e);
        com.bumptech.glide.f.N(parcel, 7, 4);
        parcel.writeInt(this.f35249f);
        com.bumptech.glide.f.N(parcel, 8, 4);
        parcel.writeInt(this.g ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 9, 4);
        parcel.writeInt(this.f35250h ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 10, 4);
        parcel.writeInt(this.f35251i ? 1 : 0);
        com.bumptech.glide.f.P(parcel, iO);
    }

    public f(boolean z3, boolean z10, boolean z11, float f10, boolean z12, boolean z13, boolean z14) {
        this(z3, z10, null, z11, f10, -1, z12, z13, z14);
    }
}
