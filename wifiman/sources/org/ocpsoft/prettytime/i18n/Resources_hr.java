package org.ocpsoft.prettytime.i18n;

import Aj.f;
import Aj.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.Objects;
import java.util.ResourceBundle;
import org.ocpsoft.prettytime.units.Day;
import org.ocpsoft.prettytime.units.Hour;
import org.ocpsoft.prettytime.units.Millennium;
import org.ocpsoft.prettytime.units.Minute;
import org.ocpsoft.prettytime.units.Month;
import org.ocpsoft.prettytime.units.Week;
import org.ocpsoft.prettytime.units.Year;

/* loaded from: classes2.dex */
public class Resources_hr extends ListResourceBundle implements Cj.b {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[][] f57065a = {new Object[]{"CenturyPattern", "%n %u"}, new Object[]{"CenturyFuturePrefix", "za "}, new Object[]{"CenturyFutureSuffix", ""}, new Object[]{"CenturyPastPrefix", ""}, new Object[]{"CenturyPastSuffix", " unatrag"}, new Object[]{"CenturySingularName", "stoljeće"}, new Object[]{"CenturyPluralName", "stoljeća"}, new Object[]{"DayPattern", "%n %u"}, new Object[]{"DayFuturePrefix", "za "}, new Object[]{"DayFutureSuffix", ""}, new Object[]{"DayPastPrefix", "prije "}, new Object[]{"DayPastSuffix", ""}, new Object[]{"DaySingularName", "dan"}, new Object[]{"DayPluralName", "dana"}, new Object[]{"DecadePattern", "%n %u"}, new Object[]{"DecadeFuturePrefix", "za "}, new Object[]{"DecadeFutureSuffix", ""}, new Object[]{"DecadePastPrefix", "prije "}, new Object[]{"DecadePastSuffix", ""}, new Object[]{"DecadeSingularName", "desetljeće"}, new Object[]{"DecadePluralName", "desetljeća"}, new Object[]{"HourPattern", "%n %u"}, new Object[]{"HourFuturePrefix", "za "}, new Object[]{"HourFutureSuffix", ""}, new Object[]{"HourPastPrefix", "prije "}, new Object[]{"HourPastSuffix", ""}, new Object[]{"HourSingularName", "sat"}, new Object[]{"HourPluralName", "sati"}, new Object[]{"JustNowPattern", "%u"}, new Object[]{"JustNowFuturePrefix", "za nekoliko trenutaka"}, new Object[]{"JustNowFutureSuffix", ""}, new Object[]{"JustNowPastPrefix", "prije nekoliko trenutaka"}, new Object[]{"JustNowPastSuffix", ""}, new Object[]{"JustNowSingularName", ""}, new Object[]{"JustNowPluralName", ""}, new Object[]{"MillenniumPattern", "%n %u"}, new Object[]{"MillenniumFuturePrefix", "za "}, new Object[]{"MillenniumFutureSuffix", ""}, new Object[]{"MillenniumPastPrefix", "prije "}, new Object[]{"MillenniumPastSuffix", ""}, new Object[]{"MillenniumSingularName", "tisućljeće"}, new Object[]{"MillenniumPluralName", "tisućljeća"}, new Object[]{"MillisecondPattern", "%n %u"}, new Object[]{"MillisecondFuturePrefix", "za "}, new Object[]{"MillisecondFutureSuffix", ""}, new Object[]{"MillisecondPastPrefix", "prije "}, new Object[]{"MillisecondPastSuffix", ""}, new Object[]{"MillisecondSingularName", "milisekunda"}, new Object[]{"MillisecondPluralName", "milisekunda"}, new Object[]{"MinutePattern", "%n %u"}, new Object[]{"MinuteFuturePrefix", "za "}, new Object[]{"MinuteFutureSuffix", ""}, new Object[]{"MinutePastPrefix", "prije "}, new Object[]{"MinutePastSuffix", ""}, new Object[]{"MinuteSingularName", "minuta"}, new Object[]{"MinutePluralName", "minuta"}, new Object[]{"MonthPattern", "%n %u"}, new Object[]{"MonthFuturePrefix", "za "}, new Object[]{"MonthFutureSuffix", ""}, new Object[]{"MonthPastPrefix", "prije "}, new Object[]{"MonthPastSuffix", ""}, new Object[]{"MonthSingularName", "mjesec"}, new Object[]{"MonthPluralName", "mjeseca"}, new Object[]{"SecondPattern", "%n %u"}, new Object[]{"SecondFuturePrefix", "za "}, new Object[]{"SecondFutureSuffix", ""}, new Object[]{"SecondPastPrefix", "prije "}, new Object[]{"SecondPastSuffix", ""}, new Object[]{"SecondSingularName", "sekunda"}, new Object[]{"SecondPluralName", "sekundi"}, new Object[]{"WeekPattern", "%n %u"}, new Object[]{"WeekFuturePrefix", "za "}, new Object[]{"WeekFutureSuffix", ""}, new Object[]{"WeekPastPrefix", "prije "}, new Object[]{"WeekPastSuffix", ""}, new Object[]{"WeekSingularName", "tjedan"}, new Object[]{"WeekPluralName", "tjedna"}, new Object[]{"YearPattern", "%n %u"}, new Object[]{"YearFuturePrefix", "za "}, new Object[]{"YearFutureSuffix", ""}, new Object[]{"YearPastPrefix", "prije "}, new Object[]{"YearPastSuffix", ""}, new Object[]{"YearSingularName", "godina"}, new Object[]{"YearPluralName", "godina"}, new Object[]{"AbstractTimeUnitPattern", ""}, new Object[]{"AbstractTimeUnitFuturePrefix", ""}, new Object[]{"AbstractTimeUnitFutureSuffix", ""}, new Object[]{"AbstractTimeUnitPastPrefix", ""}, new Object[]{"AbstractTimeUnitPastSuffix", ""}, new Object[]{"AbstractTimeUnitSingularName", ""}, new Object[]{"AbstractTimeUnitPluralName", ""}};

