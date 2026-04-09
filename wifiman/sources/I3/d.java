package I3;

import android.os.Parcel;
import android.os.Parcelable;
import s3.AbstractC7900o;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class d extends AbstractC8026a {
    public static final Parcelable.Creator<d> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    private final long f8557a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8558b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f8559c;

    /* renamed from: d, reason: collision with root package name */
    private final C3.t f8560d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f8561a = Long.MAX_VALUE;

        /* renamed from: b, reason: collision with root package name */
        private int f8562b = 0;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f8563c = false;

        /* renamed from: d, reason: collision with root package name */
        private final C3.t f8564d = null;

        public d a() {
            return new d(this.f8561a, this.f8562b, this.f8563c, this.f8564d);
        }
    }

    d(long j10, int i10, boolean z10, C3.t tVar) {
        this.f8557a = j10;
        this.f8558b = i10;
        this.f8559c = z10;
        this.f8560d = tVar;
    }

    public int b() {
        return this.f8558b;
    }

    public long e() {
        return this.f8557a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f8557a == dVar.f8557a && this.f8558b == dVar.f8558b && this.f8559c == dVar.f8559c && AbstractC7900o.a(this.f8560d, dVar.f8560d);
    }

    public int hashCode() {
        return AbstractC7900o.b(Long.valueOf(this.f8557a), Integer.valueOf(this.f8558b), Boolean.valueOf(this.f8559c));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LastLocationRequest[");
        if (this.f8557a != Long.MAX_VALUE) {
            sb2.append("maxAge=");
            C3.w.b(this.f8557a, sb2);
        }
        if (this.f8558b != 0) {
            sb2.append(", ");
            sb2.append(x.a(this.f8558b));
        }
        if (this.f8559c) {
            sb2.append(", bypass");
        }
        if (this.f8560d != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f8560d);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.n(parcel, 1, e());
        t3.b.k(parcel, 2, b());
        t3.b.c(parcel, 3, this.f8559c);
        t3.b.p(parcel, 5, this.f8560d, i10, false);
        t3.b.b(parcel, iA);
    }
}
