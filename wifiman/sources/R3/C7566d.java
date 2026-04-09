package r3;

import android.os.Parcel;
import android.os.Parcelable;
import s3.AbstractC7900o;
import t3.AbstractC8026a;

/* renamed from: r3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7566d extends AbstractC8026a {
    public static final Parcelable.Creator<C7566d> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    private final String f60078a;

    /* renamed from: b, reason: collision with root package name */
    private final int f60079b;

    /* renamed from: c, reason: collision with root package name */
    private final long f60080c;

    public C7566d(String str, int i10, long j10) {
        this.f60078a = str;
        this.f60079b = i10;
        this.f60080c = j10;
    }

    public String b() {
        return this.f60078a;
    }

    public long e() {
        long j10 = this.f60080c;
        return j10 == -1 ? this.f60079b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7566d) {
            C7566d c7566d = (C7566d) obj;
            if (((b() != null && b().equals(c7566d.b())) || (b() == null && c7566d.b() == null)) && e() == c7566d.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC7900o.b(b(), Long.valueOf(e()));
    }

    public final String toString() {
        AbstractC7900o.a aVarC = AbstractC7900o.c(this);
        aVarC.a("name", b());
        aVarC.a("version", Long.valueOf(e()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.q(parcel, 1, b(), false);
        t3.b.k(parcel, 2, this.f60079b);
        t3.b.n(parcel, 3, e());
        t3.b.b(parcel, iA);
    }

    public C7566d(String str, long j10) {
        this.f60078a = str;
        this.f60080c = j10;
        this.f60079b = -1;
    }
}
