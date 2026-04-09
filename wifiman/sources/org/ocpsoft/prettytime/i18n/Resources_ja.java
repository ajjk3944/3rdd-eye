package org.ocpsoft.prettytime.i18n;

import Aj.f;
import Aj.g;
import java.util.ListResourceBundle;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import org.ocpsoft.prettytime.units.Decade;
import org.ocpsoft.prettytime.units.Millennium;

/* loaded from: classes2.dex */
public class Resources_ja extends ListResourceBundle implements Cj.b {

    /* renamed from: b, reason: collision with root package name */
    private static final Object[][] f57077b = {new Object[]{"CenturyPattern", "%n%u"}, new Object[]{"CenturyFuturePrefix", "今から"}, new Object[]{"CenturyFutureSuffix", "後"}, new Object[]{"CenturyPastPrefix", ""}, new Object[]{"CenturyPastSuffix", "前"}, new Object[]{"CenturySingularName", "世紀"}, new Object[]{"CenturyPluralName", "世紀"}, new Object[]{"DayPattern", "%n%u"}, new Object[]{"DayFuturePrefix", "今から"}, new Object[]{"DayFutureSuffix", "後"}, new Object[]{"DayPastPrefix", ""}, new Object[]{"DayPastSuffix", "前"}, new Object[]{"DaySingularName", "日"}, new Object[]{"DayPluralName", "日"}, new Object[]{"DecadePattern", "%n%u"}, new Object[]{"DecadeFuturePrefix", "今から"}, new Object[]{"DecadeFutureSuffix", "後"}, new Object[]{"DecadePastPrefix", ""}, new Object[]{"DecadePastSuffix", "前"}, new Object[]{"DecadeSingularName", "年"}, new Object[]{"DecadePluralName", "年"}, new Object[]{"HourPattern", "%n%u"}, new Object[]{"HourFuturePrefix", "今から"}, new Object[]{"HourFutureSuffix", "後"}, new Object[]{"HourPastPrefix", ""}, new Object[]{"HourPastSuffix", "前"}, new Object[]{"HourSingularName", "時間"}, new Object[]{"HourPluralName", "時間"}, new Object[]{"JustNowPattern", "%u"}, new Object[]{"JustNowFuturePrefix", "今から"}, new Object[]{"JustNowFutureSuffix", "すぐ"}, new Object[]{"JustNowPastPrefix", ""}, new Object[]{"JustNowPastSuffix", "たった今"}, new Object[]{"JustNowSingularName", ""}, new Object[]{"JustNowPluralName", ""}, new Object[]{"MillenniumPattern", "%n%u"}, new Object[]{"MillenniumFuturePrefix", "今から"}, new Object[]{"MillenniumFutureSuffix", "後"}, new Object[]{"MillenniumPastPrefix", ""}, new Object[]{"MillenniumPastSuffix", "前"}, new Object[]{"MillenniumSingularName", "年"}, new Object[]{"MillenniumPluralName", "年"}, new Object[]{"MillisecondPattern", "%n%u"}, new Object[]{"MillisecondFuturePrefix", "今から"}, new Object[]{"MillisecondFutureSuffix", "後"}, new Object[]{"MillisecondPastPrefix", ""}, new Object[]{"MillisecondPastSuffix", "前"}, new Object[]{"MillisecondSingularName", "ミリ秒"}, new Object[]{"MillisecondPluralName", "ミリ秒"}, new Object[]{"MinutePattern", "%n%u"}, new Object[]{"MinuteFuturePrefix", "今から"}, new Object[]{"MinuteFutureSuffix", "後"}, new Object[]{"MinutePastPrefix", ""}, new Object[]{"MinutePastSuffix", "前"}, new Object[]{"MinuteSingularName", "分"}, new Object[]{"MinutePluralName", "分"}, new Object[]{"MonthPattern", "%n%u"}, new Object[]{"MonthFuturePrefix", "今から"}, new Object[]{"MonthFutureSuffix", "後"}, new Object[]{"MonthPastPrefix", ""}, new Object[]{"MonthPastSuffix", "前"}, new Object[]{"MonthSingularName", "ヶ月"}, new Object[]{"MonthPluralName", "ヶ月"}, new Object[]{"SecondPattern", "%n%u"}, new Object[]{"SecondFuturePrefix", "今から"}, new Object[]{"SecondFutureSuffix", "後"}, new Object[]{"SecondPastPrefix", ""}, new Object[]{"SecondPastSuffix", "前"}, new Object[]{"SecondSingularName", "秒"}, new Object[]{"SecondPluralName", "秒"}, new Object[]{"WeekPattern", "%n%u"}, new Object[]{"WeekFuturePrefix", "今から"}, new Object[]{"WeekFutureSuffix", "後"}, new Object[]{"WeekPastPrefix", ""}, new Object[]{"WeekPastSuffix", "前"}, new Object[]{"WeekSingularName", "週間"}, new Object[]{"WeekPluralName", "週間"}, new Object[]{"YearPattern", "%n%u"}, new Object[]{"YearFuturePrefix", "今から"}, new Object[]{"YearFutureSuffix", "後"}, new Object[]{"YearPastPrefix", ""}, new Object[]{"YearPastSuffix", "前"}, new Object[]{"YearSingularName", "年"}, new Object[]{"YearPluralName", "年"}, new Object[]{"AbstractTimeUnitPattern", ""}, new Object[]{"AbstractTimeUnitFuturePrefix", ""}, new Object[]{"AbstractTimeUnitFutureSuffix", ""}, new Object[]{"AbstractTimeUnitPastPrefix", ""}, new Object[]{"AbstractTimeUnitPastSuffix", ""}, new Object[]{"AbstractTimeUnitSingularName", ""}, new Object[]{"AbstractTimeUnitPluralName", ""}};

