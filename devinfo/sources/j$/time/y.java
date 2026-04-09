package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class y implements j$.time.temporal.m, j$.time.chrono.j, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: a, reason: collision with root package name */
    public final LocalDateTime f26239a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneOffset f26240b;

    /* renamed from: c, reason: collision with root package name */
    public final v f26241c;

    @Override // j$.time.chrono.j
    public final /* synthetic */ long B() {
        return j$.com.android.tools.r8.a.u(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.com.android.tools.r8.a.i(this, (j$.time.chrono.j) obj);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.m a() {
        return ((f) f()).a();
    }

    public static y C(LocalDateTime localDateTime, v vVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(vVar, "zone");
        if (vVar instanceof ZoneOffset) {
            return new y(localDateTime, vVar, (ZoneOffset) vVar);
        }
        j$.time.zone.f fVarC = vVar.C();
        List listF = fVarC.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) Objects.requireNonNull((ZoneOffset) listF.get(0), "offset");
            }
        } else {
            Object objE = fVarC.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.I(Duration.i(bVar.f26248d.f26051a - bVar.f26247c.f26051a, 0).f26035a);
            zoneOffset = bVar.f26248d;
        }
        return new y(localDateTime, vVar, zoneOffset);
    }

    public static y o(long j, int i4, v vVar) {
        ZoneOffset zoneOffsetD = vVar.C().d(Instant.D(j, i4));
        return new y(LocalDateTime.G(j, i4, zoneOffsetD), vVar, zoneOffsetD);
    }

    public y(LocalDateTime localDateTime, v vVar, ZoneOffset zoneOffset) {
        this.f26239a = localDateTime;
        this.f26240b = zoneOffset;
        this.f26241c = vVar;
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
            if (qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) qVar).f26204b;
            }
            return this.f26239a.k(qVar);
        }
        return qVar.j(this);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i4 = x.f26238a[((j$.time.temporal.a) qVar).ordinal()];
            if (i4 == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i4 == 2) {
                return this.f26240b.f26051a;
            }
            return this.f26239a.i(qVar);
        }
        return j$.com.android.tools.r8.a.k(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        int i4 = x.f26238a[((j$.time.temporal.a) qVar).ordinal()];
        return i4 != 1 ? i4 != 2 ? this.f26239a.w(qVar) : this.f26240b.f26051a : j$.com.android.tools.r8.a.u(this);
    }

    @Override // j$.time.chrono.j
    public final ZoneOffset g() {
        return this.f26240b;
    }

    @Override // j$.time.chrono.j
    public final v v() {
        return this.f26241c;
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.j r(v vVar) {
        Objects.requireNonNull(vVar, "zone");
        return this.f26241c.equals(vVar) ? this : C(this.f26239a, vVar, this.f26240b);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.e p() {
        return this.f26239a;
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.b f() {
        return this.f26239a.f26042a;
    }

    @Override // j$.time.chrono.j
    public final i b() {
        return this.f26239a.f26043b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(f fVar) {
        return C(LocalDateTime.F(fVar, this.f26239a.f26043b), this.f26241c, this.f26240b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i4 = x.f26238a[aVar.ordinal()];
            if (i4 == 1) {
                return o(j, this.f26239a.f26043b.f26178d, this.f26241c);
            }
            if (i4 != 2) {
                return C(this.f26239a.c(j, qVar), this.f26241c, this.f26240b);
            }
            ZoneOffset zoneOffsetI = ZoneOffset.I(aVar.f26204b.a(j, aVar));
            return (zoneOffsetI.equals(this.f26240b) || !this.f26241c.C().f(this.f26239a).contains(zoneOffsetI)) ? this : new y(this.f26239a, this.f26241c, zoneOffsetI);
        }
        return (y) qVar.o(this, j);
    }

    @Override // j$.time.temporal.m
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final y d(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (y) sVar.i(this, j);
        }
        j$.time.temporal.b bVar = (j$.time.temporal.b) sVar;
        if (bVar.compareTo(j$.time.temporal.b.DAYS) >= 0 && bVar != j$.time.temporal.b.FOREVER) {
            return C(this.f26239a.d(j, sVar), this.f26241c, this.f26240b);
        }
        LocalDateTime localDateTimeD = this.f26239a.d(j, sVar);
        ZoneOffset zoneOffset = this.f26240b;
        v vVar = this.f26241c;
        Objects.requireNonNull(localDateTimeD, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(vVar, "zone");
        if (vVar.C().f(localDateTimeD).contains(zoneOffset)) {
            return new y(localDateTimeD, vVar, zoneOffset);
        }
        localDateTimeD.getClass();
        return o(j$.com.android.tools.r8.a.t(localDateTimeD, zoneOffset), localDateTimeD.f26043b.f26178d, vVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object l(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f26227f) {
            return this.f26239a.f26042a;
        }
        return j$.com.android.tools.r8.a.r(this, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f26239a.equals(yVar.f26239a) && this.f26240b.equals(yVar.f26240b) && this.f26241c.equals(yVar.f26241c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f26239a.hashCode() ^ this.f26240b.f26051a) ^ Integer.rotateLeft(this.f26241c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f26239a.toString() + this.f26240b.f26052b;
        ZoneOffset zoneOffset = this.f26240b;
        v vVar = this.f26241c;
        if (zoneOffset == vVar) {
            return str;
        }
        return str + "[" + vVar.toString() + "]";
    }

    private Object writeReplace() {
        return new q((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
