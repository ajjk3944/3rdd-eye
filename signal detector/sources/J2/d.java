package J2;

import A3.q;
import M2.u;
import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends N2.a {
    public static final Parcelable.Creator<d> CREATOR = new q(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f2052a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2053b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2054c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2055d;

    public d(int i, long j6, String str, boolean z6) {
        this.f2052a = str;
        this.f2053b = i;
        this.f2054c = j6;
        this.f2055d = z6;
    }

    public final long a() {
        long j6 = this.f2054c;
        return j6 == -1 ? this.f2053b : j6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (u.g(this.f2052a, dVar.f2052a) && a() == dVar.a() && this.f2055d == dVar.f2055d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2052a, Long.valueOf(a()), Boolean.valueOf(this.f2055d)});
    }

    public final String toString() {
        V2.h hVar = new V2.h(this);
        hVar.g(this.f2052a, "name");
        hVar.g(Long.valueOf(a()), "version");
        hVar.g(Boolean.valueOf(this.f2055d), "is_fully_rolled_out");
        return hVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.u(parcel, 1, this.f2052a);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f2053b);
        long jA = a();
        AbstractC0241a.B(parcel, 3, 8);
        parcel.writeLong(jA);
        AbstractC0241a.B(parcel, 4, 4);
        parcel.writeInt(this.f2055d ? 1 : 0);
        AbstractC0241a.H(parcel, iE);
    }

    public d(String str) {
        this(-1, 1L, str, false);
    }
}
