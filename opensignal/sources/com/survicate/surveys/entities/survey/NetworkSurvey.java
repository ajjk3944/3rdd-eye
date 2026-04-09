package com.survicate.surveys.entities.survey;

import br.l;
import c7.a;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import h0.b;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003J\t\u0010(\u001a\u00020\u0011HÆ\u0003J}\u0010)\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0011HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017¨\u0006/"}, d2 = {"Lcom/survicate/surveys/entities/survey/NetworkSurvey;", "", "id", "", "name", "type", "points", "", "Lcom/survicate/surveys/entities/survey/questions/SurveyPoint;", "screens", "events", "Lcom/survicate/surveys/entities/survey/EventTrigger;", "audiencesIds", "", "settings", "Lcom/survicate/surveys/entities/survey/SurveySettings;", "themeId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/survicate/surveys/entities/survey/SurveySettings;I)V", "getAudiencesIds", "()Ljava/util/List;", "getEvents", "getId", "()Ljava/lang/String;", "getName", "getPoints", "getScreens", "getSettings", "()Lcom/survicate/surveys/entities/survey/SurveySettings;", "getThemeId", "()I", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class NetworkSurvey {
    private final List<Long> audiencesIds;
    private final List<EventTrigger> events;
    private final String id;
    private final String name;
    private final List<SurveyPoint> points;
    private final List<String> screens;
    private final SurveySettings settings;
    private final int themeId;
    private final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkSurvey(@o(name = "id") String str, @o(name = "name") String str2, @o(name = "type") String str3, @o(name = "points") List<? extends SurveyPoint> list, @o(name = "screens") List<String> list2, @o(name = "events") List<EventTrigger> list3, @o(name = "audiences_ids") List<Long> list4, @o(name = "settings") SurveySettings surveySettings, @o(name = "theme_id") int i10) {
        l.e(str, "id");
        l.e(str3, "type");
        l.e(list, "points");
        l.e(list2, "screens");
        l.e(list3, "events");
        l.e(list4, "audiencesIds");
        l.e(surveySettings, "settings");
        this.id = str;
        this.name = str2;
        this.type = str3;
        this.points = list;
        this.screens = list2;
        this.events = list3;
        this.audiencesIds = list4;
        this.settings = surveySettings;
        this.themeId = i10;
    }

    public static /* synthetic */ NetworkSurvey copy$default(NetworkSurvey networkSurvey, String str, String str2, String str3, List list, List list2, List list3, List list4, SurveySettings surveySettings, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = networkSurvey.id;
        }
        if ((i11 & 2) != 0) {
            str2 = networkSurvey.name;
        }
        if ((i11 & 4) != 0) {
            str3 = networkSurvey.type;
        }
        if ((i11 & 8) != 0) {
            list = networkSurvey.points;
        }
        if ((i11 & 16) != 0) {
            list2 = networkSurvey.screens;
        }
        if ((i11 & 32) != 0) {
            list3 = networkSurvey.events;
        }
        if ((i11 & 64) != 0) {
            list4 = networkSurvey.audiencesIds;
        }
        if ((i11 & 128) != 0) {
            surveySettings = networkSurvey.settings;
        }
        if ((i11 & 256) != 0) {
            i10 = networkSurvey.themeId;
        }
        SurveySettings surveySettings2 = surveySettings;
        int i12 = i10;
        List list5 = list3;
        List list6 = list4;
        List list7 = list2;
        String str4 = str3;
        return networkSurvey.copy(str, str2, str4, list, list7, list5, list6, surveySettings2, i12);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<SurveyPoint> component4() {
        return this.points;
    }

    public final List<String> component5() {
        return this.screens;
    }

    public final List<EventTrigger> component6() {
        return this.events;
    }

    public final List<Long> component7() {
        return this.audiencesIds;
    }

    /* renamed from: component8, reason: from getter */
    public final SurveySettings getSettings() {
        return this.settings;
    }

    /* renamed from: component9, reason: from getter */
    public final int getThemeId() {
        return this.themeId;
    }

    public final NetworkSurvey copy(@o(name = "id") String id2, @o(name = "name") String name, @o(name = "type") String type, @o(name = "points") List<? extends SurveyPoint> points, @o(name = "screens") List<String> screens, @o(name = "events") List<EventTrigger> events, @o(name = "audiences_ids") List<Long> audiencesIds, @o(name = "settings") SurveySettings settings, @o(name = "theme_id") int themeId) {
        l.e(id2, "id");
        l.e(type, "type");
        l.e(points, "points");
        l.e(screens, "screens");
        l.e(events, "events");
        l.e(audiencesIds, "audiencesIds");
        l.e(settings, "settings");
        return new NetworkSurvey(id2, name, type, points, screens, events, audiencesIds, settings, themeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSurvey)) {
            return false;
        }
        NetworkSurvey networkSurvey = (NetworkSurvey) other;
        return l.a(this.id, networkSurvey.id) && l.a(this.name, networkSurvey.name) && l.a(this.type, networkSurvey.type) && l.a(this.points, networkSurvey.points) && l.a(this.screens, networkSurvey.screens) && l.a(this.events, networkSurvey.events) && l.a(this.audiencesIds, networkSurvey.audiencesIds) && l.a(this.settings, networkSurvey.settings) && this.themeId == networkSurvey.themeId;
    }

    public final List<Long> getAudiencesIds() {
        return this.audiencesIds;
    }

    public final List<EventTrigger> getEvents() {
        return this.events;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final List<SurveyPoint> getPoints() {
        return this.points;
    }

    public final List<String> getScreens() {
        return this.screens;
    }

    public final SurveySettings getSettings() {
        return this.settings;
    }

    public final int getThemeId() {
        return this.themeId;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.name;
        return Integer.hashCode(this.themeId) + ((this.settings.hashCode() + b.c(b.c(b.c(b.c(a.g(this.type, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.points), 31, this.screens), 31, this.events), 31, this.audiencesIds)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkSurvey(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", points=");
        sb2.append(this.points);
        sb2.append(", screens=");
        sb2.append(this.screens);
        sb2.append(", events=");
        sb2.append(this.events);
        sb2.append(", audiencesIds=");
        sb2.append(this.audiencesIds);
        sb2.append(", settings=");
        sb2.append(this.settings);
        sb2.append(", themeId=");
        return a.q(sb2, this.themeId, ')');
    }
}
