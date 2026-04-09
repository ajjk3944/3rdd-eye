package com.survicate.surveys.presentation.text.micro;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import c7.a;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import java.util.UUID;
import kotlin.Metadata;
import wc.h;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/survicate/surveys/presentation/text/micro/MicroSurveyPointTextAdapterItem;", "Landroid/os/Parcelable;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MicroSurveyPointTextAdapterItem implements Parcelable {
    public static final Parcelable.Creator<MicroSurveyPointTextAdapterItem> CREATOR = new h(29);

    /* renamed from: a, reason: collision with root package name */
    public final String f6523a;

    /* renamed from: d, reason: collision with root package name */
    public final QuestionHeaderBindingData f6524d;

    /* renamed from: g, reason: collision with root package name */
    public final MicroSurveyPointTextAnswer f6525g;

    /* renamed from: r, reason: collision with root package name */
    public final int f6526r;

    public MicroSurveyPointTextAdapterItem(String str, QuestionHeaderBindingData questionHeaderBindingData, MicroSurveyPointTextAnswer microSurveyPointTextAnswer, int i10) {
        l.e(str, "itemUuid");
        l.e(questionHeaderBindingData, "header");
        l.e(microSurveyPointTextAnswer, "answer");
        this.f6523a = str;
        this.f6524d = questionHeaderBindingData;
        this.f6525g = microSurveyPointTextAnswer;
        this.f6526r = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicroSurveyPointTextAdapterItem)) {
            return false;
        }
        MicroSurveyPointTextAdapterItem microSurveyPointTextAdapterItem = (MicroSurveyPointTextAdapterItem) obj;
        return l.a(this.f6523a, microSurveyPointTextAdapterItem.f6523a) && l.a(this.f6524d, microSurveyPointTextAdapterItem.f6524d) && l.a(this.f6525g, microSurveyPointTextAdapterItem.f6525g) && this.f6526r == microSurveyPointTextAdapterItem.f6526r;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6526r) + ((this.f6525g.hashCode() + ((this.f6524d.hashCode() + (this.f6523a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MicroSurveyPointTextAdapterItem(itemUuid=");
        sb2.append(this.f6523a);
        sb2.append(", header=");
        sb2.append(this.f6524d);
        sb2.append(", answer=");
        sb2.append(this.f6525g);
        sb2.append(", maxAnswerCharacterCount=");
        return a.q(sb2, this.f6526r, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.e(parcel, "out");
        parcel.writeString(this.f6523a);
        this.f6524d.writeToParcel(parcel, i10);
        this.f6525g.writeToParcel(parcel, i10);
        parcel.writeInt(this.f6526r);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MicroSurveyPointTextAdapterItem(QuestionHeaderBindingData questionHeaderBindingData, MicroSurveyPointTextAnswer microSurveyPointTextAnswer, int i10) {
        String string = UUID.randomUUID().toString();
        l.d(string, "toString(...)");
        this(string, questionHeaderBindingData, microSurveyPointTextAnswer, i10);
    }
}
