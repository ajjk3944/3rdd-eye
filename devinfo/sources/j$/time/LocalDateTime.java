package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.o, j$.time.chrono.e, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f26040c = F(f.f26116d, i.f26172e);

    /* renamed from: d, reason: collision with root package name */
    public static final LocalDateTime f26041d = F(f.f26117e, i.f26173f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: a, reason: collision with root package name */
    public final f f26042a;

    /* renamed from: b, reason: collision with root package name */
    public final i f26043b;

    @Override // j$.time.chrono.e
    public final j$.time.chrono.m a() {
        return ((f) f()).a();
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.j m(ZoneOffset zoneOffset) {
        return y.C(this, zoneOffset, null);
    }

    public static LocalDateTime F(f fVar, i iVar) {
        Objects.requireNonNull(fVar, "date");
        Objects.requireNonNull(iVar, "time");
        return new LocalDateTime(fVar, iVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(((f) f()).x(), j$.time.temporal.a.EPOCH_DAY).c(b().N(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public static LocalDateTime G(long j, int i4, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j8 = i4;
        j$.time.temporal.a.NANO_OF_SECOND.s(j8);
        return new LocalDateTime(f.L(j$.com.android.tools.r8.a.B(j + zoneOffset.f26051a, 86400)), i.G((((int) j$.com.android.tools.r8.a.A(r5, r7)) * 1000000000) + j8));
    }

    public static LocalDateTime D(j$.time.temporal.n nVar) {
        if (nVar instanceof LocalDateTime) {
            return (LocalDateTime) nVar;
        }
        if (!(nVar instanceof y)) {
            if (nVar instanceof OffsetDateTime) {
                return ((OffsetDateTime) nVar).toLocalDateTime();
            }
            try {
                return new LocalDateTime(f.E(nVar), i.E(nVar));
            } catch (a e2) {
                throw new a("Unable to obtain LocalDateTime from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName(), e2);
            }
        }
        return ((y) nVar).f26239a;
    }

    public LocalDateTime(f fVar, i iVar) {
        this.f26042a = fVar;
        this.f26043b = iVar;
    }

    public final LocalDateTime L(f fVar, i iVar) {
        return (this.f26042a == fVar && this.f26043b == iVar) ? this : new LocalDateTime(fVar, iVar);
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar != null && qVar.i(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        return aVar.isDateBased() || aVar.w();
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) qVar).w()) {
                i iVar = this.f26043b;
                iVar.getClass();
                return j$.time.temporal.r.d(iVar, qVar);
            }
            return this.f26042a.k(qVar);
        }
        return qVar.j(this);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).w() ? this.f26043b.i(qVar) : this.f26042a.i(qVar);
        }
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).w() ? this.f26043b.w(qVar) : this.f26042a.w(qVar);
        }
        return qVar.l(this);
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.b f() {
        return this.f26042a;
    }

    @Override // j$.time.chrono.e
    public final i b() {
        return this.f26043b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(f fVar) {
        return L(fVar, this.f26043b);
    }

    @Override // j$.time.temporal.m
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime c(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) qVar).w()) {
                return L(this.f26042a, this.f26043b.c(j, qVar));
            }
            return L(this.f26042a.c(j, qVar), this.f26043b);
        }
        return (LocalDateTime) qVar.o(this, j);
    }

    @Override // j$.time.temporal.m
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (LocalDateTime) sVar.i(this, j);
        }
        switch (g.f26169a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return J(this.f26042a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime localDateTimeL = L(this.f26042a.N(j / 86400000000L), this.f26043b);
                return localDateTimeL.J(localDateTimeL.f26042a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeL2 = L(this.f26042a.N(j / 86400000), this.f26043b);
                return localDateTimeL2.J(localDateTimeL2.f26042a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return I(j);
            case 5:
                return J(this.f26042a, 0L, j, 0L, 0L);
            case 6:
                return J(this.f26042a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeL3 = L(this.f26042a.N(j / 256), this.f26043b);
                return localDateTimeL3.J(localDateTimeL3.f26042a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return L(this.f26042a.d(j, sVar), this.f26043b);
        }
    }

    public final LocalDateTime I(long j) {
        return J(this.f26042a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    public final LocalDateTime J(f fVar, long j, long j8, long j9, long j10) {
        if ((j | j8 | j9 | j10) == 0) {
            return L(fVar, this.f26043b);
        }
        long j11 = 1;
        long jN = this.f26043b.N();
        long j12 = ((((j % 24) * 3600000000000L) + ((j8 % 1440) * 60000000000L) + ((j9 % 86400) * 1000000000) + (j10 % 86400000000000L)) * j11) + jN;
        long jB = j$.com.android.tools.r8.a.B(j12, 86400000000000L) + (((j / 24) + (j8 / 1440) + (j9 / 86400) + (j10 / 86400000000000L)) * j11);
        long jA = j$.com.android.tools.r8.a.A(j12, 86400000000000L);
        return L(fVar.N(jB), jA == jN ? this.f26043b : i.G(jA));
    }

    @Override // j$.time.temporal.n
    public final Object l(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f26227f) {
            return this.f26042a;
        }
        return j$.com.android.tools.r8.a.q(this, aVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return C((LocalDateTime) eVar);
        }
        return j$.com.android.tools.r8.a.h(this, eVar);
    }

    public final int C(LocalDateTime localDateTime) {
        int iC = this.f26042a.C(localDateTime.f26042a);
        return iC == 0 ? this.f26043b.compareTo(localDateTime.f26043b) : iC;
    }

    public final boolean E(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return C((LocalDateTime) eVar) < 0;
        }
        long jX = this.f26042a.x();
        long jX2 = eVar.f().x();
        if (jX >= jX2) {
            return jX == jX2 && this.f26043b.N() < eVar.b().N();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f26042a.equals(localDateTime.f26042a) && this.f26043b.equals(localDateTime.f26043b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f26042a.hashCode() ^ this.f26043b.hashCode();
    }

    public final String toString() {
        return this.f26042a.toString() + "T" + this.f26043b.toString();
    }

    private Object writeReplace() {
        return new q((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
