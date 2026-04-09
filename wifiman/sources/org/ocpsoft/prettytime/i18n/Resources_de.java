package org.ocpsoft.prettytime.i18n;

import Aj.f;
import Aj.g;
import java.util.ListResourceBundle;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.ocpsoft.prettytime.i18n.Resources_de;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes2.dex */
public class Resources_de extends ListResourceBundle implements Cj.b {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[][] f57044a = {new Object[]{"CenturyPattern", "%n %u"}, new Object[]{"CenturyFuturePrefix", "in "}, new Object[]{"CenturyFutureSuffix", ""}, new Object[]{"CenturyPastPrefix", "vor "}, new Object[]{"CenturyPastSuffix", ""}, new Object[]{"CenturySingularName", "Jahrhundert"}, new Object[]{"CenturyPluralName", "Jahrhunderte"}, new Object[]{"DayPattern", "%n %u"}, new Object[]{"DayFuturePrefix", "in "}, new Object[]{"DayFutureSuffix", ""}, new Object[]{"DayPastPrefix", "vor "}, new Object[]{"DayPastSuffix", ""}, new Object[]{"DaySingularName", "Tag"}, new Object[]{"DayPluralName", "Tage"}, new Object[]{"DecadePattern", "%n %u"}, new Object[]{"DecadeFuturePrefix", "in "}, new Object[]{"DecadeFutureSuffix", ""}, new Object[]{"DecadePastPrefix", "vor "}, new Object[]{"DecadePastSuffix", ""}, new Object[]{"DecadeSingularName", "Jahrzehnt"}, new Object[]{"DecadePluralName", "Jahrzehnte"}, new Object[]{"HourPattern", "%n %u"}, new Object[]{"HourFuturePrefix", "in "}, new Object[]{"HourFutureSuffix", ""}, new Object[]{"HourPastPrefix", "vor "}, new Object[]{"HourPastSuffix", ""}, new Object[]{"HourSingularName", "Stunde"}, new Object[]{"HourPluralName", "Stunden"}, new Object[]{"JustNowPattern", "%u"}, new Object[]{"JustNowFuturePrefix", "Jetzt"}, new Object[]{"JustNowFutureSuffix", ""}, new Object[]{"JustNowPastPrefix", "gerade eben"}, new Object[]{"JustNowPastSuffix", ""}, new Object[]{"JustNowSingularName", ""}, new Object[]{"JustNowPluralName", ""}, new Object[]{"MillenniumPattern", "%n %u"}, new Object[]{"MillenniumFuturePrefix", "in "}, new Object[]{"MillenniumFutureSuffix", ""}, new Object[]{"MillenniumPastPrefix", "vor "}, new Object[]{"MillenniumPastSuffix", ""}, new Object[]{"MillenniumSingularName", "Jahrtausend"}, new Object[]{"MillenniumPluralName", "Jahrtausende"}, new Object[]{"MillisecondPattern", "%n %u"}, new Object[]{"MillisecondFuturePrefix", "in "}, new Object[]{"MillisecondFutureSuffix", ""}, new Object[]{"MillisecondPastPrefix", "vor "}, new Object[]{"MillisecondPastSuffix", ""}, new Object[]{"MillisecondSingularName", "Millisekunde"}, new Object[]{"MillisecondPluralName", "Millisekunden"}, new Object[]{"MinutePattern", "%n %u"}, new Object[]{"MinuteFuturePrefix", "in "}, new Object[]{"MinuteFutureSuffix", ""}, new Object[]{"MinutePastPrefix", "vor "}, new Object[]{"MinutePastSuffix", ""}, new Object[]{"MinuteSingularName", "Minute"}, new Object[]{"MinutePluralName", "Minuten"}, new Object[]{"MonthPattern", "%n %u"}, new Object[]{"MonthFuturePrefix", "in "}, new Object[]{"MonthFutureSuffix", ""}, new Object[]{"MonthPastPrefix", "vor "}, new Object[]{"MonthPastSuffix", ""}, new Object[]{"MonthSingularName", "Monat"}, new Object[]{"MonthPluralName", "Monate"}, new Object[]{"SecondPattern", "%n %u"}, new Object[]{"SecondFuturePrefix", "in "}, new Object[]{"SecondFutureSuffix", ""}, new Object[]{"SecondPastPrefix", "vor "}, new Object[]{"SecondPastSuffix", ""}, new Object[]{"SecondSingularName", "Sekunde"}, new Object[]{"SecondPluralName", "Sekunden"}, new Object[]{"WeekPattern", "%n %u"}, new Object[]{"WeekFuturePrefix", "in "}, new Object[]{"WeekFutureSuffix", ""}, new Object[]{"WeekPastPrefix", "vor "}, new Object[]{"WeekPastSuffix", ""}, new Object[]{"WeekSingularName", "Woche"}, new Object[]{"WeekPluralName", "Wochen"}, new Object[]{"YearPattern", "%n %u"}, new Object[]{"YearFuturePrefix", "in "}, new Object[]{"YearFutureSuffix", ""}, new Object[]{"YearPastPrefix", "vor "}, new Object[]{"YearPastSuffix", ""}, new Object[]{"YearSingularName", "Jahr"}, new Object[]{"YearPluralName", "Jahre"}, new Object[]{"AbstractTimeUnitPattern", ""}, new Object[]{"AbstractTimeUnitFuturePrefix", ""}, new Object[]{"AbstractTimeUnitFutureSuffix", ""}, new Object[]{"AbstractTimeUnitPastPrefix", ""}, new Object[]{"AbstractTimeUnitPastSuffix", ""}, new Object[]{"AbstractTimeUnitSingularName", ""}, new Object[]{"AbstractTimeUnitPluralName", ""}};

