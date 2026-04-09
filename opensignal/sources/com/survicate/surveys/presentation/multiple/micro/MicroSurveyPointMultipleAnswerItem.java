package com.survicate.surveys.presentation.multiple.micro;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import i6.a;
import kotlin.Metadata;
import w.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/survicate/surveys/presentation/multiple/micro/MicroSurveyPointMultipleAnswerItem;", "Landroid/os/Parcelable;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointMultipleAnswerItem implements Parcelable {
    public static final Parcelable.Creator<MicroSurveyPointMultipleAnswerItem> CREATOR = new a(8);
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final long f6439a;

    /* renamed from: d, reason: collision with root package name */
    public final String f6440d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6441g;

    /* renamed from: r, reason: collision with root package name */
    public final String f6442r;

    /* renamed from: x, reason: collision with root package name */
    public final String f6443x;

    /* renamed from: y, reason: collision with root package name */
    public String f6444y;

    public MicroSurveyPointMultipleAnswerItem(long j, String str, boolean z10, String str2, String str3, String str4, boolean z11) {
        l.e(str, "title");
        l.e(str2, "commentLabel");
        l.e(str3, "commentHint");
        l.e(str4, "comment");
        this.f6439a = j;
        this.f6440d = str;
        this.f6441g = z10;
        this.f6442r = str2;
        this.f6443x = str3;
        this.f6444y = str4;
        this.B = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MicroSurveyPointMultipleAnswerItem.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.c(obj, "null cannot be cast to non-null type com.survicate.surveys.presentation.multiple.micro.MicroSurveyPointMultipleAnswerItem");
        MicroSurveyPointMultipleAnswerItem microSurveyPointMultipleAnswerItem = (MicroSurveyPointMultipleAnswerItem) obj;
        return this.f6439a == microSurveyPointMultipleAnswerItem.f6439a && l.a(this.f6440d, microSurveyPointMultipleAnswerItem.f6440d) && this.f6441g == microSurveyPointMultipleAnswerItem.f6441g && l.a(this.f6442r, microSurveyPointMultipleAnswerItem.f6442r) && l.a(this.f6443x, microSurveyPointMultipleAnswerItem.f6443x) && l.a(this.f6444y, microSurveyPointMultipleAnswerItem.f6444y) && this.B == microSurveyPointMultipleAnswerItem.B;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.B) + c7.a.g(this.f6444y, c7.a.g(this.f6443x, c7.a.g(this.f6442r, g.b(c7.a.g(this.f6440d, Long.hashCode(this.f6439a) * 31, 31), this.f6441g, 31), 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.e(parcel, "out");
        parcel.writeLong(this.f6439a);
        parcel.writeString(this.f6440d);
        parcel.writeInt(this.f6441g ? 1 : 0);
        parcel.writeString(this.f6442r);
        parcel.writeString(this.f6443x);
        parcel.writeString(this.f6444y);
        parcel.writeInt(this.B ? 1 : 0);
    }
}
