package com.survicate.surveys.presentation.matrix.micro;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import i6.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/survicate/surveys/presentation/matrix/micro/MicroSurveyPointMatrixColumnItem;", "Landroid/os/Parcelable;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroSurveyPointMatrixColumnItem implements Parcelable {
    public static final Parcelable.Creator<MicroSurveyPointMatrixColumnItem> CREATOR = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public final long f6424a;

    /* renamed from: d, reason: collision with root package name */
    public final String f6425d;

    /* renamed from: g, reason: collision with root package name */
    public String f6426g;

    public MicroSurveyPointMatrixColumnItem(long j, String str, String str2) {
        l.e(str, "name");
        l.e(str2, "comment");
        this.f6424a = j;
        this.f6425d = str;
        this.f6426g = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MicroSurveyPointMatrixColumnItem.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.c(obj, "null cannot be cast to non-null type com.survicate.surveys.presentation.matrix.micro.MicroSurveyPointMatrixColumnItem");
        MicroSurveyPointMatrixColumnItem microSurveyPointMatrixColumnItem = (MicroSurveyPointMatrixColumnItem) obj;
        return this.f6424a == microSurveyPointMatrixColumnItem.f6424a && l.a(this.f6425d, microSurveyPointMatrixColumnItem.f6425d) && l.a(this.f6426g, microSurveyPointMatrixColumnItem.f6426g);
    }

    public final int hashCode() {
        return this.f6426g.hashCode() + c7.a.g(this.f6425d, Long.hashCode(this.f6424a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.e(parcel, "out");
        parcel.writeLong(this.f6424a);
        parcel.writeString(this.f6425d);
        parcel.writeString(this.f6426g);
    }
}
