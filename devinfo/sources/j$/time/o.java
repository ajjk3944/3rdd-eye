package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class o implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f26187c = 0;
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: a, reason: collision with root package name */
    public final i f26188a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneOffset f26189b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        if (this.f26189b.equals(oVar.f26189b)) {
            return this.f26188a.compareTo(oVar.f26188a);
        }
        int iCompare = Long.compare(this.f26188a.N() - (this.f26189b.f26051a * 1000000000), oVar.f26188a.N() - (oVar.f26189b.f26051a * 1000000000));
        return iCompare == 0 ? this.f26188a.compareTo(oVar.f26188a) : iCompare;
    }

    static {
        i iVar = i.f26172e;
        ZoneOffset zoneOffset = ZoneOffset.f26050f;
        iVar.getClass();
        new o(iVar, zoneOffset);
        i iVar2 = i.f26173f;
        ZoneOffset zoneOffset2 = ZoneOffset.f26049e;
        iVar2.getClass();
        new o(iVar2, zoneOffset2);
    }

    public o(i iVar, ZoneOffset zoneOffset) {
        this.f26188a = (i) Objects.requireNonNull(iVar, "time");
        this.f26189b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public final o D(i iVar, ZoneOffset zoneOffset) {
        return (this.f26188a == iVar && this.f26189b.equals(zoneOffset)) ? this : new o(iVar, zoneOffset);
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).w() || qVar == j$.time.temporal.a.OFFSET_SECONDS : qVar != null && qVar.i(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar != j$.time.temporal.a.OFFSET_SECONDS) {
                i iVar = this.f26188a;
                iVar.getClass();
                return j$.time.temporal.r.d(iVar, qVar);
            }
            return ((j$.time.temporal.a) qVar).f26204b;
        }
        return qVar.j(this);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f26189b.f26051a;
            }
            return this.f26188a.w(qVar);
        }
        return qVar.l(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
                return D(this.f26188a, ZoneOffset.I(aVar.f26204b.a(j, aVar)));
            }
            return D(this.f26188a.c(j, qVar), this.f26189b);
        }
        return (o) qVar.o(this, j);
    }

    @Override // j$.time.temporal.m
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final o d(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            return D(this.f26188a.d(j, sVar), this.f26189b);
        }
        return (o) sVar.i(this, j);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object l(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f26225d || aVar == j$.time.temporal.r.f26226e) {
            return this.f26189b;
        }
        if (((aVar == j$.time.temporal.r.f26222a) || (aVar == j$.time.temporal.r.f26223b)) || aVar == j$.time.temporal.r.f26227f) {
            return null;
        }
        if (aVar == j$.time.temporal.r.g) {
            return this.f26188a;
        }
        if (aVar == j$.time.temporal.r.f26224c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(this.f26188a.N(), j$.time.temporal.a.NANO_OF_DAY).c(this.f26189b.f26051a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f26188a.equals(oVar.f26188a) && this.f26189b.equals(oVar.f26189b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f26188a.hashCode() ^ this.f26189b.f26051a;
    }

    public final String toString() {
        return this.f26188a.toString() + this.f26189b.f26052b;
    }

    private Object writeReplace() {
        return new q((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(f fVar) {
        return (o) j$.com.android.tools.r8.a.a(fVar, this);
    }
}
