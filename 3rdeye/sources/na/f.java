package na;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import na.b;

/* compiled from: ChronoZonedDateTimeImpl.java */
/* loaded from: classes3.dex */
public final class f<D extends b> extends e<D> implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final d<D> f44429c;

    /* renamed from: d, reason: collision with root package name */
    public final ma.q f44430d;

    /* renamed from: e, reason: collision with root package name */
    public final ma.p f44431e;

    /* compiled from: ChronoZonedDateTimeImpl.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44432a;

        static {
            int[] iArr = new int[qa.a.values().length];
            f44432a = iArr;
            try {
                iArr[qa.a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44432a[qa.a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public f(ma.p pVar, ma.q qVar, d dVar) {
        com.google.gson.internal.c.v(dVar, "dateTime");
        this.f44429c = dVar;
        com.google.gson.internal.c.v(qVar, "offset");
        this.f44430d = qVar;
        com.google.gson.internal.c.v(pVar, "zone");
        this.f44431e = pVar;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static f v0(ma.p pVar, ma.q qVar, d dVar) {
        com.google.gson.internal.c.v(dVar, "localDateTime");
        com.google.gson.internal.c.v(pVar, "zone");
        if (pVar instanceof ma.q) {
            return new f(pVar, (ma.q) pVar, dVar);
        }
        ra.f fVarC = pVar.c();
        ma.f fVarS0 = ma.f.s0(dVar);
        List<ma.q> listC = fVarC.c(fVarS0);
        if (listC.size() == 1) {
            qVar = listC.get(0);
        } else if (listC.size() == 0) {
            ra.d dVarB = fVarC.b(fVarS0);
            dVar = dVar.s0(dVar.f44425c, 0L, 0L, ma.c.a(0, dVarB.f45850d.f44150c - dVarB.f45849c.f44150c).f44088b, 0L);
            qVar = dVarB.f45850d;
        } else {
            if (qVar == null || !listC.contains(qVar)) {
                qVar = listC.get(0);
            }
            dVar = dVar;
        }
        com.google.gson.internal.c.v(qVar, "offset");
        return new f(pVar, qVar, dVar);
    }

    public static <R extends b> f<R> w0(g gVar, ma.d dVar, ma.p pVar) {
        ma.q qVarA = pVar.c().a(dVar);
        com.google.gson.internal.c.v(qVarA, "offset");
        return new f<>(pVar, qVarA, (d) gVar.i(ma.f.v0(dVar.f44091b, dVar.f44092c, qVarA)));
    }

    private Object writeReplace() {
        return new t((byte) 13, this);
    }

    @Override // na.e
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && compareTo((e) obj) == 0;
    }

    @Override // na.e
    public final int hashCode() {
        return (this.f44429c.hashCode() ^ this.f44430d.f44150c) ^ Integer.rotateLeft(this.f44431e.hashCode(), 3);
    }

    @Override // pa.a, qa.e
    public final boolean isSupported(qa.h hVar) {
        if (hVar instanceof qa.a) {
            return true;
        }
        return hVar != null && hVar.isSupportedBy(this);
    }

    @Override // na.e
    public final ma.q j0() {
        return this.f44430d;
    }

    @Override // na.e
    public final ma.p k0() {
        return this.f44431e;
    }

    @Override // na.e, qa.d
    /* renamed from: m0 */
    public final e<D> q(long j4, qa.k kVar) {
        return kVar instanceof qa.b ? s0(this.f44429c.q(j4, kVar)) : o0().k0().d(kVar.addTo(this, j4));
    }

    @Override // na.e
    public final c<D> p0() {
        return this.f44429c;
    }

    @Override // na.e, qa.d
    public final e r0(long j4, qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return o0().k0().d(hVar.adjustInto(this, j4));
        }
        qa.a aVar = (qa.a) hVar;
        int i = a.f44432a[aVar.ordinal()];
        if (i == 1) {
            return q(j4 - n0(), qa.b.SECONDS);
        }
        ma.p pVar = this.f44431e;
        d<D> dVar = this.f44429c;
        if (i != 2) {
            return v0(pVar, this.f44430d, dVar.r0(j4, hVar));
        }
        return w0(o0().k0(), ma.d.m0(dVar.m0(ma.q.j(aVar.checkValidIntValue(j4))), dVar.o0().f44113e), pVar);
    }

    @Override // qa.d
    public final long t(qa.d dVar, qa.b bVar) {
        e eVarL = o0().k0().l(dVar);
        if (!androidx.work.s.n(bVar)) {
            return bVar.between(this, eVarL);
        }
        return this.f44429c.t(eVarL.t0(this.f44430d).p0(), bVar);
    }

    @Override // na.e
    public final e<D> t0(ma.p pVar) {
        com.google.gson.internal.c.v(pVar, "zone");
        if (this.f44431e.equals(pVar)) {
            return this;
        }
        return w0(o0().k0(), ma.d.m0(this.f44429c.m0(this.f44430d), r0.o0().f44113e), pVar);
    }

    @Override // na.e
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f44429c.toString());
        ma.q qVar = this.f44430d;
        sb.append(qVar.f44151d);
        String string = sb.toString();
        ma.p pVar = this.f44431e;
        if (qVar == pVar) {
            return string;
        }
        return string + '[' + pVar.toString() + ']';
    }

    @Override // na.e
    public final e<D> u0(ma.p pVar) {
        return v0(pVar, this.f44430d, this.f44429c);
    }
}
