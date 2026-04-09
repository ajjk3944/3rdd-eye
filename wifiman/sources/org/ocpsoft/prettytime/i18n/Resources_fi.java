package org.ocpsoft.prettytime.i18n;

import Aj.f;
import Aj.g;
import java.util.ListResourceBundle;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import org.ocpsoft.prettytime.units.Day;

/* loaded from: classes2.dex */
public class Resources_fi extends ListResourceBundle implements Cj.b {

    /* renamed from: b, reason: collision with root package name */
    private static Object[][] f57053b = {new Object[]{"JustNowPattern", "%u"}, new Object[]{"JustNowPastSingularName", "hetki"}, new Object[]{"JustNowFutureSingularName", "hetken"}, new Object[]{"JustNowPastSuffix", "sitten"}, new Object[]{"JustNowFutureSuffix", "päästä"}, new Object[]{"MillisecondPattern", "%u"}, new Object[]{"MillisecondPluralPattern", "%n %u"}, new Object[]{"MillisecondPastSingularName", "millisekunti"}, new Object[]{"MillisecondPastPluralName", "millisekuntia"}, new Object[]{"MillisecondFutureSingularName", "millisekunnin"}, new Object[]{"MillisecondPastSuffix", "sitten"}, new Object[]{"MillisecondFutureSuffix", "päästä"}, new Object[]{"SecondPattern", "%u"}, new Object[]{"SecondPluralPattern", "%n %u"}, new Object[]{"SecondPastSingularName", "sekunti"}, new Object[]{"SecondPastPluralName", "sekuntia"}, new Object[]{"SecondFutureSingularName", "sekunnin"}, new Object[]{"SecondPastSuffix", "sitten"}, new Object[]{"SecondFutureSuffix", "päästä"}, new Object[]{"MinutePattern", "%u"}, new Object[]{"MinutePluralPattern", "%n %u"}, new Object[]{"MinutePastSingularName", "minuutti"}, new Object[]{"MinutePastPluralName", "minuuttia"}, new Object[]{"MinuteFutureSingularName", "minuutin"}, new Object[]{"MinutePastSuffix", "sitten"}, new Object[]{"MinuteFutureSuffix", "päästä"}, new Object[]{"HourPattern", "%u"}, new Object[]{"HourPluralPattern", "%n %u"}, new Object[]{"HourPastSingularName", "tunti"}, new Object[]{"HourPastPluralName", "tuntia"}, new Object[]{"HourFutureSingularName", "tunnin"}, new Object[]{"HourPastSuffix", "sitten"}, new Object[]{"HourFutureSuffix", "päästä"}, new Object[]{"DayPattern", "%u"}, new Object[]{"DayPluralPattern", "%n %u"}, new Object[]{"DayPastSingularName", "eilen"}, new Object[]{"DayPastPluralName", "päivää"}, new Object[]{"DayFutureSingularName", "huomenna"}, new Object[]{"DayFuturePluralName", "päivän"}, new Object[]{"DayPastSuffix", "sitten"}, new Object[]{"DayFutureSuffix", "päästä"}, new Object[]{"WeekPattern", "%u"}, new Object[]{"WeekPluralPattern", "%n %u"}, new Object[]{"WeekPastSingularName", "viikko"}, new Object[]{"WeekPastPluralName", "viikkoa"}, new Object[]{"WeekFutureSingularName", "viikon"}, new Object[]{"WeekFuturePluralName", "viikon"}, new Object[]{"WeekPastSuffix", "sitten"}, new Object[]{"WeekFutureSuffix", "päästä"}, new Object[]{"MonthPattern", "%u"}, new Object[]{"MonthPluralPattern", "%n %u"}, new Object[]{"MonthPastSingularName", "kuukausi"}, new Object[]{"MonthPastPluralName", "kuukautta"}, new Object[]{"MonthFutureSingularName", "kuukauden"}, new Object[]{"MonthPastSuffix", "sitten"}, new Object[]{"MonthFutureSuffix", "päästä"}, new Object[]{"YearPattern", "%u"}, new Object[]{"YearPluralPattern", "%n %u"}, new Object[]{"YearPastSingularName", "vuosi"}, new Object[]{"YearPastPluralName", "vuotta"}, new Object[]{"YearFutureSingularName", "vuoden"}, new Object[]{"YearPastSuffix", "sitten"}, new Object[]{"YearFutureSuffix", "päästä"}, new Object[]{"DecadePattern", "%u"}, new Object[]{"DecadePluralPattern", "%n %u"}, new Object[]{"DecadePastSingularName", "vuosikymmen"}, new Object[]{"DecadePastPluralName", "vuosikymmentä"}, new Object[]{"DecadeFutureSingularName", "vuosikymmenen"}, new Object[]{"DecadePastSuffix", "sitten"}, new Object[]{"DecadeFutureSuffix", "päästä"}, new Object[]{"CenturyPattern", "%u"}, new Object[]{"CenturyPluralPattern", "%n %u"}, new Object[]{"CenturyPastSingularName", "vuosisata"}, new Object[]{"CenturyPastPluralName", "vuosisataa"}, new Object[]{"CenturyFutureSingularName", "vuosisadan"}, new Object[]{"CenturyPastSuffix", "sitten"}, new Object[]{"CenturyFutureSuffix", "päästä"}, new Object[]{"MillenniumPattern", "%u"}, new Object[]{"MillenniumPluralPattern", "%n %u"}, new Object[]{"MillenniumPastSingularName", "vuosituhat"}, new Object[]{"MillenniumPastPluralName", "vuosituhatta"}, new Object[]{"MillenniumFutureSingularName", "vuosituhannen"}, new Object[]{"MillenniumPastSuffix", "sitten"}, new Object[]{"MillenniumFutureSuffix", "päästä"}};

