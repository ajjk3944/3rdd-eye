package nb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import pb.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends qb.a {
    public static final Parcelable.Creator<d> CREATOR = new j4.g(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f29892a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29893b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29894c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f29895d;

    public d(int i4, long j, String str, boolean z3) {
        this.f29892a = str;
        this.f29893b = i4;
        this.f29894c = j;
        this.f29895d = z3;
    }

    public final long a() {
        long j = this.f29894c;
        return j == -1 ? this.f29893b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (y.l(this.f29892a, dVar.f29892a) && a() == dVar.a() && this.f29895d == dVar.f29895d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29892a, Long.valueOf(a()), Boolean.valueOf(this.f29895d)});
    }

    public final String toString() {
        km.n nVar = new km.n(this);
        nVar.f(this.f29892a, "name");
        nVar.f(Long.valueOf(a()), "version");
        nVar.f(Boolean.valueOf(this.f29895d), "is_fully_rolled_out");
        return nVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 1, this.f29892a);
        com.bumptech.glide.f.N(parcel, 2, 4);
        parcel.writeInt(this.f29893b);
        long jA = a();
        com.bumptech.glide.f.N(parcel, 3, 8);
        parcel.writeLong(jA);
        com.bumptech.glide.f.N(parcel, 4, 4);
        parcel.writeInt(this.f29895d ? 1 : 0);
        com.bumptech.glide.f.P(parcel, iO);
    }

    public d(String str) {
        this(-1, 1L, str, false);
    }
}
