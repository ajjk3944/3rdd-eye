package na;

import java.io.Serializable;
import na.b;

/* compiled from: ChronoLocalDateTimeImpl.java */
/* loaded from: classes3.dex */
public final class d<D extends b> extends c<D> implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final D f44425c;

    /* renamed from: d, reason: collision with root package name */
    public final ma.g f44426d;

    /* compiled from: ChronoLocalDateTimeImpl.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44427a;

        static {
            int[] iArr = new int[qa.b.values().length];
            f44427a = iArr;
            try {
                iArr[qa.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44427a[qa.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44427a[qa.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44427a[qa.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44427a[qa.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44427a[qa.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44427a[qa.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public d(D d10, ma.g gVar) {
        com.google.gson.internal.c.v(gVar, "time");
        this.f44425c = d10;
        this.f44426d = gVar;
    }

    private Object writeReplace() {
        return new t((byte) 12, this);
    }

    @Override // na.c, qa.d
    /* renamed from: e */
    public final qa.d s0(ma.e eVar) {
        return u0(eVar, this.f44426d);
    }

    @Override // pa.a, I9.g, qa.e
    public final int get(qa.h hVar) {
        return hVar instanceof qa.a ? hVar.isTimeBased() ? this.f44426d.get(hVar) : this.f44425c.get(hVar) : range(hVar).a(getLong(hVar), hVar);
    }

    @Override // pa.a, qa.e
    public final long getLong(qa.h hVar) {
        return hVar instanceof qa.a ? hVar.isTimeBased() ? this.f44426d.getLong(hVar) : this.f44425c.getLong(hVar) : hVar.getFrom(this);
    }

    @Override // na.c
    public final e i0(ma.q qVar) {
        return f.v0(qVar, null, this);
    }

    @Override // pa.a, qa.e
    public final boolean isSupported(qa.h hVar) {
        return hVar instanceof qa.a ? hVar.isDateBased() || hVar.isTimeBased() : hVar != null && hVar.isSupportedBy(this);
    }

    @Override // na.c
    public final D n0() {
        return this.f44425c;
    }

    @Override // na.c
    public final ma.g o0() {
        return this.f44426d;
    }

    @Override // na.c
    /* renamed from: q0 */
    public final c s0(ma.e eVar) {
        return u0(eVar, this.f44426d);
    }

    @Override // na.c, qa.d
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public final d<D> q(long j4, qa.k kVar) {
        boolean z10 = kVar instanceof qa.b;
        D d10 = this.f44425c;
        if (!z10) {
            return d10.k0().c(kVar.addTo(this, j4));
        }
        int i = a.f44427a[((qa.b) kVar).ordinal()];
        ma.g gVar = this.f44426d;
        switch (i) {
            case 1:
                return s0(this.f44425c, 0L, 0L, 0L, j4);
            case 2:
                d<D> dVarU0 = u0(d10.q(j4 / 86400000000L, qa.b.DAYS), gVar);
                return dVarU0.s0(dVarU0.f44425c, 0L, 0L, 0L, (j4 % 86400000000L) * 1000);
            case 3:
                d<D> dVarU02 = u0(d10.q(j4 / com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS, qa.b.DAYS), gVar);
                return dVarU02.s0(dVarU02.f44425c, 0L, 0L, 0L, (j4 % com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS) * 1000000);
            case 4:
                return s0(this.f44425c, 0L, 0L, j4, 0L);
            case 5:
                return s0(this.f44425c, 0L, j4, 0L, 0L);
            case 6:
                return s0(this.f44425c, j4, 0L, 0L, 0L);
            case 7:
                d<D> dVarU03 = u0(d10.q(j4 / 256, qa.b.DAYS), gVar);
                return dVarU03.s0(dVarU03.f44425c, (j4 % 256) * 12, 0L, 0L, 0L);
            default:
                return u0(d10.q(j4, kVar), gVar);
        }
    }

    @Override // I9.g, qa.e
    public final qa.m range(qa.h hVar) {
        if (hVar instanceof qa.a) {
            return (hVar.isTimeBased() ? this.f44426d : this.f44425c).range(hVar);
        }
        return hVar.rangeRefinedBy(this);
    }

    public final d<D> s0(D d10, long j4, long j10, long j11, long j12) {
        long j13 = j4 | j10 | j11 | j12;
        ma.g gVarM0 = this.f44426d;
        if (j13 == 0) {
            return u0(d10, gVarM0);
        }
        long j14 = j10 / 1440;
        long j15 = j4 / 24;
        long j16 = (j10 % 1440) * 60000000000L;
        long j17 = ((j4 % 24) * 3600000000000L) + j16 + ((j11 % 86400) * 1000000000) + (j12 % 86400000000000L);
        long jT0 = gVarM0.t0();
        long j18 = j17 + jT0;
        long jO = com.google.gson.internal.c.o(j18, 86400000000000L) + j15 + j14 + (j11 / 86400) + (j12 / 86400000000000L);
        long j19 = ((j18 % 86400000000000L) + 86400000000000L) % 86400000000000L;
        if (j19 != jT0) {
            gVarM0 = ma.g.m0(j19);
        }
        return u0(d10.q(jO, qa.b.DAYS), gVarM0);
    }

    @Override // qa.d
    public final long t(qa.d dVar, qa.b bVar) {
        D d10 = this.f44425c;
        c cVarI = d10.k0().i(dVar);
        if (!androidx.work.s.n(bVar)) {
            return bVar.between(this, cVarI);
        }
        boolean zIsTimeBased = bVar.isTimeBased();
        ma.g gVar = this.f44426d;
        if (!zIsTimeBased) {
            b bVarN0 = cVarI.n0();
            if (cVarI.o0().compareTo(gVar) < 0) {
                bVarN0 = bVarN0.u(1L, qa.b.DAYS);
            }
            return d10.t(bVarN0, bVar);
        }
        qa.a aVar = qa.a.EPOCH_DAY;
        long jE = cVarI.getLong(aVar) - d10.getLong(aVar);
        switch (a.f44427a[bVar.ordinal()]) {
            case 1:
                jE = com.google.gson.internal.c.E(jE, 86400000000000L);
                break;
            case 2:
                jE = com.google.gson.internal.c.E(jE, 86400000000L);
                break;
            case 3:
                jE = com.google.gson.internal.c.E(jE, com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS);
                break;
            case 4:
                jE = com.google.gson.internal.c.D(86400, jE);
                break;
            case 5:
                jE = com.google.gson.internal.c.D(1440, jE);
                break;
            case 6:
                jE = com.google.gson.internal.c.D(24, jE);
                break;
            case 7:
                jE = com.google.gson.internal.c.D(2, jE);
                break;
        }
        return com.google.gson.internal.c.B(jE, gVar.t(cVarI.o0(), bVar));
    }

    @Override // na.c
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public final d r0(long j4, qa.h hVar) {
        boolean z10 = hVar instanceof qa.a;
        D d10 = this.f44425c;
        if (!z10) {
            return d10.k0().c(hVar.adjustInto(this, j4));
        }
        boolean zIsTimeBased = hVar.isTimeBased();
        ma.g gVar = this.f44426d;
        return zIsTimeBased ? u0(d10, gVar.p0(j4, hVar)) : u0(d10.r0(j4, hVar), gVar);
    }

    public final d<D> u0(qa.d dVar, ma.g gVar) {
        D d10 = this.f44425c;
        return (d10 == dVar && this.f44426d == gVar) ? this : new d<>(d10.k0().b(dVar), gVar);
    }
}