    private static class HrName implements Comparable<HrName> {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f57066a;

        /* renamed from: b, reason: collision with root package name */
        private final Long f57067b;

        /* renamed from: c, reason: collision with root package name */
        private final String f57068c;

        public HrName(boolean z10, String str, Long l10) {
            this.f57066a = z10;
            this.f57068c = str;
            this.f57067b = l10;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(HrName hrName) {
            return this.f57067b.compareTo(Long.valueOf(hrName.c()));
        }

        public String b() {
            return this.f57068c;
        }

        public long c() {
            return this.f57067b.longValue();
        }

        public boolean d() {
            return this.f57066a;
        }
    }

    private static class HrTimeFormat extends Bj.a {

        /* renamed from: o, reason: collision with root package name */
        private final List f57069o = new ArrayList();

        /* renamed from: p, reason: collision with root package name */
        private final List f57070p = new ArrayList();

        public HrTimeFormat(String str, ResourceBundle resourceBundle, Collection collection) {
            w(resourceBundle.getString(str + "Pattern"));
            o(resourceBundle.getString(str + "FuturePrefix"));
            q(resourceBundle.getString(str + "FutureSuffix"));
            t(resourceBundle.getString(str + "PastPrefix"));
            v(resourceBundle.getString(str + "PastSuffix"));
            y(resourceBundle.getString(str + "SingularName"));
            x(resourceBundle.getString(str + "PluralName"));
            try {
                n(resourceBundle.getString(str + "FuturePluralName"));
            } catch (Exception unused) {
            }
            try {
                p(resourceBundle.getString(str + "FutureSingularName"));
            } catch (Exception unused2) {
            }
            try {
                s(resourceBundle.getString(str + "PastPluralName"));
            } catch (Exception unused3) {
            }
            try {
                u(resourceBundle.getString(str + "PastSingularName"));
            } catch (Exception unused4) {
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                HrName hrName = (HrName) it.next();
                if (hrName.d()) {
                    this.f57069o.add(hrName);
                } else {
                    this.f57070p.add(hrName);
                }
            }
            Collections.sort(this.f57069o);
            Collections.sort(this.f57070p);
        }

        private String z(long j10, List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HrName hrName = (HrName) it.next();
                if (hrName.c() >= j10) {
                    return hrName.b();
                }
            }
            throw new IllegalStateException("Invalid resource bundle configuration");
        }

        @Override // Bj.a
        protected String f(Aj.a aVar, boolean z10) {
            long jAbs = Math.abs(j(aVar, z10));
            return aVar.b() ? z(jAbs, this.f57069o) : z(jAbs, this.f57070p);
        }
    }

    private static class HrTimeFormatBuilder {

        /* renamed from: a, reason: collision with root package name */
        private final List f57071a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final String f57072b;

        HrTimeFormatBuilder(String str) {
            this.f57072b = str;
        }

        private HrTimeFormatBuilder a(boolean z10, String str, long j10) {
            List list = this.f57071a;
            Objects.requireNonNull(str);
            list.add(new HrName(z10, str, Long.valueOf(j10)));
            return this;
        }

        HrTimeFormatBuilder b(String str, long j10) {
            return a(true, str, j10).a(false, str, j10);
        }

        HrTimeFormat c(ResourceBundle resourceBundle) {
            return new HrTimeFormat(this.f57072b, resourceBundle, this.f57071a);
        }
    }

    @Override // Cj.b
    public f a(g gVar) {
        if (gVar instanceof Minute) {
            return new HrTimeFormatBuilder("Minute").b("minutu", 1L).b("minute", 4L).b("minuta", Long.MAX_VALUE).c(this);
        }
        if (gVar instanceof Hour) {
            return new HrTimeFormatBuilder("Hour").b("sat", 1L).b("sata", 4L).b("sati", Long.MAX_VALUE).c(this);
        }
        if (gVar instanceof Day) {
            return new HrTimeFormatBuilder("Day").b("dan", 1L).b("dana", 4L).b("dana", Long.MAX_VALUE).c(this);
        }
        if (gVar instanceof Week) {
            return new HrTimeFormatBuilder("Week").b("tjedan", 1L).b("tjedna", 4L).b("tjedana", Long.MAX_VALUE).c(this);
        }
        if (gVar instanceof Month) {
            return new HrTimeFormatBuilder("Month").b("mjesec", 1L).b("mjeseca", 4L).b("mjeseci", Long.MAX_VALUE).c(this);
        }
        if (gVar instanceof Year) {
            return new HrTimeFormatBuilder("Year").b("godinu", 1L).b("godine", 4L).b("godina", Long.MAX_VALUE).c(this);
        }
        if (gVar instanceof Millennium) {
            return new HrTimeFormatBuilder("Millennium").b("tisućljeće", 1L).b("tisućljeća", Long.MAX_VALUE).c(this);
        }
        return null;
    }

    @Override // java.util.ListResourceBundle
    public Object[][] getContents() {
        return f57065a;
    }
}
