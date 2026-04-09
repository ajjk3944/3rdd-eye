package com.survicate.surveys.entities.models;

import br.l;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/survicate/surveys/entities/models/SurveyPointDisplayRequest;", "", "surveyPoint", "Lcom/survicate/surveys/entities/survey/questions/SurveyPoint;", "isNavigatingBack", "", "(Lcom/survicate/surveys/entities/survey/questions/SurveyPoint;Z)V", "()Z", "getSurveyPoint", "()Lcom/survicate/surveys/entities/survey/questions/SurveyPoint;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveyPointDisplayRequest {
    private final boolean isNavigatingBack;
    private final SurveyPoint surveyPoint;

    public SurveyPointDisplayRequest(SurveyPoint surveyPoint, boolean z10) {
        l.e(surveyPoint, "surveyPoint");
        this.surveyPoint = surveyPoint;
        this.isNavigatingBack = z10;
    }

    public static /* synthetic */ SurveyPointDisplayRequest copy$default(SurveyPointDisplayRequest surveyPointDisplayRequest, SurveyPoint surveyPoint, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            surveyPoint = surveyPointDisplayRequest.surveyPoint;
        }
        if ((i10 & 2) != 0) {
            z10 = surveyPointDisplayRequest.isNavigatingBack;
        }
        return surveyPointDisplayRequest.copy(surveyPoint, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final SurveyPoint getSurveyPoint() {
        return this.surveyPoint;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsNavigatingBack() {
        return this.isNavigatingBack;
    }

    public final SurveyPointDisplayRequest copy(SurveyPoint surveyPoint, boolean isNavigatingBack) {
        l.e(surveyPoint, "surveyPoint");
        return new SurveyPointDisplayRequest(surveyPoint, isNavigatingBack);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyPointDisplayRequest)) {
            return false;
        }
        SurveyPointDisplayRequest surveyPointDisplayRequest = (SurveyPointDisplayRequest) other;
        return l.a(this.surveyPoint, surveyPointDisplayRequest.surveyPoint) && this.isNavigatingBack == surveyPointDisplayRequest.isNavigatingBack;
    }

    public final SurveyPoint getSurveyPoint() {
        return this.surveyPoint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.surveyPoint.hashCode() * 31;
        boolean z10 = this.isNavigatingBack;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode + i10;
    }

    public final boolean isNavigatingBack() {
        return this.isNavigatingBack;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SurveyPointDisplayRequest(surveyPoint=");
        sb2.append(this.surveyPoint);
        sb2.append(", isNavigatingBack=");
        return c7.a.r(sb2, this.isNavigatingBack, ')');
    }
}
