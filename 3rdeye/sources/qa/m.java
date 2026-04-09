package qa;

import java.io.Serializable;

/* compiled from: ValueRange.java */
/* loaded from: classes3.dex */
public final class m implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final long f45482b;

    /* renamed from: c, reason: collision with root package name */
    public final long f45483c;

    /* renamed from: d, reason: collision with root package name */
    public final long f45484d;

    /* renamed from: e, reason: collision with root package name */
    public final long f45485e;

    public m(long j4, long j10, long j11, long j12) {
        this.f45482b = j4;
        this.f45483c = j10;
        this.f45484d = j11;
        this.f45485e = j12;
    }

    public static m c(long j4, long j10) {
        if (j4 <= j10) {
            return new m(j4, j4, j10, j10);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static m d(long j4, long j10, long j11, long j12) {
        if (j4 > j10) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j11 > j12) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (j10 <= j12) {
            return new m(j4, j10, j11, j12);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public final int a(long j4, h hVar) {
        long j10 = this.f45482b;
        if (j10 >= -2147483648L) {
            long j11 = this.f45485e;
            if (j11 <= 2147483647L && j4 >= j10 && j4 <= j11) {
                return (int) j4;
            }
        }
        throw new ma.a("Invalid int value for " + hVar + ": " + j4);
    }

    public final void b(long j4, h hVar) {
        if (j4 < this.f45482b || j4 > this.f45485e) {
            if (hVar == null) {
                throw new ma.a("Invalid value (valid values " + this + "): " + j4);
            }
            throw new ma.a("Invalid value for " + hVar + " (valid values " + this + "): " + j4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f45482b == mVar.f45482b && this.f45483c == mVar.f45483c && this.f45484d == mVar.f45484d && this.f45485e == mVar.f45485e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f45482b;
        long j10 = this.f45483c;
        long j11 = (j4 + j10) << ((int) (j10 + 16));
        long j12 = this.f45484d;
        long j13 = (j11 >> ((int) (j12 + 48))) << ((int) (j12 + 32));
        long j14 = this.f45485e;
        long j15 = ((j13 >> ((int) (32 + j14))) << ((int) (j14 + 48))) >> 16;
        return (int) (j15 ^ (j15 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j4 = this.f45482b;
        sb.append(j4);
        long j10 = this.f45483c;
        if (j4 != j10) {
            sb.append('/');
            sb.append(j10);
        }
        sb.append(" - ");
        long j11 = this.f45484d;
        sb.append(j11);
        long j12 = this.f45485e;
        if (j11 != j12) {
            sb.append('/');
            sb.append(j12);
        }
        return sb.toString();
    }
}
