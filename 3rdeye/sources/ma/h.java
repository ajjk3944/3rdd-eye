package ma;

import g0.C4356c;
import java.util.Locale;

/* compiled from: Month.java */
/* loaded from: classes3.dex */
public enum h implements qa.e, qa.f {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static final qa.j<h> FROM = new a();
    private static final h[] ENUMS = values();

    /* compiled from: Month.java */
    public class a implements qa.j<h> {
        @Override // qa.j
        public final h a(qa.e eVar) {
            return h.from(eVar);
        }
    }

    /* compiled from: Month.java */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44116a;

        static {
            int[] iArr = new int[h.values().length];
            f44116a = iArr;
            try {
                iArr[h.FEBRUARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44116a[h.APRIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44116a[h.JUNE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44116a[h.SEPTEMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44116a[h.NOVEMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44116a[h.JANUARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44116a[h.MARCH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44116a[h.MAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44116a[h.JULY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44116a[h.AUGUST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f44116a[h.OCTOBER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f44116a[h.DECEMBER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static h from(qa.e eVar) {
        if (eVar instanceof h) {
            return (h) eVar;
        }
        try {
            if (!na.l.f44466d.equals(na.g.f(eVar))) {
                eVar = e.t0(eVar);
            }
            return of(eVar.get(qa.a.MONTH_OF_YEAR));
        } catch (ma.a e4) {
            throw new ma.a("Unable to obtain Month from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName(), e4);
        }
    }

    public static h of(int i) {
        if (i < 1 || i > 12) {
            throw new ma.a(C4356c.h(i, "Invalid value for MonthOfYear: "));
        }
        return ENUMS[i - 1];
    }

    @Override // qa.f
    public qa.d adjustInto(qa.d dVar) {
        if (!na.g.f(dVar).equals(na.l.f44466d)) {
            throw new ma.a("Adjustment only supported on ISO date-time");
        }
        return dVar.r0(getValue(), qa.a.MONTH_OF_YEAR);
    }

    public int firstDayOfYear(boolean z10) {
        switch (b.f44116a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z10 ? 1 : 0) + 91;
            case 3:
                return (z10 ? 1 : 0) + 152;
            case 4:
                return (z10 ? 1 : 0) + 244;
            case 5:
                return (z10 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z10 ? 1 : 0) + 60;
            case 8:
                return (z10 ? 1 : 0) + 121;
            case 9:
                return (z10 ? 1 : 0) + 182;
            case 10:
                return (z10 ? 1 : 0) + 213;
            case 11:
                return (z10 ? 1 : 0) + 274;
            default:
                return (z10 ? 1 : 0) + 335;
        }
    }

    public h firstMonthOfQuarter() {
        return ENUMS[(ordinal() / 3) * 3];
    }

    @Override // qa.e
    public int get(qa.h hVar) {
        return hVar == qa.a.MONTH_OF_YEAR ? getValue() : range(hVar).a(getLong(hVar), hVar);
    }

    public String getDisplayName(oa.m mVar, Locale locale) {
        oa.b bVar = new oa.b();
        bVar.f(qa.a.MONTH_OF_YEAR, mVar);
        return bVar.l(locale).a(this);
    }

    @Override // qa.e
    public long getLong(qa.h hVar) {
        if (hVar == qa.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (hVar instanceof qa.a) {
            throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
        }
        return hVar.getFrom(this);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // qa.e
    public boolean isSupported(qa.h hVar) {
        return hVar instanceof qa.a ? hVar == qa.a.MONTH_OF_YEAR : hVar != null && hVar.isSupportedBy(this);
    }

    public int length(boolean z10) {
        int i = b.f44116a[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z10 ? 29 : 28;
    }

    public int maxLength() {
        int i = b.f44116a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    public int minLength() {
        int i = b.f44116a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 28;
    }

    public h minus(long j4) {
        return plus(-(j4 % 12));
    }

    public h plus(long j4) {
        return ENUMS[((((int) (j4 % 12)) + 12) + ordinal()) % 12];
    }

    @Override // qa.e
    public <R> R query(qa.j<R> jVar) {
        if (jVar == qa.i.f45476b) {
            return (R) na.l.f44466d;
        }
        if (jVar == qa.i.f45477c) {
            return (R) qa.b.MONTHS;
        }
        if (jVar == qa.i.f45480f || jVar == qa.i.f45481g || jVar == qa.i.f45478d || jVar == qa.i.f45475a || jVar == qa.i.f45479e) {
            return null;
        }
        return jVar.a(this);
    }

    @Override // qa.e
    public qa.m range(qa.h hVar) {
        if (hVar == qa.a.MONTH_OF_YEAR) {
            return hVar.range();
        }
        if (hVar instanceof qa.a) {
            throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
        }
        return hVar.rangeRefinedBy(this);
    }
}
