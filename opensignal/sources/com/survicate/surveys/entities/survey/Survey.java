package com.survicate.surveys.entities.survey;

import ba.m;
import br.l;
import com.survicate.surveys.entities.survey.audience.AudienceVisitorType;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.theme.Theme;
import com.survicate.surveys.entities.survey.translations.SurveyPointTranslation;
import com.survicate.surveys.entities.survey.translations.SurveySettingsTranslation;
import com.survicate.surveys.entities.survey.translations.SurveyTranslation;
import com.survicate.surveys.entities.survey.translations.Translatable;
import eq.b;
import fq.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import mq.p;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001d¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\u0014¢\u0006\u0004\b!\u0010\u0016J\r\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b%\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b)\u0010(R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b1\u0010\u0019R$\u00104\u001a\u0002022\u0006\u00103\u001a\u0002028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0011\u00108\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b8\u0010\u0016¨\u00069"}, d2 = {"Lcom/survicate/surveys/entities/survey/Survey;", "Lcom/survicate/surveys/entities/survey/translations/Translatable;", "Lcom/survicate/surveys/entities/survey/translations/SurveyTranslation;", "", "id", "name", "", "Lcom/survicate/surveys/entities/survey/questions/SurveyPoint;", "points", "Lfq/a;", "displayFilters", "Leq/b;", "audiences", "Lcom/survicate/surveys/entities/survey/SurveySettings;", "settings", "Lcom/survicate/surveys/entities/survey/theme/Theme;", "theme", "languageCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/survicate/surveys/entities/survey/SurveySettings;Lcom/survicate/surveys/entities/survey/theme/Theme;Ljava/lang/String;)V", "", "allDisplayFiltersSatisfied", "()Z", "anyAudienceSatisfied", "toString", "()Ljava/lang/String;", "translation", "translatedWith", "(Lcom/survicate/surveys/entities/survey/translations/SurveyTranslation;)Lcom/survicate/surveys/entities/survey/Survey;", "Llq/b0;", "incrementAnswerCount", "()V", "decrementAnswerCount", "canBeDisplayed", "resetState", "Ljava/lang/String;", "getId", "getName", "Ljava/util/List;", "getPoints", "()Ljava/util/List;", "getDisplayFilters", "getAudiences", "Lcom/survicate/surveys/entities/survey/SurveySettings;", "getSettings", "()Lcom/survicate/surveys/entities/survey/SurveySettings;", "Lcom/survicate/surveys/entities/survey/theme/Theme;", "getTheme", "()Lcom/survicate/surveys/entities/survey/theme/Theme;", "getLanguageCode", "", "<set-?>", "answerCount", "I", "getAnswerCount", "()I", "isContactMode", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Survey implements Translatable<SurveyTranslation, Survey> {
    private int answerCount;
    private final List<b> audiences;
    private final List<a> displayFilters;
    private final String id;
    private final String languageCode;
    private final String name;
    private final List<SurveyPoint> points;
    private final SurveySettings settings;
    private final Theme theme;

    /* JADX WARN: Multi-variable type inference failed */
    public Survey(String str, String str2, List<? extends SurveyPoint> list, List<? extends a> list2, List<b> list3, SurveySettings surveySettings, Theme theme, String str3) {
        l.e(str, "id");
        l.e(str2, "name");
        l.e(list, "points");
        l.e(list2, "displayFilters");
        l.e(list3, "audiences");
        l.e(surveySettings, "settings");
        l.e(theme, "theme");
        this.id = str;
        this.name = str2;
        this.points = list;
        this.displayFilters = list2;
        this.audiences = list3;
        this.settings = surveySettings;
        this.theme = theme;
        this.languageCode = str3;
    }

    private final boolean allDisplayFiltersSatisfied() {
        List<a> list = this.displayFilters;
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((a) it.next()).a()));
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (!((Boolean) it2.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean anyAudienceSatisfied() {
        /*
            r9 = this;
            java.util.List<eq.b> r0 = r9.audiences
            boolean r1 = r0.isEmpty()
            r2 = 1
            if (r1 == 0) goto Lb
            goto La8
        Lb:
            boolean r1 = r0.isEmpty()
            r3 = 0
            if (r1 == 0) goto L14
            goto La9
        L14:
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La9
            java.lang.Object r1 = r0.next()
            eq.b r1 = (eq.b) r1
            java.util.ArrayList r4 = r1.f8250b
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = mq.p.a0(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L35:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L4d
            java.lang.Object r6 = r4.next()
            zn.a r6 = (zn.a) r6
            boolean r6 = r6.a()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5.add(r6)
            goto L35
        L4d:
            java.util.Iterator r4 = r5.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L59
            r1 = 0
            goto L9c
        L59:
            java.lang.Object r5 = r4.next()
        L5d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L9b
            java.lang.Object r6 = r4.next()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            com.survicate.surveys.entities.survey.audience.AudienceRelation r7 = r1.f8249a
            int[] r8 = eq.a.f8248a
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r2) goto L91
            r8 = 2
            if (r7 != r8) goto L8b
            if (r5 != 0) goto L89
            if (r6 == 0) goto L87
            goto L89
        L87:
            r5 = r3
            goto L96
        L89:
            r5 = r2
            goto L96
        L8b:
            bf.n r0 = new bf.n
            r0.<init>()
            throw r0
        L91:
            if (r5 == 0) goto L87
            if (r6 == 0) goto L87
            goto L89
        L96:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            goto L5d
        L9b:
            r1 = r5
        L9c:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto La5
            boolean r1 = r1.booleanValue()
            goto La6
        La5:
            r1 = r2
        La6:
            if (r1 == 0) goto L18
        La8:
            return r2
        La9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.survicate.surveys.entities.survey.Survey.anyAudienceSatisfied():boolean");
    }

    public final boolean canBeDisplayed() {
        return allDisplayFiltersSatisfied() && anyAudienceSatisfied();
    }

    public final void decrementAnswerCount() {
        this.answerCount--;
    }

    public final int getAnswerCount() {
        return this.answerCount;
    }

    public final List<b> getAudiences() {
        return this.audiences;
    }

    public final List<a> getDisplayFilters() {
        return this.displayFilters;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final String getName() {
        return this.name;
    }

    public final List<SurveyPoint> getPoints() {
        return this.points;
    }

    public final SurveySettings getSettings() {
        return this.settings;
    }

    public final Theme getTheme() {
        return this.theme;
    }

    public final void incrementAnswerCount() {
        this.answerCount++;
    }

    public final boolean isContactMode() {
        List<b> list = this.audiences;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((b) it.next()).f8251c == AudienceVisitorType.IDENTIFIED) {
                return true;
            }
        }
        return false;
    }

    public final void resetState() {
        this.answerCount = 0;
    }

    public String toString() {
        return m.N(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.survicate.surveys.entities.survey.translations.Translatable
    public Survey translatedWith(SurveyTranslation translation) {
        String surveyLanguage;
        List<SurveyPointTranslation> points;
        String str = this.id;
        String str2 = this.name;
        List<SurveyPoint> list = this.points;
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            SurveyPointTranslation surveyPointTranslation = null;
            if (!it.hasNext()) {
                break;
            }
            SurveyPoint surveyPoint = (SurveyPoint) it.next();
            if (translation != null && (points = translation.getPoints()) != null) {
                Iterator<T> it2 = points.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((SurveyPointTranslation) next).getId() == surveyPoint.getId()) {
                        surveyPointTranslation = next;
                        break;
                    }
                }
                surveyPointTranslation = surveyPointTranslation;
            }
            arrayList.add(surveyPoint.translatedWith(surveyPointTranslation));
        }
        List<a> list2 = this.displayFilters;
        SurveySettingsTranslation settings = null;
        List<b> list3 = this.audiences;
        SurveySettings surveySettings = this.settings;
        if (translation != null) {
            settings = translation.getSettings();
        }
        SurveySettings surveySettingsTranslatedWith = surveySettings.translatedWith(settings);
        Theme theme = this.theme;
        if (translation == null || (surveyLanguage = translation.getLanguageCode()) == null) {
            surveyLanguage = this.settings.getSurveyLanguage();
        }
        Survey survey = new Survey(str, str2, arrayList, list2, list3, surveySettingsTranslatedWith, theme, surveyLanguage);
        survey.answerCount = this.answerCount;
        return survey;
    }
}
