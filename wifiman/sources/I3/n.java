package I3;

import android.os.Parcel;
import android.os.Parcelable;
import s3.AbstractC7900o;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class n extends AbstractC8026a {
    public static final Parcelable.Creator<n> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f8583a;

    /* renamed from: b, reason: collision with root package name */
    private final C3.t f8584b;

    n(boolean z10, C3.t tVar) {
        this.f8583a = z10;
        this.f8584b = tVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f8583a == nVar.f8583a && AbstractC7900o.a(this.f8584b, nVar.f8584b);
    }

    public final int hashCode() {
        return AbstractC7900o.b(Boolean.valueOf(this.f8583a));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LocationAvailabilityRequest[");
        if (this.f8583a) {
            sb2.append("bypass, ");
        }
        if (this.f8584b != null) {
            sb2.append("impersonation=");
            sb2.append(this.f8584b);
            sb2.append(", ");
        }
        sb2.setLength(sb2.length() - 2);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f8583a;
        int iA = t3.b.a(parcel);
        t3.b.c(parcel, 1, z10);
        t3.b.p(parcel, 2, this.f8584b, i10, false);
        t3.b.b(parcel, iA);
    }
}
