package q2;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class U0 extends N2.a {
    public static final Parcelable.Creator<U0> CREATOR = new C2819g0(4);

    /* renamed from: a, reason: collision with root package name */
    public final String f23139a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23140b;

    /* renamed from: c, reason: collision with root package name */
    public final a1 f23141c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23142d;

    public U0(String str, int i, a1 a1Var, int i3) {
        this.f23139a = str;
        this.f23140b = i;
        this.f23141c = a1Var;
        this.f23142d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U0)) {
            return false;
        }
        U0 u02 = (U0) obj;
        return this.f23139a.equals(u02.f23139a) && this.f23140b == u02.f23140b && this.f23141c.a(u02.f23141c);
    }

    public final int hashCode() {
        return Objects.hash(this.f23139a, Integer.valueOf(this.f23140b), this.f23141c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.u(parcel, 1, this.f23139a);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f23140b);
        AbstractC0241a.t(parcel, 3, this.f23141c, i);
        AbstractC0241a.B(parcel, 4, 4);
        parcel.writeInt(this.f23142d);
        AbstractC0241a.H(parcel, iE);
    }
}
