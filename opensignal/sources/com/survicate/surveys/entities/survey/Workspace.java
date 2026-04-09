package com.survicate.surveys.entities.survey;

import br.l;
import c7.a;
import com.survicate.surveys.entities.models.EventSuggestion;
import com.survicate.surveys.entities.survey.translations.SurveyTranslation;
import h0.b;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bg\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\u0002\u0010\u0013Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\u0002\u0010\u0015J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005HÂ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003J\u008b\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005HÆ\u0001J\u0013\u0010-\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\nHÖ\u0001J\u000e\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\nR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/survicate/surveys/entities/survey/Workspace;", "", "lastUpdatedAt", "Ljava/util/Date;", "surveys", "", "Lcom/survicate/surveys/entities/survey/Survey;", "integrations", "Lcom/survicate/surveys/entities/survey/Integration;", "panelAnswerUrlTemplate", "", "eventSuggestions", "Lcom/survicate/surveys/entities/models/EventSuggestion;", "eventSuggestionsEnabled", "", "backendTargetingEnabled", "enforceUserAuthentication", "translations", "Lcom/survicate/surveys/entities/survey/translations/SurveyTranslation;", "(Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZZZLjava/util/List;)V", "baseLanguageSurveys", "(Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZZZLjava/util/List;Ljava/util/List;)V", "getBackendTargetingEnabled", "()Z", "getEnforceUserAuthentication", "getEventSuggestions", "()Ljava/util/List;", "getEventSuggestionsEnabled", "getIntegrations", "getLastUpdatedAt", "()Ljava/util/Date;", "getPanelAnswerUrlTemplate", "()Ljava/lang/String;", "getSurveys", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "translatedTo", "locale", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Workspace {
    private final boolean backendTargetingEnabled;
    private final List<Survey> baseLanguageSurveys;
    private final boolean enforceUserAuthentication;
    private final List<EventSuggestion> eventSuggestions;
    private final boolean eventSuggestionsEnabled;
    private final List<Integration> integrations;
    private final Date lastUpdatedAt;
    private final String panelAnswerUrlTemplate;
    private final List<Survey> surveys;
    private final List<SurveyTranslation> translations;

    public Workspace(Date date, List<Survey> list, List<Integration> list2, String str, List<EventSuggestion> list3, boolean z10, boolean z11, boolean z12, List<Survey> list4, List<SurveyTranslation> list5) {
        l.e(date, "lastUpdatedAt");
        l.e(list, "surveys");
        l.e(list2, "integrations");
        l.e(str, "panelAnswerUrlTemplate");
        l.e(list3, "eventSuggestions");
        l.e(list4, "baseLanguageSurveys");
        l.e(list5, "translations");
        this.lastUpdatedAt = date;
        this.surveys = list;
        this.integrations = list2;
        this.panelAnswerUrlTemplate = str;
        this.eventSuggestions = list3;
        this.eventSuggestionsEnabled = z10;
        this.backendTargetingEnabled = z11;
        this.enforceUserAuthentication = z12;
        this.baseLanguageSurveys = list4;
        this.translations = list5;
    }

    private final List<SurveyTranslation> component10() {
        return this.translations;
    }

    private final List<Survey> component9() {
        return this.baseLanguageSurveys;
    }

    public static /* synthetic */ Workspace copy$default(Workspace workspace, Date date, List list, List list2, String str, List list3, boolean z10, boolean z11, boolean z12, List list4, List list5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            date = workspace.lastUpdatedAt;
        }
        if ((i10 & 2) != 0) {
            list = workspace.surveys;
        }
        if ((i10 & 4) != 0) {
            list2 = workspace.integrations;
        }
        if ((i10 & 8) != 0) {
            str = workspace.panelAnswerUrlTemplate;
        }
        if ((i10 & 16) != 0) {
            list3 = workspace.eventSuggestions;
        }
        if ((i10 & 32) != 0) {
            z10 = workspace.eventSuggestionsEnabled;
        }
        if ((i10 & 64) != 0) {
            z11 = workspace.backendTargetingEnabled;
        }
        if ((i10 & 128) != 0) {
            z12 = workspace.enforceUserAuthentication;
        }
        if ((i10 & 256) != 0) {
            list4 = workspace.baseLanguageSurveys;
        }
        if ((i10 & 512) != 0) {
            list5 = workspace.translations;
        }
        List list6 = list4;
        List list7 = list5;
        boolean z13 = z11;
        boolean z14 = z12;
        List list8 = list3;
        boolean z15 = z10;
        return workspace.copy(date, list, list2, str, list8, z15, z13, z14, list6, list7);
    }

    /* renamed from: component1, reason: from getter */
    public final Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public final List<Survey> component2() {
        return this.surveys;
    }

    public final List<Integration> component3() {
        return this.integrations;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPanelAnswerUrlTemplate() {
        return this.panelAnswerUrlTemplate;
    }

    public final List<EventSuggestion> component5() {
        return this.eventSuggestions;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getEventSuggestionsEnabled() {
        return this.eventSuggestionsEnabled;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getBackendTargetingEnabled() {
        return this.backendTargetingEnabled;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getEnforceUserAuthentication() {
        return this.enforceUserAuthentication;
    }

    public final Workspace copy(Date lastUpdatedAt, List<Survey> surveys, List<Integration> integrations, String panelAnswerUrlTemplate, List<EventSuggestion> eventSuggestions, boolean eventSuggestionsEnabled, boolean backendTargetingEnabled, boolean enforceUserAuthentication, List<Survey> baseLanguageSurveys, List<SurveyTranslation> translations) {
        l.e(lastUpdatedAt, "lastUpdatedAt");
        l.e(surveys, "surveys");
        l.e(integrations, "integrations");
        l.e(panelAnswerUrlTemplate, "panelAnswerUrlTemplate");
        l.e(eventSuggestions, "eventSuggestions");
        l.e(baseLanguageSurveys, "baseLanguageSurveys");
        l.e(translations, "translations");
        return new Workspace(lastUpdatedAt, surveys, integrations, panelAnswerUrlTemplate, eventSuggestions, eventSuggestionsEnabled, backendTargetingEnabled, enforceUserAuthentication, baseLanguageSurveys, translations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Workspace)) {
            return false;
        }
        Workspace workspace = (Workspace) other;
        return l.a(this.lastUpdatedAt, workspace.lastUpdatedAt) && l.a(this.surveys, workspace.surveys) && l.a(this.integrations, workspace.integrations) && l.a(this.panelAnswerUrlTemplate, workspace.panelAnswerUrlTemplate) && l.a(this.eventSuggestions, workspace.eventSuggestions) && this.eventSuggestionsEnabled == workspace.eventSuggestionsEnabled && this.backendTargetingEnabled == workspace.backendTargetingEnabled && this.enforceUserAuthentication == workspace.enforceUserAuthentication && l.a(this.baseLanguageSurveys, workspace.baseLanguageSurveys) && l.a(this.translations, workspace.translations);
    }

    public final boolean getBackendTargetingEnabled() {
        return this.backendTargetingEnabled;
    }

    public final boolean getEnforceUserAuthentication() {
        return this.enforceUserAuthentication;
    }

    public final List<EventSuggestion> getEventSuggestions() {
        return this.eventSuggestions;
    }

    public final boolean getEventSuggestionsEnabled() {
        return this.eventSuggestionsEnabled;
    }

    public final List<Integration> getIntegrations() {
        return this.integrations;
    }

    public final Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public final String getPanelAnswerUrlTemplate() {
        return this.panelAnswerUrlTemplate;
    }

    public final List<Survey> getSurveys() {
        return this.surveys;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iC = b.c(a.g(this.panelAnswerUrlTemplate, b.c(b.c(this.lastUpdatedAt.hashCode() * 31, 31, this.surveys), 31, this.integrations), 31), 31, this.eventSuggestions);
        boolean z10 = this.eventSuggestionsEnabled;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iC + i10) * 31;
        boolean z11 = this.backendTargetingEnabled;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.enforceUserAuthentication;
        return this.translations.hashCode() + b.c((i13 + (z12 ? 1 : z12 ? 1 : 0)) * 31, 31, this.baseLanguageSurveys);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Workspace(lastUpdatedAt=");
        sb2.append(this.lastUpdatedAt);
        sb2.append(", surveys=");
        sb2.append(this.surveys);
        sb2.append(", integrations=");
        sb2.append(this.integrations);
        sb2.append(", panelAnswerUrlTemplate=");
        sb2.append(this.panelAnswerUrlTemplate);
        sb2.append(", eventSuggestions=");
        sb2.append(this.eventSuggestions);
        sb2.append(", eventSuggestionsEnabled=");
        sb2.append(this.eventSuggestionsEnabled);
        sb2.append(", backendTargetingEnabled=");
        sb2.append(this.backendTargetingEnabled);
        sb2.append(", enforceUserAuthentication=");
        sb2.append(this.enforceUserAuthentication);
        sb2.append(", baseLanguageSurveys=");
        sb2.append(this.baseLanguageSurveys);
        sb2.append(", translations=");
        return b.t(sb2, this.translations, ')');
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.survicate.surveys.entities.survey.Workspace translatedTo(java.lang.String r15) throws java.io.IOException {
        /*
            r14 = this;
            java.lang.String r0 = "locale"
            br.l.e(r15, r0)
            java.util.List<com.survicate.surveys.entities.survey.Survey> r0 = r14.baseLanguageSurveys
            java.util.ArrayList r3 = new java.util.ArrayList
            r1 = 10
            int r1 = mq.p.a0(r0, r1)
            r3.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb1
            java.lang.Object r1 = r0.next()
            com.survicate.surveys.entities.survey.Survey r1 = (com.survicate.surveys.entities.survey.Survey) r1
            java.util.List r2 = iq.d.f12924a
            java.lang.String r2 = r1.getId()
            java.util.List<com.survicate.surveys.entities.survey.translations.SurveyTranslation> r4 = r14.translations
            java.lang.String r5 = "surveyId"
            br.l.e(r2, r5)
            java.lang.String r5 = "translations"
            br.l.e(r4, r5)
            java.lang.String r5 = "-"
            java.lang.String[] r6 = new java.lang.String[]{r5}
            r7 = 6
            java.util.List r6 = tt.l.N0(r15, r6, r7)
            r7 = 2
            java.util.List r8 = mq.o.N0(r7, r6)
            r12 = 0
            r13 = 62
            java.lang.String r9 = "-"
            r10 = 0
            r11 = 0
            java.lang.String r6 = mq.o.x0(r8, r9, r10, r11, r12, r13)
            com.survicate.surveys.entities.survey.translations.SurveyTranslation r7 = iq.d.a(r2, r6, r4)
            if (r7 == 0) goto L56
            goto La8
        L56:
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r8 = "US"
            br.l.d(r7, r8)
            java.lang.String r7 = r6.toLowerCase(r7)
            java.lang.String r8 = "toLowerCase(...)"
            br.l.d(r7, r8)
            r8 = 0
            java.lang.String r9 = "zh"
            boolean r8 = tt.s.n0(r7, r9, r8)
            r10 = 0
            if (r8 != 0) goto L72
        L70:
            r7 = r10
            goto L9d
        L72:
            java.util.List r8 = iq.d.f12924a
            boolean r8 = r8.contains(r7)
            if (r8 == 0) goto L89
            java.lang.String r7 = "zh-tw"
            com.survicate.surveys.entities.survey.translations.SurveyTranslation r7 = iq.d.a(r2, r7, r4)
            if (r7 != 0) goto L9d
            java.lang.String r7 = "zh-hant"
            com.survicate.surveys.entities.survey.translations.SurveyTranslation r7 = iq.d.a(r2, r7, r4)
            goto L9d
        L89:
            java.util.List r8 = iq.d.f12925b
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L70
            com.survicate.surveys.entities.survey.translations.SurveyTranslation r7 = iq.d.a(r2, r9, r4)
            if (r7 != 0) goto L9d
            java.lang.String r7 = "zh-hans"
            com.survicate.surveys.entities.survey.translations.SurveyTranslation r7 = iq.d.a(r2, r7, r4)
        L9d:
            if (r7 == 0) goto La0
            goto La8
        La0:
            java.lang.String r5 = tt.l.V0(r6, r5)
            com.survicate.surveys.entities.survey.translations.SurveyTranslation r7 = iq.d.a(r2, r5, r4)
        La8:
            com.survicate.surveys.entities.survey.Survey r1 = r1.translatedWith(r7)
            r3.add(r1)
            goto L16
        Lb1:
            r12 = 1021(0x3fd, float:1.431E-42)
            r13 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r1 = r14
            com.survicate.surveys.entities.survey.Workspace r15 = copy$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.survicate.surveys.entities.survey.Workspace.translatedTo(java.lang.String):com.survicate.surveys.entities.survey.Workspace");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Workspace(Date date, List<Survey> list, List<Integration> list2, String str, List<EventSuggestion> list3, boolean z10, boolean z11, boolean z12, List<SurveyTranslation> list4) {
        this(date, list, list2, str, list3, z10, z11, z12, list, list4);
        l.e(date, "lastUpdatedAt");
        l.e(list, "surveys");
        l.e(list2, "integrations");
        l.e(str, "panelAnswerUrlTemplate");
        l.e(list3, "eventSuggestions");
        l.e(list4, "translations");
    }
}
