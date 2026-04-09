package ma;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;

/* compiled from: ZonedDateTime.java */
/* loaded from: classes3.dex */
public final class s extends na.e<e> implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final f f44155c;

    /* renamed from: d, reason: collision with root package name */
    public final q f44156d;

    /* renamed from: e, reason: collision with root package name */
    public final p f44157e;

    /* compiled from: ZonedDateTime.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44158a;

        static {
            int[] iArr = new int[qa.a.values().length];
            f44158a = iArr;
            try {
                iArr[qa.a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44158a[qa.a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public s(f fVar, p pVar, q qVar) {
        this.f44155c = fVar;
        this.f44156d = qVar;
        this.f44157e = pVar;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static s v0(long j4, int i, p pVar) {
        q qVarA = pVar.c().a(d.m0(j4, i));
        return new s(f.v0(j4, i, qVarA), pVar, qVarA);
    }

    public static s w0(qa.e eVar) {
        if (eVar instanceof s) {
            return (s) eVar;
        }
        try {
            p pVarA = p.a(eVar);
            qa.a aVar = qa.a.INSTANT_SECONDS;
            if (eVar.isSupported(aVar)) {
                try {
                    return v0(eVar.getLong(aVar), eVar.get(qa.a.NANO_OF_SECOND), pVarA);
                } catch (ma.a unused) {
                }
            }
            return x0(f.s0(eVar), pVarA, null);
        } catch (ma.a unused2) {
            throw new ma.a("Unable to obtain ZonedDateTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    private Object writeReplace() {
        return new m((byte) 6, this);
    }

    public static s x0(f fVar, p pVar, q qVar) {
        com.google.gson.internal.c.v(fVar, "localDateTime");
        com.google.gson.internal.c.v(pVar, "zone");
        if (pVar instanceof q) {
            return new s(fVar, pVar, (q) pVar);
        }
        ra.f fVarC = pVar.c();
        List<q> listC = fVarC.c(fVar);
        if (listC.size() == 1) {
            qVar = listC.get(0);
        } else if (listC.size() == 0) {
            ra.d dVarB = fVarC.b(fVar);
            fVar = fVar.x0(c.a(0, dVarB.f45850d.f44150c - dVarB.f45849c.f44150c).f44088b);
            qVar = dVarB.f45850d;
        } else if (qVar == null || !listC.contains(qVar)) {
            q qVar2 = listC.get(0);
            com.google.gson.internal.c.v(qVar2, "offset");
            qVar = qVar2;
        }
        return new s(fVar, pVar, qVar);
    }

    @Override // na.e
    /* renamed from: A0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final s s0(e eVar) {
        return x0(f.u0(eVar, this.f44155c.f44105d), this.f44157e, this.f44156d);
    }

    @Override // na.e
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f44155c.equals(sVar.f44155c) && this.f44156d.equals(sVar.f44156d) && this.f44157e.equals(sVar.f44157e)) {
                return true;
            }
        }
        return false;
    }

    @Override // na.e, pa.a, I9.g, qa.e
    public final int get(qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return super.get(hVar);
        }
        int i = a.f44158a[((qa.a) hVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f44155c.get(hVar) : this.f44156d.f44150c;
        }
        throw new ma.a(com.google.android.gms.measurement.internal.a.f("Field too large for an int: ", hVar));
    }

    @Override // na.e, pa.a, qa.e
    public final long getLong(qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return hVar.getFrom(this);
        }
        int i = a.f44158a[((qa.a) hVar).ordinal()];
        return i != 1 ? i != 2 ? this.f44155c.getLong(hVar) : this.f44156d.f44150c : n0();
    }

    @Override // na.e
    public final int hashCode() {
        return (this.f44155c.hashCode() ^ this.f44156d.f44150c) ^ Integer.rotateLeft(this.f44157e.hashCode(), 3);
    }

    @Override // pa.a, qa.e
    public final boolean isSupported(qa.h hVar) {
        if (hVar instanceof qa.a) {
            return true;
        }
        return hVar != null && hVar.isSupportedBy(this);
    }

    @Override // na.e
    public final q j0() {
        return this.f44156d;
    }

    @Override // na.e
    public final p k0() {
        return this.f44157e;
    }

    @Override // na.e
    /* renamed from: l0 */
    public final na.e u(long j4, qa.b bVar) {
        return j4 == Long.MIN_VALUE ? m0(Long.MAX_VALUE, bVar).m0(1L, bVar) : m0(-j4, bVar);
    }

    @Override // na.e
    public final na.b o0() {
        return this.f44155c.f44104c;
    }

    @Override // na.e
    public final na.c p0() {
        return this.f44155c;
    }

    @Override // na.e
    public final g q0() {
        return this.f44155c.f44105d;
    }

    @Override // na.e, pa.a, I9.g, qa.e
    public final <R> R query(qa.j<R> jVar) {
        return jVar == qa.i.f45480f ? (R) this.f44155c.f44104c : (R) super.query(jVar);
    }

    @Override // na.e, I9.g, qa.e
    public final qa.m range(qa.h hVar) {
        return hVar instanceof qa.a ? (hVar == qa.a.INSTANT_SECONDS || hVar == qa.a.OFFSET_SECONDS) ? hVar.range() : this.f44155c.range(hVar) : hVar.rangeRefinedBy(this);
    }

    @Override // qa.d
    public final long t(qa.d dVar, qa.b bVar) {
        s sVarW0 = w0(dVar);
        if (!androidx.work.s.n(bVar)) {
            return bVar.between(this, sVarW0);
        }
        sVarW0.getClass();
        p pVar = this.f44157e;
        com.google.gson.internal.c.v(pVar, "zone");
        if (!sVarW0.f44157e.equals(pVar)) {
            q qVar = sVarW0.f44156d;
            f fVar = sVarW0.f44155c;
            sVarW0 = v0(fVar.m0(qVar), fVar.f44105d.f44113e, pVar);
        }
        boolean zIsDateBased = bVar.isDateBased();
        f fVar2 = this.f44155c;
        f fVar3 = sVarW0.f44155c;
        return zIsDateBased ? fVar2.t(fVar3, bVar) : new j(fVar2, this.f44156d).t(new j(fVar3, sVarW0.f44156d), bVar);
    }

    @Override // na.e
    public final na.e t0(p pVar) {
        com.google.gson.internal.c.v(pVar, "zone");
        if (this.f44157e.equals(pVar)) {
            return this;
        }
        q qVar = this.f44156d;
        f fVar = this.f44155c;
        return v0(fVar.m0(qVar), fVar.f44105d.f44113e, pVar);
    }

    @Override // na.e
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f44155c.toString());
        q qVar = this.f44156d;
        sb.append(qVar.f44151d);
        String string = sb.toString();
        p pVar = this.f44157e;
        if (qVar == pVar) {
            return string;
        }
        return string + '[' + pVar.toString() + ']';
    }

    @Override // na.e, pa.a, qa.d
    public final qa.d u(long j4, qa.k kVar) {
        qa.b bVar = (qa.b) kVar;
        return j4 == Long.MIN_VALUE ? m0(Long.MAX_VALUE, bVar).m0(1L, bVar) : m0(-j4, bVar);
    }

    @Override // na.e
    public final na.e u0(p pVar) {
        com.google.gson.internal.c.v(pVar, "zone");
        return this.f44157e.equals(pVar) ? this : x0(this.f44155c, pVar, this.f44156d);
    }

    @Override // na.e, qa.d
    /* renamed from: y0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final s q(long j4, qa.k kVar) {
        if (!(kVar instanceof qa.b)) {
            return (s) kVar.addTo(this, j4);
        }
        boolean zIsDateBased = kVar.isDateBased();
        q qVar = this.f44156d;
        p pVar = this.f44157e;
        f fVar = this.f44155c;
        if (zIsDateBased) {
            return x0(fVar.l0(j4, kVar), pVar, qVar);
        }
        f fVarL0 = fVar.l0(j4, kVar);
        com.google.gson.internal.c.v(fVarL0, "localDateTime");
        com.google.gson.internal.c.v(qVar, "offset");
        com.google.gson.internal.c.v(pVar, "zone");
        return v0(fVarL0.m0(qVar), fVarL0.f44105d.f44113e, pVar);
    }

    @Override // na.e
    /* renamed from: z0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final s r0(long j4, qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return (s) hVar.adjustInto(this, j4);
        }
        qa.a aVar = (qa.a) hVar;
        int i = a.f44158a[aVar.ordinal()];
        f fVar = this.f44155c;
        p pVar = this.f44157e;
        if (i == 1) {
            return v0(j4, fVar.f44105d.f44113e, pVar);
        }
        q qVar = this.f44156d;
        if (i != 2) {
            return x0(fVar.p0(j4, hVar), pVar, qVar);
        }
        q qVarJ = q.j(aVar.checkValidIntValue(j4));
        return (qVarJ.equals(qVar) || !pVar.c().d(fVar, qVarJ)) ? this : new s(fVar, pVar, qVarJ);
    }
}
