package com.survicate.surveys.presentation.widget;

import ac.l;
import android.os.Parcel;
import android.os.Parcelable;
import c7.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/survicate/surveys/presentation/widget/QuestionHeaderBindingData;", "Landroid/os/Parcelable;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class QuestionHeaderBindingData implements Parcelable {
    public static final Parcelable.Creator<QuestionHeaderBindingData> CREATOR = new l(18);

    /* renamed from: a, reason: collision with root package name */
    public final String f6597a;

    /* renamed from: d, reason: collision with root package name */
    public final String f6598d;

    /* renamed from: g, reason: collision with root package name */
    public final String f6599g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f6600r;

    /* renamed from: x, reason: collision with root package name */
    public final SurveyPointImageBindingData f6601x;

    public QuestionHeaderBindingData(String str, String str2, String str3, boolean z10, SurveyPointImageBindingData surveyPointImageBindingData) {
        br.l.e(str, "surveyPointIntroduction");
        br.l.e(str2, "surveyPointTitle");
        br.l.e(str3, "answerRequiredLabel");
        this.f6597a = str;
        this.f6598d = str2;
        this.f6599g = str3;
        this.f6600r = z10;
        this.f6601x = surveyPointImageBindingData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionHeaderBindingData)) {
            return false;
        }
        QuestionHeaderBindingData questionHeaderBindingData = (QuestionHeaderBindingData) obj;
        return br.l.a(this.f6597a, questionHeaderBindingData.f6597a) && br.l.a(this.f6598d, questionHeaderBindingData.f6598d) && br.l.a(this.f6599g, questionHeaderBindingData.f6599g) && this.f6600r == questionHeaderBindingData.f6600r && br.l.a(this.f6601x, questionHeaderBindingData.f6601x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iG = a.g(this.f6599g, a.g(this.f6598d, this.f6597a.hashCode() * 31, 31), 31);
        boolean z10 = this.f6600r;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iG + i10) * 31;
        SurveyPointImageBindingData surveyPointImageBindingData = this.f6601x;
        return i11 + (surveyPointImageBindingData == null ? 0 : surveyPointImageBindingData.hashCode());
    }

    public final String toString() {
        return "QuestionHeaderBindingData(surveyPointIntroduction=" + this.f6597a + ", surveyPointTitle=" + this.f6598d + ", answerRequiredLabel=" + this.f6599g + ", showAnswerRequiredLabel=" + this.f6600r + ", imageBindingData=" + this.f6601x + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        br.l.e(parcel, "out");
        parcel.writeString(this.f6597a);
        parcel.writeString(this.f6598d);
        parcel.writeString(this.f6599g);
        parcel.writeInt(this.f6600r ? 1 : 0);
        SurveyPointImageBindingData surveyPointImageBindingData = this.f6601x;
        if (surveyPointImageBindingData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            surveyPointImageBindingData.writeToParcel(parcel, i10);
        }
    }
}
