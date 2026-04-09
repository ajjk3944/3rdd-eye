package hr;

import java.util.Iterator;

/* loaded from: classes.dex */
public class e implements Iterable, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f10871a;

    /* renamed from: d, reason: collision with root package name */
    public final long f10872d;

    /* renamed from: g, reason: collision with root package name */
    public final long f10873g;

    public e(long j, long j7, long j10) {
        if (j10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j10 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f10871a = j;
        if (j10 > 0) {
            if (j < j7) {
                long j11 = j7 % j10;
                long j12 = j % j10;
                long j13 = ((j11 < 0 ? j11 + j10 : j11) - (j12 < 0 ? j12 + j10 : j12)) % j10;
                j7 -= j13 < 0 ? j13 + j10 : j13;
            }
        } else {
            if (j10 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (j > j7) {
                long j14 = -j10;
                long j15 = j % j14;
                long j16 = j7 % j14;
                long j17 = ((j15 < 0 ? j15 + j14 : j15) - (j16 < 0 ? j16 + j14 : j16)) % j14;
                j7 += j17 < 0 ? j17 + j14 : j17;
            }
        }
        this.f10872d = j7;
        this.f10873g = j10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.f10871a == eVar.f10871a && this.f10872d == eVar.f10872d && this.f10873g == eVar.f10873g;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = 31;
        long j7 = this.f10871a;
        long j10 = this.f10872d;
        long j11 = (((j7 ^ (j7 >>> 32)) * j) + (j10 ^ (j10 >>> 32))) * j;
        long j12 = this.f10873g;
        return (int) (j11 + (j12 ^ (j12 >>> 32)));
    }

    public boolean isEmpty() {
        long j = this.f10873g;
        long j7 = this.f10872d;
        long j10 = this.f10871a;
        return j > 0 ? j10 > j7 : j10 < j7;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f(this.f10871a, this.f10872d, this.f10873g);
    }

    public String toString() {
        StringBuilder sb2;
        long j = this.f10873g;
        long j7 = this.f10872d;
        long j10 = this.f10871a;
        if (j > 0) {
            sb2 = new StringBuilder();
            sb2.append(j10);
            sb2.append("..");
            sb2.append(j7);
            sb2.append(" step ");
            sb2.append(j);
        } else {
            sb2 = new StringBuilder();
            sb2.append(j10);
            sb2.append(" downTo ");
            sb2.append(j7);
            sb2.append(" step ");
            sb2.append(-j);
        }
        return sb2.toString();
    }
}
