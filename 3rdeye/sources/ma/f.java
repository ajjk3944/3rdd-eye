package ma;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* compiled from: LocalDateTime.java */
/* loaded from: classes3.dex */
public final class f extends na.c<e> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final f f44102e = u0(e.f44095f, g.f44107f);

    /* renamed from: f, reason: collision with root package name */
    public static final f f44103f = u0(e.f44096g, g.f44108g);

    /* renamed from: c, reason: collision with root package name */
    public final e f44104c;

    /* renamed from: d, reason: collision with root package name */
    public final g f44105d;

    /* compiled from: LocalDateTime.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44106a;

        static {
            int[] iArr = new int[qa.b.values().length];
            f44106a = iArr;
            try {
                iArr[qa.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44106a[qa.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44106a[qa.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44106a[qa.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44106a[qa.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44106a[qa.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44106a[qa.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public f(e eVar, g gVar) {
        this.f44104c = eVar;
        this.f44105d = gVar;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static f s0(qa.e eVar) {
        if (eVar instanceof f) {
            return (f) eVar;
        }
        if (eVar instanceof s) {
            return ((s) eVar).f44155c;
        }
        try {
            return new f(e.t0(eVar), g.k0(eVar));
        } catch (ma.a unused) {
            throw new ma.a("Unable to obtain LocalDateTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    public static f u0(e eVar, g gVar) {
        com.google.gson.internal.c.v(eVar, "date");
        com.google.gson.internal.c.v(gVar, "time");
        return new f(eVar, gVar);
    }

    public static f v0(long j4, int i, q qVar) {
        com.google.gson.internal.c.v(qVar, "offset");
        long j10 = j4 + qVar.f44150c;
        long jO = com.google.gson.internal.c.o(j10, 86400L);
        int iP = com.google.gson.internal.c.p(86400, j10);
        e eVarD0 = e.D0(jO);
        long j11 = iP;
        g gVar = g.f44107f;
        qa.a.SECOND_OF_DAY.checkValidValue(j11);
        qa.a.NANO_OF_SECOND.checkValidValue(i);
        int i10 = (int) (j11 / 3600);
        long j12 = j11 - (i10 * 3600);
        return new f(eVarD0, g.j0(i10, (int) (j12 / 60), (int) (j12 - (r7 * 60)), i));
    }

    private Object writeReplace() {
        return new m((byte) 4, this);
    }

    public final f A0(e eVar, g gVar) {
        return (this.f44104c == eVar && this.f44105d == gVar) ? this : new f(eVar, gVar);
    }

    @Override // na.c, qa.d
    /* renamed from: e */
    public final qa.d s0(e eVar) {
        return A0(eVar, this.f44105d);
    }

    @Override // na.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f44104c.equals(fVar.f44104c) && this.f44105d.equals(fVar.f44105d)) {
                return true;
            }
        }
        return false;
    }

    @Override // pa.a, I9.g, qa.e
    public final int get(qa.h hVar) {
        return hVar instanceof qa.a ? hVar.isTimeBased() ? this.f44105d.get(hVar) : this.f44104c.get(hVar) : super.get(hVar);
    }

    @Override // pa.a, qa.e
    public final long getLong(qa.h hVar) {
        return hVar instanceof qa.a ? hVar.isTimeBased() ? this.f44105d.getLong(hVar) : this.f44104c.getLong(hVar) : hVar.getFrom(this);
    }

    @Override // na.c
    public final int hashCode() {
        return this.f44104c.hashCode() ^ this.f44105d.hashCode();
    }

    @Override // na.c
    public final na.e i0(q qVar) {
        return s.x0(this, qVar, null);
    }

    @Override // pa.a, qa.e
    public final boolean isSupported(qa.h hVar) {
        return hVar instanceof qa.a ? hVar.isDateBased() || hVar.isTimeBased() : hVar != null && hVar.isSupportedBy(this);
    }

    @Override // na.c, java.lang.Comparable
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final int compareTo(na.c<?> cVar) {
        return cVar instanceof f ? r0((f) cVar) : super.compareTo(cVar);
    }

    @Override // na.c
    /* renamed from: k0 */
    public final na.c u(long j4, qa.b bVar) {
        return j4 == Long.MIN_VALUE ? l0(Long.MAX_VALUE, bVar).l0(1L, bVar) : l0(-j4, bVar);
    }

    @Override // na.c
    public final na.b n0() {
        return this.f44104c;
    }

    @Override // na.c
    public final g o0() {
        return this.f44105d;
    }

    @Override // na.c
    /* renamed from: q0 */
    public final na.c s0(e eVar) {
        return A0(eVar, this.f44105d);
    }

    @Override // na.c, pa.a, I9.g, qa.e
    public final <R> R query(qa.j<R> jVar) {
        return jVar == qa.i.f45480f ? (R) this.f44104c : (R) super.query(jVar);
    }

    public final int r0(f fVar) {
        int iR0 = this.f44104c.r0(fVar.f44104c);
        return iR0 == 0 ? this.f44105d.compareTo(fVar.f44105d) : iR0;
    }

    @Override // I9.g, qa.e
    public final qa.m range(qa.h hVar) {
        return hVar instanceof qa.a ? hVar.isTimeBased() ? this.f44105d.range(hVar) : this.f44104c.range(hVar) : hVar.rangeRefinedBy(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0102  */
    @Override // qa.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long t(qa.d r12, qa.b r13) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.f.t(qa.d, qa.b):long");
    }

    public final boolean t0(f fVar) {
        if (androidx.work.s.n(fVar)) {
            return r0(fVar) < 0;
        }
        long jO0 = this.f44104c.o0();
        long jO02 = fVar.f44104c.o0();
        if (jO0 >= jO02) {
            return jO0 == jO02 && this.f44105d.t0() < fVar.f44105d.t0();
        }
        return true;
    }

    @Override // na.c
    public final String toString() {
        return this.f44104c.toString() + 'T' + this.f44105d.toString();
    }

    @Override // na.c, pa.a, qa.d
    public final qa.d u(long j4, qa.k kVar) {
        qa.b bVar = (qa.b) kVar;
        return j4 == Long.MIN_VALUE ? l0(Long.MAX_VALUE, bVar).l0(1L, bVar) : l0(-j4, bVar);
    }

    @Override // na.c, qa.d
    /* renamed from: w0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final f q(long j4, qa.k kVar) {
        if (!(kVar instanceof qa.b)) {
            return (f) kVar.addTo(this, j4);
        }
        int i = a.f44106a[((qa.b) kVar).ordinal()];
        g gVar = this.f44105d;
        e eVar = this.f44104c;
        switch (i) {
            case 1:
                return y0(this.f44104c, 0L, 0L, 0L, j4);
            case 2:
                f fVarA0 = A0(eVar.F0(j4 / 86400000000L), gVar);
                return fVarA0.y0(fVarA0.f44104c, 0L, 0L, 0L, (j4 % 86400000000L) * 1000);
            case 3:
                f fVarA02 = A0(eVar.F0(j4 / com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS), gVar);
                return fVarA02.y0(fVarA02.f44104c, 0L, 0L, 0L, (j4 % com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS) * 1000000);
            case 4:
                return x0(j4);
            case 5:
                return y0(this.f44104c, 0L, j4, 0L, 0L);
            case 6:
                return y0(this.f44104c, j4, 0L, 0L, 0L);
            case 7:
                f fVarA03 = A0(eVar.F0(j4 / 256), gVar);
                return fVarA03.y0(fVarA03.f44104c, (j4 % 256) * 12, 0L, 0L, 0L);
            default:
                return A0(eVar.n0(j4, kVar), gVar);
        }
    }

    public final f x0(long j4) {
        return y0(this.f44104c, 0L, 0L, j4, 0L);
    }

    public final f y0(e eVar, long j4, long j10, long j11, long j12) {
        long j13 = j4 | j10 | j11 | j12;
        g gVarM0 = this.f44105d;
        if (j13 == 0) {
            return A0(eVar, gVarM0);
        }
        long j14 = j4 / 24;
        long j15 = j14 + (j10 / 1440) + (j11 / 86400) + (j12 / 86400000000000L);
        long j16 = 1;
        long j17 = ((j4 % 24) * 3600000000000L) + ((j10 % 1440) * 60000000000L) + ((j11 % 86400) * 1000000000) + (j12 % 86400000000000L);
        long jT0 = gVarM0.t0();
        long j18 = (j17 * j16) + jT0;
        long jO = com.google.gson.internal.c.o(j18, 86400000000000L) + (j15 * j16);
        long j19 = ((j18 % 86400000000000L) + 86400000000000L) % 86400000000000L;
        if (j19 != jT0) {
            gVarM0 = g.m0(j19);
        }
        return A0(eVar.F0(jO), gVarM0);
    }

    @Override // na.c
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public final f r0(long j4, qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return (f) hVar.adjustInto(this, j4);
        }
        boolean zIsTimeBased = hVar.isTimeBased();
        g gVar = this.f44105d;
        e eVar = this.f44104c;
        return zIsTimeBased ? A0(eVar, gVar.p0(j4, hVar)) : A0(eVar.D(j4, hVar), gVar);
    }
}
