package com.survicate.surveys.entities.survey.translations;

import br.l;
import c7.a;
import h0.b;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/survicate/surveys/entities/survey/translations/SurveyTranslation;", "", "id", "", "languageCode", "points", "", "Lcom/survicate/surveys/entities/survey/translations/SurveyPointTranslation;", "settings", "Lcom/survicate/surveys/entities/survey/translations/SurveySettingsTranslation;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/survicate/surveys/entities/survey/translations/SurveySettingsTranslation;)V", "getId", "()Ljava/lang/String;", "getLanguageCode", "getPoints", "()Ljava/util/List;", "getSettings", "()Lcom/survicate/surveys/entities/survey/translations/SurveySettingsTranslation;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveyTranslation {
    private final String id;
    private final String languageCode;
    private final List<SurveyPointTranslation> points;
    private final SurveySettingsTranslation settings;

    public SurveyTranslation(String str, String str2, List<SurveyPointTranslation> list, SurveySettingsTranslation surveySettingsTranslation) {
        l.e(str, "id");
        l.e(str2, "languageCode");
        l.e(list, "points");
        l.e(surveySettingsTranslation, "settings");
        this.id = str;
        this.languageCode = str2;
        this.points = list;
        this.settings = surveySettingsTranslation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SurveyTranslation copy$default(SurveyTranslation surveyTranslation, String str, String str2, List list, SurveySettingsTranslation surveySettingsTranslation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = surveyTranslation.id;
        }
        if ((i10 & 2) != 0) {
            str2 = surveyTranslation.languageCode;
        }
        if ((i10 & 4) != 0) {
            list = surveyTranslation.points;
        }
        if ((i10 & 8) != 0) {
            surveySettingsTranslation = surveyTranslation.settings;
        }
        return surveyTranslation.copy(str, str2, list, surveySettingsTranslation);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final List<SurveyPointTranslation> component3() {
        return this.points;
    }

    /* renamed from: component4, reason: from getter */
    public final SurveySettingsTranslation getSettings() {
        return this.settings;
    }

    public final SurveyTranslation copy(String id2, String languageCode, List<SurveyPointTranslation> points, SurveySettingsTranslation settings) {
        l.e(id2, "id");
        l.e(languageCode, "languageCode");
        l.e(points, "points");
        l.e(settings, "settings");
        return new SurveyTranslation(id2, languageCode, points, settings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyTranslation)) {
            return false;
        }
        SurveyTranslation surveyTranslation = (SurveyTranslation) other;
        return l.a(this.id, surveyTranslation.id) && l.a(this.languageCode, surveyTranslation.languageCode) && l.a(this.points, surveyTranslation.points) && l.a(this.settings, surveyTranslation.settings);
    }

    public final String getId() {
        return this.id;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final List<SurveyPointTranslation> getPoints() {
        return this.points;
    }

    public final SurveySettingsTranslation getSettings() {
        return this.settings;
    }

    public int hashCode() {
        return this.settings.hashCode() + b.c(a.g(this.languageCode, this.id.hashCode() * 31, 31), 31, this.points);
    }

    public String toString() {
        return "SurveyTranslation(id=" + this.id + ", languageCode=" + this.languageCode + ", points=" + this.points + ", settings=" + this.settings + ')';
    }
}
