package j$.time.chrono;

import j$.time.ZoneOffset;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class g implements e, j$.time.temporal.m, j$.time.temporal.o, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* renamed from: a, reason: collision with root package name */
    public final transient b f26066a;

    /* renamed from: b, reason: collision with root package name */
    public final transient j$.time.i f26067b;

    @Override // j$.time.temporal.n
    public final /* synthetic */ Object l(j$.time.format.a aVar) {
        return j$.com.android.tools.r8.a.q(this, aVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: z */
    public final /* synthetic */ int compareTo(e eVar) {
        return j$.com.android.tools.r8.a.h(this, eVar);
    }

    public static g C(m mVar, j$.time.temporal.m mVar2) {
        g gVar = (g) mVar2;
        if (mVar.equals(gVar.f26066a.a())) {
            return gVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.h() + ", actual: " + gVar.f26066a.a().h());
    }

    public g(b bVar, j$.time.i iVar) {
        Objects.requireNonNull(bVar, "date");
        Objects.requireNonNull(iVar, "time");
        this.f26066a = bVar;
        this.f26067b = iVar;
    }

    public final g G(j$.time.temporal.m mVar, j$.time.i iVar) {
        b bVar = this.f26066a;
        return (bVar == mVar && this.f26067b == iVar) ? this : new g(d.C(bVar.a(), mVar), iVar);
    }

    @Override // j$.time.chrono.e
    public final m a() {
        return this.f26066a.a();
    }

    @Override // j$.time.chrono.e
    public final b f() {
        return this.f26066a;
    }

    public final int hashCode() {
        return this.f26066a.hashCode() ^ this.f26067b.hashCode();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return C(this.f26066a.a(), j$.time.temporal.r.b(this, j, bVar));
    }

    public final String toString() {
        return this.f26066a.toString() + "T" + this.f26067b.toString();
    }

    @Override // j$.time.chrono.e
    public final j$.time.i b() {
        return this.f26067b;
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
            if (!((j$.time.temporal.a) qVar).w()) {
                return this.f26066a.k(qVar);
            }
            j$.time.i iVar = this.f26067b;
            iVar.getClass();
            return j$.time.temporal.r.d(iVar, qVar);
        }
        return qVar.j(this);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).w() ? this.f26067b.i(qVar) : this.f26066a.i(qVar);
        }
        return k(qVar).a(w(qVar), qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).w() ? this.f26067b.w(qVar) : this.f26066a.w(qVar);
        }
        return qVar.l(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(j$.time.f fVar) {
        return G(fVar, this.f26067b);
    }

    @Override // j$.time.temporal.m
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final g c(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) qVar).w()) {
                return G(this.f26066a, this.f26067b.c(j, qVar));
            }
            return G(this.f26066a.c(j, qVar), this.f26067b);
        }
        return C(this.f26066a.a(), qVar.o(this, j));
    }

    @Override // j$.time.temporal.m
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final g d(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return C(this.f26066a.a(), sVar.i(this, j));
        }
        switch (f.f26063a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return E(this.f26066a, 0L, 0L, 0L, j);
            case 2:
                g gVarG = G(this.f26066a.d(j / 86400000000L, (j$.time.temporal.s) j$.time.temporal.b.DAYS), this.f26067b);
                return gVarG.E(gVarG.f26066a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                g gVarG2 = G(this.f26066a.d(j / 86400000, (j$.time.temporal.s) j$.time.temporal.b.DAYS), this.f26067b);
                return gVarG2.E(gVarG2.f26066a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return E(this.f26066a, 0L, 0L, j, 0L);
            case 5:
                return E(this.f26066a, 0L, j, 0L, 0L);
            case 6:
                return E(this.f26066a, j, 0L, 0L, 0L);
            case 7:
                g gVarG3 = G(this.f26066a.d(j / 256, (j$.time.temporal.s) j$.time.temporal.b.DAYS), this.f26067b);
                return gVarG3.E(gVarG3.f26066a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return G(this.f26066a.d(j, sVar), this.f26067b);
        }
    }

    public final g E(b bVar, long j, long j8, long j9, long j10) {
        if ((j | j8 | j9 | j10) == 0) {
            return G(bVar, this.f26067b);
        }
        long j11 = j / 24;
        long j12 = ((j % 24) * 3600000000000L) + ((j8 % 1440) * 60000000000L) + ((j9 % 86400) * 1000000000) + (j10 % 86400000000000L);
        long jN = this.f26067b.N();
        long j13 = j12 + jN;
        long jB = j$.com.android.tools.r8.a.B(j13, 86400000000000L) + j11 + (j8 / 1440) + (j9 / 86400) + (j10 / 86400000000000L);
        long jA = j$.com.android.tools.r8.a.A(j13, 86400000000000L);
        return G(bVar.d(jB, (j$.time.temporal.s) j$.time.temporal.b.DAYS), jA == jN ? this.f26067b : j$.time.i.G(jA));
    }

    @Override // j$.time.chrono.e
    public final j m(ZoneOffset zoneOffset) {
        return l.C(zoneOffset, null, this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(f().x(), j$.time.temporal.a.EPOCH_DAY).c(b().N(), j$.time.temporal.a.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new f0((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && j$.com.android.tools.r8.a.h(this, (e) obj) == 0;
    }
}
