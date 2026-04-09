package na;

/* compiled from: MinguoDate.java */
/* loaded from: classes3.dex */
public final class r extends na.a<r> {

    /* renamed from: c, reason: collision with root package name */
    public final ma.e f44482c;

    /* compiled from: MinguoDate.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44483a;

        static {
            int[] iArr = new int[qa.a.values().length];
            f44483a = iArr;
            try {
                iArr[qa.a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44483a[qa.a.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44483a[qa.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44483a[qa.a.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44483a[qa.a.PROLEPTIC_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44483a[qa.a.YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44483a[qa.a.ERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public r(ma.e eVar) {
        com.google.gson.internal.c.v(eVar, "date");
        this.f44482c = eVar;
    }

    private Object writeReplace() {
        return new t((byte) 5, this);
    }

    @Override // na.b, qa.d
    /* renamed from: e */
    public final qa.d s0(ma.e eVar) {
        return (r) super.s0(eVar);
    }

    @Override // na.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f44482c.equals(((r) obj).f44482c);
        }
        return false;
    }

    @Override // pa.a, qa.e
    public final long getLong(qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return hVar.getFrom(this);
        }
        int i = a.f44483a[((qa.a) hVar).ordinal()];
        if (i == 4) {
            int iV0 = v0();
            if (iV0 < 1) {
                iV0 = 1 - iV0;
            }
            return iV0;
        }
        ma.e eVar = this.f44482c;
        if (i == 5) {
            return ((v0() * 12) + eVar.f44098d) - 1;
        }
        if (i == 6) {
            return v0();
        }
        if (i != 7) {
            return eVar.getLong(hVar);
        }
        return v0() < 1 ? 0 : 1;
    }

    @Override // na.b
    public final int hashCode() {
        q.f44480d.getClass();
        return this.f44482c.hashCode() ^ (-1990173233);
    }

    @Override // na.a, na.b
    public final c<r> i0(ma.g gVar) {
        return new d(this, gVar);
    }

    @Override // na.b
    public final g k0() {
        return q.f44480d;
    }

    @Override // na.b
    public final h l0() {
        return (s) super.l0();
    }

    @Override // na.b
    /* renamed from: m0 */
    public final b u(long j4, qa.k kVar) {
        return (r) super.u(j4, kVar);
    }

    @Override // na.a, na.b
    /* renamed from: n0 */
    public final b q(long j4, qa.k kVar) {
        return (r) super.q(j4, kVar);
    }

    @Override // na.b
    public final long o0() {
        return this.f44482c.o0();
    }

    @Override // na.a, na.b, qa.d
    public final qa.d q(long j4, qa.k kVar) {
        return (r) super.q(j4, kVar);
    }

    @Override // na.b
    /* renamed from: q0 */
    public final b s0(qa.f fVar) {
        return (r) super.s0(fVar);
    }

    @Override // na.a
    /* renamed from: r0 */
    public final na.a q(long j4, qa.k kVar) {
        return (r) super.q(j4, kVar);
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
        int i = a.f44483a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.f44482c.range(hVar);
        }
        if (i != 4) {
            return q.f44480d.m(aVar);
        }
        qa.m mVarRange = qa.a.YEAR.range();
        return qa.m.c(1L, v0() <= 0 ? (-mVarRange.f45482b) + 1912 : mVarRange.f45485e - 1911);
    }

    @Override // na.a
    public final na.a s0(long j4) {
        return x0(this.f44482c.F0(j4));
    }

    @Override // na.a
    public final na.a t0(long j4) {
        return x0(this.f44482c.G0(j4));
    }

    @Override // na.b, pa.a, qa.d
    public final qa.d u(long j4, qa.k kVar) {
        return (r) super.u(j4, kVar);
    }

    @Override // na.a
    public final na.a u0(long j4) {
        return x0(this.f44482c.I0(j4));
    }

    public final int v0() {
        return this.f44482c.f44097c - 1911;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // na.b
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final na.r r0(long r9, qa.h r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof qa.a
            if (r0 == 0) goto L97
            r0 = r11
            qa.a r0 = (qa.a) r0
            long r1 = r8.getLong(r0)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L10
            return r8
        L10:
            int[] r1 = na.r.a.f44483a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            ma.e r3 = r8.f44482c
            r4 = 7
            r5 = 6
            r6 = 4
            if (r2 == r6) goto L49
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r5) goto L49
            if (r2 == r4) goto L49
            goto L5f
        L27:
            na.q r11 = na.q.f44480d
            qa.m r11 = r11.m(r0)
            r11.b(r9, r0)
            int r11 = r8.v0()
            long r0 = (long) r11
            r4 = 12
            long r0 = r0 * r4
            short r11 = r3.f44098d
            long r4 = (long) r11
            long r0 = r0 + r4
            r4 = 1
            long r0 = r0 - r4
            long r9 = r9 - r0
            ma.e r9 = r3.G0(r9)
            na.r r9 = r8.x0(r9)
            return r9
        L49:
            na.q r2 = na.q.f44480d
            qa.m r2 = r2.m(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L82
            if (r0 == r5) goto L77
            if (r0 == r4) goto L68
        L5f:
            ma.e r9 = r3.D(r9, r11)
            na.r r9 = r8.x0(r9)
            return r9
        L68:
            int r9 = r8.v0()
            int r9 = 1912 - r9
            ma.e r9 = r3.N0(r9)
            na.r r9 = r8.x0(r9)
            return r9
        L77:
            int r2 = r2 + 1911
            ma.e r9 = r3.N0(r2)
            na.r r9 = r8.x0(r9)
            return r9
        L82:
            int r9 = r8.v0()
            r10 = 1
            if (r9 < r10) goto L8c
            int r2 = r2 + 1911
            goto L8e
        L8c:
            int r2 = 1912 - r2
        L8e:
            ma.e r9 = r3.N0(r2)
            na.r r9 = r8.x0(r9)
            return r9
        L97:
            qa.d r9 = r11.adjustInto(r8, r9)
            na.r r9 = (na.r) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: na.r.r0(long, qa.h):na.r");
    }

    public final r x0(ma.e eVar) {
        return eVar.equals(this.f44482c) ? this : new r(eVar);
    }
}
