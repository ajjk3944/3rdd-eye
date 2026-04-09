package iq;

import br.l;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.survey.translations.SurveyTranslation;
import java.util.Iterator;
import java.util.List;
import tt.s;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f12924a = e5.I("zh-tw", "zh-hant", "zh-hk", "zh-mo");

    /* renamed from: b, reason: collision with root package name */
    public static final List f12925b = e5.I("zh", "zh-hans", "zh-cn", "zh-sg");

    public static SurveyTranslation a(String str, String str2, List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            SurveyTranslation surveyTranslation = (SurveyTranslation) next;
            if (l.a(surveyTranslation.getId(), str) && s.g0(surveyTranslation.getLanguageCode(), str2)) {
                break;
            }
        }
        return (SurveyTranslation) next;
    }
}
