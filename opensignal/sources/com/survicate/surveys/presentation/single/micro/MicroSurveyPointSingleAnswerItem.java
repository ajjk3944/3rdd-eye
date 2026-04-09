package com.survicate.surveys.presentation.single.micro;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import c7.a;
import kotlin.Metadata;
import tc.c;
import w.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/survicate/surveys/presentation/single/micro/MicroSurveyPointSingleAnswerItem;", "Landroid/os/Parcelable;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointSingleAnswerItem implements Parcelable {
    public static final Parcelable.Creator<MicroSurveyPointSingleAnswerItem> CREATOR = new c(20);
    public String B;
    public boolean D;

    /* renamed from: a, reason: collision with root package name */
    public final long f6493a;

    /* renamed from: d, reason: collision with root package name */
    public final String f6494d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6495g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f6496r;

    /* renamed from: x, reason: collision with root package name */
    public final String f6497x;

    /* renamed from: y, reason: collision with root package name */
    public final String f6498y;

    public MicroSurveyPointSingleAnswerItem(long j, String str, boolean z10, boolean z11, String str2, String str3, String str4, boolean z12) {
        l.e(str, "title");
        l.e(str2, "commentLabel");
        l.e(str3, "commentHint");
        l.e(str4, "comment");
        this.f6493a = j;
        this.f6494d = str;
        this.f6495g = z10;
        this.f6496r = z11;
        this.f6497x = str2;
        this.f6498y = str3;
        this.B = str4;
        this.D = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MicroSurveyPointSingleAnswerItem.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.c(obj, "null cannot be cast to non-null type com.survicate.surveys.presentation.single.micro.MicroSurveyPointSingleAnswerItem");
        MicroSurveyPointSingleAnswerItem microSurveyPointSingleAnswerItem = (MicroSurveyPointSingleAnswerItem) obj;
        return this.f6493a == microSurveyPointSingleAnswerItem.f6493a && this.f6495g == microSurveyPointSingleAnswerItem.f6495g && this.f6496r == microSurveyPointSingleAnswerItem.f6496r && this.D == microSurveyPointSingleAnswerItem.D && l.a(this.f6494d, microSurveyPointSingleAnswerItem.f6494d) && l.a(this.f6497x, microSurveyPointSingleAnswerItem.f6497x) && l.a(this.f6498y, microSurveyPointSingleAnswerItem.f6498y) && l.a(this.B, microSurveyPointSingleAnswerItem.B);
    }

    public final int hashCode() {
        return this.B.hashCode() + a.g(this.f6498y, a.g(this.f6497x, a.g(this.f6494d, g.b(g.b(g.b(Long.hashCode(this.f6493a) * 31, this.f6495g, 31), this.f6496r, 31), this.D, 31), 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.e(parcel, "out");
        parcel.writeLong(this.f6493a);
        parcel.writeString(this.f6494d);
        parcel.writeInt(this.f6495g ? 1 : 0);
        parcel.writeInt(this.f6496r ? 1 : 0);
        parcel.writeString(this.f6497x);
        parcel.writeString(this.f6498y);
        parcel.writeString(this.B);
        parcel.writeInt(this.D ? 1 : 0);
    }
}
