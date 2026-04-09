package na;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;

/* compiled from: JapaneseDate.java */
/* loaded from: classes3.dex */
public final class o extends na.a<o> {

    /* renamed from: f, reason: collision with root package name */
    public static final ma.e f44470f = ma.e.C0(1873, 1, 1);

    /* renamed from: c, reason: collision with root package name */
    public final ma.e f44471c;

    /* renamed from: d, reason: collision with root package name */
    public transient p f44472d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f44473e;

    /* compiled from: JapaneseDate.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44474a;

        static {
            int[] iArr = new int[qa.a.values().length];
            f44474a = iArr;
            try {
                iArr[qa.a.DAY_OF_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44474a[qa.a.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44474a[qa.a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44474a[qa.a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44474a[qa.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44474a[qa.a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44474a[qa.a.ERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public o(ma.e eVar) {
        if (eVar.y0(f44470f)) {
            throw new ma.a("Minimum supported date is January 1st Meiji 6");
        }
        this.f44472d = p.j0(eVar);
        this.f44473e = eVar.f44097c - (r0.f44478d.f44097c - 1);
        this.f44471c = eVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        ma.e eVar = this.f44471c;
        this.f44472d = p.j0(eVar);
        this.f44473e = eVar.f44097c - (r0.f44478d.f44097c - 1);
    }

    private Object writeReplace() {
        return new t((byte) 1, this);
    }

    @Override // na.b, qa.d
    /* renamed from: e */
    public final qa.d s0(ma.e eVar) {
        return (o) super.s0(eVar);
    }

    @Override // na.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return this.f44471c.equals(((o) obj).f44471c);
        }
        return false;
    }

    @Override // pa.a, qa.e
    public final long getLong(qa.h hVar) {
        int iW0;
        if (!(hVar instanceof qa.a)) {
            return hVar.getFrom(this);
        }
        int i = a.f44474a[((qa.a) hVar).ordinal()];
        ma.e eVar = this.f44471c;
        switch (i) {
            case 1:
                if (this.f44473e != 1) {
                    iW0 = eVar.w0();
                    break;
                } else {
                    iW0 = (eVar.w0() - this.f44472d.f44478d.w0()) + 1;
                    break;
                }
            case 2:
                iW0 = this.f44473e;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
            case 7:
                return this.f44472d.f44477c;
            default:
                return eVar.getLong(hVar);
        }
        return iW0;
    }

    @Override // na.b
    public final int hashCode() {
        n.f44468e.getClass();
        return this.f44471c.hashCode() ^ (-688086063);
    }

    @Override // na.a, na.b
    public final c<o> i0(ma.g gVar) {
        return new d(this, gVar);
    }

    @Override // na.b, pa.a, qa.e
    public final boolean isSupported(qa.h hVar) {
        if (hVar == qa.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || hVar == qa.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || hVar == qa.a.ALIGNED_WEEK_OF_MONTH || hVar == qa.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return super.isSupported(hVar);
    }

    @Override // na.b
    public final g k0() {
        return n.f44468e;
    }

    @Override // na.b
    public final h l0() {
        return this.f44472d;
    }

    @Override // na.b
    /* renamed from: m0 */
    public final b u(long j4, qa.k kVar) {
        return (o) super.u(j4, kVar);
    }

    @Override // na.a, na.b
    /* renamed from: n0 */
    public final b q(long j4, qa.k kVar) {
        return (o) super.q(j4, kVar);
    }

    @Override // na.b
    public final long o0() {
        return this.f44471c.o0();
    }

    @Override // na.a, na.b, qa.d
    public final qa.d q(long j4, qa.k kVar) {
        return (o) super.q(j4, kVar);
    }

    @Override // na.b
    /* renamed from: q0 */
    public final b s0(qa.f fVar) {
        return (o) super.s0(fVar);
    }

    @Override // na.a
    /* renamed from: r0 */
    public final na.a q(long j4, qa.k kVar) {
        return (o) super.q(j4, kVar);
    }

    @Override // I9.g, qa.e
    public final qa.m range(qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return hVar.rangeRefinedBy(this);
        }
        if (!isSupported(hVar)) {
            throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
        }
        qa.a aVar = (qa.a) hVar;
        int i = a.f44474a[aVar.ordinal()];
        return i != 1 ? i != 2 ? n.f44468e.m(aVar) : v0(1) : v0(6);
    }

    @Override // na.a
    public final na.a s0(long j4) {
        return x0(this.f44471c.F0(j4));
    }

    @Override // na.a
    public final na.a t0(long j4) {
        return x0(this.f44471c.G0(j4));
    }

    @Override // na.b, pa.a, qa.d
    public final qa.d u(long j4, qa.k kVar) {
        return (o) super.u(j4, kVar);
    }

    @Override // na.a
    public final na.a u0(long j4) {
        return x0(this.f44471c.I0(j4));
    }

    public final qa.m v0(int i) {
        Calendar calendar = Calendar.getInstance(n.f44467d);
        calendar.set(0, this.f44472d.f44477c + 2);
        calendar.set(this.f44473e, r2.f44098d - 1, this.f44471c.f44099e);
        return qa.m.c(calendar.getActualMinimum(i), calendar.getActualMaximum(i));
    }

    @Override // na.b
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public final o r0(long j4, qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return (o) hVar.adjustInto(this, j4);
        }
        qa.a aVar = (qa.a) hVar;
        if (getLong(aVar) == j4) {
            return this;
        }
        int[] iArr = a.f44474a;
        int i = iArr[aVar.ordinal()];
        ma.e eVar = this.f44471c;
        if (i == 1 || i == 2 || i == 7) {
            int iA = n.f44468e.m(aVar).a(j4, aVar);
            int i10 = iArr[aVar.ordinal()];
            if (i10 == 1) {
                return x0(eVar.F0(iA - (this.f44473e == 1 ? (eVar.w0() - this.f44472d.f44478d.w0()) + 1 : eVar.w0())));
            }
            if (i10 == 2) {
                return y0(this.f44472d, iA);
            }
            if (i10 == 7) {
                return y0(p.k0(iA), this.f44473e);
            }
        }
        return x0(eVar.D(j4, hVar));
    }

    public final o x0(ma.e eVar) {
        return eVar.equals(this.f44471c) ? this : new o(eVar);
    }

    public final o y0(p pVar, int i) {
        n.f44468e.getClass();
        if (pVar == null) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i10 = (pVar.f44478d.f44097c + i) - 1;
        qa.m.c(1L, (pVar.i0().f44097c - pVar.f44478d.f44097c) + 1).b(i, qa.a.YEAR_OF_ERA);
        return x0(this.f44471c.N0(i10));
    }
}