    /* renamed from: a, reason: collision with root package name */
    private final Map f57078a = new ConcurrentHashMap();

    private static class JaTimeFormat implements f {

        /* renamed from: a, reason: collision with root package name */
        private String f57079a = "";

        /* renamed from: b, reason: collision with root package name */
        private String f57080b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f57081c = "";

        /* renamed from: d, reason: collision with root package name */
        private String f57082d = "";

        /* renamed from: e, reason: collision with root package name */
        private String f57083e = "";

        /* renamed from: f, reason: collision with root package name */
        private String f57084f = "";

        /* renamed from: g, reason: collision with root package name */
        private String f57085g = "";

        /* renamed from: h, reason: collision with root package name */
        private String f57086h = "";

        /* renamed from: i, reason: collision with root package name */
        private String f57087i = "";

        /* renamed from: j, reason: collision with root package name */
        private String f57088j = "";

        /* renamed from: k, reason: collision with root package name */
        private String f57089k = "";

        /* renamed from: l, reason: collision with root package name */
        private int f57090l = 50;

        public JaTimeFormat(ResourceBundle resourceBundle, g gVar) {
            t(resourceBundle.getString(k(gVar) + "Pattern"));
            m(resourceBundle.getString(k(gVar) + "FuturePrefix"));
            o(resourceBundle.getString(k(gVar) + "FutureSuffix"));
            q(resourceBundle.getString(k(gVar) + "PastPrefix"));
            s(resourceBundle.getString(k(gVar) + "PastSuffix"));
            v(resourceBundle.getString(k(gVar) + "SingularName"));
            u(resourceBundle.getString(k(gVar) + "PluralName"));
            try {
                l(resourceBundle.getString(k(gVar) + "FuturePluralName"));
            } catch (Exception unused) {
            }
            try {
                n(resourceBundle.getString(k(gVar) + "FutureSingularName"));
            } catch (Exception unused2) {
            }
            try {
                p(resourceBundle.getString(k(gVar) + "PastPluralName"));
            } catch (Exception unused3) {
            }
            try {
                r(resourceBundle.getString(k(gVar) + "PastSingularName"));
            } catch (Exception unused4) {
            }
        }

