package na;

/* compiled from: ThaiBuddhistDate.java */
/* loaded from: classes3.dex */
public final class v extends na.a<v> {

    /* renamed from: c, reason: collision with root package name */
    public final ma.e f44488c;

    /* compiled from: ThaiBuddhistDate.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44489a;

        static {
            int[] iArr = new int[qa.a.values().length];
            f44489a = iArr;
            try {
                iArr[qa.a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44489a[qa.a.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44489a[qa.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44489a[qa.a.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44489a[qa.a.PROLEPTIC_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44489a[qa.a.YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44489a[qa.a.ERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public v(ma.e eVar) {
        com.google.gson.internal.c.v(eVar, "date");
        this.f44488c = eVar;
    }

    private Object writeReplace() {
        return new t((byte) 7, this);
    }

    @Override // na.b, qa.d
    /* renamed from: e */
    public final qa.d s0(ma.e eVar) {
        return (v) super.s0(eVar);
    }

    @Override // na.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.f44488c.equals(((v) obj).f44488c);
        }
        return false;
    }

    @Override // pa.a, qa.e
    public final long getLong(qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return hVar.getFrom(this);
        }
        int i = a.f44489a[((qa.a) hVar).ordinal()];
        if (i == 4) {
            int iV0 = v0();
            if (iV0 < 1) {
                iV0 = 1 - iV0;
            }
            return iV0;
        }
        ma.e eVar = this.f44488c;
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
        u.f44486d.getClass();
        return this.f44488c.hashCode() ^ 146118545;
    }

    @Override // na.a, na.b
    public final c<v> i0(ma.g gVar) {
        return new d(this, gVar);
    }

    @Override // na.b
    public final g k0() {
        return u.f44486d;
    }

    @Override // na.b
    public final h l0() {
        return (w) super.l0();
    }

    @Override // na.b
    /* renamed from: m0 */
    public final b u(long j4, qa.k kVar) {
        return (v) super.u(j4, kVar);
    }

    @Override // na.a, na.b
    /* renamed from: n0 */
    public final b q(long j4, qa.k kVar) {
        return (v) super.q(j4, kVar);
    }

    @Override // na.b
    public final long o0() {
        return this.f44488c.o0();
    }

    @Override // na.a, na.b, qa.d
    public final qa.d q(long j4, qa.k kVar) {
        return (v) super.q(j4, kVar);
    }

    @Override // na.b
    /* renamed from: q0 */
    public final b s0(qa.f fVar) {
        return (v) super.s0(fVar);
    }

    @Override // na.a
    /* renamed from: r0 */
    public final na.a q(long j4, qa.k kVar) {
        return (v) super.q(j4, kVar);
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
        int i = a.f44489a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.f44488c.range(hVar);
        }
        if (i != 4) {
            return u.f44486d.m(aVar);
        }
        qa.m mVarRange = qa.a.YEAR.range();
        return qa.m.c(1L, v0() <= 0 ? (-(mVarRange.f45482b + 543)) + 1 : 543 + mVarRange.f45485e);
    }

    @Override // na.a
    public final na.a s0(long j4) {
        return x0(this.f44488c.F0(j4));
    }

    @Override // na.a
    public final na.a t0(long j4) {
        return x0(this.f44488c.G0(j4));
    }

    @Override // na.b, pa.a, qa.d
    public final qa.d u(long j4, qa.k kVar) {
        return (v) super.u(j4, kVar);
    }

    @Override // na.a
    public final na.a u0(long j4) {
        return x0(this.f44488c.I0(j4));
    }

    public final int v0() {
        return this.f44488c.f44097c + 543;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // na.b
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final na.v r0(long r9, qa.h r11) {
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
            int[] r1 = na.v.a.f44489a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            ma.e r3 = r8.f44488c
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
            na.u r11 = na.u.f44486d
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
            na.v r9 = r8.x0(r9)
            return r9
        L49:
            na.u r2 = na.u.f44486d
            qa.m r2 = r2.m(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L82
            if (r0 == r5) goto L77
            if (r0 == r4) goto L68
        L5f:
            ma.e r9 = r3.D(r9, r11)
            na.v r9 = r8.x0(r9)
            return r9
        L68:
            int r9 = r8.v0()
            int r9 = (-542) - r9
            ma.e r9 = r3.N0(r9)
            na.v r9 = r8.x0(r9)
            return r9
        L77:
            int r2 = r2 + (-543)
            ma.e r9 = r3.N0(r2)
            na.v r9 = r8.x0(r9)
            return r9
        L82:
            int r9 = r8.v0()
            r10 = 1
            if (r9 < r10) goto L8a
            goto L8c
        L8a:
            int r2 = 1 - r2
        L8c:
            int r2 = r2 + (-543)
            ma.e r9 = r3.N0(r2)
            na.v r9 = r8.x0(r9)
            return r9
        L97:
            qa.d r9 = r11.adjustInto(r8, r9)
            na.v r9 = (na.v) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: na.v.r0(long, qa.h):na.v");
    }

    public final v x0(ma.e eVar) {
        return eVar.equals(this.f44488c) ? this : new v(eVar);
    }
}