    /* renamed from: a, reason: collision with root package name */
    private final Map f57054a = new ConcurrentHashMap();

    private static class FiTimeFormat extends Bj.a {

        /* renamed from: o, reason: collision with root package name */
        private final ResourceBundle f57055o;

        /* renamed from: p, reason: collision with root package name */
        private String f57056p = "";

        /* renamed from: q, reason: collision with root package name */
        private String f57057q = "";

        /* renamed from: r, reason: collision with root package name */
        private String f57058r = "";

        /* renamed from: s, reason: collision with root package name */
        private String f57059s = "";

        /* renamed from: t, reason: collision with root package name */
        private String f57060t = "";

        public FiTimeFormat(ResourceBundle resourceBundle, g gVar) {
            this.f57055o = resourceBundle;
            if (resourceBundle.containsKey(E(gVar) + "PastSingularName")) {
                H(resourceBundle.getString(E(gVar) + "PastSingularName")).F(resourceBundle.getString(E(gVar) + "FutureSingularName")).I(resourceBundle.getString(E(gVar) + "PastSingularName")).G(resourceBundle.getString(E(gVar) + "FutureSingularName")).J(resourceBundle.getString(E(gVar) + "Pattern"));
                if (resourceBundle.containsKey(E(gVar) + "PastPluralName")) {
                    I(resourceBundle.getString(E(gVar) + "PastPluralName"));
                }
                if (resourceBundle.containsKey(E(gVar) + "FuturePluralName")) {
                    G(resourceBundle.getString(E(gVar) + "FuturePluralName"));
                }
                if (resourceBundle.containsKey(E(gVar) + "PluralPattern")) {
                    J(resourceBundle.getString(E(gVar) + "PluralPattern"));
                }
                w(resourceBundle.getString(E(gVar) + "Pattern")).v(resourceBundle.getString(E(gVar) + "PastSuffix")).q(resourceBundle.getString(E(gVar) + "FutureSuffix")).o("").t("").y("").x("");
            }
        }

        private String E(g gVar) {
            return gVar.getClass().getSimpleName();
        }

        public String A() {
            return this.f57059s;
        }

        public String B() {
            return this.f57056p;
        }

        public String C() {
            return this.f57058r;
        }

        public String D() {
            return this.f57060t;
        }

        public FiTimeFormat F(String str) {
            this.f57057q = str;
            return this;
        }

        public FiTimeFormat G(String str) {
            this.f57059s = str;
            return this;
        }

        public FiTimeFormat H(String str) {
            this.f57056p = str;
            return this;
        }

        public FiTimeFormat I(String str) {
            this.f57058r = str;
            return this;
        }

        public FiTimeFormat J(String str) {
            this.f57060t = str;
            return this;
        }

        @Override // Bj.a, Aj.f
        public String a(Aj.a aVar, String str) {
            return ((aVar.a() instanceof Day) && Math.abs(aVar.d(50)) == 1) ? str : super.a(aVar, str);
        }

        @Override // Bj.a
        protected String f(Aj.a aVar, boolean z10) {
            String strB = aVar.e() ? B() : z();
            if (Math.abs(j(aVar, z10)) == 0 || Math.abs(j(aVar, z10)) > 1) {
                return aVar.e() ? C() : A();
            }
            return strB;
        }

        @Override // Bj.a
        protected String h(long j10) {
            return Math.abs(j10) == 1 ? g() : D();
        }

        public String z() {
            return this.f57057q;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ f c(g gVar) {
        return new FiTimeFormat(this, gVar);
    }

    @Override // Cj.b
    public f a(g gVar) {
        return (f) this.f57054a.computeIfAbsent(gVar, new Function() { // from class: org.ocpsoft.prettytime.i18n.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f57136a.c((g) obj);
            }
        });
    }

    @Override // java.util.ListResourceBundle
    protected Object[][] getContents() {
        return f57053b;
    }
}