        private String c(String str, String str2, long j10) {
            return f(j10).replaceAll("%s", str).replaceAll("%n", String.valueOf(j10)).replaceAll("%u", str2);
        }

        private String d(Aj.a aVar, boolean z10) {
            String strI = i(aVar);
            String strE = e(aVar, z10);
            long jH = h(aVar, z10);
            if (aVar.a() instanceof Decade) {
                jH *= 10;
            }
            if (aVar.a() instanceof Millennium) {
                jH *= 1000;
            }
            return c(strI, strE, jH);
        }

        private String g(Aj.a aVar) {
            return (!aVar.b() || this.f57082d == null || this.f57081c.length() <= 0) ? (!aVar.e() || this.f57084f == null || this.f57083e.length() <= 0) ? this.f57080b : this.f57084f : this.f57082d;
        }

        private String i(Aj.a aVar) {
            return aVar.c() < 0 ? "-" : "";
        }

        private String j(Aj.a aVar) {
            String str;
            String str2;
            return (!aVar.b() || (str2 = this.f57081c) == null || str2.length() <= 0) ? (!aVar.e() || (str = this.f57083e) == null || str.length() <= 0) ? this.f57079a : this.f57083e : this.f57081c;
        }

        private String k(g gVar) {
            return gVar.getClass().getSimpleName();
        }

        @Override // Aj.f
        public String a(Aj.a aVar, String str) {
            StringBuilder sb2 = new StringBuilder();
            if (aVar.e()) {
                sb2.append(this.f57088j);
                sb2.append(str);
                sb2.append(this.f57089k);
            } else {
                sb2.append(this.f57086h);
                sb2.append(str);
                sb2.append(this.f57087i);
            }
            return sb2.toString().replaceAll("\\s+", " ").trim();
        }

        @Override // Aj.f
        public String b(Aj.a aVar) {
            return d(aVar, true);
        }

        protected String e(Aj.a aVar, boolean z10) {
            return (Math.abs(h(aVar, z10)) == 0 || Math.abs(h(aVar, z10)) > 1) ? g(aVar) : j(aVar);
        }

        protected String f(long j10) {
            return this.f57085g;
        }

        protected long h(Aj.a aVar, boolean z10) {
            return Math.abs(z10 ? aVar.d(this.f57090l) : aVar.c());
        }

        public JaTimeFormat l(String str) {
            this.f57082d = str;
            return this;
        }

        public JaTimeFormat m(String str) {
            this.f57086h = str.trim();
            return this;
        }

        public JaTimeFormat n(String str) {
            this.f57081c = str;
            return this;
        }

        public JaTimeFormat o(String str) {
            this.f57087i = str.trim();
            return this;
        }

        public JaTimeFormat p(String str) {
            this.f57084f = str;
            return this;
        }

        public JaTimeFormat q(String str) {
            this.f57088j = str.trim();
            return this;
        }

        public JaTimeFormat r(String str) {
            this.f57083e = str;
            return this;
        }

        public JaTimeFormat s(String str) {
            this.f57089k = str.trim();
            return this;
        }

        public JaTimeFormat t(String str) {
            this.f57085g = str;
            return this;
        }

        public String toString() {
            return "JaTimeFormat [pattern=" + this.f57085g + ", futurePrefix=" + this.f57086h + ", futureSuffix=" + this.f57087i + ", pastPrefix=" + this.f57088j + ", pastSuffix=" + this.f57089k + ", roundingTolerance=" + this.f57090l + "]";
        }

        public JaTimeFormat u(String str) {
            this.f57080b = str;
            return this;
        }

        public JaTimeFormat v(String str) {
            this.f57079a = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ f c(g gVar) {
        return new JaTimeFormat(this, gVar);
    }

    @Override // Cj.b
    public f a(g gVar) {
        return (f) this.f57078a.computeIfAbsent(gVar, new Function() { // from class: org.ocpsoft.prettytime.i18n.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f57137a.c((g) obj);
            }
        });
    }

    @Override // java.util.ListResourceBundle
    public Object[][] getContents() {
        return f57077b;
    }
}
