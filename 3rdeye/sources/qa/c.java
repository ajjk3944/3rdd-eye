package qa;

import g0.C4356c;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;
import java.util.Map;

/* compiled from: IsoFields.java */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f45467a = b.QUARTER_OF_YEAR;

    /* renamed from: b, reason: collision with root package name */
    public static final b f45468b = b.WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: c, reason: collision with root package name */
    public static final b f45469c = b.WEEK_BASED_YEAR;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0519c f45470d = EnumC0519c.WEEK_BASED_YEARS;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0519c f45471e = EnumC0519c.QUARTER_YEARS;

    /* compiled from: IsoFields.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45472a;

        static {
            int[] iArr = new int[EnumC0519c.values().length];
            f45472a = iArr;
            try {
                iArr[EnumC0519c.WEEK_BASED_YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45472a[EnumC0519c.QUARTER_YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IsoFields.java */
    public static abstract class b implements h {
        private static final /* synthetic */ b[] $VALUES;
        public static final b DAY_OF_QUARTER;
        private static final int[] QUARTER_DAYS;
        public static final b QUARTER_OF_YEAR;
        public static final b WEEK_BASED_YEAR;
        public static final b WEEK_OF_WEEK_BASED_YEAR;

        /* compiled from: IsoFields.java */
        public enum a extends b {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // qa.c.b, qa.h
            public <R extends qa.d> R adjustInto(R r9, long j4) {
                long from = getFrom(r9);
                range().b(j4, this);
                qa.a aVar = qa.a.DAY_OF_YEAR;
                return (R) r9.r0((j4 - from) + r9.getLong(aVar), aVar);
            }

            @Override // qa.c.b
            public k getBaseUnit() {
                return qa.b.DAYS;
            }

            @Override // qa.c.b, qa.h
            public long getFrom(e eVar) {
                if (!eVar.isSupported(this)) {
                    throw new l("Unsupported field: DayOfQuarter");
                }
                int i = eVar.get(qa.a.DAY_OF_YEAR);
                int i10 = eVar.get(qa.a.MONTH_OF_YEAR);
                long j4 = eVar.getLong(qa.a.YEAR);
                int[] iArr = b.QUARTER_DAYS;
                int i11 = (i10 - 1) / 3;
                na.l.f44466d.getClass();
                return i - iArr[i11 + (na.l.m(j4) ? 4 : 0)];
            }

            @Override // qa.c.b
            public k getRangeUnit() {
                return c.f45471e;
            }

            @Override // qa.c.b, qa.h
            public boolean isSupportedBy(e eVar) {
                return eVar.isSupported(qa.a.DAY_OF_YEAR) && eVar.isSupported(qa.a.MONTH_OF_YEAR) && eVar.isSupported(qa.a.YEAR) && b.isIso(eVar);
            }

            @Override // qa.c.b, qa.h
            public m range() {
                return m.d(1L, 1L, 90L, 92L);
            }

            @Override // qa.c.b, qa.h
            public m rangeRefinedBy(e eVar) {
                if (!eVar.isSupported(this)) {
                    throw new l("Unsupported field: DayOfQuarter");
                }
                long j4 = eVar.getLong(b.QUARTER_OF_YEAR);
                if (j4 != 1) {
                    return j4 == 2 ? m.c(1L, 91L) : (j4 == 3 || j4 == 4) ? m.c(1L, 92L) : range();
                }
                long j10 = eVar.getLong(qa.a.YEAR);
                na.l.f44466d.getClass();
                return na.l.m(j10) ? m.c(1L, 91L) : m.c(1L, 90L);
            }

            @Override // qa.c.b
            public e resolve(Map<h, Long> map, e eVar, oa.j jVar) {
                ma.e eVarF0;
                qa.a aVar = qa.a.YEAR;
                Long l5 = map.get(aVar);
                h hVar = b.QUARTER_OF_YEAR;
                Long l10 = map.get(hVar);
                if (l5 == null || l10 == null) {
                    return null;
                }
                int iCheckValidIntValue = aVar.checkValidIntValue(l5.longValue());
                long jLongValue = map.get(b.DAY_OF_QUARTER).longValue();
                if (jVar == oa.j.LENIENT) {
                    eVarF0 = ma.e.C0(iCheckValidIntValue, 1, 1).G0(com.google.gson.internal.c.D(3, com.google.gson.internal.c.F(l10.longValue(), 1L))).F0(com.google.gson.internal.c.F(jLongValue, 1L));
                } else {
                    int iA = hVar.range().a(l10.longValue(), hVar);
                    if (jVar == oa.j.STRICT) {
                        int i = 91;
                        if (iA == 1) {
                            na.l.f44466d.getClass();
                            if (!na.l.m(iCheckValidIntValue)) {
                                i = 90;
                            }
                        } else if (iA != 2) {
                            i = 92;
                        }
                        m.c(1L, i).b(jLongValue, this);
                    } else {
                        range().b(jLongValue, this);
                    }
                    eVarF0 = ma.e.C0(iCheckValidIntValue, ((iA - 1) * 3) + 1, 1).F0(jLongValue - 1);
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(hVar);
                return eVarF0;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "DayOfQuarter";
            }
        }

        /* compiled from: IsoFields.java */
        /* renamed from: qa.c$b$b, reason: collision with other inner class name */
        public enum C0517b extends b {
            public C0517b(String str, int i) {
                super(str, i, null);
            }

            @Override // qa.c.b, qa.h
            public <R extends qa.d> R adjustInto(R r9, long j4) {
                long from = getFrom(r9);
                range().b(j4, this);
                qa.a aVar = qa.a.MONTH_OF_YEAR;
                return (R) r9.r0(((j4 - from) * 3) + r9.getLong(aVar), aVar);
            }

            @Override // qa.c.b
            public k getBaseUnit() {
                return c.f45471e;
            }

            @Override // qa.c.b, qa.h
            public long getFrom(e eVar) {
                if (eVar.isSupported(this)) {
                    return (eVar.getLong(qa.a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new l("Unsupported field: QuarterOfYear");
            }

            @Override // qa.c.b
            public k getRangeUnit() {
                return qa.b.YEARS;
            }

            @Override // qa.c.b, qa.h
            public boolean isSupportedBy(e eVar) {
                return eVar.isSupported(qa.a.MONTH_OF_YEAR) && b.isIso(eVar);
            }

            @Override // qa.c.b, qa.h
            public m range() {
                return m.c(1L, 4L);
            }

            @Override // qa.c.b, qa.h
            public m rangeRefinedBy(e eVar) {
                return range();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "QuarterOfYear";
            }
        }

        /* compiled from: IsoFields.java */
        /* renamed from: qa.c$b$c, reason: collision with other inner class name */
        public enum C0518c extends b {
            public C0518c(String str, int i) {
                super(str, i, null);
            }

            @Override // qa.c.b, qa.h
            public <R extends qa.d> R adjustInto(R r9, long j4) {
                range().b(j4, this);
                return (R) r9.q(com.google.gson.internal.c.F(j4, getFrom(r9)), qa.b.WEEKS);
            }

            @Override // qa.c.b
            public k getBaseUnit() {
                return qa.b.WEEKS;
            }

            @Override // qa.c.b
            public String getDisplayName(Locale locale) {
                com.google.gson.internal.c.v(locale, CommonUrlParts.LOCALE);
                return "Week";
            }

            @Override // qa.c.b, qa.h
            public long getFrom(e eVar) {
                if (eVar.isSupported(this)) {
                    return b.getWeek(ma.e.t0(eVar));
                }
                throw new l("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // qa.c.b
            public k getRangeUnit() {
                return c.f45470d;
            }

            @Override // qa.c.b, qa.h
            public boolean isSupportedBy(e eVar) {
                return eVar.isSupported(qa.a.EPOCH_DAY) && b.isIso(eVar);
            }

            @Override // qa.c.b, qa.h
            public m range() {
                return m.d(1L, 1L, 52L, 53L);
            }

            @Override // qa.c.b, qa.h
            public m rangeRefinedBy(e eVar) {
                if (eVar.isSupported(this)) {
                    return b.getWeekRange(ma.e.t0(eVar));
                }
                throw new l("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // qa.c.b
            public e resolve(Map<h, Long> map, e eVar, oa.j jVar) {
                ma.e eVarD;
                long j4;
                h hVar = b.WEEK_BASED_YEAR;
                Long l5 = map.get(hVar);
                qa.a aVar = qa.a.DAY_OF_WEEK;
                Long l10 = map.get(aVar);
                if (l5 == null || l10 == null) {
                    return null;
                }
                int iA = hVar.range().a(l5.longValue(), hVar);
                long jLongValue = map.get(b.WEEK_OF_WEEK_BASED_YEAR).longValue();
                if (jVar == oa.j.LENIENT) {
                    long jLongValue2 = l10.longValue();
                    if (jLongValue2 > 7) {
                        long j10 = jLongValue2 - 1;
                        j4 = j10 / 7;
                        jLongValue2 = (j10 % 7) + 1;
                    } else if (jLongValue2 < 1) {
                        j4 = (jLongValue2 / 7) - 1;
                        jLongValue2 = (jLongValue2 % 7) + 7;
                    } else {
                        j4 = 0;
                    }
                    eVarD = ma.e.C0(iA, 1, 4).H0(jLongValue - 1).H0(j4).D(jLongValue2, aVar);
                } else {
                    int iCheckValidIntValue = aVar.checkValidIntValue(l10.longValue());
                    if (jVar == oa.j.STRICT) {
                        b.getWeekRange(ma.e.C0(iA, 1, 4)).b(jLongValue, this);
                    } else {
                        range().b(jLongValue, this);
                    }
                    eVarD = ma.e.C0(iA, 1, 4).H0(jLongValue - 1).D(iCheckValidIntValue, aVar);
                }
                map.remove(this);
                map.remove(hVar);
                map.remove(aVar);
                return eVarD;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekOfWeekBasedYear";
            }
        }

        /* compiled from: IsoFields.java */
        public enum d extends b {
            public d(String str, int i) {
                super(str, i, null);
            }

            @Override // qa.c.b, qa.h
            public <R extends qa.d> R adjustInto(R r9, long j4) {
                if (!isSupportedBy(r9)) {
                    throw new l("Unsupported field: WeekBasedYear");
                }
                int iA = range().a(j4, b.WEEK_BASED_YEAR);
                ma.e eVarT0 = ma.e.t0(r9);
                int i = eVarT0.get(qa.a.DAY_OF_WEEK);
                int week = b.getWeek(eVarT0);
                if (week == 53 && b.getWeekRange(iA) == 52) {
                    week = 52;
                }
                return (R) r9.s0(ma.e.C0(iA, 1, 4).F0(((week - 1) * 7) + (i - r6.get(r0))));
            }

            @Override // qa.c.b
            public k getBaseUnit() {
                return c.f45470d;
            }

            @Override // qa.c.b, qa.h
            public long getFrom(e eVar) {
                if (eVar.isSupported(this)) {
                    return b.getWeekBasedYear(ma.e.t0(eVar));
                }
                throw new l("Unsupported field: WeekBasedYear");
            }

            @Override // qa.c.b
            public k getRangeUnit() {
                return qa.b.FOREVER;
            }

            @Override // qa.c.b, qa.h
            public boolean isSupportedBy(e eVar) {
                return eVar.isSupported(qa.a.EPOCH_DAY) && b.isIso(eVar);
            }

            @Override // qa.c.b, qa.h
            public m range() {
                return qa.a.YEAR.range();
            }

            @Override // qa.c.b, qa.h
            public m rangeRefinedBy(e eVar) {
                return qa.a.YEAR.range();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekBasedYear";
            }
        }

        static {
            a aVar = new a("DAY_OF_QUARTER", 0);
            DAY_OF_QUARTER = aVar;
            C0517b c0517b = new C0517b("QUARTER_OF_YEAR", 1);
            QUARTER_OF_YEAR = c0517b;
            C0518c c0518c = new C0518c("WEEK_OF_WEEK_BASED_YEAR", 2);
            WEEK_OF_WEEK_BASED_YEAR = c0518c;
            d dVar = new d("WEEK_BASED_YEAR", 3);
            WEEK_BASED_YEAR = dVar;
            $VALUES = new b[]{aVar, c0517b, c0518c, dVar};
            QUARTER_DAYS = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
        }

        private b(String str, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeek(ma.e eVar) {
            int iOrdinal = eVar.v0().ordinal();
            int iW0 = eVar.w0() - 1;
            int i = (3 - iOrdinal) + iW0;
            int i10 = i - ((i / 7) * 7);
            int i11 = i10 - 3;
            if (i11 < -3) {
                i11 = i10 + 4;
            }
            if (iW0 < i11) {
                return (int) getWeekRange(eVar.M0(180).I0(-1L)).f45485e;
            }
            int iC = C4356c.c(iW0, i11, 7, 1);
            if (iC != 53 || i11 == -3 || (i11 == -2 && eVar.z0())) {
                return iC;
            }
            return 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeekBasedYear(ma.e eVar) {
            int i = eVar.f44097c;
            int iW0 = eVar.w0();
            if (iW0 <= 3) {
                return iW0 - eVar.v0().ordinal() < -2 ? i - 1 : i;
            }
            if (iW0 >= 363) {
                return ((iW0 - 363) - (eVar.z0() ? 1 : 0)) - eVar.v0().ordinal() >= 0 ? i + 1 : i;
            }
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static m getWeekRange(ma.e eVar) {
            return m.c(1L, getWeekRange(getWeekBasedYear(eVar)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isIso(e eVar) {
            return na.g.f(eVar).equals(na.l.f44466d);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        @Override // qa.h
        public abstract /* synthetic */ qa.d adjustInto(qa.d dVar, long j4);

        public abstract /* synthetic */ k getBaseUnit();

        public String getDisplayName(Locale locale) {
            com.google.gson.internal.c.v(locale, CommonUrlParts.LOCALE);
            return toString();
        }

        @Override // qa.h
        public abstract /* synthetic */ long getFrom(e eVar);

        public abstract /* synthetic */ k getRangeUnit();

        @Override // qa.h
        public boolean isDateBased() {
            return true;
        }

        @Override // qa.h
        public abstract /* synthetic */ boolean isSupportedBy(e eVar);

        @Override // qa.h
        public boolean isTimeBased() {
            return false;
        }

        @Override // qa.h
        public abstract /* synthetic */ m range();

        @Override // qa.h
        public abstract /* synthetic */ m rangeRefinedBy(e eVar);

        public e resolve(Map<h, Long> map, e eVar, oa.j jVar) {
            return null;
        }

        public /* synthetic */ b(String str, int i, a aVar) {
            this(str, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeekRange(int i) {
            ma.e eVarC0 = ma.e.C0(i, 1, 1);
            if (eVarC0.v0() != ma.b.THURSDAY) {
                return (eVarC0.v0() == ma.b.WEDNESDAY && eVarC0.z0()) ? 53 : 52;
            }
            return 53;
        }
    }

    /* compiled from: IsoFields.java */
    /* renamed from: qa.c$c, reason: collision with other inner class name */
    public enum EnumC0519c implements k {
        WEEK_BASED_YEARS("WeekBasedYears", ma.c.a(0, 31556952)),
        QUARTER_YEARS("QuarterYears", ma.c.a(0, 7889238));

        private final ma.c duration;
        private final String name;

        EnumC0519c(String str, ma.c cVar) {
            this.name = str;
            this.duration = cVar;
        }

        @Override // qa.k
        public <R extends d> R addTo(R r9, long j4) {
            int i = a.f45472a[ordinal()];
            if (i == 1) {
                return (R) r9.r0(com.google.gson.internal.c.B(r9.get(r0), j4), c.f45469c);
            }
            if (i == 2) {
                return (R) r9.q(j4 / 256, qa.b.YEARS).q((j4 % 256) * 3, qa.b.MONTHS);
            }
            throw new IllegalStateException("Unreachable");
        }

        @Override // qa.k
        public long between(d dVar, d dVar2) {
            int i = a.f45472a[ordinal()];
            if (i == 1) {
                b bVar = c.f45469c;
                return com.google.gson.internal.c.F(dVar2.getLong(bVar), dVar.getLong(bVar));
            }
            if (i == 2) {
                return dVar.t(dVar2, qa.b.MONTHS) / 3;
            }
            throw new IllegalStateException("Unreachable");
        }

        public ma.c getDuration() {
            return this.duration;
        }

        @Override // qa.k
        public boolean isDateBased() {
            return true;
        }

        public boolean isDurationEstimated() {
            return true;
        }

        public boolean isSupportedBy(d dVar) {
            return dVar.isSupported(qa.a.EPOCH_DAY);
        }

        public boolean isTimeBased() {
            return false;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }
}
