package vt;

import br.l;
import java.io.Serializable;
import xu.d;

/* loaded from: classes.dex */
public final class a implements Comparable, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final a f23968g = new a(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f23969a;

    /* renamed from: d, reason: collision with root package name */
    public final long f23970d;

    public a(long j, long j7) {
        this.f23969a = j;
        this.f23970d = j7;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        l.e(aVar, "other");
        long j = aVar.f23969a;
        long j7 = this.f23969a;
        if (j7 != j) {
            return Long.compare(j7 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.f23970d ^ Long.MIN_VALUE, aVar.f23970d ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f23969a == aVar.f23969a && this.f23970d == aVar.f23970d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23969a ^ this.f23970d);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        d.q(this.f23969a, bArr, 0, 0, 4);
        bArr[8] = 45;
        d.q(this.f23969a, bArr, 9, 4, 6);
        bArr[13] = 45;
        d.q(this.f23969a, bArr, 14, 6, 8);
        bArr[18] = 45;
        d.q(this.f23970d, bArr, 19, 0, 2);
        bArr[23] = 45;
        d.q(this.f23970d, bArr, 24, 2, 8);
        return new String(bArr, tt.a.f22975a);
    }
}
