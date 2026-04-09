package pb;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f extends qb.a {
    public static final Parcelable.Creator<f> CREATOR = new j4.g(19);

    /* renamed from: a, reason: collision with root package name */
    public final l f31589a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31590b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f31591c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f31592d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31593e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f31594f;

    public f(l lVar, boolean z3, boolean z10, int[] iArr, int i4, int[] iArr2) {
        this.f31589a = lVar;
        this.f31590b = z3;
        this.f31591c = z10;
        this.f31592d = iArr;
        this.f31593e = i4;
        this.f31594f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.H(parcel, 1, this.f31589a, i4);
        com.bumptech.glide.f.N(parcel, 2, 4);
        parcel.writeInt(this.f31590b ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(this.f31591c ? 1 : 0);
        int[] iArr = this.f31592d;
        if (iArr != null) {
            int iO2 = com.bumptech.glide.f.O(parcel, 4);
            parcel.writeIntArray(iArr);
            com.bumptech.glide.f.P(parcel, iO2);
        }
        com.bumptech.glide.f.N(parcel, 5, 4);
        parcel.writeInt(this.f31593e);
        int[] iArr2 = this.f31594f;
        if (iArr2 != null) {
            int iO3 = com.bumptech.glide.f.O(parcel, 6);
            parcel.writeIntArray(iArr2);
            com.bumptech.glide.f.P(parcel, iO3);
        }
        com.bumptech.glide.f.P(parcel, iO);
    }
}