    /* JADX INFO: Access modifiers changed from: private */
    static class DeTimeFormat extends Bj.a {

        /* renamed from: o, reason: collision with root package name */
        private static final Map f57045o;

        /* renamed from: p, reason: collision with root package name */
        private static final Pattern f57046p;

        static {
            Map map = (Map) Stream.of((Object[]) new String[]{"Jahrtausende", "Jahrhunderte", "Jahrzehnte", "Jahre", "Monate", "Tage"}).collect(Collectors.toMap(Function.identity(), new Function() { // from class: org.ocpsoft.prettytime.i18n.a
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Resources_de.DeTimeFormat.B((String) obj);
                }
            }));
            f57045o = map;
            f57046p = Pattern.compile("\\b(" + String.join("|", map.keySet()) + ")\\b");
        }

        public DeTimeFormat(ResourceBundle resourceBundle, g gVar) {
            String simpleName = gVar.getClass().getSimpleName();
            w(resourceBundle.getString(simpleName + "Pattern"));
            o(resourceBundle.getString(simpleName + "FuturePrefix"));
            q(resourceBundle.getString(simpleName + "FutureSuffix"));
            t(resourceBundle.getString(simpleName + "PastPrefix"));
            v(resourceBundle.getString(simpleName + "PastSuffix"));
            y(resourceBundle.getString(simpleName + "SingularName"));
            x(resourceBundle.getString(simpleName + "PluralName"));
        }

        private String A(String str) {
            Matcher matcher = f57046p.matcher(str);
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                matcher.appendReplacement(stringBuffer, (String) f57045o.get(matcher.group(1)));
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String B(String str) {
            return str + SnmpConfigurator.O_CONTEXT_NAME;
        }

        @Override // Bj.a, Aj.f
        public String a(Aj.a aVar, String str) {
            return super.a(aVar, A(str));
        }
    }

    @Override // Cj.b
    public f a(g gVar) {
        return new DeTimeFormat(this, gVar);
    }

    @Override // java.util.ListResourceBundle
    protected Object[][] getContents() {
        return f57044a;
    }
}
