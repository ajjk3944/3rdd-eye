package na;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: JapaneseChronology.java */
/* loaded from: classes3.dex */
public final class n extends g implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final Locale f44467d = new Locale("ja", "JP", "JP");

    /* renamed from: e, reason: collision with root package name */
    public static final n f44468e = new n();

    /* compiled from: JapaneseChronology.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44469a;

        static {
            int[] iArr = new int[qa.a.values().length];
            f44469a = iArr;
            try {
                iArr[qa.a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44469a[qa.a.DAY_OF_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44469a[qa.a.MICRO_OF_DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44469a[qa.a.MICRO_OF_SECOND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44469a[qa.a.HOUR_OF_DAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44469a[qa.a.HOUR_OF_AMPM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44469a[qa.a.MINUTE_OF_DAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44469a[qa.a.MINUTE_OF_HOUR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44469a[qa.a.SECOND_OF_DAY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44469a[qa.a.SECOND_OF_MINUTE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f44469a[qa.a.MILLI_OF_DAY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f44469a[qa.a.MILLI_OF_SECOND.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f44469a[qa.a.NANO_OF_DAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f44469a[qa.a.NANO_OF_SECOND.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f44469a[qa.a.CLOCK_HOUR_OF_DAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f44469a[qa.a.CLOCK_HOUR_OF_AMPM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f44469a[qa.a.EPOCH_DAY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f44469a[qa.a.PROLEPTIC_MONTH.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f44469a[qa.a.ERA.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f44469a[qa.a.YEAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f44469a[qa.a.YEAR_OF_ERA.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f44469a[qa.a.MONTH_OF_YEAR.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f44469a[qa.a.DAY_OF_YEAR.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"Unknown", "K", "M", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "S", "H"});
        map.put("ja", new String[]{"Unknown", "K", "M", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "S", "H"});
        map2.put("en", new String[]{"Unknown", "K", "M", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "S", "H"});
        map2.put("ja", new String[]{"Unknown", "慶", "明", "大", "昭", "平"});
        map3.put("en", new String[]{"Unknown", "Keio", "Meiji", "Taisho", "Showa", "Heisei"});
        map3.put("ja", new String[]{"Unknown", "慶応", "明治", "大正", "昭和", "平成"});
    }

    private Object readResolve() {
        return f44468e;
    }

    @Override // na.g
    public final b a(qa.e eVar) {
        return eVar instanceof o ? (o) eVar : new o(ma.e.t0(eVar));
    }

    @Override // na.g
    public final h e(int i) {
        return p.k0(i);
    }

    @Override // na.g
    public final String g() {
        return "japanese";
    }

    @Override // na.g
    public final String h() {
        return "Japanese";
    }

    @Override // na.g
    public final e<o> k(ma.d dVar, ma.p pVar) {
        return f.w0(this, dVar, pVar);
    }

    public final qa.m m(qa.a aVar) {
        int[] iArr = a.f44469a;
        switch (iArr[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return aVar.range();
            default:
                Calendar calendar = Calendar.getInstance(f44467d);
                int i = 0;
                switch (iArr[aVar.ordinal()]) {
                    case 19:
                        p[] pVarArrL0 = p.l0();
                        return qa.m.c(pVarArrL0[0].f44477c, pVarArrL0[pVarArrL0.length - 1].f44477c);
                    case 20:
                        p[] pVarArrL02 = p.l0();
                        return qa.m.c(o.f44470f.f44097c, pVarArrL02[pVarArrL02.length - 1].i0().f44097c);
                    case 21:
                        p[] pVarArrL03 = p.l0();
                        int i10 = (pVarArrL03[pVarArrL03.length - 1].i0().f44097c - pVarArrL03[pVarArrL03.length - 1].f44478d.f44097c) + 1;
                        int iMin = Integer.MAX_VALUE;
                        while (i < pVarArrL03.length) {
                            iMin = Math.min(iMin, (pVarArrL03[i].i0().f44097c - pVarArrL03[i].f44478d.f44097c) + 1);
                            i++;
                        }
                        return qa.m.d(1L, 6L, iMin, i10);
                    case 22:
                        return qa.m.d(calendar.getMinimum(2) + 1, calendar.getGreatestMinimum(2) + 1, calendar.getLeastMaximum(2) + 1, calendar.getMaximum(2) + 1);
                    case 23:
                        p[] pVarArrL04 = p.l0();
                        int iMin2 = 366;
                        while (i < pVarArrL04.length) {
                            iMin2 = Math.min(iMin2, ((pVarArrL04[i].f44478d.z0() ? 366 : 365) - pVarArrL04[i].f44478d.w0()) + 1);
                            i++;
                        }
                        return qa.m.d(1L, 1L, iMin2, 366L);
                    default:
                        throw new UnsupportedOperationException("Unimplementable field: " + aVar);
                }
        }
    }
}
