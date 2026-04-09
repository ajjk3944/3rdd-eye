package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class l implements j, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* renamed from: a, reason: collision with root package name */
    public final transient g f26080a;

    /* renamed from: b, reason: collision with root package name */
    public final transient ZoneOffset f26081b;

    /* renamed from: c, reason: collision with root package name */
    public final transient j$.time.v f26082c;

    @Override // j$.time.chrono.j
    public final /* synthetic */ long B() {
        return j$.com.android.tools.r8.a.u(this);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ int i(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.k(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ Object l(j$.time.format.a aVar) {
        return j$.com.android.tools.r8.a.r(this, aVar);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.com.android.tools.r8.a.i(this, (j) obj);
    }

    public static l C(j$.time.v vVar, ZoneOffset zoneOffset, g gVar) {
        Objects.requireNonNull(gVar, "localDateTime");
        Objects.requireNonNull(vVar, "zone");
        if (vVar instanceof ZoneOffset) {
            return new l(vVar, (ZoneOffset) vVar, gVar);
        }
        j$.time.zone.f fVarC = vVar.C();
        LocalDateTime localDateTimeD = LocalDateTime.D(gVar);
        List listF = fVarC.f(localDateTimeD);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            gVar = gVar;
        } else {
            Object objE = fVarC.e(localDateTimeD);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            gVar = gVar.E(gVar.f26066a, 0L, 0L, Duration.i(bVar.f26248d.f26051a - bVar.f26247c.f26051a, 0).f26035a, 0L);
            zoneOffset = bVar.f26248d;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new l(vVar, zoneOffset, gVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar != j$.time.temporal.a.INSTANT_SECONDS && qVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return ((g) p()).k(qVar);
            }
            return ((j$.time.temporal.a) qVar).f26204b;
        }
        return qVar.j(this);
    }

    public static l o(m mVar, j$.time.temporal.m mVar2) {
        l lVar = (l) mVar2;
        if (mVar.equals(lVar.a())) {
            return lVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.h() + ", actual: " + lVar.a().h());
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i4 = i.f26075a[((j$.time.temporal.a) qVar).ordinal()];
            if (i4 == 1) {
                return B();
            }
            if (i4 != 2) {
                return ((g) p()).w(qVar);
            }
            return g().f26051a;
        }
        return qVar.l(this);
    }

    public l(j$.time.v vVar, ZoneOffset zoneOffset, g gVar) {
        this.f26080a = (g) Objects.requireNonNull(gVar, "dateTime");
        this.f26081b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
        this.f26082c = (j$.time.v) Objects.requireNonNull(vVar, "zone");
    }

    @Override // j$.time.chrono.j
    public final ZoneOffset g() {
        return this.f26081b;
    }

    @Override // j$.time.chrono.j
    public final b f() {
        return ((g) p()).f();
    }

    @Override // j$.time.chrono.j
    public final j$.time.i b() {
        return ((g) p()).b();
    }

    public final int hashCode() {
        return (this.f26080a.hashCode() ^ this.f26081b.f26051a) ^ Integer.rotateLeft(this.f26082c.hashCode(), 3);
    }

    @Override // j$.time.chrono.j
    public final e p() {
        return this.f26080a;
    }

    public final String toString() {
        String str = this.f26080a.toString() + this.f26081b.f26052b;
        ZoneOffset zoneOffset = this.f26081b;
        j$.time.v vVar = this.f26082c;
        if (zoneOffset == vVar) {
            return str;
        }
        return str + "[" + vVar.toString() + "]";
    }

    @Override // j$.time.chrono.j
    public final j$.time.v v() {
        return this.f26082c;
    }

    @Override // j$.time.chrono.j
    public final m a() {
        return f().a();
    }

    @Override // j$.time.chrono.j
    public final j r(j$.time.v vVar) {
        return C(vVar, this.f26081b, this.f26080a);
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.i(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return o(a(), qVar.o(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i4 = k.f26078a[aVar.ordinal()];
        if (i4 == 1) {
            return d(j - j$.com.android.tools.r8.a.u(this), j$.time.temporal.b.SECONDS);
        }
        if (i4 != 2) {
            return C(this.f26082c, this.f26081b, this.f26080a.c(j, qVar));
        }
        ZoneOffset zoneOffsetI = ZoneOffset.I(aVar.f26204b.a(j, aVar));
        g gVar = this.f26080a;
        gVar.getClass();
        Instant instantD = Instant.D(j$.com.android.tools.r8.a.t(gVar, zoneOffsetI), gVar.f26067b.f26178d);
        j$.time.v vVar = this.f26082c;
        m mVarA = a();
        ZoneOffset zoneOffsetD = vVar.C().d(instantD);
        Objects.requireNonNull(zoneOffsetD, "offset");
        return new l(vVar, zoneOffsetD, (g) mVarA.u(LocalDateTime.G(instantD.f26038a, instantD.f26039b, zoneOffsetD)));
    }

    @Override // j$.time.temporal.m
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final l d(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            return o(a(), this.f26080a.d(j, sVar).o(this));
        }
        return o(a(), sVar.i(this, j));
    }

    private Object writeReplace() {
        return new f0((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && j$.com.android.tools.r8.a.i(this, (j) obj) == 0;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(j$.time.f fVar) {
        return o(a(), fVar.o(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return o(a(), j$.time.temporal.r.b(this, j, bVar));
    }
}
