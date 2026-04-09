package j$.time;

import j$.time.format.DateTimeFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.o, Comparable<Instant>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Instant f26037c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: a, reason: collision with root package name */
    public final long f26038a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26039b;

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.f26038a, instant2.f26038a);
        return iCompare != 0 ? iCompare : this.f26039b - instant2.f26039b;
    }

    static {
        D(-31557014167219200L, 0L);
        D(31556889864403199L, 999999999L);
    }

    public static Instant D(long j, long j8) {
        return C(j$.com.android.tools.r8.a.x(j, j$.com.android.tools.r8.a.B(j8, 1000000000L)), (int) j$.com.android.tools.r8.a.A(j8, 1000000000L));
    }

    public static Instant C(long j, int i4) {
        if ((i4 | j) == 0) {
            return f26037c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new a("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i4);
    }

    public Instant(long j, int i4) {
        this.f26038a = j;
        this.f26039b = i4;
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.NANO_OF_SECOND || qVar == j$.time.temporal.a.MICRO_OF_SECOND || qVar == j$.time.temporal.a.MILLI_OF_SECOND : qVar != null && qVar.i(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.r.d(this, qVar).a(qVar.l(this), qVar);
        }
        int i4 = d.f26112a[((j$.time.temporal.a) qVar).ordinal()];
        if (i4 == 1) {
            return this.f26039b;
        }
        if (i4 == 2) {
            return this.f26039b / 1000;
        }
        if (i4 == 3) {
            return this.f26039b / 1000000;
        }
        if (i4 == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.f26204b.a(this.f26038a, aVar);
        }
        throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        int i4;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        int i10 = d.f26112a[((j$.time.temporal.a) qVar).ordinal()];
        if (i10 == 1) {
            i4 = this.f26039b;
        } else if (i10 == 2) {
            i4 = this.f26039b / 1000;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    return this.f26038a;
                }
                throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
            }
            i4 = this.f26039b / 1000000;
        }
        return i4;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (Instant) qVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.s(j);
        int i4 = d.f26112a[aVar.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                int i10 = ((int) j) * 1000;
                if (i10 != this.f26039b) {
                    return C(this.f26038a, i10);
                }
            } else if (i4 == 3) {
                int i11 = ((int) j) * 1000000;
                if (i11 != this.f26039b) {
                    return C(this.f26038a, i11);
                }
            } else {
                if (i4 != 4) {
                    throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
                }
                if (j != this.f26038a) {
                    return C(j, this.f26039b);
                }
            }
        } else if (j != this.f26039b) {
            return C(this.f26038a, (int) j);
        }
        return this;
    }

    @Override // j$.time.temporal.m
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final Instant d(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (Instant) sVar.i(this, j);
        }
        switch (d.f26113b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return E(0L, j);
            case 2:
                return E(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return E(j / 1000, (j % 1000) * 1000000);
            case 4:
                return E(j, 0L);
            case 5:
                return E(j$.com.android.tools.r8.a.w(j, 60), 0L);
            case 6:
                return E(j$.com.android.tools.r8.a.w(j, 3600), 0L);
            case 7:
                return E(j$.com.android.tools.r8.a.w(j, 43200), 0L);
            case 8:
                return E(j$.com.android.tools.r8.a.w(j, 86400), 0L);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public final Instant E(long j, long j8) {
        if ((j | j8) == 0) {
            return this;
        }
        return D(j$.com.android.tools.r8.a.x(j$.com.android.tools.r8.a.x(this.f26038a, j), j8 / 1000000000), this.f26039b + (j8 % 1000000000));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object l(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f26224c) {
            return j$.time.temporal.b.NANOS;
        }
        if (aVar == j$.time.temporal.r.f26223b || aVar == j$.time.temporal.r.f26222a || aVar == j$.time.temporal.r.f26226e || aVar == j$.time.temporal.r.f26225d || aVar == j$.time.temporal.r.f26227f || aVar == j$.time.temporal.r.g) {
            return null;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(this.f26038a, j$.time.temporal.a.INSTANT_SECONDS).c(this.f26039b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.C(this, zoneOffset);
    }

    public long toEpochMilli() {
        long j = this.f26038a;
        if (j < 0 && this.f26039b > 0) {
            return j$.com.android.tools.r8.a.x(j$.com.android.tools.r8.a.w(j + 1, 1000), (this.f26039b / 1000000) - 1000);
        }
        return j$.com.android.tools.r8.a.x(j$.com.android.tools.r8.a.w(j, 1000), this.f26039b / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f26038a == instant.f26038a && this.f26039b == instant.f26039b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f26038a;
        return (this.f26039b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.f26121e.a(this);
    }

    private Object writeReplace() {
        return new q((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(f fVar) {
        return (Instant) j$.com.android.tools.r8.a.a(fVar, this);
    }
}
