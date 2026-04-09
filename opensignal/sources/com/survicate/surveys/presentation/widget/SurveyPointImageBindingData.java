package com.survicate.surveys.presentation.widget;

import ac.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.survicate.surveys.entities.survey.questions.SurveyPointImage;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/survicate/surveys/presentation/widget/SurveyPointImageBindingData;", "Landroid/os/Parcelable;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveyPointImageBindingData implements Parcelable {
    public static final Parcelable.Creator<SurveyPointImageBindingData> CREATOR = new l(19);

    /* renamed from: a, reason: collision with root package name */
    public final SurveyPointImage f6602a;

    public SurveyPointImageBindingData(SurveyPointImage surveyPointImage) {
        this.f6602a = surveyPointImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SurveyPointImageBindingData) && br.l.a(this.f6602a, ((SurveyPointImageBindingData) obj).f6602a);
    }

    public final int hashCode() {
        SurveyPointImage surveyPointImage = this.f6602a;
        if (surveyPointImage == null) {
            return 0;
        }
        return surveyPointImage.hashCode();
    }

    public final String toString() {
        return "SurveyPointImageBindingData(surveyPointImage=" + this.f6602a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        br.l.e(parcel, "out");
        SurveyPointImage surveyPointImage = this.f6602a;
        if (surveyPointImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            surveyPointImage.writeToParcel(parcel, i10);
        }
    }
}
