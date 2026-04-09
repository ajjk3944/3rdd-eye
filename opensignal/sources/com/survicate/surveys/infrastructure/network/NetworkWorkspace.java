package com.survicate.surveys.infrastructure.network;

import br.g;
import br.l;
import c7.a;
import com.survicate.surveys.entities.survey.Integration;
import com.survicate.surveys.entities.survey.NetworkSurvey;
import com.survicate.surveys.entities.survey.NetworkTargetingEvent;
import com.survicate.surveys.entities.survey.audience.NetworkAudience;
import com.survicate.surveys.entities.survey.theme.Theme;
import com.survicate.surveys.entities.survey.translations.SurveyTranslation;
import h0.b;
import java.util.List;
import kotlin.Metadata;
import mq.w;
import nk.o;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\u000e\b\u0003\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\b\b\u0001\u0010\u0011\u001a\u00020\n\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0001\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0003¢\u0006\u0002\u0010\u0016J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003HÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ¦\u0001\u00102\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0003\u0010\r\u001a\u00020\u000e2\u000e\b\u0003\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0003\u0010\u0011\u001a\u00020\n2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u000eHÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018¨\u00069"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/NetworkWorkspace;", "", "surveys", "", "Lcom/survicate/surveys/entities/survey/NetworkSurvey;", "themes", "Lcom/survicate/surveys/entities/survey/theme/Theme;", "audiences", "Lcom/survicate/surveys/entities/survey/audience/NetworkAudience;", "installing", "", "integrations", "Lcom/survicate/surveys/entities/survey/Integration;", "panelAnswerUrlTemplate", "", "targetingEvents", "Lcom/survicate/surveys/entities/survey/NetworkTargetingEvent;", "targetingEventsEnabled", "backendTargetingEnabled", "enforceUserAuthentication", "translations", "Lcom/survicate/surveys/entities/survey/translations/SurveyTranslation;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/List;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V", "getAudiences", "()Ljava/util/List;", "getBackendTargetingEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnforceUserAuthentication", "getInstalling", "()Z", "getIntegrations", "getPanelAnswerUrlTemplate", "()Ljava/lang/String;", "getSurveys", "getTargetingEvents", "getTargetingEventsEnabled", "getThemes", "getTranslations", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/List;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Lcom/survicate/surveys/infrastructure/network/NetworkWorkspace;", "equals", "other", "hashCode", "", "toString", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class NetworkWorkspace {
    private final List<NetworkAudience> audiences;
    private final Boolean backendTargetingEnabled;
    private final Boolean enforceUserAuthentication;
    private final boolean installing;
    private final List<Integration> integrations;
    private final String panelAnswerUrlTemplate;
    private final List<NetworkSurvey> surveys;
    private final List<NetworkTargetingEvent> targetingEvents;
    private final boolean targetingEventsEnabled;
    private final List<Theme> themes;
    private final List<SurveyTranslation> translations;

    public NetworkWorkspace(@o(name = "surveys") List<NetworkSurvey> list, @o(name = "themes") List<Theme> list2, @o(name = "audiences") List<NetworkAudience> list3, @o(name = "installing") boolean z10, @o(name = "integrations") List<Integration> list4, @o(name = "panel_answer_url") String str, @o(name = "targeting_events") List<NetworkTargetingEvent> list5, @o(name = "targeting_events_enabled") boolean z11, @o(name = "backend_targeting_enabled") Boolean bool, @o(name = "enforce_user_authentication") Boolean bool2, @o(name = "translations") List<SurveyTranslation> list6) {
        l.e(list, "surveys");
        l.e(list2, "themes");
        l.e(list3, "audiences");
        l.e(list4, "integrations");
        l.e(str, "panelAnswerUrlTemplate");
        l.e(list5, "targetingEvents");
        this.surveys = list;
        this.themes = list2;
        this.audiences = list3;
        this.installing = z10;
        this.integrations = list4;
        this.panelAnswerUrlTemplate = str;
        this.targetingEvents = list5;
        this.targetingEventsEnabled = z11;
        this.backendTargetingEnabled = bool;
        this.enforceUserAuthentication = bool2;
        this.translations = list6;
    }

    public static /* synthetic */ NetworkWorkspace copy$default(NetworkWorkspace networkWorkspace, List list, List list2, List list3, boolean z10, List list4, String str, List list5, boolean z11, Boolean bool, Boolean bool2, List list6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = networkWorkspace.surveys;
        }
        if ((i10 & 2) != 0) {
            list2 = networkWorkspace.themes;
        }
        if ((i10 & 4) != 0) {
            list3 = networkWorkspace.audiences;
        }
        if ((i10 & 8) != 0) {
            z10 = networkWorkspace.installing;
        }
        if ((i10 & 16) != 0) {
            list4 = networkWorkspace.integrations;
        }
        if ((i10 & 32) != 0) {
            str = networkWorkspace.panelAnswerUrlTemplate;
        }
        if ((i10 & 64) != 0) {
            list5 = networkWorkspace.targetingEvents;
        }
        if ((i10 & 128) != 0) {
            z11 = networkWorkspace.targetingEventsEnabled;
        }
        if ((i10 & 256) != 0) {
            bool = networkWorkspace.backendTargetingEnabled;
        }
        if ((i10 & 512) != 0) {
            bool2 = networkWorkspace.enforceUserAuthentication;
        }
        if ((i10 & 1024) != 0) {
            list6 = networkWorkspace.translations;
        }
        Boolean bool3 = bool2;
        List list7 = list6;
        boolean z12 = z11;
        Boolean bool4 = bool;
        String str2 = str;
        List list8 = list5;
        List list9 = list4;
        List list10 = list3;
        return networkWorkspace.copy(list, list2, list10, z10, list9, str2, list8, z12, bool4, bool3, list7);
    }

    public final List<NetworkSurvey> component1() {
        return this.surveys;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getEnforceUserAuthentication() {
        return this.enforceUserAuthentication;
    }

    public final List<SurveyTranslation> component11() {
        return this.translations;
    }

    public final List<Theme> component2() {
        return this.themes;
    }

    public final List<NetworkAudience> component3() {
        return this.audiences;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getInstalling() {
        return this.installing;
    }

    public final List<Integration> component5() {
        return this.integrations;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPanelAnswerUrlTemplate() {
        return this.panelAnswerUrlTemplate;
    }

    public final List<NetworkTargetingEvent> component7() {
        return this.targetingEvents;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getTargetingEventsEnabled() {
        return this.targetingEventsEnabled;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getBackendTargetingEnabled() {
        return this.backendTargetingEnabled;
    }

    public final NetworkWorkspace copy(@o(name = "surveys") List<NetworkSurvey> surveys, @o(name = "themes") List<Theme> themes, @o(name = "audiences") List<NetworkAudience> audiences, @o(name = "installing") boolean installing, @o(name = "integrations") List<Integration> integrations, @o(name = "panel_answer_url") String panelAnswerUrlTemplate, @o(name = "targeting_events") List<NetworkTargetingEvent> targetingEvents, @o(name = "targeting_events_enabled") boolean targetingEventsEnabled, @o(name = "backend_targeting_enabled") Boolean backendTargetingEnabled, @o(name = "enforce_user_authentication") Boolean enforceUserAuthentication, @o(name = "translations") List<SurveyTranslation> translations) {
        l.e(surveys, "surveys");
        l.e(themes, "themes");
        l.e(audiences, "audiences");
        l.e(integrations, "integrations");
        l.e(panelAnswerUrlTemplate, "panelAnswerUrlTemplate");
        l.e(targetingEvents, "targetingEvents");
        return new NetworkWorkspace(surveys, themes, audiences, installing, integrations, panelAnswerUrlTemplate, targetingEvents, targetingEventsEnabled, backendTargetingEnabled, enforceUserAuthentication, translations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkWorkspace)) {
            return false;
        }
        NetworkWorkspace networkWorkspace = (NetworkWorkspace) other;
        return l.a(this.surveys, networkWorkspace.surveys) && l.a(this.themes, networkWorkspace.themes) && l.a(this.audiences, networkWorkspace.audiences) && this.installing == networkWorkspace.installing && l.a(this.integrations, networkWorkspace.integrations) && l.a(this.panelAnswerUrlTemplate, networkWorkspace.panelAnswerUrlTemplate) && l.a(this.targetingEvents, networkWorkspace.targetingEvents) && this.targetingEventsEnabled == networkWorkspace.targetingEventsEnabled && l.a(this.backendTargetingEnabled, networkWorkspace.backendTargetingEnabled) && l.a(this.enforceUserAuthentication, networkWorkspace.enforceUserAuthentication) && l.a(this.translations, networkWorkspace.translations);
    }

    public final List<NetworkAudience> getAudiences() {
        return this.audiences;
    }

    public final Boolean getBackendTargetingEnabled() {
        return this.backendTargetingEnabled;
    }

    public final Boolean getEnforceUserAuthentication() {
        return this.enforceUserAuthentication;
    }

    public final boolean getInstalling() {
        return this.installing;
    }

    public final List<Integration> getIntegrations() {
        return this.integrations;
    }

    public final String getPanelAnswerUrlTemplate() {
        return this.panelAnswerUrlTemplate;
    }

    public final List<NetworkSurvey> getSurveys() {
        return this.surveys;
    }

    public final List<NetworkTargetingEvent> getTargetingEvents() {
        return this.targetingEvents;
    }

    public final boolean getTargetingEventsEnabled() {
        return this.targetingEventsEnabled;
    }

    public final List<Theme> getThemes() {
        return this.themes;
    }

    public final List<SurveyTranslation> getTranslations() {
        return this.translations;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iC = b.c(b.c(this.surveys.hashCode() * 31, 31, this.themes), 31, this.audiences);
        boolean z10 = this.installing;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int iC2 = b.c(a.g(this.panelAnswerUrlTemplate, b.c((iC + i10) * 31, 31, this.integrations), 31), 31, this.targetingEvents);
        boolean z11 = this.targetingEventsEnabled;
        int i11 = (iC2 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
        Boolean bool = this.backendTargetingEnabled;
        int iHashCode = (i11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enforceUserAuthentication;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<SurveyTranslation> list = this.translations;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkWorkspace(surveys=");
        sb2.append(this.surveys);
        sb2.append(", themes=");
        sb2.append(this.themes);
        sb2.append(", audiences=");
        sb2.append(this.audiences);
        sb2.append(", installing=");
        sb2.append(this.installing);
        sb2.append(", integrations=");
        sb2.append(this.integrations);
        sb2.append(", panelAnswerUrlTemplate=");
        sb2.append(this.panelAnswerUrlTemplate);
        sb2.append(", targetingEvents=");
        sb2.append(this.targetingEvents);
        sb2.append(", targetingEventsEnabled=");
        sb2.append(this.targetingEventsEnabled);
        sb2.append(", backendTargetingEnabled=");
        sb2.append(this.backendTargetingEnabled);
        sb2.append(", enforceUserAuthentication=");
        sb2.append(this.enforceUserAuthentication);
        sb2.append(", translations=");
        return b.t(sb2, this.translations, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NetworkWorkspace(List list, List list2, List list3, boolean z10, List list4, String str, List list5, boolean z11, Boolean bool, Boolean bool2, List list6, int i10, g gVar) {
        List list7;
        Boolean bool3;
        Boolean bool4;
        boolean z12;
        List list8;
        int i11 = i10 & 1;
        w wVar = w.f16945a;
        list = i11 != 0 ? wVar : list;
        list2 = (i10 & 2) != 0 ? wVar : list2;
        list3 = (i10 & 4) != 0 ? wVar : list3;
        list4 = (i10 & 16) != 0 ? wVar : list4;
        if ((i10 & 64) != 0) {
            list7 = list6;
            bool3 = bool2;
            bool4 = bool;
            z12 = z11;
            list8 = wVar;
        } else {
            list7 = list6;
            bool3 = bool2;
            bool4 = bool;
            z12 = z11;
            list8 = list5;
        }
        this(list, list2, list3, z10, list4, str, list8, z12, bool4, bool3, list7);
    }
}
