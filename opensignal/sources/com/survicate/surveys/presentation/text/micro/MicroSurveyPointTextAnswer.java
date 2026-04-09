package com.survicate.surveys.presentation.text.micro;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import kotlin.Metadata;
import zp.f;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/survicate/surveys/presentation/text/micro/MicroSurveyPointTextAnswer;", "Landroid/os/Parcelable;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointTextAnswer implements Parcelable {
    public static final Parcelable.Creator<MicroSurveyPointTextAnswer> CREATOR = new f(0);

    /* renamed from: a, reason: collision with root package name */
    public String f6527a;

    /* renamed from: d, reason: collision with root package name */
    public final String f6528d;

    public MicroSurveyPointTextAnswer(String str, String str2) {
        l.e(str, "input");
        l.e(str2, "inputHint");
        this.f6527a = str;
        this.f6528d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.e(parcel, "out");
        parcel.writeString(this.f6527a);
        parcel.writeString(this.f6528d);
    }
}
