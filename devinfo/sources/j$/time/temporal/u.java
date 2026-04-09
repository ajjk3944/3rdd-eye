package j$.time.temporal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class u implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: a, reason: collision with root package name */
    public final long f26228a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26229b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26230c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26231d;

    public static u e(long j, long j8) {
        if (j > j8) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new u(j, j, j8, j8);
    }

    public static u f(long j, long j8) {
        if (j > j8) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j8) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new u(1L, 1L, j, j8);
    }

    public u(long j, long j8, long j9, long j10) {
        this.f26228a = j;
        this.f26229b = j8;
        this.f26230c = j9;
        this.f26231d = j10;
    }

    public final int a(long j, q qVar) {
        if (this.f26228a < -2147483648L || this.f26231d > 2147483647L || !d(j)) {
            throw new j$.time.a(c(j, qVar));
        }
        return (int) j;
    }

    public final boolean d(long j) {
        return j >= this.f26228a && j <= this.f26231d;
    }

    public final void b(long j, q qVar) {
        if (!d(j)) {
            throw new j$.time.a(c(j, qVar));
        }
    }

    public final String c(long j, q qVar) {
        if (qVar != null) {
            return "Invalid value for " + qVar + " (valid values " + this + "): " + j;
        }
        return "Invalid value (valid values " + this + "): " + j;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j = this.f26228a;
        long j8 = this.f26229b;
        if (j > j8) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j9 = this.f26230c;
        long j10 = this.f26231d;
        if (j9 > j10) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j8 > j10) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f26228a == uVar.f26228a && this.f26229b == uVar.f26229b && this.f26230c == uVar.f26230c && this.f26231d == uVar.f26231d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f26228a;
        long j8 = this.f26229b;
        long j9 = j + (j8 << 16) + (j8 >> 48);
        long j10 = this.f26230c;
        long j11 = j9 + (j10 << 32) + (j10 >> 32);
        long j12 = this.f26231d;
        long j13 = j11 + (j12 << 48) + (j12 >> 16);
        return (int) (j13 ^ (j13 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26228a);
        if (this.f26228a != this.f26229b) {
            sb2.append('/');
            sb2.append(this.f26229b);
        }
        sb2.append(" - ");
        sb2.append(this.f26230c);
        if (this.f26230c != this.f26231d) {
            sb2.append('/');
            sb2.append(this.f26231d);
        }
        return sb2.toString();
    }
}
