package fq;

import br.l;
import com.survicate.surveys.entities.survey.SurveySettings;
import io.sentry.android.core.u0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import on.k;

/* loaded from: classes.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9036a;

    /* renamed from: b, reason: collision with root package name */
    public final SurveySettings f9037b;

    /* renamed from: c, reason: collision with root package name */
    public final gq.b f9038c;

    /* renamed from: d, reason: collision with root package name */
    public final gq.a f9039d;

    /* renamed from: e, reason: collision with root package name */
    public final iq.f f9040e;

    public g(String str, SurveySettings surveySettings, boolean z10, bm.d dVar, gq.b bVar, gq.a aVar, iq.f fVar) {
        l.e(str, "surveyId");
        l.e(surveySettings, "surveySettings");
        l.e(dVar, "backendTargetingResultProvider");
        l.e(bVar, "seenSurveysProvider");
        l.e(aVar, "presentationTimesProvider");
        l.e(fVar, "timestampProvider");
        this.f9036a = str;
        this.f9037b = surveySettings;
        this.f9038c = bVar;
        this.f9039d = aVar;
        this.f9040e = fVar;
    }

    @Override // yn.a
    public final boolean a() {
        Long l10;
        Set setF = ((k) this.f9038c).f19637a.F();
        String str = this.f9036a;
        boolean zContains = setF.contains(str);
        SurveySettings surveySettings = this.f9037b;
        if (zContains && !surveySettings.getRecurring()) {
            return false;
        }
        k kVar = (k) this.f9039d;
        Long l11 = (Long) kVar.f19637a.E("lastPresentationTimesKey").get(str);
        iq.f fVar = this.f9040e;
        if (l11 != null && surveySettings.getRecurringPeriodSeconds() != -1) {
            ((u0) fVar).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = l11.longValue();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            l.e(timeUnit, "timeUnit");
            if (timeUnit.convert(jCurrentTimeMillis - jLongValue, TimeUnit.MILLISECONDS) < surveySettings.getRecurringPeriodSeconds()) {
                return false;
            }
        }
        Long recurringStopAfterSeconds = surveySettings.getRecurringStopAfterSeconds();
        if (recurringStopAfterSeconds != null) {
            long jLongValue2 = recurringStopAfterSeconds.longValue();
            Long l12 = (Long) kVar.f19637a.E("firstPresentationTimesKey").get(str);
            if (l12 != null) {
                long jLongValue3 = l12.longValue();
                ((u0) fVar).getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                l.e(timeUnit2, "timeUnit");
                if (timeUnit2.convert(jCurrentTimeMillis2 - jLongValue3, TimeUnit.MILLISECONDS) >= jLongValue2) {
                    return false;
                }
            }
        }
        Integer surveyThrottleDays = surveySettings.getSurveyThrottleDays();
        if (surveyThrottleDays == null) {
            return true;
        }
        int iIntValue = surveyThrottleDays.intValue();
        Iterator it = kVar.f19637a.E("lastPresentationTimesKey").entrySet().iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((Number) ((Map.Entry) it.next()).getValue()).longValue());
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((Number) ((Map.Entry) it.next()).getValue()).longValue());
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l10 = lValueOf;
        } else {
            l10 = null;
        }
        if (l10 == null) {
            return true;
        }
        long jLongValue4 = l10.longValue();
        ((u0) fVar).getClass();
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        TimeUnit timeUnit3 = TimeUnit.DAYS;
        l.e(timeUnit3, "timeUnit");
        return timeUnit3.convert(jCurrentTimeMillis3 - jLongValue4, TimeUnit.MILLISECONDS) >= ((long) iIntValue);
    }
}
