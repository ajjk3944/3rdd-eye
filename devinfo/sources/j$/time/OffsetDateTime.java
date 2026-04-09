package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.m, j$.time.temporal.o, Comparable<OffsetDateTime>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f26044c = 0;
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: a, reason: collision with root package name */
    public final LocalDateTime f26045a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneOffset f26046b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.f26046b.equals(offsetDateTime2.f26046b)) {
            iCompare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f26045a;
            ZoneOffset zoneOffset = this.f26046b;
            localDateTime.getClass();
            long jT = j$.com.android.tools.r8.a.t(localDateTime, zoneOffset);
            LocalDateTime localDateTime2 = offsetDateTime2.f26045a;
            ZoneOffset zoneOffset2 = offsetDateTime2.f26046b;
            localDateTime2.getClass();
            iCompare = Long.compare(jT, j$.com.android.tools.r8.a.t(localDateTime2, zoneOffset2));
            if (iCompare == 0) {
                iCompare = this.f26045a.f26043b.f26178d - offsetDateTime2.f26045a.f26043b.f26178d;
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompare;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.f26040c;
        ZoneOffset zoneOffset = ZoneOffset.f26050f;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f26041d;
        ZoneOffset zoneOffset2 = ZoneOffset.f26049e;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime C(Instant instant, v vVar) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(vVar, "zone");
        ZoneOffset zoneOffsetD = vVar.C().d(instant);
        return new OffsetDateTime(LocalDateTime.G(instant.f26038a, instant.f26039b, zoneOffsetD), zoneOffsetD);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.f26045a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.f26046b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public final OffsetDateTime E(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f26045a == localDateTime && this.f26046b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.i(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar != j$.time.temporal.a.INSTANT_SECONDS && qVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f26045a.k(qVar);
            }
            return ((j$.time.temporal.a) qVar).f26204b;
        }
        return qVar.j(this);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i4 = n.f26186a[((j$.time.temporal.a) qVar).ordinal()];
            if (i4 == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i4 == 2) {
                return this.f26046b.f26051a;
            }
            return this.f26045a.i(qVar);
        }
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        int i4 = n.f26186a[((j$.time.temporal.a) qVar).ordinal()];
        if (i4 != 1) {
            return i4 != 2 ? this.f26045a.w(qVar) : this.f26046b.f26051a;
        }
        LocalDateTime localDateTime = this.f26045a;
        ZoneOffset zoneOffset = this.f26046b;
        localDateTime.getClass();
        return j$.com.android.tools.r8.a.t(localDateTime, zoneOffset);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f26045a;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(f fVar) {
        LocalDateTime localDateTime = this.f26045a;
        return E(localDateTime.L(fVar, localDateTime.f26043b), this.f26046b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i4 = n.f26186a[aVar.ordinal()];
            if (i4 == 1) {
                return C(Instant.D(j, this.f26045a.f26043b.f26178d), this.f26046b);
            }
            if (i4 == 2) {
                return E(this.f26045a, ZoneOffset.I(aVar.f26204b.a(j, aVar)));
            }
            return E(this.f26045a.c(j, qVar), this.f26046b);
        }
        return (OffsetDateTime) qVar.o(this, j);
    }

    @Override // j$.time.temporal.m
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime d(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            return E(this.f26045a.d(j, sVar), this.f26046b);
        }
        return (OffsetDateTime) sVar.i(this, j);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object l(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f26225d || aVar == j$.time.temporal.r.f26226e) {
            return this.f26046b;
        }
        if (aVar == j$.time.temporal.r.f26222a) {
            return null;
        }
        if (aVar == j$.time.temporal.r.f26227f) {
            return this.f26045a.f26042a;
        }
        if (aVar == j$.time.temporal.r.g) {
            return this.f26045a.f26043b;
        }
        if (aVar == j$.time.temporal.r.f26223b) {
            return j$.time.chrono.t.f26098c;
        }
        if (aVar == j$.time.temporal.r.f26224c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(this.f26045a.f26042a.x(), j$.time.temporal.a.EPOCH_DAY).c(this.f26045a.f26043b.N(), j$.time.temporal.a.NANO_OF_DAY).c(this.f26046b.f26051a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.f26045a.equals(offsetDateTime.f26045a) && this.f26046b.equals(offsetDateTime.f26046b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f26045a.hashCode() ^ this.f26046b.f26051a;
    }

    public final String toString() {
        return this.f26045a.toString() + this.f26046b.f26052b;
    }

    private Object writeReplace() {
        return new q((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
