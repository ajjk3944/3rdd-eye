package com.survicate.surveys.entities.survey.translations;

import br.l;
import h0.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/survicate/surveys/entities/survey/translations/SurveyPointEntryTranslation;", "", "id", "", "value", "", "(JLjava/lang/String;)V", "getId", "()J", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveyPointEntryTranslation {
    private final long id;
    private final String value;

    public SurveyPointEntryTranslation(long j, String str) {
        this.id = j;
        this.value = str;
    }

    public static /* synthetic */ SurveyPointEntryTranslation copy$default(SurveyPointEntryTranslation surveyPointEntryTranslation, long j, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j = surveyPointEntryTranslation.id;
        }
        if ((i10 & 2) != 0) {
            str = surveyPointEntryTranslation.value;
        }
        return surveyPointEntryTranslation.copy(j, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final SurveyPointEntryTranslation copy(long id2, String value) {
        return new SurveyPointEntryTranslation(id2, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyPointEntryTranslation)) {
            return false;
        }
        SurveyPointEntryTranslation surveyPointEntryTranslation = (SurveyPointEntryTranslation) other;
        return this.id == surveyPointEntryTranslation.id && l.a(this.value, surveyPointEntryTranslation.value);
    }

    public final long getId() {
        return this.id;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        String str = this.value;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SurveyPointEntryTranslation(id=");
        sb2.append(this.id);
        sb2.append(", value=");
        return b.r(sb2, this.value, ')');
    }
}
