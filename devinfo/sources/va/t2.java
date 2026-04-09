package va;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t2 extends qb.a {
    public static final Parcelable.Creator<t2> CREATOR = new f1(4);

    /* renamed from: a, reason: collision with root package name */
    public final String f36170a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36171b;

    /* renamed from: c, reason: collision with root package name */
    public final z2 f36172c;

    /* renamed from: d, reason: collision with root package name */
    public final int f36173d;

    public t2(String str, int i4, z2 z2Var, int i10) {
        this.f36170a = str;
        this.f36171b = i4;
        this.f36172c = z2Var;
        this.f36173d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return this.f36170a.equals(t2Var.f36170a) && this.f36171b == t2Var.f36171b && this.f36172c.a(t2Var.f36172c);
    }

    public final int hashCode() {
        return Objects.hash(this.f36170a, Integer.valueOf(this.f36171b), this.f36172c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 1, this.f36170a);
        com.bumptech.glide.f.N(parcel, 2, 4);
        parcel.writeInt(this.f36171b);
        com.bumptech.glide.f.H(parcel, 3, this.f36172c, i4);
        com.bumptech.glide.f.N(parcel, 4, 4);
        parcel.writeInt(this.f36173d);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
