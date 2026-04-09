package ma;

import g0.C4356c;
import java.util.Locale;

/* compiled from: DayOfWeek.java */
/* loaded from: classes3.dex */
public enum b implements qa.e, qa.f {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static final qa.j<b> FROM = new a();
    private static final b[] ENUMS = values();

    /* compiled from: DayOfWeek.java */
    public class a implements qa.j<b> {
        @Override // qa.j
        public final b a(qa.e eVar) {
            return b.from(eVar);
        }
    }

    public static b from(qa.e eVar) {
        if (eVar instanceof b) {
            return (b) eVar;
        }
        try {
            return of(eVar.get(qa.a.DAY_OF_WEEK));
        } catch (ma.a e4) {
            throw new ma.a("Unable to obtain DayOfWeek from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName(), e4);
        }
    }

    public static b of(int i) {
        if (i < 1 || i > 7) {
            throw new ma.a(C4356c.h(i, "Invalid value for DayOfWeek: "));
        }
        return ENUMS[i - 1];
    }

    @Override // qa.f
    public qa.d adjustInto(qa.d dVar) {
        return dVar.r0(getValue(), qa.a.DAY_OF_WEEK);
    }

    @Override // qa.e
    public int get(qa.h hVar) {
        return hVar == qa.a.DAY_OF_WEEK ? getValue() : range(hVar).a(getLong(hVar), hVar);
    }

    public String getDisplayName(oa.m mVar, Locale locale) {
        oa.b bVar = new oa.b();
        bVar.f(qa.a.DAY_OF_WEEK, mVar);
        return bVar.l(locale).a(this);
    }

    @Override // qa.e
    public long getLong(qa.h hVar) {
        if (hVar == qa.a.DAY_OF_WEEK) {
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
        return hVar instanceof qa.a ? hVar == qa.a.DAY_OF_WEEK : hVar != null && hVar.isSupportedBy(this);
    }

    public b minus(long j4) {
        return plus(-(j4 % 7));
    }

    public b plus(long j4) {
        return ENUMS[((((int) (j4 % 7)) + 7) + ordinal()) % 7];
    }

    @Override // qa.e
    public <R> R query(qa.j<R> jVar) {
        if (jVar == qa.i.f45477c) {
            return (R) qa.b.DAYS;
        }
        if (jVar == qa.i.f45480f || jVar == qa.i.f45481g || jVar == qa.i.f45476b || jVar == qa.i.f45478d || jVar == qa.i.f45475a || jVar == qa.i.f45479e) {
            return null;
        }
        return jVar.a(this);
    }

    @Override // qa.e
    public qa.m range(qa.h hVar) {
        if (hVar == qa.a.DAY_OF_WEEK) {
            return hVar.range();
        }
        if (hVar instanceof qa.a) {
            throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
        }
        return hVar.rangeRefinedBy(this);
    }
}
