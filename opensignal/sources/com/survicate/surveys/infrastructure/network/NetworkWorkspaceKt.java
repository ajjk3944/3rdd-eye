package com.survicate.surveys.infrastructure.network;

import br.l;
import com.survicate.surveys.entities.models.EventSuggestion;
import com.survicate.surveys.entities.survey.Integration;
import com.survicate.surveys.entities.survey.NetworkSurvey;
import com.survicate.surveys.entities.survey.NetworkSurveyKt;
import com.survicate.surveys.entities.survey.NetworkTargetingEvent;
import com.survicate.surveys.entities.survey.NetworkTargetingEventKt;
import com.survicate.surveys.entities.survey.Survey;
import com.survicate.surveys.entities.survey.SurveyAnswerType;
import com.survicate.surveys.entities.survey.SurveySettings;
import com.survicate.surveys.entities.survey.Workspace;
import com.survicate.surveys.entities.survey.audience.NetworkAudience;
import com.survicate.surveys.entities.survey.audience.NetworkAudienceKt;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.questions.cta.SurveyCtaSurveyPoint;
import com.survicate.surveys.entities.survey.questions.form.SurveyFormSurveyPoint;
import com.survicate.surveys.entities.survey.questions.nps.SurveyNpsSurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.entities.survey.theme.Theme;
import com.survicate.surveys.entities.survey.translations.SurveyTranslation;
import cq.j;
import cq.k;
import cq.o;
import fq.b;
import fq.f;
import fq.g;
import fq.h;
import fq.i;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import mq.p;
import mq.w;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001c\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\nH\u0002¢\u0006\u0004\b\u001c\u0010\u0012\u001a\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u0015\u001a!\u0010!\u001a\u00020\u001e*\b\u0012\u0004\u0012\u00020\u001e0\n2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0019\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\n*\u00020\u0000H\u0002¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/NetworkWorkspace;", "", "locale", "Ljava/util/Date;", "lastUpdatedAt", "Lcq/o;", "targetingFiltersFactory", "Lcom/survicate/surveys/entities/survey/Workspace;", "mapToWorkspace", "(Lcom/survicate/surveys/infrastructure/network/NetworkWorkspace;Ljava/lang/String;Ljava/util/Date;Lcq/o;)Lcom/survicate/surveys/entities/survey/Workspace;", "", "Lcom/survicate/surveys/entities/survey/Survey;", "mapSurveys", "(Lcom/survicate/surveys/infrastructure/network/NetworkWorkspace;Lcq/o;)Ljava/util/List;", "Lcom/survicate/surveys/entities/survey/questions/SurveyPoint;", "surveyPoints", "Llq/b0;", "validateSurveyPoints", "(Ljava/util/List;)V", "surveyPoint", "validatePointSettings", "(Lcom/survicate/surveys/entities/survey/questions/SurveyPoint;)V", "Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;", "questionPoint", "validatePossibleAnswers", "(Lcom/survicate/surveys/entities/survey/questions/question/SurveyQuestionSurveyPoint;)V", "Lcom/survicate/surveys/entities/survey/questions/question/QuestionPointAnswer;", "answers", "validateSmileyScaleAnswers", "validateAnswerType", "Lcom/survicate/surveys/entities/survey/theme/Theme;", "Lcom/survicate/surveys/entities/survey/NetworkSurvey;", "networkSurvey", "findMatchingTheme", "(Ljava/util/List;Lcom/survicate/surveys/entities/survey/NetworkSurvey;)Lcom/survicate/surveys/entities/survey/theme/Theme;", "Lcom/survicate/surveys/entities/models/EventSuggestion;", "mapMobileTargetingEvents", "(Lcom/survicate/surveys/infrastructure/network/NetworkWorkspace;)Ljava/util/List;", "survicate-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkWorkspaceKt {
    private static final Theme findMatchingTheme(List<Theme> list, NetworkSurvey networkSurvey) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Theme) next).getId() == networkSurvey.getThemeId()) {
                break;
            }
        }
        Theme theme = (Theme) next;
        if (theme != null) {
            return theme;
        }
        throw new IllegalArgumentException("Theme not found for survey " + networkSurvey.getId());
    }

    private static final List<EventSuggestion> mapMobileTargetingEvents(NetworkWorkspace networkWorkspace) {
        List<NetworkTargetingEvent> targetingEvents = networkWorkspace.getTargetingEvents();
        ArrayList arrayList = new ArrayList();
        for (Object obj : targetingEvents) {
            if (l.a(((NetworkTargetingEvent) obj).getType(), NetworkTargetingEvent.TYPE_MOBILE)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(NetworkTargetingEventKt.toEventSuggestion((NetworkTargetingEvent) it.next()));
        }
        return arrayList2;
    }

    private static final List<Survey> mapSurveys(NetworkWorkspace networkWorkspace, o oVar) {
        String str;
        List<NetworkSurvey> surveys = networkWorkspace.getSurveys();
        ArrayList arrayList = new ArrayList(p.a0(surveys, 10));
        for (NetworkSurvey networkSurvey : surveys) {
            validateSurveyPoints(networkSurvey.getPoints());
            List<NetworkAudience> audiences = networkWorkspace.getAudiences();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : audiences) {
                if (networkSurvey.getAudiencesIds().contains(Long.valueOf(((NetworkAudience) obj).getId()))) {
                    arrayList2.add(obj);
                }
            }
            Theme themeFindMatchingTheme = findMatchingTheme(networkWorkspace.getThemes(), networkSurvey);
            String id2 = networkSurvey.getId();
            String name = networkSurvey.getName();
            if (name == null) {
                name = "";
            }
            String str2 = name;
            List<SurveyPoint> points = networkSurvey.getPoints();
            oVar.getClass();
            ArrayList arrayList3 = new ArrayList();
            List<String> screens = networkSurvey.getScreens();
            Integer displayDelaySeconds = networkSurvey.getSettings().getDisplayDelaySeconds();
            arrayList3.add(new h(screens, displayDelaySeconds != null ? displayDelaySeconds.intValue() : 0, oVar.f6648a, oVar.f6658m));
            arrayList3.add(new b(networkSurvey.getId(), networkSurvey.getEvents(), oVar.f6649b, oVar.f6654g, oVar.f6658m));
            arrayList3.add(new f(l.a(networkSurvey.getSettings().getDisplayNotEngaged(), Boolean.TRUE), oVar.j));
            arrayList3.add(new g(networkSurvey.getId(), networkSurvey.getSettings(), NetworkSurveyKt.isContactMode(networkSurvey, arrayList2), oVar.f6659n, oVar.f6652e, oVar.f6653f, oVar.f6658m));
            g1.f fVar = oVar.k;
            String id3 = networkSurvey.getId();
            fVar.getClass();
            LinkedHashMap linkedHashMap = (LinkedHashMap) fVar.f9211r;
            l.e(id3, "surveyId");
            k kVar = (k) linkedHashMap.get(id3);
            if (kVar == null) {
                j jVar = k.Companion;
                oVar.f6657l.getClass();
                double dRandom = Math.random() * 100.0d;
                Double percentage = networkSurvey.getSettings().getPercentage();
                jVar.getClass();
                kVar = (percentage == null || percentage.doubleValue() <= 0.0d || dRandom > percentage.doubleValue()) ? k.FAILURE : k.SUCCESS;
                String id4 = networkSurvey.getId();
                l.e(id4, "surveyId");
                l.e(kVar, "result");
                linkedHashMap.put(id4, kVar);
            }
            arrayList3.add(new i(networkSurvey.getId(), networkSurvey.getSettings().getPercentage(), kVar, oVar.f6660o));
            ArrayList arrayListP0 = mq.o.p0(arrayList3);
            ArrayList arrayList4 = new ArrayList(p.a0(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList4.add(NetworkAudienceKt.toDomainModel((NetworkAudience) it.next(), oVar));
            }
            SurveySettings settings = networkSurvey.getSettings();
            String surveyLanguage = networkSurvey.getSettings().getSurveyLanguage();
            if (surveyLanguage != null) {
                if (surveyLanguage.length() == 0) {
                    surveyLanguage = null;
                }
                str = surveyLanguage;
            } else {
                str = null;
            }
            arrayList.add(new Survey(id2, str2, points, arrayListP0, arrayList4, settings, themeFindMatchingTheme, str));
        }
        return arrayList;
    }

    public static final Workspace mapToWorkspace(NetworkWorkspace networkWorkspace, String str, Date date, o oVar) {
        l.e(networkWorkspace, "<this>");
        l.e(str, "locale");
        l.e(date, "lastUpdatedAt");
        l.e(oVar, "targetingFiltersFactory");
        List<Survey> listMapSurveys = mapSurveys(networkWorkspace, oVar);
        List<Integration> integrations = networkWorkspace.getIntegrations();
        String panelAnswerUrlTemplate = networkWorkspace.getPanelAnswerUrlTemplate();
        List<EventSuggestion> listMapMobileTargetingEvents = mapMobileTargetingEvents(networkWorkspace);
        boolean targetingEventsEnabled = networkWorkspace.getTargetingEventsEnabled();
        Boolean backendTargetingEnabled = networkWorkspace.getBackendTargetingEnabled();
        boolean zBooleanValue = backendTargetingEnabled != null ? backendTargetingEnabled.booleanValue() : false;
        Boolean enforceUserAuthentication = networkWorkspace.getEnforceUserAuthentication();
        boolean zBooleanValue2 = enforceUserAuthentication != null ? enforceUserAuthentication.booleanValue() : true;
        List<SurveyTranslation> translations = networkWorkspace.getTranslations();
        if (translations == null) {
            translations = w.f16945a;
        }
        return new Workspace(date, listMapSurveys, integrations, panelAnswerUrlTemplate, listMapMobileTargetingEvents, targetingEventsEnabled, zBooleanValue, zBooleanValue2, translations).translatedTo(str);
    }

    private static final void validateAnswerType(SurveyPoint surveyPoint) {
        if (SurveyAnswerType.INSTANCE.fromString(surveyPoint.getAnswerType()) != null) {
            return;
        }
        throw new IllegalArgumentException(("Unknown answer type: " + surveyPoint.getAnswerType()).toString());
    }

    private static final void validatePointSettings(SurveyPoint surveyPoint) {
        if (surveyPoint instanceof SurveyCtaSurveyPoint) {
            if (((SurveyCtaSurveyPoint) surveyPoint).getCtaSettings() == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            return;
        }
        if (surveyPoint instanceof SurveyFormSurveyPoint) {
            if (((SurveyFormSurveyPoint) surveyPoint).getSettings() == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            return;
        }
        if (surveyPoint instanceof SurveyNpsSurveyPoint) {
            if (((SurveyNpsSurveyPoint) surveyPoint).getSettings() == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            if (!(surveyPoint instanceof SurveyQuestionSurveyPoint)) {
                throw new IllegalArgumentException("Unknown survey point type: " + surveyPoint.getType());
            }
            SurveyQuestionSurveyPoint surveyQuestionSurveyPoint = (SurveyQuestionSurveyPoint) surveyPoint;
            if (surveyQuestionSurveyPoint.getSettings() == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            validatePossibleAnswers(surveyQuestionSurveyPoint);
        }
    }

    private static final void validatePossibleAnswers(SurveyQuestionSurveyPoint surveyQuestionSurveyPoint) {
        if (l.a(surveyQuestionSurveyPoint.getAnswerType(), SurveyAnswerType.TEXT.getKey()) || l.a(surveyQuestionSurveyPoint.getAnswerType(), SurveyAnswerType.DATE.getKey())) {
            return;
        }
        Iterator<QuestionPointAnswer> it = surveyQuestionSurveyPoint.getAnswers().iterator();
        while (it.hasNext()) {
            if (it.next().getPossibleAnswer() == null) {
                throw new IllegalArgumentException(("The possibleAnswer value is missing for answer type: " + surveyQuestionSurveyPoint.getAnswerType()).toString());
            }
        }
        if (l.a(surveyQuestionSurveyPoint.getAnswerType(), SurveyAnswerType.SMILEY_SCALE.getKey())) {
            validateSmileyScaleAnswers(surveyQuestionSurveyPoint.getAnswers());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[LOOP:1: B:20:0x0062->B:22:0x0068, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void validateSmileyScaleAnswers(java.util.List<com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer> r5) {
        /*
            java.lang.String r0 = "answers"
            br.l.e(r5, r0)
            int r0 = r5.size()
            r1 = 0
            r2 = 3
            if (r0 == r2) goto L14
            int r0 = r5.size()
            r3 = 5
            if (r0 != r3) goto L7a
        L14:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L1b
            goto L32
        L1b:
            java.util.Iterator r0 = r5.iterator()
        L1f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L32
            java.lang.Object r3 = r0.next()
            com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer r3 = (com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer) r3
            java.lang.String r3 = r3.getPossibleAnswer()
            if (r3 != 0) goto L1f
            goto L7a
        L32:
            int r0 = r5.size()
            java.lang.String r1 = "Happy"
            java.lang.String r3 = "Neutral"
            java.lang.String r4 = "Unsatisfied"
            if (r0 != r2) goto L47
            java.lang.String[] r0 = new java.lang.String[]{r4, r3, r1}
            java.util.List r0 = com.google.android.gms.internal.measurement.e5.I(r0)
            goto L53
        L47:
            java.lang.String r0 = "Extremely unsatisfied"
            java.lang.String r2 = "Extremely happy"
            java.lang.String[] r0 = new java.lang.String[]{r0, r4, r3, r1, r2}
            java.util.List r0 = com.google.android.gms.internal.measurement.e5.I(r0)
        L53:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = mq.p.a0(r5, r2)
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L62:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L76
            java.lang.Object r2 = r5.next()
            com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer r2 = (com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer) r2
            java.lang.String r2 = r2.getPossibleAnswer()
            r1.add(r2)
            goto L62
        L76:
            boolean r1 = r1.equals(r0)
        L7a:
            if (r1 == 0) goto L7d
            return
        L7d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid Smiley Scale answer options"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.survicate.surveys.infrastructure.network.NetworkWorkspaceKt.validateSmileyScaleAnswers(java.util.List):void");
    }

    private static final void validateSurveyPoints(List<? extends SurveyPoint> list) {
        for (SurveyPoint surveyPoint : list) {
            validatePointSettings(surveyPoint);
            validateAnswerType(surveyPoint);
        }
    }
}
