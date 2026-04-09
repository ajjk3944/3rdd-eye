package j$.time.temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class h implements q {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f26208a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h[] f26209b;

    @Override // j$.time.temporal.q
    public final boolean isDateBased() {
        return true;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f26209b.clone();
    }

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.q
            public final u k() {
                return u.f(90L, 92L);
            }

            @Override // j$.time.temporal.q
            public final boolean i(n nVar) {
                if (!nVar.e(a.DAY_OF_YEAR) || !nVar.e(a.MONTH_OF_YEAR) || !nVar.e(a.YEAR)) {
                    return false;
                }
                h hVar2 = j.f26212a;
                return j$.com.android.tools.r8.a.v(nVar).equals(j$.time.chrono.t.f26098c);
            }

            @Override // j$.time.temporal.q
            public final u j(n nVar) {
                if (!i(nVar)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                long jW = nVar.w(h.QUARTER_OF_YEAR);
                if (jW == 1) {
                    long jW2 = nVar.w(a.YEAR);
                    j$.time.chrono.t.f26098c.getClass();
                    return j$.time.chrono.t.j(jW2) ? u.e(1L, 91L) : u.e(1L, 90L);
                }
                if (jW == 2) {
                    return u.e(1L, 91L);
                }
                if (jW == 3 || jW == 4) {
                    return u.e(1L, 92L);
                }
                return k();
            }

            @Override // j$.time.temporal.q
            public final long l(n nVar) {
                if (!i(nVar)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                int i4 = nVar.i(a.DAY_OF_YEAR);
                int i10 = nVar.i(a.MONTH_OF_YEAR);
                long jW = nVar.w(a.YEAR);
                int i11 = (i10 - 1) / 3;
                j$.time.chrono.t.f26098c.getClass();
                return i4 - h.f26208a[i11 + (j$.time.chrono.t.j(jW) ? 4 : 0)];
            }

            @Override // j$.time.temporal.q
            public final m o(m mVar, long j) {
                long jL = l(mVar);
                k().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.c((j - jL) + mVar.w(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.q
            public final u k() {
                return u.e(1L, 4L);
            }

            @Override // j$.time.temporal.q
            public final boolean i(n nVar) {
                if (!nVar.e(a.MONTH_OF_YEAR)) {
                    return false;
                }
                h hVar3 = j.f26212a;
                return j$.com.android.tools.r8.a.v(nVar).equals(j$.time.chrono.t.f26098c);
            }

            @Override // j$.time.temporal.q
            public final long l(n nVar) {
                if (!i(nVar)) {
                    throw new t("Unsupported field: QuarterOfYear");
                }
                return (nVar.w(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.q
            public final u j(n nVar) {
                if (!i(nVar)) {
                    throw new t("Unsupported field: QuarterOfYear");
                }
                return k();
            }

            @Override // j$.time.temporal.q
            public final m o(m mVar, long j) {
                long jL = l(mVar);
                k().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.c(((j - jL) * 3) + mVar.w(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.q
            public final u k() {
                return u.f(52L, 53L);
            }

            @Override // j$.time.temporal.q
            public final boolean i(n nVar) {
                if (!nVar.e(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar4 = j.f26212a;
                return j$.com.android.tools.r8.a.v(nVar).equals(j$.time.chrono.t.f26098c);
            }

            @Override // j$.time.temporal.q
            public final u j(n nVar) {
                if (!i(nVar)) {
                    throw new t("Unsupported field: WeekOfWeekBasedYear");
                }
                return u.e(1L, h.C(h.w(j$.time.f.E(nVar))));
            }

            @Override // j$.time.temporal.q
            public final long l(n nVar) {
                if (!i(nVar)) {
                    throw new t("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.s(j$.time.f.E(nVar));
            }

            @Override // j$.time.temporal.q
            public final m o(m mVar, long j) {
                k().b(j, this);
                return mVar.d(j$.com.android.tools.r8.a.C(j, l(mVar)), b.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.q
            public final u k() {
                return a.YEAR.f26204b;
            }

            @Override // j$.time.temporal.q
            public final boolean i(n nVar) {
                if (!nVar.e(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar5 = j.f26212a;
                return j$.com.android.tools.r8.a.v(nVar).equals(j$.time.chrono.t.f26098c);
            }

            @Override // j$.time.temporal.q
            public final long l(n nVar) {
                if (i(nVar)) {
                    return h.w(j$.time.f.E(nVar));
                }
                throw new t("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final u j(n nVar) {
                if (!i(nVar)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                return k();
            }

            @Override // j$.time.temporal.q
            public final m o(m mVar, long j) {
                if (!i(mVar)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.f26204b.a(j, h.WEEK_BASED_YEAR);
                j$.time.f fVarE = j$.time.f.E(mVar);
                int i4 = fVarE.i(a.DAY_OF_WEEK);
                int iS = h.s(fVarE);
                if (iS == 53 && h.C(iA) == 52) {
                    iS = 52;
                }
                return mVar.j(j$.time.f.K(iA, 1, 4).N(((iS - 1) * 7) + (i4 - r6.i(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        f26209b = new h[]{hVar, hVar2, hVar3, hVar4};
        f26208a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int C(int i4) {
        j$.time.f fVarK = j$.time.f.K(i4, 1, 1);
        if (fVarK.G() != j$.time.c.THURSDAY) {
            return (fVarK.G() == j$.time.c.WEDNESDAY && fVarK.I()) ? 53 : 52;
        }
        return 53;
    }

    public static int s(j$.time.f fVar) {
        int iOrdinal = fVar.G().ordinal();
        int iH = fVar.H() - 1;
        int i4 = (3 - iOrdinal) + iH;
        int i10 = i4 - ((i4 / 7) * 7);
        int i11 = i10 - 3;
        if (i11 < -3) {
            i11 = i10 + 4;
        }
        if (iH < i11) {
            return (int) u.e(1L, C(w(fVar.T(180).P(-1L)))).f26231d;
        }
        int i12 = ((iH - i11) / 7) + 1;
        if (i12 != 53 || i11 == -3 || (i11 == -2 && fVar.I())) {
            return i12;
        }
        return 1;
    }

    public static int w(j$.time.f fVar) {
        int i4 = fVar.f26118a;
        int iH = fVar.H();
        if (iH <= 3) {
            return iH - fVar.G().ordinal() < -2 ? i4 - 1 : i4;
        }
        if (iH >= 363) {
            return ((iH - 363) - (fVar.I() ? 1 : 0)) - fVar.G().ordinal() >= 0 ? i4 + 1 : i4;
        }
        return i4;
    }
}
