package I3;

import android.os.Parcel;
import android.os.Parcelable;
import s3.AbstractC7900o;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class s extends AbstractC8026a {
    public static final Parcelable.Creator<s> CREATOR = new t();

    /* renamed from: a, reason: collision with root package name */
    public final int f8585a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8586b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8587c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8588d;

    s(int i10, int i11, long j10, long j11) {
        this.f8585a = i10;
        this.f8586b = i11;
        this.f8587c = j10;
        this.f8588d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f8585a == sVar.f8585a && this.f8586b == sVar.f8586b && this.f8587c == sVar.f8587c && this.f8588d == sVar.f8588d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC7900o.b(Integer.valueOf(this.f8586b), Integer.valueOf(this.f8585a), Long.valueOf(this.f8588d), Long.valueOf(this.f8587c));
    }

    public final String toString() {
        int i10 = this.f8585a;
        int length = String.valueOf(i10).length();
        int i11 = this.f8586b;
        int length2 = String.valueOf(i11).length();
        long j10 = this.f8588d;
        int length3 = String.valueOf(j10).length();
        long j11 = this.f8587c;
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j11).length());
        sb2.append("NetworkLocationStatus: Wifi status: ");
        sb2.append(i10);
        sb2.append(" Cell status: ");
        sb2.append(i11);
        sb2.append(" elapsed time NS: ");
        sb2.append(j10);
        sb2.append(" system time ms: ");
        sb2.append(j11);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f8585a;
        int iA = t3.b.a(parcel);
        t3.b.k(parcel, 1, i11);
        t3.b.k(parcel, 2, this.f8586b);
        t3.b.n(parcel, 3, this.f8587c);
        t3.b.n(parcel, 4, this.f8588d);
        t3.b.b(parcel, iA);
    }
}
